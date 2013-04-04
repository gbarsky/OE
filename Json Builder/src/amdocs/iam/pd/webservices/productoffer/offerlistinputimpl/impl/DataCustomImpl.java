/*
 * XML Type:  DataCustom
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/OfferListInputImpl
 * Java type: amdocs.iam.pd.webservices.productoffer.offerlistinputimpl.DataCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.offerlistinputimpl.impl;
/**
 * An XML DataCustom(@http://amdocs/iam/pd/webservices/productOffer/OfferListInputImpl).
 *
 * This is a complex type.
 */
public class DataCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.offerlistinputimpl.DataCustom
{
    
    public DataCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCY$0 = 
        new javax.xml.namespace.QName("", "currency");
    private static final javax.xml.namespace.QName FREEOFFERIND$2 = 
        new javax.xml.namespace.QName("", "freeOfferInd");
    private static final javax.xml.namespace.QName BUNDLEIND$4 = 
        new javax.xml.namespace.QName("", "bundleInd");
    
    
    /**
     * Gets the "currency" element
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currency" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "currency" element
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURRENCY$0) != 0;
        }
    }
    
    /**
     * Sets the "currency" element
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$0);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "currency" element
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$0);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "currency" element
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURRENCY$0, 0);
        }
    }
    
    /**
     * Gets the "freeOfferInd" element
     */
    public java.lang.String getFreeOfferInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEOFFERIND$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "freeOfferInd" element
     */
    public org.apache.xmlbeans.XmlString xgetFreeOfferInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEOFFERIND$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "freeOfferInd" element
     */
    public boolean isSetFreeOfferInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREEOFFERIND$2) != 0;
        }
    }
    
    /**
     * Sets the "freeOfferInd" element
     */
    public void setFreeOfferInd(java.lang.String freeOfferInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEOFFERIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEOFFERIND$2);
            }
            target.setStringValue(freeOfferInd);
        }
    }
    
    /**
     * Sets (as xml) the "freeOfferInd" element
     */
    public void xsetFreeOfferInd(org.apache.xmlbeans.XmlString freeOfferInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEOFFERIND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEOFFERIND$2);
            }
            target.set(freeOfferInd);
        }
    }
    
    /**
     * Unsets the "freeOfferInd" element
     */
    public void unsetFreeOfferInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREEOFFERIND$2, 0);
        }
    }
    
    /**
     * Gets the "bundleInd" element
     */
    public java.lang.String getBundleInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLEIND$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bundleInd" element
     */
    public org.apache.xmlbeans.XmlString xgetBundleInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLEIND$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "bundleInd" element
     */
    public boolean isSetBundleInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUNDLEIND$4) != 0;
        }
    }
    
    /**
     * Sets the "bundleInd" element
     */
    public void setBundleInd(java.lang.String bundleInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUNDLEIND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUNDLEIND$4);
            }
            target.setStringValue(bundleInd);
        }
    }
    
    /**
     * Sets (as xml) the "bundleInd" element
     */
    public void xsetBundleInd(org.apache.xmlbeans.XmlString bundleInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUNDLEIND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUNDLEIND$4);
            }
            target.set(bundleInd);
        }
    }
    
    /**
     * Unsets the "bundleInd" element
     */
    public void unsetBundleInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUNDLEIND$4, 0);
        }
    }
}
