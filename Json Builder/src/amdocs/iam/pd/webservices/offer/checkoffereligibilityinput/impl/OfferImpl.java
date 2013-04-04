/*
 * XML Type:  Offer
 * Namespace: http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityInput
 * Java type: amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.impl;
/**
 * An XML Offer(@http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityInput).
 *
 * This is a complex type.
 */
public class OfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer
{
    
    public OfferImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERPK$0 = 
        new javax.xml.namespace.QName("", "OfferPK");
    private static final javax.xml.namespace.QName CUSTOMEROFFERPARAMETERS$2 = 
        new javax.xml.namespace.QName("", "CustomerOfferParameters");
    private static final javax.xml.namespace.QName PRODUCTID$4 = 
        new javax.xml.namespace.QName("", "productID");
    private static final javax.xml.namespace.QName OFFERCUSTOM$6 = 
        new javax.xml.namespace.QName("", "OfferCustom");
    
    
    /**
     * Gets the "OfferPK" element
     */
    public amdocs.iam.pd.general.common.OfferPK getOfferPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferPK target = null;
            target = (amdocs.iam.pd.general.common.OfferPK)get_store().find_element_user(OFFERPK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OfferPK" element
     */
    public void setOfferPK(amdocs.iam.pd.general.common.OfferPK offerPK)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferPK target = null;
            target = (amdocs.iam.pd.general.common.OfferPK)get_store().find_element_user(OFFERPK$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.OfferPK)get_store().add_element_user(OFFERPK$0);
            }
            target.set(offerPK);
        }
    }
    
    /**
     * Appends and returns a new empty "OfferPK" element
     */
    public amdocs.iam.pd.general.common.OfferPK addNewOfferPK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferPK target = null;
            target = (amdocs.iam.pd.general.common.OfferPK)get_store().add_element_user(OFFERPK$0);
            return target;
        }
    }
    
    /**
     * Gets the "CustomerOfferParameters" element
     */
    public amdocs.iam.pd.general.common.OfferParameters getCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferParameters target = null;
            target = (amdocs.iam.pd.general.common.OfferParameters)get_store().find_element_user(CUSTOMEROFFERPARAMETERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerOfferParameters" element
     */
    public boolean isSetCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMEROFFERPARAMETERS$2) != 0;
        }
    }
    
    /**
     * Sets the "CustomerOfferParameters" element
     */
    public void setCustomerOfferParameters(amdocs.iam.pd.general.common.OfferParameters customerOfferParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferParameters target = null;
            target = (amdocs.iam.pd.general.common.OfferParameters)get_store().find_element_user(CUSTOMEROFFERPARAMETERS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.OfferParameters)get_store().add_element_user(CUSTOMEROFFERPARAMETERS$2);
            }
            target.set(customerOfferParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerOfferParameters" element
     */
    public amdocs.iam.pd.general.common.OfferParameters addNewCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.OfferParameters target = null;
            target = (amdocs.iam.pd.general.common.OfferParameters)get_store().add_element_user(CUSTOMEROFFERPARAMETERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerOfferParameters" element
     */
    public void unsetCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMEROFFERPARAMETERS$2, 0);
        }
    }
    
    /**
     * Gets the "productID" element
     */
    public java.lang.String getProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productID" element
     */
    public org.apache.xmlbeans.XmlString xgetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "productID" element
     */
    public boolean isSetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$4) != 0;
        }
    }
    
    /**
     * Sets the "productID" element
     */
    public void setProductID(java.lang.String productID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$4);
            }
            target.setStringValue(productID);
        }
    }
    
    /**
     * Sets (as xml) the "productID" element
     */
    public void xsetProductID(org.apache.xmlbeans.XmlString productID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTID$4);
            }
            target.set(productID);
        }
    }
    
    /**
     * Unsets the "productID" element
     */
    public void unsetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$4, 0);
        }
    }
    
    /**
     * Gets the "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom getOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OfferCustom" element
     */
    public boolean isSetOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERCUSTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "OfferCustom" element
     */
    public void setOfferCustom(amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom offerCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$6);
            }
            target.set(offerCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom addNewOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "OfferCustom" element
     */
    public void unsetOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERCUSTOM$6, 0);
        }
    }
}
