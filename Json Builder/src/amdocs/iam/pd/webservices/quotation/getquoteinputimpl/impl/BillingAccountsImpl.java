/*
 * XML Type:  BillingAccounts
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinputimpl.impl;
/**
 * An XML BillingAccounts(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInputImpl).
 *
 * This is a complex type.
 */
public class BillingAccountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccounts
{
    
    public BillingAccountsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RC$0 = 
        new javax.xml.namespace.QName("", "RC");
    private static final javax.xml.namespace.QName OC$2 = 
        new javax.xml.namespace.QName("", "OC");
    
    
    /**
     * Gets array of all "RC" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[] getRCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RC$0, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[] result = new amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount getRCArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().find_element_user(RC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RC" element
     */
    public int sizeOfRCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RC$0);
        }
    }
    
    /**
     * Sets array of all "RC" element
     */
    public void setRCArray(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[] rcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rcArray, RC$0);
        }
    }
    
    /**
     * Sets ith "RC" element
     */
    public void setRCArray(int i, amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount rc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().find_element_user(RC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount insertNewRC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().insert_element_user(RC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount addNewRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().add_element_user(RC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RC" element
     */
    public void removeRC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RC$0, i);
        }
    }
    
    /**
     * Gets array of all "OC" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[] getOCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OC$2, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[] result = new amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount getOCArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().find_element_user(OC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OC" element
     */
    public int sizeOfOCArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OC$2);
        }
    }
    
    /**
     * Sets array of all "OC" element
     */
    public void setOCArray(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount[] ocArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ocArray, OC$2);
        }
    }
    
    /**
     * Sets ith "OC" element
     */
    public void setOCArray(int i, amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount oc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().find_element_user(OC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount insertNewOC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().insert_element_user(OC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount addNewOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.BillingAccount)get_store().add_element_user(OC$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "OC" element
     */
    public void removeOC(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OC$2, i);
        }
    }
}
