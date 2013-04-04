/*
 * XML Type:  CustomerParameterTypes
 * Namespace: http://amdocs/iam/pd/webservices/heading/HeadingListInput
 * Java type: amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.heading.headinglistinput.impl;
/**
 * An XML CustomerParameterTypes(@http://amdocs/iam/pd/webservices/heading/HeadingListInput).
 *
 * This is a complex type.
 */
public class CustomerParameterTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.heading.headinglistinput.CustomerParameterTypes
{
    
    public CustomerParameterTypesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERGLOBALPARAMETERS$0 = 
        new javax.xml.namespace.QName("", "CustomerGlobalParameters");
    private static final javax.xml.namespace.QName CUSTOMEROFFERPARAMETERS$2 = 
        new javax.xml.namespace.QName("", "CustomerOfferParameters");
    
    
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
    
    /**
     * Gets the "CustomerOfferParameters" element
     */
    public amdocs.iam.pd.general.common.OfferParameters getCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferParameters target = null;
            target = (amdocs.iam.pd.general.common.OfferParameters)get_store().find_element_user(CUSTOMEROFFERPARAMETERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerOfferParameters" element
     */
    public boolean isSetCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMEROFFERPARAMETERS$2) != 0;
        }
    }
    
    /**
     * Sets the "CustomerOfferParameters" element
     */
    public void setCustomerOfferParameters(amdocs.iam.pd.general.common.OfferParameters customerOfferParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferParameters target = null;
            target = (amdocs.iam.pd.general.common.OfferParameters)get_store().find_element_user(CUSTOMEROFFERPARAMETERS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.OfferParameters)get_store().add_element_user(CUSTOMEROFFERPARAMETERS$2);
            }
            target.set(customerOfferParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerOfferParameters" element
     */
    public amdocs.iam.pd.general.common.OfferParameters addNewCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferParameters target = null;
            target = (amdocs.iam.pd.general.common.OfferParameters)get_store().add_element_user(CUSTOMEROFFERPARAMETERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerOfferParameters" element
     */
    public void unsetCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMEROFFERPARAMETERS$2, 0);
        }
    }
}
