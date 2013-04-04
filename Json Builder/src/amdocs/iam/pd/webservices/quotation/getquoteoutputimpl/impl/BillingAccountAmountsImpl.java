/*
 * XML Type:  BillingAccountAmounts
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.impl;
/**
 * An XML BillingAccountAmounts(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl).
 *
 * This is a complex type.
 */
public class BillingAccountAmountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts
{
    
    public BillingAccountAmountsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLINGACCOUNTID$0 = 
        new javax.xml.namespace.QName("", "billingAccountId");
    private static final javax.xml.namespace.QName AMOUNT$2 = 
        new javax.xml.namespace.QName("", "amount");
    private static final javax.xml.namespace.QName TAXAMOUNT$4 = 
        new javax.xml.namespace.QName("", "taxAmount");
    private static final javax.xml.namespace.QName TAXRATE$6 = 
        new javax.xml.namespace.QName("", "taxRate");
    private static final javax.xml.namespace.QName AMOUNTSAFTERTAX$8 = 
        new javax.xml.namespace.QName("", "amountsAfterTax");
    
    
    /**
     * Gets the "billingAccountId" element
     */
    public java.lang.String getBillingAccountId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLINGACCOUNTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billingAccountId" element
     */
    public org.apache.xmlbeans.XmlString xgetBillingAccountId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLINGACCOUNTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "billingAccountId" element
     */
    public void setBillingAccountId(java.lang.String billingAccountId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLINGACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLINGACCOUNTID$0);
            }
            target.setStringValue(billingAccountId);
        }
    }
    
    /**
     * Sets (as xml) the "billingAccountId" element
     */
    public void xsetBillingAccountId(org.apache.xmlbeans.XmlString billingAccountId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLINGACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLINGACCOUNTID$0);
            }
            target.set(billingAccountId);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$2);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AMOUNT$2);
            }
            target.set(amount);
        }
    }
    
    /**
     * Gets the "taxAmount" element
     */
    public double getTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "taxAmount" element
     */
    public org.apache.xmlbeans.XmlDouble xgetTaxAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAXAMOUNT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "taxAmount" element
     */
    public void setTaxAmount(double taxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXAMOUNT$4);
            }
            target.setDoubleValue(taxAmount);
        }
    }
    
    /**
     * Sets (as xml) the "taxAmount" element
     */
    public void xsetTaxAmount(org.apache.xmlbeans.XmlDouble taxAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAXAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TAXAMOUNT$4);
            }
            target.set(taxAmount);
        }
    }
    
    /**
     * Gets the "taxRate" element
     */
    public double getTaxRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXRATE$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "taxRate" element
     */
    public org.apache.xmlbeans.XmlDouble xgetTaxRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAXRATE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "taxRate" element
     */
    public void setTaxRate(double taxRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXRATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXRATE$6);
            }
            target.setDoubleValue(taxRate);
        }
    }
    
    /**
     * Sets (as xml) the "taxRate" element
     */
    public void xsetTaxRate(org.apache.xmlbeans.XmlDouble taxRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAXRATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TAXRATE$6);
            }
            target.set(taxRate);
        }
    }
    
    /**
     * Gets the "amountsAfterTax" element
     */
    public double getAmountsAfterTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNTSAFTERTAX$8, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "amountsAfterTax" element
     */
    public org.apache.xmlbeans.XmlDouble xgetAmountsAfterTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNTSAFTERTAX$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "amountsAfterTax" element
     */
    public void setAmountsAfterTax(double amountsAfterTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNTSAFTERTAX$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNTSAFTERTAX$8);
            }
            target.setDoubleValue(amountsAfterTax);
        }
    }
    
    /**
     * Sets (as xml) the "amountsAfterTax" element
     */
    public void xsetAmountsAfterTax(org.apache.xmlbeans.XmlDouble amountsAfterTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNTSAFTERTAX$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AMOUNTSAFTERTAX$8);
            }
            target.set(amountsAfterTax);
        }
    }
}
