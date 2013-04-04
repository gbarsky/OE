/*
 * XML Type:  TotalChargeAmounts
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.impl;
/**
 * An XML TotalChargeAmounts(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl).
 *
 * This is a complex type.
 */
public class TotalChargeAmountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts
{
    
    public TotalChargeAmountsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMOUNTSAFTERTAX$0 = 
        new javax.xml.namespace.QName("", "amountsAfterTax");
    private static final javax.xml.namespace.QName TAXAMOUNT$2 = 
        new javax.xml.namespace.QName("", "taxAmount");
    
    
    /**
     * Gets the "amountsAfterTax" element
     */
    public double getAmountsAfterTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNTSAFTERTAX$0, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNTSAFTERTAX$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNTSAFTERTAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNTSAFTERTAX$0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNTSAFTERTAX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AMOUNTSAFTERTAX$0);
            }
            target.set(amountsAfterTax);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$2, 0);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAXAMOUNT$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAXAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAXAMOUNT$2);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TAXAMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TAXAMOUNT$2);
            }
            target.set(taxAmount);
        }
    }
}
