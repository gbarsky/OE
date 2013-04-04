/*
 * XML Type:  Result
 * Namespace: http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityOutput
 * Java type: amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.impl;
/**
 * An XML Result(@http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityOutput).
 *
 * This is a complex type.
 */
public class ResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result
{
    
    public ResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERPK$0 = 
        new javax.xml.namespace.QName("", "OfferPK");
    private static final javax.xml.namespace.QName PRODUCTID$2 = 
        new javax.xml.namespace.QName("", "productID");
    private static final javax.xml.namespace.QName ISOFFERELIGIBLE$4 = 
        new javax.xml.namespace.QName("", "isOfferEligible");
    private static final javax.xml.namespace.QName FALSEREASON$6 = 
        new javax.xml.namespace.QName("", "falseReason");
    private static final javax.xml.namespace.QName RESULTCUSTOM$8 = 
        new javax.xml.namespace.QName("", "ResultCustom");
    
    
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
     * Gets the "productID" element
     */
    public java.lang.String getProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$2, 0);
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
            return get_store().count_elements(PRODUCTID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTID$2);
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
            get_store().remove_element(PRODUCTID$2, 0);
        }
    }
    
    /**
     * Gets the "isOfferEligible" element
     */
    public boolean getIsOfferEligible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOFFERELIGIBLE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isOfferEligible" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsOfferEligible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOFFERELIGIBLE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isOfferEligible" element
     */
    public void setIsOfferEligible(boolean isOfferEligible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOFFERELIGIBLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOFFERELIGIBLE$4);
            }
            target.setBooleanValue(isOfferEligible);
        }
    }
    
    /**
     * Sets (as xml) the "isOfferEligible" element
     */
    public void xsetIsOfferEligible(org.apache.xmlbeans.XmlBoolean isOfferEligible)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISOFFERELIGIBLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISOFFERELIGIBLE$4);
            }
            target.set(isOfferEligible);
        }
    }
    
    /**
     * Gets the "falseReason" element
     */
    public java.lang.String getFalseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FALSEREASON$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "falseReason" element
     */
    public org.apache.xmlbeans.XmlString xgetFalseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FALSEREASON$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "falseReason" element
     */
    public boolean isSetFalseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FALSEREASON$6) != 0;
        }
    }
    
    /**
     * Sets the "falseReason" element
     */
    public void setFalseReason(java.lang.String falseReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FALSEREASON$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FALSEREASON$6);
            }
            target.setStringValue(falseReason);
        }
    }
    
    /**
     * Sets (as xml) the "falseReason" element
     */
    public void xsetFalseReason(org.apache.xmlbeans.XmlString falseReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FALSEREASON$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FALSEREASON$6);
            }
            target.set(falseReason);
        }
    }
    
    /**
     * Unsets the "falseReason" element
     */
    public void unsetFalseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FALSEREASON$6, 0);
        }
    }
    
    /**
     * Gets the "ResultCustom" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom getResultCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom)get_store().find_element_user(RESULTCUSTOM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResultCustom" element
     */
    public boolean isSetResultCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTCUSTOM$8) != 0;
        }
    }
    
    /**
     * Sets the "ResultCustom" element
     */
    public void setResultCustom(amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom resultCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom)get_store().find_element_user(RESULTCUSTOM$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom)get_store().add_element_user(RESULTCUSTOM$8);
            }
            target.set(resultCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "ResultCustom" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom addNewResultCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutputimpl.ResultCustom)get_store().add_element_user(RESULTCUSTOM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ResultCustom" element
     */
    public void unsetResultCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTCUSTOM$8, 0);
        }
    }
}
