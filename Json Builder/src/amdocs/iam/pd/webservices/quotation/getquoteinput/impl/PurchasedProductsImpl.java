/*
 * XML Type:  PurchasedProducts
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinput.impl;
/**
 * An XML PurchasedProducts(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInput).
 *
 * This is a complex type.
 */
public class PurchasedProductsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProducts
{
    
    public PurchasedProductsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURCHASEDPRODUCT$0 = 
        new javax.xml.namespace.QName("", "purchasedProduct");
    
    
    /**
     * Gets array of all "purchasedProduct" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct[] getPurchasedProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PURCHASEDPRODUCT$0, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct[] result = new amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "purchasedProduct" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct getPurchasedProductArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct)get_store().find_element_user(PURCHASEDPRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "purchasedProduct" element
     */
    public int sizeOfPurchasedProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURCHASEDPRODUCT$0);
        }
    }
    
    /**
     * Sets array of all "purchasedProduct" element
     */
    public void setPurchasedProductArray(amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct[] purchasedProductArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(purchasedProductArray, PURCHASEDPRODUCT$0);
        }
    }
    
    /**
     * Sets ith "purchasedProduct" element
     */
    public void setPurchasedProductArray(int i, amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct purchasedProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct)get_store().find_element_user(PURCHASEDPRODUCT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(purchasedProduct);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "purchasedProduct" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct insertNewPurchasedProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct)get_store().insert_element_user(PURCHASEDPRODUCT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "purchasedProduct" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct addNewPurchasedProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct)get_store().add_element_user(PURCHASEDPRODUCT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "purchasedProduct" element
     */
    public void removePurchasedProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURCHASEDPRODUCT$0, i);
        }
    }
}
