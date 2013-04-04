/*
 * XML Type:  PurchasedProduct
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProduct
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML PurchasedProduct(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class PurchasedProductImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.PurchasedProduct
{
    
    public PurchasedProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURCHASEDPRODUCTID$0 = 
        new javax.xml.namespace.QName("", "purchasedProductId");
    private static final javax.xml.namespace.QName ERRORMESSAGE$2 = 
        new javax.xml.namespace.QName("", "errorMessage");
    private static final javax.xml.namespace.QName OFFERS$4 = 
        new javax.xml.namespace.QName("", "Offers");
    private static final javax.xml.namespace.QName PURCHASEDPRODUCTCUSTOM$6 = 
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
     * Gets the "errorMessage" element
     */
    public java.lang.String getErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorMessage" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "errorMessage" element
     */
    public boolean isSetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORMESSAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "errorMessage" element
     */
    public void setErrorMessage(java.lang.String errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMESSAGE$2);
            }
            target.setStringValue(errorMessage);
        }
    }
    
    /**
     * Sets (as xml) the "errorMessage" element
     */
    public void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$2);
            }
            target.set(errorMessage);
        }
    }
    
    /**
     * Unsets the "errorMessage" element
     */
    public void unsetErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMESSAGE$2, 0);
        }
    }
    
    /**
     * Gets the "Offers" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails getOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails)get_store().find_element_user(OFFERS$4, 0);
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
    public void setOffers(amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails offers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails)get_store().find_element_user(OFFERS$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails)get_store().add_element_user(OFFERS$4);
            }
            target.set(offers);
        }
    }
    
    /**
     * Appends and returns a new empty "Offers" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails addNewOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails)get_store().add_element_user(OFFERS$4);
            return target;
        }
    }
    
    /**
     * Gets the "purchasedProductCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom getPurchasedProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom)get_store().find_element_user(PURCHASEDPRODUCTCUSTOM$6, 0);
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
            return get_store().count_elements(PURCHASEDPRODUCTCUSTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "purchasedProductCustom" element
     */
    public void setPurchasedProductCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom purchasedProductCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom)get_store().find_element_user(PURCHASEDPRODUCTCUSTOM$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom)get_store().add_element_user(PURCHASEDPRODUCTCUSTOM$6);
            }
            target.set(purchasedProductCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "purchasedProductCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom addNewPurchasedProductCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.PurchasedProductCustom)get_store().add_element_user(PURCHASEDPRODUCTCUSTOM$6);
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
            get_store().remove_element(PURCHASEDPRODUCTCUSTOM$6, 0);
        }
    }
}
