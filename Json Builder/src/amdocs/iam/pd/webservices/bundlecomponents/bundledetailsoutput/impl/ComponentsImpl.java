/*
 * XML Type:  Components
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.impl;
/**
 * An XML Components(@http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput).
 *
 * This is a complex type.
 */
public class ComponentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.Components
{
    
    public ComponentsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTID$0 = 
        new javax.xml.namespace.QName("", "componentID");
    private static final javax.xml.namespace.QName OFFERCODE$2 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName PRODUCTCODE$4 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName PRODUCTTYPE$6 = 
        new javax.xml.namespace.QName("", "productType");
    private static final javax.xml.namespace.QName MEDIATYPE$8 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName MANDATORYIND$10 = 
        new javax.xml.namespace.QName("", "mandatoryInd");
    private static final javax.xml.namespace.QName QUANTITY$12 = 
        new javax.xml.namespace.QName("", "quantity");
    private static final javax.xml.namespace.QName MAINCOMPONENTIND$14 = 
        new javax.xml.namespace.QName("", "mainComponentInd");
    private static final javax.xml.namespace.QName DEFAULTOFFERCODE$16 = 
        new javax.xml.namespace.QName("", "defaultOfferCode");
    private static final javax.xml.namespace.QName COMPONENTCUSTOM$18 = 
        new javax.xml.namespace.QName("", "ComponentCustom");
    
    
    /**
     * Gets the "componentID" element
     */
    public java.lang.String getComponentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPONENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "componentID" element
     */
    public amdocs.iam.pd.general.common.Long xgetComponentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(COMPONENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "componentID" element
     */
    public void setComponentID(java.lang.String componentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPONENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPONENTID$0);
            }
            target.setStringValue(componentID);
        }
    }
    
    /**
     * Sets (as xml) the "componentID" element
     */
    public void xsetComponentID(amdocs.iam.pd.general.common.Long componentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.Long target = null;
            target = (amdocs.iam.pd.general.common.Long)get_store().find_element_user(COMPONENTID$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.Long)get_store().add_element_user(COMPONENTID$0);
            }
            target.set(componentID);
        }
    }
    
    /**
     * Gets the "offerCode" element
     */
    public java.lang.String getOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERCODE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERCODE$2);
            }
            target.set(offerCode);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$4);
            }
            target.set(productCode);
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
     * Gets the "mediaType" element
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$8);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Gets the "mandatoryInd" element
     */
    public java.lang.String getMandatoryInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANDATORYIND$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mandatoryInd" element
     */
    public org.apache.xmlbeans.XmlString xgetMandatoryInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANDATORYIND$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mandatoryInd" element
     */
    public void setMandatoryInd(java.lang.String mandatoryInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANDATORYIND$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANDATORYIND$10);
            }
            target.setStringValue(mandatoryInd);
        }
    }
    
    /**
     * Sets (as xml) the "mandatoryInd" element
     */
    public void xsetMandatoryInd(org.apache.xmlbeans.XmlString mandatoryInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANDATORYIND$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANDATORYIND$10);
            }
            target.set(mandatoryInd);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public int getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantity" element
     */
    public org.apache.xmlbeans.XmlInt xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(int quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$12);
            }
            target.setIntValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "quantity" element
     */
    public void xsetQuantity(org.apache.xmlbeans.XmlInt quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANTITY$12);
            }
            target.set(quantity);
        }
    }
    
    /**
     * Gets the "mainComponentInd" element
     */
    public java.lang.String getMainComponentInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINCOMPONENTIND$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mainComponentInd" element
     */
    public org.apache.xmlbeans.XmlString xgetMainComponentInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINCOMPONENTIND$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mainComponentInd" element
     */
    public void setMainComponentInd(java.lang.String mainComponentInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINCOMPONENTIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINCOMPONENTIND$14);
            }
            target.setStringValue(mainComponentInd);
        }
    }
    
    /**
     * Sets (as xml) the "mainComponentInd" element
     */
    public void xsetMainComponentInd(org.apache.xmlbeans.XmlString mainComponentInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINCOMPONENTIND$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAINCOMPONENTIND$14);
            }
            target.set(mainComponentInd);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTOFFERCODE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTOFFERCODE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "defaultOfferCode" element
     */
    public boolean isSetDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTOFFERCODE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTOFFERCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTOFFERCODE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTOFFERCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTOFFERCODE$16);
            }
            target.set(defaultOfferCode);
        }
    }
    
    /**
     * Unsets the "defaultOfferCode" element
     */
    public void unsetDefaultOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTOFFERCODE$16, 0);
        }
    }
    
    /**
     * Gets the "ComponentCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom getComponentCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom)get_store().find_element_user(COMPONENTCUSTOM$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ComponentCustom" element
     */
    public boolean isSetComponentCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTCUSTOM$18) != 0;
        }
    }
    
    /**
     * Sets the "ComponentCustom" element
     */
    public void setComponentCustom(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom componentCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom)get_store().find_element_user(COMPONENTCUSTOM$18, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom)get_store().add_element_user(COMPONENTCUSTOM$18);
            }
            target.set(componentCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentCustom" element
     */
    public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom addNewComponentCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.ComponentCustom)get_store().add_element_user(COMPONENTCUSTOM$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ComponentCustom" element
     */
    public void unsetComponentCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTCUSTOM$18, 0);
        }
    }
}
