/*
 * XML Type:  PurchasedProductCustom
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinputimpl.impl;
/**
 * An XML PurchasedProductCustom(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInputImpl).
 *
 * This is a complex type.
 */
public class PurchasedProductCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom
{
    
    public PurchasedProductCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLINGACCOUNTS$0 = 
        new javax.xml.namespace.QName("", "billingAccounts");
    private static final javax.xml.namespace.QName PRODUCTBUSINESSENTITY$2 = 
        new javax.xml.namespace.QName("", "productBusinessEntity");
    
    
    /**
     * Gets the "billingAccounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts getBillingAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts)get_store().find_element_user(BILLINGACCOUNTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "billingAccounts" element
     */
    public boolean isSetBillingAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLINGACCOUNTS$0) != 0;
        }
    }
    
    /**
     * Sets the "billingAccounts" element
     */
    public void setBillingAccounts(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts billingAccounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts)get_store().find_element_user(BILLINGACCOUNTS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts)get_store().add_element_user(BILLINGACCOUNTS$0);
            }
            target.set(billingAccounts);
        }
    }
    
    /**
     * Appends and returns a new empty "billingAccounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts addNewBillingAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts)get_store().add_element_user(BILLINGACCOUNTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "billingAccounts" element
     */
    public void unsetBillingAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLINGACCOUNTS$0, 0);
        }
    }
    
    /**
     * Gets the "productBusinessEntity" element
     */
    public java.lang.String getProductBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTBUSINESSENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productBusinessEntity" element
     */
    public org.apache.xmlbeans.XmlString xgetProductBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTBUSINESSENTITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productBusinessEntity" element
     */
    public void setProductBusinessEntity(java.lang.String productBusinessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTBUSINESSENTITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTBUSINESSENTITY$2);
            }
            target.setStringValue(productBusinessEntity);
        }
    }
    
    /**
     * Sets (as xml) the "productBusinessEntity" element
     */
    public void xsetProductBusinessEntity(org.apache.xmlbeans.XmlString productBusinessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTBUSINESSENTITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTBUSINESSENTITY$2);
            }
            target.set(productBusinessEntity);
        }
    }
}
