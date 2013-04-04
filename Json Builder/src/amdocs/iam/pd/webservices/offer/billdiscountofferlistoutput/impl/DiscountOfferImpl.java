/*
 * XML Type:  DiscountOffer
 * Namespace: http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput
 * Java type: amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.impl;
/**
 * An XML DiscountOffer(@http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput).
 *
 * This is a complex type.
 */
public class DiscountOfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer
{
    
    public DiscountOfferImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName OFFERNAME$2 = 
        new javax.xml.namespace.QName("", "offerName");
    private static final javax.xml.namespace.QName OFFERDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "offerDescription");
    private static final javax.xml.namespace.QName EFFECTIVEDATE$6 = 
        new javax.xml.namespace.QName("", "effectiveDate");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$8 = 
        new javax.xml.namespace.QName("", "expirationDate");
    private static final javax.xml.namespace.QName PACKAGE$10 = 
        new javax.xml.namespace.QName("", "package");
    private static final javax.xml.namespace.QName DISCOUNTOFFERCUSTOM$12 = 
        new javax.xml.namespace.QName("", "DiscountOfferCustom");
    
    
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
     * Gets the "offerName" element
     */
    public java.lang.String getOfferName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERNAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERNAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERNAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERNAME$2);
            }
            target.set(offerName);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERDESCRIPTION$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERDESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERDESCRIPTION$4);
            }
            target.set(offerDescription);
        }
    }
    
    /**
     * Gets the "effectiveDate" element
     */
    public java.lang.String getEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "effectiveDate" element
     */
    public org.apache.xmlbeans.XmlString xgetEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "effectiveDate" element
     */
    public void setEffectiveDate(java.lang.String effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.setStringValue(effectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "effectiveDate" element
     */
    public void xsetEffectiveDate(org.apache.xmlbeans.XmlString effectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EFFECTIVEDATE$6);
            }
            target.set(effectiveDate);
        }
    }
    
    /**
     * Gets the "expirationDate" element
     */
    public java.lang.String getExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expirationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expirationDate" element
     */
    public void setExpirationDate(java.lang.String expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATE$8);
            }
            target.setStringValue(expirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "expirationDate" element
     */
    public void xsetExpirationDate(org.apache.xmlbeans.XmlString expirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPIRATIONDATE$8);
            }
            target.set(expirationDate);
        }
    }
    
    /**
     * Gets the "package" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement)get_store().find_element_user(PACKAGE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "package" element
     */
    public void setPackage(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement)get_store().find_element_user(PACKAGE$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement)get_store().add_element_user(PACKAGE$10);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Appends and returns a new empty "package" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement addNewPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.PackageElement)get_store().add_element_user(PACKAGE$10);
            return target;
        }
    }
    
    /**
     * Gets the "DiscountOfferCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom getDiscountOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom)get_store().find_element_user(DISCOUNTOFFERCUSTOM$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DiscountOfferCustom" element
     */
    public boolean isSetDiscountOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTOFFERCUSTOM$12) != 0;
        }
    }
    
    /**
     * Sets the "DiscountOfferCustom" element
     */
    public void setDiscountOfferCustom(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom discountOfferCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom)get_store().find_element_user(DISCOUNTOFFERCUSTOM$12, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom)get_store().add_element_user(DISCOUNTOFFERCUSTOM$12);
            }
            target.set(discountOfferCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DiscountOfferCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom addNewDiscountOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DiscountOfferCustom)get_store().add_element_user(DISCOUNTOFFERCUSTOM$12);
            return target;
        }
    }
    
    /**
     * Unsets the "DiscountOfferCustom" element
     */
    public void unsetDiscountOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTOFFERCUSTOM$12, 0);
        }
    }
}
