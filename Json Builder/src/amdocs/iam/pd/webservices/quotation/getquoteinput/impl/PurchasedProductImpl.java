/*
 * XML Type:  PurchasedProduct
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinput.impl;
/**
 * An XML PurchasedProduct(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInput).
 *
 * This is a complex type.
 */
public class PurchasedProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteinput.PurchasedProduct
{
    
    public PurchasedProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURCHASEDPRODUCTID$0 = 
        new javax.xml.namespace.QName("", "purchasedProductId");
    private static final javax.xml.namespace.QName OFFERS$2 = 
        new javax.xml.namespace.QName("", "Offers");
    private static final javax.xml.namespace.QName PURCHASEDPRODUCTCUSTOM$4 = 
        new javax.xml.namespace.QName("", "purchasedProductCustom");
    
    
    /**
     * Gets the "purchasedProductId" element
     */
    public java.lang.String getPurchasedProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEDPRODUCTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "purchasedProductId" element
     */
    public org.apache.xmlbeans.XmlString xgetPurchasedProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURCHASEDPRODUCTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "purchasedProductId" element
     */
    public void setPurchasedProductId(java.lang.String purchasedProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEDPRODUCTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURCHASEDPRODUCTID$0);
            }
            target.setStringValue(purchasedProductId);
        }
    }
    
    /**
     * Sets (as xml) the "purchasedProductId" element
     */
    public void xsetPurchasedProductId(org.apache.xmlbeans.XmlString purchasedProductId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURCHASEDPRODUCTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PURCHASEDPRODUCTID$0);
            }
            target.set(purchasedProductId);
        }
    }
    
    /**
     * Gets the "Offers" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails getOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails)get_store().find_element_user(OFFERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Offers" element
     */
    public void setOffers(amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails offers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails)get_store().find_element_user(OFFERS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails)get_store().add_element_user(OFFERS$2);
            }
            target.set(offers);
        }
    }
    
    /**
     * Appends and returns a new empty "Offers" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails addNewOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetails)get_store().add_element_user(OFFERS$2);
            return target;
        }
    }
    
    /**
     * Gets the "purchasedProductCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom getPurchasedProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom)get_store().find_element_user(PURCHASEDPRODUCTCUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "purchasedProductCustom" element
     */
    public boolean isSetPurchasedProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURCHASEDPRODUCTCUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "purchasedProductCustom" element
     */
    public void setPurchasedProductCustom(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom purchasedProductCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom)get_store().find_element_user(PURCHASEDPRODUCTCUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom)get_store().add_element_user(PURCHASEDPRODUCTCUSTOM$4);
            }
            target.set(purchasedProductCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "purchasedProductCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom addNewPurchasedProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.PurchasedProductCustom)get_store().add_element_user(PURCHASEDPRODUCTCUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "purchasedProductCustom" element
     */
    public void unsetPurchasedProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURCHASEDPRODUCTCUSTOM$4, 0);
        }
    }
}
