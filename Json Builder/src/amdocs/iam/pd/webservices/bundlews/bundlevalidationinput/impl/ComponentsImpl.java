/*
 * XML Type:  Components
 * Namespace: http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput
 * Java type: amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.impl;
/**
 * An XML Components(@http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput).
 *
 * This is a complex type.
 */
public class ComponentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Components
{
    
    public ComponentsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("", "Component");
    private static final javax.xml.namespace.QName COMPONENTSCUSTOM$2 = 
        new javax.xml.namespace.QName("", "ComponentsCustom");
    
    
    /**
     * Gets array of all "Component" elements
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$0, targetList);
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component[] result = new amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Component" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "Component" element
     */
    public void setComponentArray(amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component[] componentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentArray, COMPONENT$0);
        }
    }
    
    /**
     * Sets ith "Component" element
     */
    public void setComponentArray(int i, amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component)get_store().insert_element_user(COMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.Component)get_store().add_element_user(COMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$0, i);
        }
    }
    
    /**
     * Gets the "ComponentsCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom getComponentsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom)get_store().find_element_user(COMPONENTSCUSTOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ComponentsCustom" element
     */
    public boolean isSetComponentsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTSCUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "ComponentsCustom" element
     */
    public void setComponentsCustom(amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom componentsCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom)get_store().find_element_user(COMPONENTSCUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom)get_store().add_element_user(COMPONENTSCUSTOM$2);
            }
            target.set(componentsCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentsCustom" element
     */
    public amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom addNewComponentsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom target = null;
            target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinputimpl.ComponentsCustom)get_store().add_element_user(COMPONENTSCUSTOM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ComponentsCustom" element
     */
    public void unsetComponentsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTSCUSTOM$2, 0);
        }
    }
}
