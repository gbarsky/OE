/*
 * XML Type:  Offer
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/OfferListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.offerlistoutput.impl;
/**
 * An XML Offer(@http://amdocs/iam/pd/webservices/productOffer/OfferListOutput).
 *
 * This is a complex type.
 */
public class OfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offer
{
    
    public OfferImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName OFFERDESCRIPTION$2 = 
        new javax.xml.namespace.QName("", "offerDescription");
    private static final javax.xml.namespace.QName OFFERNAME$4 = 
        new javax.xml.namespace.QName("", "offerName");
    private static final javax.xml.namespace.QName PRODUCTCODE$6 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName OFFERCUSTOM$8 = 
        new javax.xml.namespace.QName("", "OfferCustom");
    
    
    /**
     * Gets the "offerCode" element
     */
    public java.lang.String getOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerCode" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerCode" element
     */
    public void setOfferCode(java.lang.String offerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERCODE$0);
            }
            target.setStringValue(offerCode);
        }
    }
    
    /**
     * Sets (as xml) the "offerCode" element
     */
    public void xsetOfferCode(org.apache.xmlbeans.XmlString offerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERCODE$0);
            }
            target.set(offerCode);
        }
    }
    
    /**
     * Gets the "offerDescription" element
     */
    public java.lang.String getOfferDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerDescription" element
     */
    public void setOfferDescription(java.lang.String offerDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERDESCRIPTION$2);
            }
            target.setStringValue(offerDescription);
        }
    }
    
    /**
     * Sets (as xml) the "offerDescription" element
     */
    public void xsetOfferDescription(org.apache.xmlbeans.XmlString offerDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERDESCRIPTION$2);
            }
            target.set(offerDescription);
        }
    }
    
    /**
     * Gets the "offerName" element
     */
    public java.lang.String getOfferName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerName" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerName" element
     */
    public void setOfferName(java.lang.String offerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERNAME$4);
            }
            target.setStringValue(offerName);
        }
    }
    
    /**
     * Sets (as xml) the "offerName" element
     */
    public void xsetOfferName(org.apache.xmlbeans.XmlString offerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERNAME$4);
            }
            target.set(offerName);
        }
    }
    
    /**
     * Gets the "productCode" element
     */
    public java.lang.String getProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "productCode" element
     */
    public org.apache.xmlbeans.XmlString xgetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "productCode" element
     */
    public void setProductCode(java.lang.String productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTCODE$6);
            }
            target.setStringValue(productCode);
        }
    }
    
    /**
     * Sets (as xml) the "productCode" element
     */
    public void xsetProductCode(org.apache.xmlbeans.XmlString productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTCODE$6);
            }
            target.set(productCode);
        }
    }
    
    /**
     * Gets the "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom getOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$8, 0);
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
            return get_store().count_elements(OFFERCUSTOM$8) != 0;
        }
    }
    
    /**
     * Sets the "OfferCustom" element
     */
    public void setOfferCustom(amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom offerCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$8);
            }
            target.set(offerCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom addNewOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistoutputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$8);
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
            get_store().remove_element(OFFERCUSTOM$8, 0);
        }
    }
}
