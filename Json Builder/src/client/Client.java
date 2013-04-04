package client;
import amdocs.iam.pd.pdwebservices.*;
import amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.*;
import amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.*;
import com.google.gson.*;



public class Client{
	
	static Pd_wsStub stub ;
	
    public static void main(java.lang.String args[]){
        try{
        	stub =
                new Pd_wsStub();

     
            getProductDetails(stub);
     
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("\n\n\n");
        }
    }


    /* two way call/receive */
    public static void getProductDetails(Pd_wsStub stub){
        try{
            GetProductDetailsDocument req =
            		GetProductDetailsDocument.Factory.newInstance();
            GetProductDetailsDocument.GetProductDetails details = req.addNewGetProductDetails();
            amdocs.iam.pd.webservices.productattrrel.productdetailsinput.Data data =  details.addNewROOT().addNewDATA();
            data.setProductCode("YPINCOLUMN");
            data.setProductVersion("1");

            GetProductDetailsResponseDocument res =
                stub.getProductDetails(req);

            
            ProductDetails prodDet = createProductBean(res);
            convertToJson(prodDet);
           
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("\n\n\n");
        }
    }

    public static ProductDetails createProductBean(GetProductDetailsResponseDocument res){
    	ProductDetails details = new ProductDetails();
    	ProductEntity entity  = res.getGetProductDetailsResponse().getROOT().getDATA().getProductEntity();        
        Attribute[] attributes  = res.getGetProductDetailsResponse().getROOT().getDATA().getProductEntity().getProductAttributes().getAttributeArray();
        SlvInfo slvInfo = null;
        
        java.util.ArrayList<ProductAttribute> attrList = new java.util.ArrayList<ProductAttribute>();
        
        for (int i=0; i<attributes.length; i++ ){
        	ProductAttribute prdAttr = new ProductAttribute();
        	prdAttr.setAttributeCode(attributes[i].getAttributeCode());
        	prdAttr.setAttributeName(attributes[i].getAttributeName());
        	prdAttr.setAttributeType(attributes[i].getAttributeType());
        	prdAttr.setAppearOnBillInd(attributes[i].getAppearOnBillInd());
        	prdAttr.setAttributeDescription(attributes[i].getAttributeDescription());        	
        	prdAttr.setContentType(attributes[i].getContentType());
        	prdAttr.setDefaultValue(attributes[i].getDefaultValue());
        	prdAttr.setDefinitionType(attributes[i].getDefinitionType());
        	prdAttr.setFieldType(attributes[i].getFieldType());
        	prdAttr.setFinalInd(attributes[i].getFinalInd());
        	prdAttr.setMaxLength(attributes[i].getMaxLength());
        	prdAttr.setPreviewInd(attributes[i].getPreviewInd());
        	prdAttr.setQueryName(attributes[i].getQueryName());
        	prdAttr.setQuerySql(attributes[i].getQuerySql());
        	prdAttr.setReferenceQueryId(attributes[i].getReferenceQueryId());
        	prdAttr.setRelationType(attributes[i].getRelationType());
        	prdAttr.setShowAllValues(attributes[i].getShowAllValues());
        	// attribute is slv type
        	if ((prdAttr.getDefinitionType().equals("R") || prdAttr.getDefinitionType().equals("F")) && prdAttr.getQueryName() != null){
        	   slvInfo = getReferenceAttributeValues(entity,prdAttr.getAttributeCode());
        	   if (slvInfo != null)
        		   prdAttr.setSlvInfo(slvInfo);
        	}
        	attrList.add(prdAttr);	
        	
        }
        
        details.setProductDesc(entity.getProductDescription());
        details.setProductName(entity.getProductName());
        details.setAgreementReqInd(entity.getAgreementReqInd());
        details.setDaysForFulfillment(entity.getDaysForFulfillment());
        details.setEffectiveDate(entity.getEffectiveDate());        
        details.setExpirationDate(entity.getExpirationDate());
        details.setLimitInventoryType(entity.getLimitInventoryType());
        details.setMaxAppearances(entity.getMaxAppearances());
        details.setMediaType(entity.getMediaType());
        details.setProductCode(entity.getProductCode());
        details.setProductionDate(entity.getProductionDate());
        details.setProductStatus(entity.getProductStatus());
        details.setProductType(entity.getProductType());
        details.setProductVersion(entity.getProductVersion());
        details.setShowAppearAttrList(entity.getShowAppearAttrList());
        
        details.setAttributes(attrList.toArray(new ProductAttribute[attrList.size()]));
        details.setHeadings(getHeadingsByProduct(entity));
        
        return details;
        
    }
    
    
    public static SlvInfo getReferenceAttributeValues(ProductEntity i_entity, String i_attrCode){
    	
      SlvInfo slvInfo = null;	
      try{ 	
    	GetReferenceAttributeValuesDocument refReq = GetReferenceAttributeValuesDocument.Factory.newInstance();
    	GetReferenceAttributeValuesDocument.GetReferenceAttributeValues referenceAttributeValues = refReq.addNewGetReferenceAttributeValues();
    	amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.Data data = referenceAttributeValues.addNewROOT().addNewDATA();
    	data.setProductCode(i_entity.getProductCode());
    	data.setProductVersion(i_entity.getProductVersion());
    	data.setAttributeCode(i_attrCode);
    	GetReferenceAttributeValuesResponseDocument refResponse = 
    			stub.getReferenceAttributeValues(refReq);
    	
        slvInfo = getSlvInfo(refResponse);
    	
      } catch(Exception e){
          e.printStackTrace();
          System.out.println("\n\n\n");
      }
    	
        return slvInfo;
    	
    }
    
