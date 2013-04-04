/*
 * XML Type:  Product
 * Namespace: http://amdocs/iam/pd/webservices/product/FullProductListOutput
 * Java type: amdocs.iam.pd.webservices.product.fullproductlistoutput.Product
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.product.fullproductlistoutput.impl;
/**
 * An XML Product(@http://amdocs/iam/pd/webservices/product/FullProductListOutput).
 *
 * This is a complex type.
 */
public class ProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.product.fullproductlistoutput.Product
{
    
    public ProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTVERSION$2 = 
        new javax.xml.namespace.QName("", "productVersion");
    private static final javax.xml.namespace.QName PRODUCTTYPE$4 = 
        new javax.xml.namespace.QName("", "productType");
    private static final javax.xml.namespace.QName MEDIATYPE$6 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName PRODUCTNAME$8 = 
        new javax.xml.namespace.QName("", "productName");
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$10 = 
        new javax.xml.namespace.QName("", "productDescription");
    private static final javax.xml.namespace.QName DEFAULTOFFERCODE$12 = 
        new javax.xml.namespace.QName("", "defaultOfferCode");
    private static final javax.xml.namespace.QName AGREEMENTREQIND$14 = 
        new javax.xml.namespace.QName("", "agreementReqInd");
    private static final javax.xml.namespace.QName PRODUCTCUSTOM$16 = 
        new javax.xml.namespace.QName("", "ProductCustom");
    private static final javax.xml.namespace.QName MAXAPPEARANCES$18 = 
        new javax.xml.namespace.QName("", "maxAppearances");
    private static final javax.xml.namespace.QName DAYSFORFULFILLMENT$20 = 
        new javax.xml.namespace.QName("", "daysForFulfillment");
    private static final javax.xml.namespace.QName FILEID$22 = 
        new javax.xml.namespace.QName("", "fileId");
    
    
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
     * Gets the "productType" element
     */
    public java.lang.String getProductType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$6);
            }
            target.set(mediaType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTDESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTDESCRIPTION$10);
            }
            target.set(productDescription);
        }
    }
    
    /**
     * Gets the "defaultOfferCode" element
     */
    public java.lang.String getDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTOFFERCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultOfferCode" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTOFFERCODE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "defaultOfferCode" element
     */
    public void setDefaultOfferCode(java.lang.String defaultOfferCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTOFFERCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTOFFERCODE$12);
            }
            target.setStringValue(defaultOfferCode);
        }
    }
    
    /**
     * Sets (as xml) the "defaultOfferCode" element
     */
    public void xsetDefaultOfferCode(org.apache.xmlbeans.XmlString defaultOfferCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTOFFERCODE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTOFFERCODE$12);
            }
            target.set(defaultOfferCode);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTREQIND$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTREQIND$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGREEMENTREQIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGREEMENTREQIND$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGREEMENTREQIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGREEMENTREQIND$14);
            }
            target.set(agreementReqInd);
        }
    }
    
    /**
     * Gets the "ProductCustom" element
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom getProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom)get_store().find_element_user(PRODUCTCUSTOM$16, 0);
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
            return get_store().count_elements(PRODUCTCUSTOM$16) != 0;
        }
    }
    
    /**
     * Sets the "ProductCustom" element
     */
    public void setProductCustom(amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom productCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom)get_store().find_element_user(PRODUCTCUSTOM$16, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom)get_store().add_element_user(PRODUCTCUSTOM$16);
            }
            target.set(productCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ProductCustom" element
     */
    public amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom addNewProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom target = null;
            target = (amdocs.iam.pd.webservices.product.fullproductlistoutputimpl.ProductCustom)get_store().add_element_user(PRODUCTCUSTOM$16);
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
            get_store().remove_element(PRODUCTCUSTOM$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXAPPEARANCES$18, 0);
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
    public org.apache.xmlbeans.XmlString xgetMaxAppearances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXAPPEARANCES$18, 0);
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
            return get_store().count_elements(MAXAPPEARANCES$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXAPPEARANCES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXAPPEARANCES$18);
            }
            target.setStringValue(maxAppearances);
        }
    }
    
    /**
     * Sets (as xml) the "maxAppearances" element
     */
    public void xsetMaxAppearances(org.apache.xmlbeans.XmlString maxAppearances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAXAPPEARANCES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAXAPPEARANCES$18);
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
            get_store().remove_element(MAXAPPEARANCES$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSFORFULFILLMENT$20, 0);
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
    public org.apache.xmlbeans.XmlString xgetDaysForFulfillment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DAYSFORFULFILLMENT$20, 0);
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
            return get_store().count_elements(DAYSFORFULFILLMENT$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSFORFULFILLMENT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYSFORFULFILLMENT$20);
            }
            target.setStringValue(daysForFulfillment);
        }
    }
    
    /**
     * Sets (as xml) the "daysForFulfillment" element
     */
    public void xsetDaysForFulfillment(org.apache.xmlbeans.XmlString daysForFulfillment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DAYSFORFULFILLMENT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DAYSFORFULFILLMENT$20);
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
            get_store().remove_element(DAYSFORFULFILLMENT$20, 0);
        }
    }
    
    /**
     * Gets the "fileId" element
     */
    public java.lang.String getFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fileId" element
     */
    public org.apache.xmlbeans.XmlString xgetFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEID$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "fileId" element
     */
    public boolean isSetFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEID$22) != 0;
        }
    }
    
    /**
     * Sets the "fileId" element
     */
    public void setFileId(java.lang.String fileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILEID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILEID$22);
            }
            target.setStringValue(fileId);
        }
    }
    
    /**
     * Sets (as xml) the "fileId" element
     */
    public void xsetFileId(org.apache.xmlbeans.XmlString fileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILEID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILEID$22);
            }
            target.set(fileId);
        }
    }
    
    /**
     * Unsets the "fileId" element
     */
    public void unsetFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEID$22, 0);
        }
    }
}
