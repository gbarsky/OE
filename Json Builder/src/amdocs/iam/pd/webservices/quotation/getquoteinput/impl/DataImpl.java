/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("", "currency");
    private static final javax.xml.namespace.QName ACTIVITYCODE$2 = 
        new javax.xml.namespace.QName("", "activityCode");
    private static final javax.xml.namespace.QName LANGUAGE$4 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName OMITTAX$6 = 
        new javax.xml.namespace.QName("", "omitTax");
    private static final javax.xml.namespace.QName CUSTOMERGLOBALPARAMETERS$8 = 
        new javax.xml.namespace.QName("", "customerGlobalParameters");
    private static final javax.xml.namespace.QName PURCHASEDPRODUCTS$10 = 
        new javax.xml.namespace.QName("", "purchasedProducts");
    private static final javax.xml.namespace.QName DATACUSTOM$12 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
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
     * Gets the "activityCode" element
     */
    public java.lang.String getActivityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityCode" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "activityCode" element
     */
    public void setActivityCode(java.lang.String activityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYCODE$2);
            }
            target.setStringValue(activityCode);
        }
    }
    
    /**
     * Sets (as xml) the "activityCode" element
     */
    public void xsetActivityCode(org.apache.xmlbeans.XmlString activityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYCODE$2);
            }
            target.set(activityCode);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$4, 0);
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
            return get_store().count_elements(LANGUAGE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$4);
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
            get_store().remove_element(LANGUAGE$4, 0);
        }
    }
    
    /**
     * Gets the "omitTax" element
     */
    public java.lang.String getOmitTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMITTAX$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "omitTax" element
     */
    public org.apache.xmlbeans.XmlString xgetOmitTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMITTAX$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "omitTax" element
     */
    public boolean isSetOmitTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OMITTAX$6) != 0;
        }
    }
    
    /**
     * Sets the "omitTax" element
     */
    public void setOmitTax(java.lang.String omitTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OMITTAX$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OMITTAX$6);
            }
            target.setStringValue(omitTax);
        }
    }
    
    /**
     * Sets (as xml) the "omitTax" element
     */
    public void xsetOmitTax(org.apache.xmlbeans.XmlString omitTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OMITTAX$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OMITTAX$6);
            }
            target.set(omitTax);
        }
    }
    
    /**
     * Unsets the "omitTax" element
     */
    public void unsetOmitTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OMITTAX$6, 0);
        }
    }
    
    /**
     * Gets the "customerGlobalParameters" element
     */
    public amdocs.iam.pd.general.common.ParametersDimT getCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.ParametersDimT target = null;
            target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().find_element_user(CUSTOMERGLOBALPARAMETERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customerGlobalParameters" element
     */
    public boolean isSetCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERGLOBALPARAMETERS$8) != 0;
        }
    }
    
    /**
     * Sets the "customerGlobalParameters" element
     */
    public void setCustomerGlobalParameters(amdocs.iam.pd.general.common.ParametersDimT customerGlobalParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.ParametersDimT target = null;
            target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().find_element_user(CUSTOMERGLOBALPARAMETERS$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().add_element_user(CUSTOMERGLOBALPARAMETERS$8);
            }
            target.set(customerGlobalParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "customerGlobalParameters" element
     */
    public amdocs.iam.pd.general.common.ParametersDimT addNewCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.ParametersDimT target = null;
            target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().add_element_user(CUSTOMERGLOBALPARAMETERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "customerGlobalParameters" element
     */
    public void unsetCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERGLOBALPARAMETERS$8, 0);
        }
    }
    
    /**
     * Gets the "purchasedProducts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts getPurchasedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts)get_store().find_element_user(PURCHASEDPRODUCTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "purchasedProducts" element
     */
    public void setPurchasedProducts(amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts purchasedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts)get_store().find_element_user(PURCHASEDPRODUCTS$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts)get_store().add_element_user(PURCHASEDPRODUCTS$10);
            }
            target.set(purchasedProducts);
        }
    }
    
    /**
     * Appends and returns a new empty "purchasedProducts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts addNewPurchasedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts)get_store().add_element_user(PURCHASEDPRODUCTS$10);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$12, 0);
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
            return get_store().count_elements(DATACUSTOM$12) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$12, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$12);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$12);
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
            get_store().remove_element(DATACUSTOM$12, 0);
        }
    }
}
