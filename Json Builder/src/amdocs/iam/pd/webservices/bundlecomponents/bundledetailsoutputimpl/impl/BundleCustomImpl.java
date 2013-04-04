/*
 * XML Type:  BundleCustom
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutputImpl
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.BundleCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.impl;
/**
 * An XML BundleCustom(@http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutputImpl).
 *
 * This is a complex type.
 */
public class BundleCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutputimpl.BundleCustom
{
    
    public BundleCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("", "currency");
    private static final javax.xml.namespace.QName BUNDLETYPE$2 = 
        new javax.xml.namespace.QName("", "bundleType");
    
    
    /**
     * Gets the "currency" element
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currency" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$0) != 0;
        }
    }
    
    /**
     * Sets the "currency" element
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$0);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "currency" element
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$0);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$0, 0);
        }
    }
    
    /**
     * Gets the "bundleType" element
     */
    public java.lang.String getBundleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bundleType" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLETYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "bundleType" element
     */
    public boolean isSetBundleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNDLETYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "bundleType" element
     */
    public void setBundleType(java.lang.String bundleType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLETYPE$2);
            }
            target.setStringValue(bundleType);
        }
    }
    
    /**
     * Sets (as xml) the "bundleType" element
     */
    public void xsetBundleType(org.apache.xmlbeans.XmlString bundleType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLETYPE$2);
            }
            target.set(bundleType);
        }
    }
    
    /**
     * Unsets the "bundleType" element
     */
    public void unsetBundleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNDLETYPE$2, 0);
        }
    }
}
