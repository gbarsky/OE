/*
 * XML Type:  Amounts
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML Amounts(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class AmountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts
{
    
    public AmountsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROSSAMOUNT$0 = 
        new javax.xml.namespace.QName("", "grossAmount");
    private static final javax.xml.namespace.QName NETAMOUNT$2 = 
        new javax.xml.namespace.QName("", "netAmount");
    private static final javax.xml.namespace.QName DISCOUNTAMOUNT$4 = 
        new javax.xml.namespace.QName("", "discountAmount");
    private static final javax.xml.namespace.QName AMOUNTCUSTOM$6 = 
        new javax.xml.namespace.QName("", "AmountCustom");
    
    
    /**
     * Gets the "grossAmount" element
     */
    public double getGrossAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAMOUNT$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "grossAmount" element
     */
    public org.apache.xmlbeans.XmlDouble xgetGrossAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GROSSAMOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "grossAmount" element
     */
    public void setGrossAmount(double grossAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROSSAMOUNT$0);
            }
            target.setDoubleValue(grossAmount);
        }
    }
    
    /**
     * Sets (as xml) the "grossAmount" element
     */
    public void xsetGrossAmount(org.apache.xmlbeans.XmlDouble grossAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GROSSAMOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(GROSSAMOUNT$0);
            }
            target.set(grossAmount);
        }
    }
    
    /**
     * Gets the "netAmount" element
     */
    public double getNetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETAMOUNT$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "netAmount" element
     */
    public org.apache.xmlbeans.XmlDouble xgetNetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NETAMOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "netAmount" element
     */
    public void setNetAmount(double netAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETAMOUNT$2);
            }
            target.setDoubleValue(netAmount);
        }
    }
    
    /**
     * Sets (as xml) the "netAmount" element
     */
    public void xsetNetAmount(org.apache.xmlbeans.XmlDouble netAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NETAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(NETAMOUNT$2);
            }
            target.set(netAmount);
        }
    }
    
    /**
     * Gets the "discountAmount" element
     */
    public double getDiscountAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTAMOUNT$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "discountAmount" element
     */
    public org.apache.xmlbeans.XmlDouble xgetDiscountAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DISCOUNTAMOUNT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "discountAmount" element
     */
    public boolean isSetDiscountAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTAMOUNT$4) != 0;
        }
    }
    
    /**
     * Sets the "discountAmount" element
     */
    public void setDiscountAmount(double discountAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCOUNTAMOUNT$4);
            }
            target.setDoubleValue(discountAmount);
        }
    }
    
    /**
     * Sets (as xml) the "discountAmount" element
     */
    public void xsetDiscountAmount(org.apache.xmlbeans.XmlDouble discountAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DISCOUNTAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DISCOUNTAMOUNT$4);
            }
            target.set(discountAmount);
        }
    }
    
    /**
     * Unsets the "discountAmount" element
     */
    public void unsetDiscountAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTAMOUNT$4, 0);
        }
    }
    
    /**
     * Gets the "AmountCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom getAmountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom)get_store().find_element_user(AMOUNTCUSTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AmountCustom" element
     */
    public boolean isSetAmountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNTCUSTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "AmountCustom" element
     */
    public void setAmountCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom amountCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom)get_store().find_element_user(AMOUNTCUSTOM$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom)get_store().add_element_user(AMOUNTCUSTOM$6);
            }
            target.set(amountCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "AmountCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom addNewAmountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom)get_store().add_element_user(AMOUNTCUSTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "AmountCustom" element
     */
    public void unsetAmountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNTCUSTOM$6, 0);
        }
    }
}
