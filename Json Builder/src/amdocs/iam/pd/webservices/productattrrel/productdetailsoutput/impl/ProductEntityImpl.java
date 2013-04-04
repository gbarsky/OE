/*
 * XML Type:  ProductEntity
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML ProductEntity(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class ProductEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity
{
    
    public ProductEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTVERSION$2 = 
        new javax.xml.namespace.QName("", "productVersion");
    private static final javax.xml.namespace.QName PRODUCTNAME$4 = 
        new javax.xml.namespace.QName("", "productName");
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$6 = 
        new javax.xml.namespace.QName("", "productDescription");
    private static final javax.xml.namespace.QName PRODUCTTYPE$8 = 
        new javax.xml.namespace.QName("", "productType");
    private static final javax.xml.namespace.QName MEDIATYPE$10 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName LIMITINVENTORYTYPE$12 = 
        new javax.xml.namespace.QName("", "limitInventoryType");
    private static final javax.xml.namespace.QName DAYSFORFULFILLMENT$14 = 
        new javax.xml.namespace.QName("", "daysForFulfillment");
    private static final javax.xml.namespace.QName MAXAPPEARANCES$16 = 
        new javax.xml.namespace.QName("", "maxAppearances");
    private static final javax.xml.namespace.QName AGREEMENTREQIND$18 = 
        new javax.xml.namespace.QName("", "agreementReqInd");
    private static final javax.xml.namespace.QName EDITINCONTENTEDITOR$20 = 
        new javax.xml.namespace.QName("", "editInContentEditor");
    private static final javax.xml.namespace.QName SHOWAPPEARATTRLIST$22 = 
        new javax.xml.namespace.QName("", "showAppearAttrList");
    private static final javax.xml.namespace.QName PRODUCTSTATUS$24 = 
        new javax.xml.namespace.QName("", "productStatus");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$26 = 
        new javax.xml.namespace.QName("", "effectiveDate");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$28 = 
        new javax.xml.namespace.QName("", "expirationDate");
    private static final javax.xml.namespace.QName PRODUCTIONDATE$30 = 
        new javax.xml.namespace.QName("", "productionDate");
    private static final javax.xml.namespace.QName PRODUCTCUSTOM$32 = 
        new javax.xml.namespace.QName("", "ProductCustom");
    private static final javax.xml.namespace.QName PRODUCTATTRIBUTES$34 = 
        new javax.xml.namespace.QName("", "productAttributes");
    private static final javax.xml.namespace.QName PRODUCTRELATIONS$36 = 
        new javax.xml.namespace.QName("", "productRelations");
    
    
    /**
     * Gets the "productCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productCode" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productCode" element
     */
    public void setProductCode(java.lang.String productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$0);
            }
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Sets (as xml) the "productCode" element
     */
    public void xsetProductCode(org.apache.xmlbeans.XmlString productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$0);
            }
            target.set(productCode);
        }
    }
    
    /**
     * Gets the "productVersion" element
     */
    public java.lang.String getProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productVersion" element
     */
    public amdocs.iam.pd.general.common.Long xgetProductVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(PRODUCTVERSION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productVersion" element
     */
    public void setProductVersion(java.lang.String productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$2);
            }
            target.setStringValue(productVersion);
        }
    }
    
    /**
     * Sets (as xml) the "productVersion" element
     */
    public void xsetProductVersion(amdocs.iam.pd.general.common.Long productVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(PRODUCTVERSION$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(PRODUCTVERSION$2);
            }
            target.set(productVersion);
        }
    }
    
    /**
     * Gets the "productName" element
     */
    public java.lang.String getProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productName" element
     */
    public org.apache.xmlbeans.XmlString xgetProductName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productName" element
     */
    public void setProductName(java.lang.String productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$4);
            }
            target.setStringValue(productName);
        }
    }
    
    /**
     * Sets (as xml) the "productName" element
     */
    public void xsetProductName(org.apache.xmlbeans.XmlString productName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$4);
            }
            target.set(productName);
        }
    }
    
    /**
     * Gets the "productDescription" element
     */
    public java.lang.String getProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productDescription" element
     */
    public void setProductDescription(java.lang.String productDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$6);
            }
            target.setStringValue(productDescription);
        }
    }
    
    /**
     * Sets (as xml) the "productDescription" element
     */
    public void xsetProductDescription(org.apache.xmlbeans.XmlString productDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTDESCRIPTION$6);
            }
            target.set(productDescription);
        }
    }
    
    /**
     * Gets the "productType" element
     */
    public java.lang.String getProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productType" element
     */
    public org.apache.xmlbeans.XmlString xgetProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productType" element
     */
    public void setProductType(java.lang.String productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$8);
            }
            target.setStringValue(productType);
        }
    }
    
    /**
     * Sets (as xml) the "productType" element
     */
    public void xsetProductType(org.apache.xmlbeans.XmlString productType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$8);
            }
            target.set(productType);
        }
    }
    
    /**
     * Gets the "mediaType" element
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediaType" element
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$10);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" element
     */
    public void xsetMediaType(org.apache.xmlbeans.XmlString mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$10);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Gets the "limitInventoryType" element
     */
    public java.lang.String getLimitInventoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITINVENTORYTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "limitInventoryType" element
     */
    public amdocs.iam.pd.general.common.Long xgetLimitInventoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(LIMITINVENTORYTYPE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "limitInventoryType" element
     */
    public boolean isSetLimitInventoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIMITINVENTORYTYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "limitInventoryType" element
     */
    public void setLimitInventoryType(java.lang.String limitInventoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITINVENTORYTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIMITINVENTORYTYPE$12);
            }
            target.setStringValue(limitInventoryType);
        }
    }
    
    /**
     * Sets (as xml) the "limitInventoryType" element
     */
    public void xsetLimitInventoryType(amdocs.iam.pd.general.common.Long limitInventoryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(LIMITINVENTORYTYPE$12, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(LIMITINVENTORYTYPE$12);
            }
            target.set(limitInventoryType);
        }
    }
    
    /**
     * Unsets the "limitInventoryType" element
     */
    public void unsetLimitInventoryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIMITINVENTORYTYPE$12, 0);
        }
    }
    
    /**
     * Gets the "daysForFulfillment" element
     */
    public java.lang.String getDaysForFulfillment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSFORFULFILLMENT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "daysForFulfillment" element
     */
    public amdocs.iam.pd.general.common.Long xgetDaysForFulfillment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(DAYSFORFULFILLMENT$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "daysForFulfillment" element
     */
    public boolean isSetDaysForFulfillment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYSFORFULFILLMENT$14) != 0;
        }
    }
    
    /**
     * Sets the "daysForFulfillment" element
     */
    public void setDaysForFulfillment(java.lang.String daysForFulfillment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSFORFULFILLMENT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYSFORFULFILLMENT$14);
            }
            target.setStringValue(daysForFulfillment);
        }
    }
    
    /**
     * Sets (as xml) the "daysForFulfillment" element
     */
    public void xsetDaysForFulfillment(amdocs.iam.pd.general.common.Long daysForFulfillment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(DAYSFORFULFILLMENT$14, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(DAYSFORFULFILLMENT$14);
            }
            target.set(daysForFulfillment);
        }
    }
    
    /**
     * Unsets the "daysForFulfillment" element
     */
    public void unsetDaysForFulfillment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYSFORFULFILLMENT$14, 0);
        }
    }
    
    /**
     * Gets the "maxAppearances" element
     */
    public java.lang.String getMaxAppearances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXAPPEARANCES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxAppearances" element
     */
    public amdocs.iam.pd.general.common.Long xgetMaxAppearances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MAXAPPEARANCES$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "maxAppearances" element
     */
    public boolean isSetMaxAppearances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXAPPEARANCES$16) != 0;
        }
    }
    
    /**
     * Sets the "maxAppearances" element
     */
    public void setMaxAppearances(java.lang.String maxAppearances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXAPPEARANCES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXAPPEARANCES$16);
            }
            target.setStringValue(maxAppearances);
        }
    }
    
    /**
     * Sets (as xml) the "maxAppearances" element
     */
    public void xsetMaxAppearances(amdocs.iam.pd.general.common.Long maxAppearances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(MAXAPPEARANCES$16, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(MAXAPPEARANCES$16);
            }
            target.set(maxAppearances);
        }
    }
    
    /**
     * Unsets the "maxAppearances" element
     */
    public void unsetMaxAppearances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXAPPEARANCES$16, 0);
        }
    }
    
    /**
     * Gets the "agreementReqInd" element
     */
    public java.lang.String getAgreementReqInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTREQIND$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agreementReqInd" element
     */
    public org.apache.xmlbeans.XmlString xgetAgreementReqInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTREQIND$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "agreementReqInd" element
     */
    public void setAgreementReqInd(java.lang.String agreementReqInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTREQIND$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGREEMENTREQIND$18);
            }
            target.setStringValue(agreementReqInd);
        }
    }
    
    /**
     * Sets (as xml) the "agreementReqInd" element
     */
    public void xsetAgreementReqInd(org.apache.xmlbeans.XmlString agreementReqInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTREQIND$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGREEMENTREQIND$18);
            }
            target.set(agreementReqInd);
        }
    }
    
    /**
     * Gets the "editInContentEditor" element
     */
    public java.lang.String getEditInContentEditor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITINCONTENTEDITOR$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "editInContentEditor" element
     */
    public org.apache.xmlbeans.XmlString xgetEditInContentEditor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITINCONTENTEDITOR$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "editInContentEditor" element
     */
    public void setEditInContentEditor(java.lang.String editInContentEditor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITINCONTENTEDITOR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDITINCONTENTEDITOR$20);
            }
            target.setStringValue(editInContentEditor);
        }
    }
    
    /**
     * Sets (as xml) the "editInContentEditor" element
     */
    public void xsetEditInContentEditor(org.apache.xmlbeans.XmlString editInContentEditor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITINCONTENTEDITOR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDITINCONTENTEDITOR$20);
            }
            target.set(editInContentEditor);
        }
    }
    
    /**
     * Gets the "showAppearAttrList" element
     */
    public java.lang.String getShowAppearAttrList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWAPPEARATTRLIST$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "showAppearAttrList" element
     */
    public org.apache.xmlbeans.XmlString xgetShowAppearAttrList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOWAPPEARATTRLIST$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "showAppearAttrList" element
     */
    public void setShowAppearAttrList(java.lang.String showAppearAttrList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWAPPEARATTRLIST$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOWAPPEARATTRLIST$22);
            }
            target.setStringValue(showAppearAttrList);
        }
    }
    
    /**
     * Sets (as xml) the "showAppearAttrList" element
     */
    public void xsetShowAppearAttrList(org.apache.xmlbeans.XmlString showAppearAttrList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHOWAPPEARATTRLIST$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHOWAPPEARATTRLIST$22);
            }
            target.set(showAppearAttrList);
        }
    }
    
    /**
     * Gets the "productStatus" element
     */
    public java.lang.String getProductStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATUS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productStatus" element
     */
    public org.apache.xmlbeans.XmlString xgetProductStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSTATUS$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productStatus" element
     */
    public void setProductStatus(java.lang.String productStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATUS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSTATUS$24);
            }
            target.setStringValue(productStatus);
        }
    }
    
    /**
     * Sets (as xml) the "productStatus" element
     */
    public void xsetProductStatus(org.apache.xmlbeans.XmlString productStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSTATUS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSTATUS$24);
            }
            target.set(productStatus);
        }
    }
    
    /**
     * Gets the "effectiveDate" element
     */
    public java.lang.String getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectiveDate" element
     */
    public org.apache.xmlbeans.XmlString xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "effectiveDate" element
     */
    public void setEffectiveDate(java.lang.String effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$26);
            }
            target.setStringValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "effectiveDate" element
     */
    public void xsetEffectiveDate(org.apache.xmlbeans.XmlString effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFECTIVEDATE$26);
            }
            target.set(effectiveDate);
        }
    }
    
    /**
     * Gets the "expirationDate" element
     */
    public java.lang.String getExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expirationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "expirationDate" element
     */
    public boolean isSetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONDATE$28) != 0;
        }
    }
    
    /**
     * Sets the "expirationDate" element
     */
    public void setExpirationDate(java.lang.String expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATE$28);
            }
            target.setStringValue(expirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "expirationDate" element
     */
    public void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIRATIONDATE$28);
            }
            target.set(expirationDate);
        }
    }
    
    /**
     * Unsets the "expirationDate" element
     */
    public void unsetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONDATE$28, 0);
        }
    }
    
    /**
     * Gets the "productionDate" element
     */
    public java.lang.String getProductionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONDATE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productionDate" element
     */
    public org.apache.xmlbeans.XmlString xgetProductionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTIONDATE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "productionDate" element
     */
    public boolean isSetProductionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONDATE$30) != 0;
        }
    }
    
    /**
     * Sets the "productionDate" element
     */
    public void setProductionDate(java.lang.String productionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTIONDATE$30);
            }
            target.setStringValue(productionDate);
        }
    }
    
    /**
     * Sets (as xml) the "productionDate" element
     */
    public void xsetProductionDate(org.apache.xmlbeans.XmlString productionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTIONDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTIONDATE$30);
            }
            target.set(productionDate);
        }
    }
    
    /**
     * Unsets the "productionDate" element
     */
    public void unsetProductionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONDATE$30, 0);
        }
    }
    
    /**
     * Gets the "ProductCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom getProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom)get_store().find_element_user(PRODUCTCUSTOM$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductCustom" element
     */
    public boolean isSetProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCUSTOM$32) != 0;
        }
    }
    
    /**
     * Sets the "ProductCustom" element
     */
    public void setProductCustom(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom productCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom)get_store().find_element_user(PRODUCTCUSTOM$32, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom)get_store().add_element_user(PRODUCTCUSTOM$32);
            }
            target.set(productCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom addNewProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.ProductCustom)get_store().add_element_user(PRODUCTCUSTOM$32);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductCustom" element
     */
    public void unsetProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCUSTOM$32, 0);
        }
    }
    
    /**
     * Gets the "productAttributes" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes getProductAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes)get_store().find_element_user(PRODUCTATTRIBUTES$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "productAttributes" element
     */
    public boolean isSetProductAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTATTRIBUTES$34) != 0;
        }
    }
    
    /**
     * Sets the "productAttributes" element
     */
    public void setProductAttributes(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes productAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes)get_store().find_element_user(PRODUCTATTRIBUTES$34, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes)get_store().add_element_user(PRODUCTATTRIBUTES$34);
            }
            target.set(productAttributes);
        }
    }
    
    /**
     * Appends and returns a new empty "productAttributes" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes addNewProductAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes)get_store().add_element_user(PRODUCTATTRIBUTES$34);
            return target;
        }
    }
    
    /**
     * Unsets the "productAttributes" element
     */
    public void unsetProductAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTATTRIBUTES$34, 0);
        }
    }
    
    /**
     * Gets the "productRelations" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations getProductRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations)get_store().find_element_user(PRODUCTRELATIONS$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "productRelations" element
     */
    public boolean isSetProductRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTRELATIONS$36) != 0;
        }
    }
    
    /**
     * Sets the "productRelations" element
     */
    public void setProductRelations(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations productRelations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations)get_store().find_element_user(PRODUCTRELATIONS$36, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations)get_store().add_element_user(PRODUCTRELATIONS$36);
            }
            target.set(productRelations);
        }
    }
    
    /**
     * Appends and returns a new empty "productRelations" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations addNewProductRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations)get_store().add_element_user(PRODUCTRELATIONS$36);
            return target;
        }
    }
    
    /**
     * Unsets the "productRelations" element
     */
    public void unsetProductRelations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTRELATIONS$36, 0);
        }
    }
}
