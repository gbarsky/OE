/*
 * An XML document type.
 * Localname: GetProductListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductListResponseDocument
{
    
    public GetProductListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductListResponse");
    
    
    /**
     * Gets the "GetProductListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse getGetProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse)get_store().find_element_user(GETPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductListResponse" element
     */
    public void setGetProductListResponse(amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse getProductListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse)get_store().find_element_user(GETPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse)get_store().add_element_user(GETPRODUCTLISTRESPONSE$0);
            }
            target.set(getProductListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse addNewGetProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse)get_store().add_element_user(GETPRODUCTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductListResponseDocument.GetProductListResponse
    {
        
        public GetProductListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productRelations/ProductListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ROOT" element
         */
        public void setROOT(amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