    public static SlvInfo getSlvInfo(GetReferenceAttributeValuesResponseDocument refResponse){
    	
    	SlvInfo slvInfo = new SlvInfo();
    	ValidValues vv =  refResponse.getGetReferenceAttributeValuesResponse().getROOT().getDATA().getAttributeValues();
    	
    	slvInfo.setCodeColumnDisplayedName(vv.getCodeColumn().getColumnDisplayedName());
    	slvInfo.setDecodeColumnDisplayedName(vv.getDecodeColumn().getColumnDisplayedName());
    	
    	ColumnValues codeColumnValues = vv.getCodeColumn().getColumnValues();
    	String[] codeColumnValuesArray = codeColumnValues.getColumnValueArray();
    	ColumnValues decodeColumnValues = vv.getDecodeColumn().getColumnValues();
    	String[] decodeColumnValuesArray = decodeColumnValues.getColumnValueArray();
    	ColumnValues populatedColumnValues = null; ;
    	String[] populatedColumnValuesArray = null ;
    	
    	if (vv.getPopulatedFields() != null){
    		PopulatedField[] popFields = vv.getPopulatedFields().getPopulatedFieldArray();
    		if  (popFields.length > 0) {
    			populatedColumnValues = popFields[0].getPopulatedColumn().getColumnValues();
    			populatedColumnValuesArray = populatedColumnValues.getColumnValueArray();
    			slvInfo.setPopulatedColumnDisplayedName(popFields[0].getPopulatedColumn().getColumnDisplayedName());
    			slvInfo.setPopulatedFieldAttribute(popFields[0].getAttributeCode());    	
    		}
    	}	
    	
        java.util.ArrayList<ColumnValue> colValuesList = new java.util.ArrayList<ColumnValue>();
        
    	for (int i=0;i<codeColumnValuesArray.length;i++){
    		ColumnValue colVal = new ColumnValue();
    		colVal.setCodeColumnValue(codeColumnValuesArray[i]);
    		colVal.setDecodeColumnValue(decodeColumnValuesArray[i]);
    		if (populatedColumnValuesArray != null) {
    			colVal.setPopulatedFieldValue(populatedColumnValuesArray[i]);
    		}    	    
    	colValuesList.add(colVal);
    	}
    	
    	slvInfo.setColumnValues(colValuesList.toArray(new ColumnValue[colValuesList.size()]));
    	
    	return slvInfo;
    }
    
 public static Heading[] getHeadingsByProduct(ProductEntity i_entity){

   java.util.ArrayList<Heading> headingList = new java.util.ArrayList<Heading>();
   try {	    	
    	GetHeadingListDocument req = GetHeadingListDocument.Factory.newInstance();
    	amdocs.iam.pd.webservices.heading.headinglistinput.DataType data = req.addNewGetHeadingList().addNewROOT().addNewDATA();
    	data.setProductCode(i_entity.getProductCode());
    	data.setLanguage("en");
    	
    	GetHeadingListResponseDocument resp = stub.getHeadingList(req);
    	amdocs.iam.pd.webservices.heading.headinglistoutput.Headings headings = resp.getGetHeadingListResponse().getROOT().getDATA().getHeadings();
    	if (headings != null){
    		amdocs.iam.pd.webservices.heading.headinglistoutput.Heading[] headArray = headings.getHeadingArray();
    		for (int j=0;j<headArray.length;j++){
    			Heading h = new Heading();
    			h.setHeadingCode(headArray[j].getHeadingCode());
    			h.setHeadingName(headArray[j].getHeadingName());
    			
    			headingList.add(h);
    		}
    	}    	    	    	
    	
     } catch(Exception e){
         e.printStackTrace();
         System.out.println("\n\n\n");
     }
   		
         return  headingList.toArray(new Heading[headingList.size()]);
    	
    }
    public static void convertToJson (ProductDetails details){
    	
    	Gson gson = new Gson();
    	String json = gson.toJson(details);
    	System.out.println(json);
    	
    }
}