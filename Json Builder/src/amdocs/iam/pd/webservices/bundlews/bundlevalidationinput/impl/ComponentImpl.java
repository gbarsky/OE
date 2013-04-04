/*
 * XML Type:  Component
 * Namespace: http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput
 * Java type: amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.impl;
/**
 * An XML Component(@http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput).
 *
 * This is a complex type.
 */
public class ComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component
{
    
    public ComponentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLECOMPONENTID$0 = 
        new javax.xml.namespace.QName("", "BundleComponentId");
    private static final javax.xml.namespace.QName OFFERCODE$2 = 
        new javax.xml.namespace.QName("", "OfferCode");
    private static final javax.xml.namespace.QName COMPONENTCUSTOM$4 = 
        new javax.xml.namespace.QName("", "ComponentCustom");
    
    
    /**
     * Gets the "BundleComponentId" element
     */
    public java.lang.String getBundleComponentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECOMPONENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BundleComponentId" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleComponentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECOMPONENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BundleComponentId" element
     */
    public void setBundleComponentId(java.lang.String bundleComponentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECOMPONENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLECOMPONENTID$0);
            }
            target.setStringValue(bundleComponentId);
        }
    }
    
    /**
     * Sets (as xml) the "BundleComponentId" element
     */
    public void xsetBundleComponentId(org.apache.xmlbeans.XmlString bundleComponentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECOMPONENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLECOMPONENTID$0);
            }
            target.set(bundleComponentId);
        }
    }
    
    /**
     * Gets the "OfferCode" element
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
     * Gets (as xml) the "OfferCode" element
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
     * Sets the "OfferCode" element
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
     * Sets (as xml) the "OfferCode" element
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
     * Gets the "ComponentCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom getComponentCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom)get_store().find_element_user(COMPONENTCUSTOM$4, 0);
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
            return get_store().count_elements(COMPONENTCUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "ComponentCustom" element
     */
    public void setComponentCustom(amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom componentCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom)get_store().find_element_user(COMPONENTCUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom)get_store().add_element_user(COMPONENTCUSTOM$4);
            }
            target.set(componentCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom addNewComponentCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentCustom)get_store().add_element_user(COMPONENTCUSTOM$4);
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
            get_store().remove_element(COMPONENTCUSTOM$4, 0);
        }
    }
}
