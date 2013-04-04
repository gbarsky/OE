/*
 * XML Type:  ChargeAttributes
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML ChargeAttributes(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class ChargeAttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes
{
    
    public ChargeAttributesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNT$0 = 
        new javax.xml.namespace.QName("", "discount");
    private static final javax.xml.namespace.QName REGULAR$2 = 
        new javax.xml.namespace.QName("", "regular");
    private static final javax.xml.namespace.QName CHARGEFREQUENCY$4 = 
        new javax.xml.namespace.QName("", "chargeFrequency");
    private static final javax.xml.namespace.QName CHARGESCUSTOM$6 = 
        new javax.xml.namespace.QName("", "chargesCustom");
    
    
    /**
     * Gets array of all "discount" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge[] getDiscountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISCOUNT$0, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge[] result = new amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "discount" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge getDiscountArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge)get_store().find_element_user(DISCOUNT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "discount" element
     */
    public int sizeOfDiscountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNT$0);
        }
    }
    
    /**
     * Sets array of all "discount" element
     */
    public void setDiscountArray(amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge[] discountArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(discountArray, DISCOUNT$0);
        }
    }
    
    /**
     * Sets ith "discount" element
     */
    public void setDiscountArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge discount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge)get_store().find_element_user(DISCOUNT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(discount);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "discount" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge insertNewDiscount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge)get_store().insert_element_user(DISCOUNT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "discount" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge addNewDiscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.DiscountCharge)get_store().add_element_user(DISCOUNT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "discount" element
     */
    public void removeDiscount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNT$0, i);
        }
    }
    
    /**
     * Gets array of all "regular" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge[] getRegularArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGULAR$2, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge[] result = new amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "regular" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge getRegularArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge)get_store().find_element_user(REGULAR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "regular" element
     */
    public int sizeOfRegularArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGULAR$2);
        }
    }
    
    /**
     * Sets array of all "regular" element
     */
    public void setRegularArray(amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge[] regularArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(regularArray, REGULAR$2);
        }
    }
    
    /**
     * Sets ith "regular" element
     */
    public void setRegularArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge regular)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge)get_store().find_element_user(REGULAR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(regular);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "regular" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge insertNewRegular(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge)get_store().insert_element_user(REGULAR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "regular" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge addNewRegular()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.RegularCharge)get_store().add_element_user(REGULAR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "regular" element
     */
    public void removeRegular(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGULAR$2, i);
        }
    }
    
    /**
     * Gets the "chargeFrequency" element
     */
    public double getChargeFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEFREQUENCY$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargeFrequency" element
     */
    public org.apache.xmlbeans.XmlDouble xgetChargeFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CHARGEFREQUENCY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "chargeFrequency" element
     */
    public boolean isSetChargeFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARGEFREQUENCY$4) != 0;
        }
    }
    
    /**
     * Sets the "chargeFrequency" element
     */
    public void setChargeFrequency(double chargeFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEFREQUENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGEFREQUENCY$4);
            }
            target.setDoubleValue(chargeFrequency);
        }
    }
    
    /**
     * Sets (as xml) the "chargeFrequency" element
     */
    public void xsetChargeFrequency(org.apache.xmlbeans.XmlDouble chargeFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CHARGEFREQUENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(CHARGEFREQUENCY$4);
            }
            target.set(chargeFrequency);
        }
    }
    
    /**
     * Unsets the "chargeFrequency" element
     */
    public void unsetChargeFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARGEFREQUENCY$4, 0);
        }
    }
    
    /**
     * Gets the "chargesCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom getChargesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom)get_store().find_element_user(CHARGESCUSTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "chargesCustom" element
     */
    public boolean isSetChargesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARGESCUSTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "chargesCustom" element
     */
    public void setChargesCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom chargesCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom)get_store().find_element_user(CHARGESCUSTOM$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom)get_store().add_element_user(CHARGESCUSTOM$6);
            }
            target.set(chargesCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "chargesCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom addNewChargesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.ChargesCustom)get_store().add_element_user(CHARGESCUSTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "chargesCustom" element
     */
    public void unsetChargesCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARGESCUSTOM$6, 0);
        }
    }
}
