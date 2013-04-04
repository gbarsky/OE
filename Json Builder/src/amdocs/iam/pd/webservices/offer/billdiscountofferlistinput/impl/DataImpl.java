/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListInput
 * Java type: amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$0 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    private static final javax.xml.namespace.QName DATACUSTOM$2 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerParameters" element
     */
    public boolean isSetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARAMETERS$0) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParameters" element
     */
    public void setCustomerParameters(amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$0);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerParameters" element
     */
    public void unsetCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARAMETERS$0, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
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
            return get_store().count_elements(DATACUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
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
            get_store().remove_element(DATACUSTOM$2, 0);
        }
    }
}
