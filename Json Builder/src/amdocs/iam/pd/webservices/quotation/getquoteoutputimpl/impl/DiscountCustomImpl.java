/*
 * XML Type:  DiscountCustom
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.impl;
/**
 * An XML DiscountCustom(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl).
 *
 * This is a complex type.
 */
public class DiscountCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DiscountCustom
{
    
    public DiscountCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLINGACCOUNTAMOUNTS$0 = 
        new javax.xml.namespace.QName("", "billingAccountAmounts");
    private static final javax.xml.namespace.QName TOTALCHARGEAMOUNTS$2 = 
        new javax.xml.namespace.QName("", "totalChargeAmounts");
    private static final javax.xml.namespace.QName CHARGEROLE$4 = 
        new javax.xml.namespace.QName("", "chargeRole");
    private static final javax.xml.namespace.QName DYNAMICELEMENTS$6 = 
        new javax.xml.namespace.QName("", "dynamicElements");
    
    
    /**
     * Gets array of all "billingAccountAmounts" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts[] getBillingAccountAmountsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BILLINGACCOUNTAMOUNTS$0, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts[] result = new amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "billingAccountAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts getBillingAccountAmountsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts)get_store().find_element_user(BILLINGACCOUNTAMOUNTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "billingAccountAmounts" element
     */
    public int sizeOfBillingAccountAmountsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLINGACCOUNTAMOUNTS$0);
        }
    }
    
    /**
     * Sets array of all "billingAccountAmounts" element
     */
    public void setBillingAccountAmountsArray(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts[] billingAccountAmountsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(billingAccountAmountsArray, BILLINGACCOUNTAMOUNTS$0);
        }
    }
    
    /**
     * Sets ith "billingAccountAmounts" element
     */
    public void setBillingAccountAmountsArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts billingAccountAmounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts)get_store().find_element_user(BILLINGACCOUNTAMOUNTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(billingAccountAmounts);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "billingAccountAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts insertNewBillingAccountAmounts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts)get_store().insert_element_user(BILLINGACCOUNTAMOUNTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "billingAccountAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts addNewBillingAccountAmounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.BillingAccountAmounts)get_store().add_element_user(BILLINGACCOUNTAMOUNTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "billingAccountAmounts" element
     */
    public void removeBillingAccountAmounts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLINGACCOUNTAMOUNTS$0, i);
        }
    }
    
    /**
     * Gets the "totalChargeAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts getTotalChargeAmounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts)get_store().find_element_user(TOTALCHARGEAMOUNTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "totalChargeAmounts" element
     */
    public void setTotalChargeAmounts(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts totalChargeAmounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts)get_store().find_element_user(TOTALCHARGEAMOUNTS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts)get_store().add_element_user(TOTALCHARGEAMOUNTS$2);
            }
            target.set(totalChargeAmounts);
        }
    }
    
    /**
     * Appends and returns a new empty "totalChargeAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts addNewTotalChargeAmounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalChargeAmounts)get_store().add_element_user(TOTALCHARGEAMOUNTS$2);
            return target;
        }
    }
    
    /**
     * Gets the "chargeRole" element
     */
    public java.lang.String getChargeRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEROLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chargeRole" element
     */
    public org.apache.xmlbeans.XmlString xgetChargeRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGEROLE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "chargeRole" element
     */
    public void setChargeRole(java.lang.String chargeRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARGEROLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARGEROLE$4);
            }
            target.setStringValue(chargeRole);
        }
    }
    
    /**
     * Sets (as xml) the "chargeRole" element
     */
    public void xsetChargeRole(org.apache.xmlbeans.XmlString chargeRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHARGEROLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHARGEROLE$4);
            }
            target.set(chargeRole);
        }
    }
    
    /**
     * Gets array of all "dynamicElements" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement[] getDynamicElementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DYNAMICELEMENTS$6, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement[] result = new amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dynamicElements" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement getDynamicElementsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement)get_store().find_element_user(DYNAMICELEMENTS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dynamicElements" element
     */
    public int sizeOfDynamicElementsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DYNAMICELEMENTS$6);
        }
    }
    
    /**
     * Sets array of all "dynamicElements" element
     */
    public void setDynamicElementsArray(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement[] dynamicElementsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dynamicElementsArray, DYNAMICELEMENTS$6);
        }
    }
    
    /**
     * Sets ith "dynamicElements" element
     */
    public void setDynamicElementsArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement dynamicElements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement)get_store().find_element_user(DYNAMICELEMENTS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dynamicElements);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dynamicElements" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement insertNewDynamicElements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement)get_store().insert_element_user(DYNAMICELEMENTS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dynamicElements" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement addNewDynamicElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DynamicElement)get_store().add_element_user(DYNAMICELEMENTS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "dynamicElements" element
     */
    public void removeDynamicElements(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DYNAMICELEMENTS$6, i);
        }
    }
}
