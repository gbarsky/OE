/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURCHASEDPRODUCTS$0 = 
        new javax.xml.namespace.QName("", "purchasedProducts");
    private static final javax.xml.namespace.QName DATACUSTOM$2 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "purchasedProducts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts getPurchasedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts)get_store().find_element_user(PURCHASEDPRODUCTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "purchasedProducts" element
     */
    public void setPurchasedProducts(amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts purchasedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts)get_store().find_element_user(PURCHASEDPRODUCTS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts)get_store().add_element_user(PURCHASEDPRODUCTS$0);
            }
            target.set(purchasedProducts);
        }
    }
    
    /**
     * Appends and returns a new empty "purchasedProducts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts addNewPurchasedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProducts)get_store().add_element_user(PURCHASEDPRODUCTS$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$2, 0);
        }
    }
}
