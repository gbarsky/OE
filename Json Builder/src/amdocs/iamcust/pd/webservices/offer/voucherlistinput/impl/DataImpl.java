/*
 * XML Type:  Data
 * Namespace: http://amdocs/iamcust/pd/webservices/offer/VoucherListInput
 * Java type: amdocs.iamcust.pd.webservices.offer.voucherlistinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.offer.voucherlistinput.impl;
/**
 * An XML Data(@http://amdocs/iamcust/pd/webservices/offer/VoucherListInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.offer.voucherlistinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName CURRENCY$2 = 
        new javax.xml.namespace.QName("", "currency");
    private static final javax.xml.namespace.QName CUSTOMERPARAMETERS$4 = 
        new javax.xml.namespace.QName("", "CustomerParameters");
    
    
    /**
     * Gets the "productCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "productCode" element
     */
    public boolean isSetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCODE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$0);
            }
            target.set(productCode);
        }
    }
    
    /**
     * Unsets the "productCode" element
     */
    public void unsetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCODE$0, 0);
        }
    }
    
    /**
     * Gets the "currency" element
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$2, 0);
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
            return get_store().count_elements(CURRENCY$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$2);
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
            get_store().remove_element(CURRENCY$2, 0);
        }
    }
    
    /**
     * Gets the "CustomerParameters" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter getCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter)get_store().find_element_user(CUSTOMERPARAMETERS$4, 0);
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
            return get_store().count_elements(CUSTOMERPARAMETERS$4) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParameters" element
     */
    public void setCustomerParameters(amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter customerParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter)get_store().find_element_user(CUSTOMERPARAMETERS$4, 0);
            if (target == null)
            {
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter)get_store().add_element_user(CUSTOMERPARAMETERS$4);
            }
            target.set(customerParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerParameters" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter addNewCustomerParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.CustomerParameter)get_store().add_element_user(CUSTOMERPARAMETERS$4);
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
            get_store().remove_element(CUSTOMERPARAMETERS$4, 0);
        }
    }
}
