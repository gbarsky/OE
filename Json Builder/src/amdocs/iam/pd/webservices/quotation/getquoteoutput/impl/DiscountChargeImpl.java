/*
 * XML Type:  DiscountCharge
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML DiscountCharge(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class DiscountChargeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge
{
    
    public DiscountChargeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTOFFERCODE$0 = 
        new javax.xml.namespace.QName("", "discountOfferCode");
    private static final javax.xml.namespace.QName REVENUECODE$2 = 
        new javax.xml.namespace.QName("", "revenueCode");
    private static final javax.xml.namespace.QName CHARGECODE$4 = 
        new javax.xml.namespace.QName("", "chargeCode");
    private static final javax.xml.namespace.QName AMOUNT$6 = 
        new javax.xml.namespace.QName("", "amount");
    private static final javax.xml.namespace.QName DISCOUNTCUSTOM$8 = 
        new javax.xml.namespace.QName("", "discountCustom");
    
    
    /**
     * Gets the "discountOfferCode" element
     */
    public java.lang.String getDiscountOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTOFFERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "discountOfferCode" element
     */
    public org.apache.xmlbeans.XmlString xgetDiscountOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCOUNTOFFERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "discountOfferCode" element
     */
    public void setDiscountOfferCode(java.lang.String discountOfferCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTOFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCOUNTOFFERCODE$0);
            }
            target.setStringValue(discountOfferCode);
        }
    }
    
    /**
     * Sets (as xml) the "discountOfferCode" element
     */
    public void xsetDiscountOfferCode(org.apache.xmlbeans.XmlString discountOfferCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISCOUNTOFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISCOUNTOFFERCODE$0);
            }
            target.set(discountOfferCode);
        }
    }
    
    /**
     * Gets the "revenueCode" element
     */
    public java.lang.String getRevenueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVENUECODE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVENUECODE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVENUECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVENUECODE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVENUECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REVENUECODE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGECODE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGECODE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGECODE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHARGECODE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$6, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$6);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AMOUNT$6);
            }
            target.set(amount);
        }
    }
    
    /**
     * Gets the "discountCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom getDiscountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom)get_store().find_element_user(DISCOUNTCUSTOM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "discountCustom" element
     */
    public boolean isSetDiscountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTCUSTOM$8) != 0;
        }
    }
    
    /**
     * Sets the "discountCustom" element
     */
    public void setDiscountCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom discountCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom)get_store().find_element_user(DISCOUNTCUSTOM$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom)get_store().add_element_user(DISCOUNTCUSTOM$8);
            }
            target.set(discountCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "discountCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom addNewDiscountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom)get_store().add_element_user(DISCOUNTCUSTOM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "discountCustom" element
     */
    public void unsetDiscountCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTCUSTOM$8, 0);
        }
    }
}
