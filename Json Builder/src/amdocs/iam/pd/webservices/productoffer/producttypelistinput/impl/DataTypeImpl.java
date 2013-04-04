/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/ProductTypeListInput
 * Java type: amdocs.iam.pd.webservices.productoffer.producttypelistinput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.producttypelistinput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/productOffer/ProductTypeListInput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.producttypelistinput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$2 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    private static final javax.xml.namespace.QName DATACUSTOM$4 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "language" element
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" element
     */
    public org.apache.xmlbeans.XmlString xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$0);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" element
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlString language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$0);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$0, 0);
        }
    }
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$2, 0);
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
            return get_store().count_elements(CUSTOMERPARAMETERS$2) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParameters" element
     */
    public void setCustomerParameters(amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$2);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$2);
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
            get_store().remove_element(CUSTOMERPARAMETERS$2, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
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
    public void setDataCustom(amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.producttypelistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
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
