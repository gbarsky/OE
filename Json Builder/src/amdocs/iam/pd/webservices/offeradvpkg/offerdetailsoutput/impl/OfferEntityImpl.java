/*
 * XML Type:  OfferEntity
 * Namespace: http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput
 * Java type: amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.impl;
/**
 * An XML OfferEntity(@http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput).
 *
 * This is a complex type.
 */
public class OfferEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferEntity
{
    
    public OfferEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName OFFERNAME$2 = 
        new javax.xml.namespace.QName("", "offerName");
    private static final javax.xml.namespace.QName OFFERDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "offerDescription");
    private static final javax.xml.namespace.QName OFFERTYPE$6 = 
        new javax.xml.namespace.QName("", "offerType");
    private static final javax.xml.namespace.QName OFFERPRIORITY$8 = 
        new javax.xml.namespace.QName("", "offerPriority");
    private static final javax.xml.namespace.QName PRODUCTCODE$10 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTVERSION$12 = 
        new javax.xml.namespace.QName("", "productVersion");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$14 = 
        new javax.xml.namespace.QName("", "effectiveDate");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$16 = 
        new javax.xml.namespace.QName("", "expirationDate");
    private static final javax.xml.namespace.QName RCPACKAGEIND$18 = 
        new javax.xml.namespace.QName("", "rcPackageInd");
    private static final javax.xml.namespace.QName UCPACKAGEIND$20 = 
        new javax.xml.namespace.QName("", "ucPackageInd");
    private static final javax.xml.namespace.QName OCPACKAGEIND$22 = 
        new javax.xml.namespace.QName("", "ocPackageInd");
    private static final javax.xml.namespace.QName PROMOTIONIND$24 = 
        new javax.xml.namespace.QName("", "promotionInd");
    private static final javax.xml.namespace.QName PROMOTIONPERIOD$26 = 
        new javax.xml.namespace.QName("", "promotionPeriod");
    private static final javax.xml.namespace.QName PROMOTIONINTERVAL$28 = 
        new javax.xml.namespace.QName("", "promotionInterval");
    private static final javax.xml.namespace.QName PROMOTIONCUTDATE$30 = 
        new javax.xml.namespace.QName("", "promotionCutDate");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$32 = 
        new javax.xml.namespace.QName("", "customerParameters");
    private static final javax.xml.namespace.QName OFFERPARAMETERS$34 = 
        new javax.xml.namespace.QName("", "offerParameters");
    private static final javax.xml.namespace.QName OFFERPROPERTIES$36 = 
        new javax.xml.namespace.QName("", "offerProperties");
    private static final javax.xml.namespace.QName OFFERENTITYCUSTOM$38 = 
        new javax.xml.namespace.QName("", "OfferEntityCustom");
    
    
    /**
     * Gets the "offerCode" element
     */
    public java.lang.String getOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerCode" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerCode" element
     */
    public void setOfferCode(java.lang.String offerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERCODE$0);
            }
            target.setStringValue(offerCode);
        }
    }
    
    /**
     * Sets (as xml) the "offerCode" element
     */
    public void xsetOfferCode(org.apache.xmlbeans.XmlString offerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERCODE$0);
            }
            target.set(offerCode);
        }
    }
    
    /**
     * Gets the "offerName" element
     */
    public java.lang.String getOfferName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerName" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerName" element
     */
    public void setOfferName(java.lang.String offerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERNAME$2);
            }
            target.setStringValue(offerName);
        }
    }
    
    /**
     * Sets (as xml) the "offerName" element
     */
    public void xsetOfferName(org.apache.xmlbeans.XmlString offerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERNAME$2);
            }
            target.set(offerName);
        }
    }
    
    /**
     * Gets the "offerDescription" element
     */
    public java.lang.String getOfferDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerDescription" element
     */
    public void setOfferDescription(java.lang.String offerDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERDESCRIPTION$4);
            }
            target.setStringValue(offerDescription);
        }
    }
    
    /**
     * Sets (as xml) the "offerDescription" element
     */
    public void xsetOfferDescription(org.apache.xmlbeans.XmlString offerDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERDESCRIPTION$4);
            }
            target.set(offerDescription);
        }
    }
    
    /**
     * Gets the "offerType" element
     */
    public java.lang.String getOfferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerType" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerType" element
     */
    public void setOfferType(java.lang.String offerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERTYPE$6);
            }
            target.setStringValue(offerType);
        }
    }
    
    /**
     * Sets (as xml) the "offerType" element
     */
    public void xsetOfferType(org.apache.xmlbeans.XmlString offerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERTYPE$6);
            }
            target.set(offerType);
        }
    }
    
    /**
     * Gets the "offerPriority" element
     */
    public java.lang.String getOfferPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERPRIORITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerPriority" element
     */
    public amdocs.iam.pd.general.common.Long xgetOfferPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(OFFERPRIORITY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerPriority" element
     */
    public void setOfferPriority(java.lang.String offerPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERPRIORITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERPRIORITY$8);
            }
            target.setStringValue(offerPriority);
        }
    }
    
    /**
     * Sets (as xml) the "offerPriority" element
     */
    public void xsetOfferPriority(amdocs.iam.pd.general.common.Long offerPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(OFFERPRIORITY$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(OFFERPRIORITY$8);
            }
            target.set(offerPriority);
        }
    }
    
    /**
     * Gets the "productCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$12, 0);
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
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(PRODUCTVERSION$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTVERSION$12);
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
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(PRODUCTVERSION$12, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(PRODUCTVERSION$12);
            }
            target.set(productVersion);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFECTIVEDATE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$16, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIRATIONDATE$16);
            }
            target.set(expirationDate);
        }
    }
    
    /**
     * Gets the "rcPackageInd" element
     */
    public java.lang.String getRcPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RCPACKAGEIND$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rcPackageInd" element
     */
    public org.apache.xmlbeans.XmlString xgetRcPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RCPACKAGEIND$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rcPackageInd" element
     */
    public void setRcPackageInd(java.lang.String rcPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RCPACKAGEIND$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RCPACKAGEIND$18);
            }
            target.setStringValue(rcPackageInd);
        }
    }
    
    /**
     * Sets (as xml) the "rcPackageInd" element
     */
    public void xsetRcPackageInd(org.apache.xmlbeans.XmlString rcPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RCPACKAGEIND$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RCPACKAGEIND$18);
            }
            target.set(rcPackageInd);
        }
    }
    
    /**
     * Gets the "ucPackageInd" element
     */
    public java.lang.String getUcPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UCPACKAGEIND$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ucPackageInd" element
     */
    public org.apache.xmlbeans.XmlString xgetUcPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UCPACKAGEIND$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ucPackageInd" element
     */
    public void setUcPackageInd(java.lang.String ucPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UCPACKAGEIND$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UCPACKAGEIND$20);
            }
            target.setStringValue(ucPackageInd);
        }
    }
    
    /**
     * Sets (as xml) the "ucPackageInd" element
     */
    public void xsetUcPackageInd(org.apache.xmlbeans.XmlString ucPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UCPACKAGEIND$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UCPACKAGEIND$20);
            }
            target.set(ucPackageInd);
        }
    }
    
    /**
     * Gets the "ocPackageInd" element
     */
    public java.lang.String getOcPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCPACKAGEIND$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ocPackageInd" element
     */
    public org.apache.xmlbeans.XmlString xgetOcPackageInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCPACKAGEIND$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ocPackageInd" element
     */
    public void setOcPackageInd(java.lang.String ocPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCPACKAGEIND$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCPACKAGEIND$22);
            }
            target.setStringValue(ocPackageInd);
        }
    }
    
    /**
     * Sets (as xml) the "ocPackageInd" element
     */
    public void xsetOcPackageInd(org.apache.xmlbeans.XmlString ocPackageInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCPACKAGEIND$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OCPACKAGEIND$22);
            }
            target.set(ocPackageInd);
        }
    }
    
    /**
     * Gets the "promotionInd" element
     */
    public java.lang.String getPromotionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONIND$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "promotionInd" element
     */
    public org.apache.xmlbeans.XmlString xgetPromotionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONIND$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "promotionInd" element
     */
    public boolean isSetPromotionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROMOTIONIND$24) != 0;
        }
    }
    
    /**
     * Sets the "promotionInd" element
     */
    public void setPromotionInd(java.lang.String promotionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONIND$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROMOTIONIND$24);
            }
            target.setStringValue(promotionInd);
        }
    }
    
    /**
     * Sets (as xml) the "promotionInd" element
     */
    public void xsetPromotionInd(org.apache.xmlbeans.XmlString promotionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONIND$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROMOTIONIND$24);
            }
            target.set(promotionInd);
        }
    }
    
    /**
     * Unsets the "promotionInd" element
     */
    public void unsetPromotionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROMOTIONIND$24, 0);
        }
    }
    
    /**
     * Gets the "promotionPeriod" element
     */
    public java.lang.String getPromotionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONPERIOD$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "promotionPeriod" element
     */
    public org.apache.xmlbeans.XmlString xgetPromotionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONPERIOD$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "promotionPeriod" element
     */
    public boolean isSetPromotionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROMOTIONPERIOD$26) != 0;
        }
    }
    
    /**
     * Sets the "promotionPeriod" element
     */
    public void setPromotionPeriod(java.lang.String promotionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONPERIOD$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROMOTIONPERIOD$26);
            }
            target.setStringValue(promotionPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "promotionPeriod" element
     */
    public void xsetPromotionPeriod(org.apache.xmlbeans.XmlString promotionPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONPERIOD$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROMOTIONPERIOD$26);
            }
            target.set(promotionPeriod);
        }
    }
    
    /**
     * Unsets the "promotionPeriod" element
     */
    public void unsetPromotionPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROMOTIONPERIOD$26, 0);
        }
    }
    
    /**
     * Gets the "promotionInterval" element
     */
    public java.lang.String getPromotionInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONINTERVAL$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "promotionInterval" element
     */
    public org.apache.xmlbeans.XmlString xgetPromotionInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONINTERVAL$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "promotionInterval" element
     */
    public boolean isSetPromotionInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROMOTIONINTERVAL$28) != 0;
        }
    }
    
    /**
     * Sets the "promotionInterval" element
     */
    public void setPromotionInterval(java.lang.String promotionInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONINTERVAL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROMOTIONINTERVAL$28);
            }
            target.setStringValue(promotionInterval);
        }
    }
    
    /**
     * Sets (as xml) the "promotionInterval" element
     */
    public void xsetPromotionInterval(org.apache.xmlbeans.XmlString promotionInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONINTERVAL$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROMOTIONINTERVAL$28);
            }
            target.set(promotionInterval);
        }
    }
    
    /**
     * Unsets the "promotionInterval" element
     */
    public void unsetPromotionInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROMOTIONINTERVAL$28, 0);
        }
    }
    
    /**
     * Gets the "promotionCutDate" element
     */
    public java.lang.String getPromotionCutDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONCUTDATE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "promotionCutDate" element
     */
    public org.apache.xmlbeans.XmlString xgetPromotionCutDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONCUTDATE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "promotionCutDate" element
     */
    public boolean isSetPromotionCutDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROMOTIONCUTDATE$30) != 0;
        }
    }
    
    /**
     * Sets the "promotionCutDate" element
     */
    public void setPromotionCutDate(java.lang.String promotionCutDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROMOTIONCUTDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROMOTIONCUTDATE$30);
            }
            target.setStringValue(promotionCutDate);
        }
    }
    
    /**
     * Sets (as xml) the "promotionCutDate" element
     */
    public void xsetPromotionCutDate(org.apache.xmlbeans.XmlString promotionCutDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROMOTIONCUTDATE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROMOTIONCUTDATE$30);
            }
            target.set(promotionCutDate);
        }
    }
    
    /**
     * Unsets the "promotionCutDate" element
     */
    public void unsetPromotionCutDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROMOTIONCUTDATE$30, 0);
        }
    }
    
    /**
     * Gets the "customerParameters" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().find_element_user(CUSTOMERPARAMETERS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customerParameters" element
     */
    public boolean isSetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARAMETERS$32) != 0;
        }
    }
    
    /**
     * Sets the "customerParameters" element
     */
    public void setCustomerParameters(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().find_element_user(CUSTOMERPARAMETERS$32, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().add_element_user(CUSTOMERPARAMETERS$32);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "customerParameters" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().add_element_user(CUSTOMERPARAMETERS$32);
            return target;
        }
    }
    
    /**
     * Unsets the "customerParameters" element
     */
    public void unsetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARAMETERS$32, 0);
        }
    }
    
    /**
     * Gets the "offerParameters" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters getOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().find_element_user(OFFERPARAMETERS$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offerParameters" element
     */
    public boolean isSetOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERPARAMETERS$34) != 0;
        }
    }
    
    /**
     * Sets the "offerParameters" element
     */
    public void setOfferParameters(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters offerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().find_element_user(OFFERPARAMETERS$34, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().add_element_user(OFFERPARAMETERS$34);
            }
            target.set(offerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "offerParameters" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters addNewOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.Parameters)get_store().add_element_user(OFFERPARAMETERS$34);
            return target;
        }
    }
    
    /**
     * Unsets the "offerParameters" element
     */
    public void unsetOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERPARAMETERS$34, 0);
        }
    }
    
    /**
     * Gets the "offerProperties" element
     */
    public amdocs.iam.pd.general.common.PropertiesT getOfferProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT)get_store().find_element_user(OFFERPROPERTIES$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offerProperties" element
     */
    public boolean isSetOfferProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERPROPERTIES$36) != 0;
        }
    }
    
    /**
     * Sets the "offerProperties" element
     */
    public void setOfferProperties(amdocs.iam.pd.general.common.PropertiesT offerProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT)get_store().find_element_user(OFFERPROPERTIES$36, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.PropertiesT)get_store().add_element_user(OFFERPROPERTIES$36);
            }
            target.set(offerProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "offerProperties" element
     */
    public amdocs.iam.pd.general.common.PropertiesT addNewOfferProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.PropertiesT target = null;
            target = (amdocs.iam.pd.general.common.PropertiesT)get_store().add_element_user(OFFERPROPERTIES$36);
            return target;
        }
    }
    
    /**
     * Unsets the "offerProperties" element
     */
    public void unsetOfferProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERPROPERTIES$36, 0);
        }
    }
    
    /**
     * Gets the "OfferEntityCustom" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom getOfferEntityCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom)get_store().find_element_user(OFFERENTITYCUSTOM$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OfferEntityCustom" element
     */
    public boolean isSetOfferEntityCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERENTITYCUSTOM$38) != 0;
        }
    }
    
    /**
     * Sets the "OfferEntityCustom" element
     */
    public void setOfferEntityCustom(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom offerEntityCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom)get_store().find_element_user(OFFERENTITYCUSTOM$38, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom)get_store().add_element_user(OFFERENTITYCUSTOM$38);
            }
            target.set(offerEntityCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "OfferEntityCustom" element
     */
    public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom addNewOfferEntityCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom target = null;
            target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutputimpl.OfferEntityCustom)get_store().add_element_user(OFFERENTITYCUSTOM$38);
            return target;
        }
    }
    
    /**
     * Unsets the "OfferEntityCustom" element
     */
    public void unsetOfferEntityCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERENTITYCUSTOM$38, 0);
        }
    }
}
