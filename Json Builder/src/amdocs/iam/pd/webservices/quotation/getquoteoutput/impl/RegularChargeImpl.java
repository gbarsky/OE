/*
 * XML Type:  RegularCharge
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML RegularCharge(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class RegularChargeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge
{
    
    public RegularChargeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVENUECODE$0 = 
        new javax.xml.namespace.QName("", "revenueCode");
    private static final javax.xml.namespace.QName CHARGECODE$2 = 
        new javax.xml.namespace.QName("", "chargeCode");
    private static final javax.xml.namespace.QName AMOUNT$4 = 
        new javax.xml.namespace.QName("", "amount");
    private static final javax.xml.namespace.QName REGULARCUSTOM$6 = 
        new javax.xml.namespace.QName("", "regularCustom");
    
    
    /**
     * Gets the "revenueCode" element
     */
    public java.lang.String getRevenueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVENUECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "revenueCode" element
     */
    public org.apache.xmlbeans.XmlString xgetRevenueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVENUECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "revenueCode" element
     */
    public void setRevenueCode(java.lang.String revenueCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVENUECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVENUECODE$0);
            }
            target.setStringValue(revenueCode);
        }
    }
    
    /**
     * Sets (as xml) the "revenueCode" element
     */
    public void xsetRevenueCode(org.apache.xmlbeans.XmlString revenueCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVENUECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REVENUECODE$0);
            }
            target.set(revenueCode);
        }
    }
    
    /**
     * Gets the "chargeCode" element
     */
    public java.lang.String getChargeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargeCode" element
     */
    public org.apache.xmlbeans.XmlString xgetChargeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGECODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "chargeCode" element
     */
    public void setChargeCode(java.lang.String chargeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGECODE$2);
            }
            target.setStringValue(chargeCode);
        }
    }
    
    /**
     * Sets (as xml) the "chargeCode" element
     */
    public void xsetChargeCode(org.apache.xmlbeans.XmlString chargeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHARGECODE$2);
            }
            target.set(chargeCode);
        }
    }
    
    /**
     * Gets the "amount" element
     */
    public double getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "amount" element
     */
    public org.apache.xmlbeans.XmlDouble xgetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(double amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$4);
            }
            target.setDoubleValue(amount);
        }
    }
    
    /**
     * Sets (as xml) the "amount" element
     */
    public void xsetAmount(org.apache.xmlbeans.XmlDouble amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AMOUNT$4);
            }
            target.set(amount);
        }
    }
    
    /**
     * Gets the "regularCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom getRegularCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom)get_store().find_element_user(REGULARCUSTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regularCustom" element
     */
    public boolean isSetRegularCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGULARCUSTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "regularCustom" element
     */
    public void setRegularCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom regularCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom)get_store().find_element_user(REGULARCUSTOM$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom)get_store().add_element_user(REGULARCUSTOM$6);
            }
            target.set(regularCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "regularCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom addNewRegularCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.RegularCustom)get_store().add_element_user(REGULARCUSTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "regularCustom" element
     */
    public void unsetRegularCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGULARCUSTOM$6, 0);
        }
    }
}
