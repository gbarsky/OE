/*
 * XML Type:  VoucherOffer
 * Namespace: http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput
 * Java type: amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.offer.voucherlistoutput.impl;
/**
 * An XML VoucherOffer(@http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput).
 *
 * This is a complex type.
 */
public class VoucherOfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer
{
    
    public VoucherOfferImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName OFFERNAME$2 = 
        new javax.xml.namespace.QName("", "offerName");
    private static final javax.xml.namespace.QName OFFERDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "offerDescription");
    private static final javax.xml.namespace.QName PRODUCTCODE$6 = 
        new javax.xml.namespace.QName("", "productCode");
    private static final javax.xml.namespace.QName VOUCHERAVAILABILITY$8 = 
        new javax.xml.namespace.QName("", "voucherAvailability");
    private static final javax.xml.namespace.QName VOUCHEREXPIRATIONDATE$10 = 
        new javax.xml.namespace.QName("", "voucherExpirationDate");
    private static final javax.xml.namespace.QName VOUCHEREXPIRATIONPERIOD$12 = 
        new javax.xml.namespace.QName("", "voucherExpirationPeriod");
    private static final javax.xml.namespace.QName VOUCHERAMOUNT$14 = 
        new javax.xml.namespace.QName("", "voucherAmount");
    
    
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
     * True if has "productCode" element
     */
    public boolean isSetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCODE$6) != 0;
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
     * Unsets the "productCode" element
     */
    public void unsetProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCODE$6, 0);
        }
    }
    
    /**
     * Gets the "voucherAvailability" element
     */
    public java.lang.String getVoucherAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHERAVAILABILITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "voucherAvailability" element
     */
    public org.apache.xmlbeans.XmlString xgetVoucherAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOUCHERAVAILABILITY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "voucherAvailability" element
     */
    public void setVoucherAvailability(java.lang.String voucherAvailability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHERAVAILABILITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOUCHERAVAILABILITY$8);
            }
            target.setStringValue(voucherAvailability);
        }
    }
    
    /**
     * Sets (as xml) the "voucherAvailability" element
     */
    public void xsetVoucherAvailability(org.apache.xmlbeans.XmlString voucherAvailability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOUCHERAVAILABILITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOUCHERAVAILABILITY$8);
            }
            target.set(voucherAvailability);
        }
    }
    
    /**
     * Gets the "voucherExpirationDate" element
     */
    public java.lang.String getVoucherExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHEREXPIRATIONDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "voucherExpirationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetVoucherExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOUCHEREXPIRATIONDATE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "voucherExpirationDate" element
     */
    public void setVoucherExpirationDate(java.lang.String voucherExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHEREXPIRATIONDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOUCHEREXPIRATIONDATE$10);
            }
            target.setStringValue(voucherExpirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "voucherExpirationDate" element
     */
    public void xsetVoucherExpirationDate(org.apache.xmlbeans.XmlString voucherExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOUCHEREXPIRATIONDATE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOUCHEREXPIRATIONDATE$10);
            }
            target.set(voucherExpirationDate);
        }
    }
    
    /**
     * Gets the "voucherExpirationPeriod" element
     */
    public java.lang.String getVoucherExpirationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHEREXPIRATIONPERIOD$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "voucherExpirationPeriod" element
     */
    public org.apache.xmlbeans.XmlString xgetVoucherExpirationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOUCHEREXPIRATIONPERIOD$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "voucherExpirationPeriod" element
     */
    public void setVoucherExpirationPeriod(java.lang.String voucherExpirationPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHEREXPIRATIONPERIOD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOUCHEREXPIRATIONPERIOD$12);
            }
            target.setStringValue(voucherExpirationPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "voucherExpirationPeriod" element
     */
    public void xsetVoucherExpirationPeriod(org.apache.xmlbeans.XmlString voucherExpirationPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOUCHEREXPIRATIONPERIOD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOUCHEREXPIRATIONPERIOD$12);
            }
            target.set(voucherExpirationPeriod);
        }
    }
    
    /**
     * Gets the "voucherAmount" element
     */
    public double getVoucherAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHERAMOUNT$14, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "voucherAmount" element
     */
    public org.apache.xmlbeans.XmlDouble xgetVoucherAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VOUCHERAMOUNT$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "voucherAmount" element
     */
    public void setVoucherAmount(double voucherAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOUCHERAMOUNT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOUCHERAMOUNT$14);
            }
            target.setDoubleValue(voucherAmount);
        }
    }
    
    /**
     * Sets (as xml) the "voucherAmount" element
     */
    public void xsetVoucherAmount(org.apache.xmlbeans.XmlDouble voucherAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VOUCHERAMOUNT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VOUCHERAMOUNT$14);
            }
            target.set(voucherAmount);
        }
    }
}
