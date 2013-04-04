/*
 * XML Type:  CustomerParameterTypes
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.impl;
/**
 * An XML CustomerParameterTypes(@http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput).
 *
 * This is a complex type.
 */
public class CustomerParameterTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.CustomerParameterTypes
{
    
    public CustomerParameterTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERGLOBALPARAMETERS$0 = 
        new javax.xml.namespace.QName("", "CustomerGlobalParameters");
    
    
    /**
     * Gets the "CustomerGlobalParameters" element
     */
    public amdocs.iam.pd.general.common.GlobalParameters getCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalParameters target = null;
            target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().find_element_user(CUSTOMERGLOBALPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerGlobalParameters" element
     */
    public boolean isSetCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERGLOBALPARAMETERS$0) != 0;
        }
    }
    
    /**
     * Sets the "CustomerGlobalParameters" element
     */
    public void setCustomerGlobalParameters(amdocs.iam.pd.general.common.GlobalParameters customerGlobalParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalParameters target = null;
            target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().find_element_user(CUSTOMERGLOBALPARAMETERS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().add_element_user(CUSTOMERGLOBALPARAMETERS$0);
            }
            target.set(customerGlobalParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerGlobalParameters" element
     */
    public amdocs.iam.pd.general.common.GlobalParameters addNewCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalParameters target = null;
            target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().add_element_user(CUSTOMERGLOBALPARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerGlobalParameters" element
     */
    public void unsetCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERGLOBALPARAMETERS$0, 0);
        }
    }
}
