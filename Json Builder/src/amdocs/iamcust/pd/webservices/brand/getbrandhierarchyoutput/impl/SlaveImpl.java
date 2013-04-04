/*
 * XML Type:  Slave
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.impl;
/**
 * An XML Slave(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public class SlaveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Slave
{
    
    public SlaveImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTVERSION$2 = 
        new javax.xml.namespace.QName("", "productVersion");
    private static final javax.xml.namespace.QName MEDIATYPE$4 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName PRODUCTTYPE$6 = 
        new javax.xml.namespace.QName("", "productType");
    private static final javax.xml.namespace.QName BRANDCODE$8 = 
        new javax.xml.namespace.QName("", "brandCode");
    private static final javax.xml.namespace.QName PRODUCTSTATUS$10 = 
        new javax.xml.namespace.QName("", "productStatus");
    private static final javax.xml.namespace.QName RELATIONTYPE$12 = 
        new javax.xml.namespace.QName("", "relationType");
    private static final javax.xml.namespace.QName CANCELIMMEDIATELYINDICATOR$14 = 
        new javax.xml.namespace.QName("", "cancelImmediatelyIndicator");
    private static final javax.xml.namespace.QName MANDATORYINDICATOR$16 = 
        new javax.xml.namespace.QName("", "mandatoryIndicator");
    private static final javax.xml.namespace.QName STARTDATEINDICATOR$18 = 
        new javax.xml.namespace.QName("", "startDateIndicator");
    private static final javax.xml.namespace.QName ENDDATEINDICATOR$20 = 
        new javax.xml.namespace.QName("", "endDateIndicator");
    private static final javax.xml.namespace.QName LOCKEDATTRIBUTES$22 = 
        new javax.xml.namespace.QName("", "lockedAttributes");
    private static final javax.xml.namespace.QName LINKEDATTRIBUTES$24 = 
        new javax.xml.namespace.QName("", "linkedAttributes");
    private static final javax.xml.namespace.QName LOCKEDAPPEARANCEATTRIBUTES$26 = 
        new javax.xml.namespace.QName("", "lockedAppearanceAttributes");
    private static final javax.xml.namespace.QName LINKEDAPPEARANCEATTRIBUTES$28 = 
        new javax.xml.namespace.QName("", "linkedAppearanceAttributes");
    private static final javax.xml.namespace.QName OFFERS$30 = 
        new javax.xml.namespace.QName("", "offers");
    
    
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
     * Gets the "mediaType" element
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$4);
            }
            target.set(mediaType);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTTYPE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTTYPE$6);
            }
            target.set(productType);
        }
    }
    
    /**
     * Gets the "brandCode" element
     */
    public java.lang.String getBrandCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "brandCode" element
     */
    public org.apache.xmlbeans.XmlString xgetBrandCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDCODE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "brandCode" element
     */
    public void setBrandCode(java.lang.String brandCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDCODE$8);
            }
            target.setStringValue(brandCode);
        }
    }
    
    /**
     * Sets (as xml) the "brandCode" element
     */
    public void xsetBrandCode(org.apache.xmlbeans.XmlString brandCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANDCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANDCODE$8);
            }
            target.set(brandCode);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATUS$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSTATUS$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTSTATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTSTATUS$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTSTATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTSTATUS$10);
            }
            target.set(productStatus);
        }
    }
    
    /**
     * Gets the "relationType" element
     */
    public java.lang.String getRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationType" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "relationType" element
     */
    public void setRelationType(java.lang.String relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONTYPE$12);
            }
            target.setStringValue(relationType);
        }
    }
    
    /**
     * Sets (as xml) the "relationType" element
     */
    public void xsetRelationType(org.apache.xmlbeans.XmlString relationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONTYPE$12);
            }
            target.set(relationType);
        }
    }
    
    /**
     * Gets the "cancelImmediatelyIndicator" element
     */
    public java.lang.String getCancelImmediatelyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELIMMEDIATELYINDICATOR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cancelImmediatelyIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetCancelImmediatelyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANCELIMMEDIATELYINDICATOR$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "cancelImmediatelyIndicator" element
     */
    public boolean isSetCancelImmediatelyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANCELIMMEDIATELYINDICATOR$14) != 0;
        }
    }
    
    /**
     * Sets the "cancelImmediatelyIndicator" element
     */
    public void setCancelImmediatelyIndicator(java.lang.String cancelImmediatelyIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELIMMEDIATELYINDICATOR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANCELIMMEDIATELYINDICATOR$14);
            }
            target.setStringValue(cancelImmediatelyIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "cancelImmediatelyIndicator" element
     */
    public void xsetCancelImmediatelyIndicator(org.apache.xmlbeans.XmlString cancelImmediatelyIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CANCELIMMEDIATELYINDICATOR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CANCELIMMEDIATELYINDICATOR$14);
            }
            target.set(cancelImmediatelyIndicator);
        }
    }
    
    /**
     * Unsets the "cancelImmediatelyIndicator" element
     */
    public void unsetCancelImmediatelyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANCELIMMEDIATELYINDICATOR$14, 0);
        }
    }
    
    /**
     * Gets the "mandatoryIndicator" element
     */
    public java.lang.String getMandatoryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANDATORYINDICATOR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mandatoryIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetMandatoryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANDATORYINDICATOR$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "mandatoryIndicator" element
     */
    public boolean isSetMandatoryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANDATORYINDICATOR$16) != 0;
        }
    }
    
    /**
     * Sets the "mandatoryIndicator" element
     */
    public void setMandatoryIndicator(java.lang.String mandatoryIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANDATORYINDICATOR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANDATORYINDICATOR$16);
            }
            target.setStringValue(mandatoryIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "mandatoryIndicator" element
     */
    public void xsetMandatoryIndicator(org.apache.xmlbeans.XmlString mandatoryIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANDATORYINDICATOR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANDATORYINDICATOR$16);
            }
            target.set(mandatoryIndicator);
        }
    }
    
    /**
     * Unsets the "mandatoryIndicator" element
     */
    public void unsetMandatoryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANDATORYINDICATOR$16, 0);
        }
    }
    
    /**
     * Gets the "startDateIndicator" element
     */
    public java.lang.String getStartDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEINDICATOR$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDateIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetStartDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATEINDICATOR$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "startDateIndicator" element
     */
    public boolean isSetStartDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATEINDICATOR$18) != 0;
        }
    }
    
    /**
     * Sets the "startDateIndicator" element
     */
    public void setStartDateIndicator(java.lang.String startDateIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATEINDICATOR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATEINDICATOR$18);
            }
            target.setStringValue(startDateIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "startDateIndicator" element
     */
    public void xsetStartDateIndicator(org.apache.xmlbeans.XmlString startDateIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATEINDICATOR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATEINDICATOR$18);
            }
            target.set(startDateIndicator);
        }
    }
    
    /**
     * Unsets the "startDateIndicator" element
     */
    public void unsetStartDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATEINDICATOR$18, 0);
        }
    }
    
    /**
     * Gets the "endDateIndicator" element
     */
    public java.lang.String getEndDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATEINDICATOR$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endDateIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetEndDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATEINDICATOR$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "endDateIndicator" element
     */
    public boolean isSetEndDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATEINDICATOR$20) != 0;
        }
    }
    
    /**
     * Sets the "endDateIndicator" element
     */
    public void setEndDateIndicator(java.lang.String endDateIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATEINDICATOR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATEINDICATOR$20);
            }
            target.setStringValue(endDateIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "endDateIndicator" element
     */
    public void xsetEndDateIndicator(org.apache.xmlbeans.XmlString endDateIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATEINDICATOR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATEINDICATOR$20);
            }
            target.set(endDateIndicator);
        }
    }
    
    /**
     * Unsets the "endDateIndicator" element
     */
    public void unsetEndDateIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATEINDICATOR$20, 0);
        }
    }
    
    /**
     * Gets array of all "lockedAttributes" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] getLockedAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCKEDATTRIBUTES$22, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lockedAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute getLockedAttributesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LOCKEDATTRIBUTES$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lockedAttributes" element
     */
    public int sizeOfLockedAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCKEDATTRIBUTES$22);
        }
    }
    
    /**
     * Sets array of all "lockedAttributes" element
     */
    public void setLockedAttributesArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] lockedAttributesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lockedAttributesArray, LOCKEDATTRIBUTES$22);
        }
    }
    
    /**
     * Sets ith "lockedAttributes" element
     */
    public void setLockedAttributesArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute lockedAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LOCKEDATTRIBUTES$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lockedAttributes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lockedAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute insertNewLockedAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().insert_element_user(LOCKEDATTRIBUTES$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lockedAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute addNewLockedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().add_element_user(LOCKEDATTRIBUTES$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "lockedAttributes" element
     */
    public void removeLockedAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCKEDATTRIBUTES$22, i);
        }
    }
    
    /**
     * Gets array of all "linkedAttributes" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] getLinkedAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKEDATTRIBUTES$24, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "linkedAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute getLinkedAttributesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LINKEDATTRIBUTES$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "linkedAttributes" element
     */
    public int sizeOfLinkedAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKEDATTRIBUTES$24);
        }
    }
    
    /**
     * Sets array of all "linkedAttributes" element
     */
    public void setLinkedAttributesArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] linkedAttributesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkedAttributesArray, LINKEDATTRIBUTES$24);
        }
    }
    
    /**
     * Sets ith "linkedAttributes" element
     */
    public void setLinkedAttributesArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute linkedAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LINKEDATTRIBUTES$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkedAttributes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkedAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute insertNewLinkedAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().insert_element_user(LINKEDATTRIBUTES$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkedAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute addNewLinkedAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().add_element_user(LINKEDATTRIBUTES$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "linkedAttributes" element
     */
    public void removeLinkedAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKEDATTRIBUTES$24, i);
        }
    }
    
    /**
     * Gets array of all "lockedAppearanceAttributes" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] getLockedAppearanceAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCKEDAPPEARANCEATTRIBUTES$26, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lockedAppearanceAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute getLockedAppearanceAttributesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LOCKEDAPPEARANCEATTRIBUTES$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lockedAppearanceAttributes" element
     */
    public int sizeOfLockedAppearanceAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCKEDAPPEARANCEATTRIBUTES$26);
        }
    }
    
    /**
     * Sets array of all "lockedAppearanceAttributes" element
     */
    public void setLockedAppearanceAttributesArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] lockedAppearanceAttributesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lockedAppearanceAttributesArray, LOCKEDAPPEARANCEATTRIBUTES$26);
        }
    }
    
    /**
     * Sets ith "lockedAppearanceAttributes" element
     */
    public void setLockedAppearanceAttributesArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute lockedAppearanceAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LOCKEDAPPEARANCEATTRIBUTES$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lockedAppearanceAttributes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lockedAppearanceAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute insertNewLockedAppearanceAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().insert_element_user(LOCKEDAPPEARANCEATTRIBUTES$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lockedAppearanceAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute addNewLockedAppearanceAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().add_element_user(LOCKEDAPPEARANCEATTRIBUTES$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "lockedAppearanceAttributes" element
     */
    public void removeLockedAppearanceAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCKEDAPPEARANCEATTRIBUTES$26, i);
        }
    }
    
    /**
     * Gets array of all "linkedAppearanceAttributes" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] getLinkedAppearanceAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKEDAPPEARANCEATTRIBUTES$28, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "linkedAppearanceAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute getLinkedAppearanceAttributesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LINKEDAPPEARANCEATTRIBUTES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "linkedAppearanceAttributes" element
     */
    public int sizeOfLinkedAppearanceAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKEDAPPEARANCEATTRIBUTES$28);
        }
    }
    
    /**
     * Sets array of all "linkedAppearanceAttributes" element
     */
    public void setLinkedAppearanceAttributesArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute[] linkedAppearanceAttributesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkedAppearanceAttributesArray, LINKEDAPPEARANCEATTRIBUTES$28);
        }
    }
    
    /**
     * Sets ith "linkedAppearanceAttributes" element
     */
    public void setLinkedAppearanceAttributesArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute linkedAppearanceAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().find_element_user(LINKEDAPPEARANCEATTRIBUTES$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkedAppearanceAttributes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkedAppearanceAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute insertNewLinkedAppearanceAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().insert_element_user(LINKEDAPPEARANCEATTRIBUTES$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkedAppearanceAttributes" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute addNewLinkedAppearanceAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute)get_store().add_element_user(LINKEDAPPEARANCEATTRIBUTES$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "linkedAppearanceAttributes" element
     */
    public void removeLinkedAppearanceAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKEDAPPEARANCEATTRIBUTES$28, i);
        }
    }
    
    /**
     * Gets array of all "offers" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer[] getOffersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFERS$30, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "offers" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer getOffersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer)get_store().find_element_user(OFFERS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "offers" element
     */
    public int sizeOfOffersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERS$30);
        }
    }
    
    /**
     * Sets array of all "offers" element
     */
    public void setOffersArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer[] offersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(offersArray, OFFERS$30);
        }
    }
    
    /**
     * Sets ith "offers" element
     */
    public void setOffersArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer offers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer)get_store().find_element_user(OFFERS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "offers" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer insertNewOffers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer)get_store().insert_element_user(OFFERS$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "offers" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer addNewOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer)get_store().add_element_user(OFFERS$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "offers" element
     */
    public void removeOffers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERS$30, i);
        }
    }
}
