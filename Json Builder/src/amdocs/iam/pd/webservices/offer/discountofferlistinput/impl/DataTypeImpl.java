/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/offer/DiscountOfferListInput
 * Java type: amdocs.iam.pd.webservices.offer.discountofferlistinput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.discountofferlistinput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/offer/DiscountOfferListInput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.discountofferlistinput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName LANGUAGE$2 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName DATACUSTOM$4 = 
        new javax.xml.namespace.QName("", "DataCustom");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$6 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    
    
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
     * Gets the "language" element
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$2, 0);
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
            return get_store().count_elements(LANGUAGE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$2);
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
            get_store().remove_element(LANGUAGE$2, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
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
    public void setDataCustom(amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
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
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
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
            return get_store().count_elements(CUSTOMERPARAMETERS$6) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParameters" element
     */
    public void setCustomerParameters(amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes)get_store().find_element_user(CUSTOMERPARAMETERS$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.CustomerParameterTypes)get_store().add_element_user(CUSTOMERPARAMETERS$6);
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
            get_store().remove_element(CUSTOMERPARAMETERS$6, 0);
        }
    }
}
