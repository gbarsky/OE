/*
 * XML Type:  BillingAccount
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinputimpl.impl;
/**
 * An XML BillingAccount(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInputImpl).
 *
 * This is a complex type.
 */
public class BillingAccountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount
{
    
    public BillingAccountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLINGACCOUNTID$0 = 
        new javax.xml.namespace.QName("", "billingAccountId");
    private static final javax.xml.namespace.QName PERCENTAGE$2 = 
        new javax.xml.namespace.QName("", "percentage");
    
    
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
     * Gets the "percentage" element
     */
    public double getPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "percentage" element
     */
    public org.apache.xmlbeans.XmlDouble xgetPercentage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PERCENTAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "percentage" element
     */
    public void setPercentage(double percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTAGE$2);
            }
            target.setDoubleValue(percentage);
        }
    }
    
    /**
     * Sets (as xml) the "percentage" element
     */
    public void xsetPercentage(org.apache.xmlbeans.XmlDouble percentage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PERCENTAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PERCENTAGE$2);
            }
            target.set(percentage);
        }
    }
}
