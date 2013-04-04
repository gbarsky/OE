/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput
 * Java type: amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLECODE$0 = 
        new javax.xml.namespace.QName("", "BundleCode");
    private static final javax.xml.namespace.QName COMPONENTS$2 = 
        new javax.xml.namespace.QName("", "Components");
    private static final javax.xml.namespace.QName DATACUSTOM$4 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "BundleCode" element
     */
    public java.lang.String getBundleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BundleCode" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BundleCode" element
     */
    public void setBundleCode(java.lang.String bundleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLECODE$0);
            }
            target.setStringValue(bundleCode);
        }
    }
    
    /**
     * Sets (as xml) the "BundleCode" element
     */
    public void xsetBundleCode(org.apache.xmlbeans.XmlString bundleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLECODE$0);
            }
            target.set(bundleCode);
        }
    }
    
    /**
     * Gets the "Components" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components getComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components)get_store().find_element_user(COMPONENTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Components" element
     */
    public void setComponents(amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components components)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components)get_store().find_element_user(COMPONENTS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components)get_store().add_element_user(COMPONENTS$2);
            }
            target.set(components);
        }
    }
    
    /**
     * Appends and returns a new empty "Components" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components addNewComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components)get_store().add_element_user(COMPONENTS$2);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$4, 0);
        }
    }
}
