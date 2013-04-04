/*
 * XML Type:  OfferDetail
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteInput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteinput.impl;
/**
 * An XML OfferDetail(@http://amdocs/iam/pd/webservices/quotation/GetQuoteInput).
 *
 * This is a complex type.
 */
public class OfferDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteinput.OfferDetail
{
    
    public OfferDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName OFFERTYPE$2 = 
        new javax.xml.namespace.QName("", "offerType");
    private static final javax.xml.namespace.QName OFFERINSTANCE$4 = 
        new javax.xml.namespace.QName("", "offerInstance");
    private static final javax.xml.namespace.QName OFFERACTIVITYCODE$6 = 
        new javax.xml.namespace.QName("", "offerActivityCode");
    private static final javax.xml.namespace.QName OFFERACTIVITYREASON$8 = 
        new javax.xml.namespace.QName("", "offerActivityReason");
    private static final javax.xml.namespace.QName CUSTOMEROFFERPARAMETERS$10 = 
        new javax.xml.namespace.QName("", "customerOfferParameters");
    private static final javax.xml.namespace.QName OFFERCUSTOM$12 = 
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
     * Gets the "offerType" element
     */
    public java.lang.String getOfferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerType" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerType" element
     */
    public void setOfferType(java.lang.String offerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERTYPE$2);
            }
            target.setStringValue(offerType);
        }
    }
    
    /**
     * Sets (as xml) the "offerType" element
     */
    public void xsetOfferType(org.apache.xmlbeans.XmlString offerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERTYPE$2);
            }
            target.set(offerType);
        }
    }
    
    /**
     * Gets the "offerInstance" element
     */
    public java.lang.String getOfferInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINSTANCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerInstance" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINSTANCE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "offerInstance" element
     */
    public boolean isSetOfferInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFERINSTANCE$4) != 0;
        }
    }
    
    /**
     * Sets the "offerInstance" element
     */
    public void setOfferInstance(java.lang.String offerInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINSTANCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERINSTANCE$4);
            }
            target.setStringValue(offerInstance);
        }
    }
    
    /**
     * Sets (as xml) the "offerInstance" element
     */
    public void xsetOfferInstance(org.apache.xmlbeans.XmlString offerInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINSTANCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERINSTANCE$4);
            }
            target.set(offerInstance);
        }
    }
    
    /**
     * Unsets the "offerInstance" element
     */
    public void unsetOfferInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFERINSTANCE$4, 0);
        }
    }
    
    /**
     * Gets the "offerActivityCode" element
     */
    public java.lang.String getOfferActivityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERACTIVITYCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerActivityCode" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferActivityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERACTIVITYCODE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerActivityCode" element
     */
    public void setOfferActivityCode(java.lang.String offerActivityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERACTIVITYCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERACTIVITYCODE$6);
            }
            target.setStringValue(offerActivityCode);
        }
    }
    
    /**
     * Sets (as xml) the "offerActivityCode" element
     */
    public void xsetOfferActivityCode(org.apache.xmlbeans.XmlString offerActivityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERACTIVITYCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERACTIVITYCODE$6);
            }
            target.set(offerActivityCode);
        }
    }
    
    /**
     * Gets the "offerActivityReason" element
     */
    public java.lang.String getOfferActivityReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERACTIVITYREASON$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerActivityReason" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferActivityReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERACTIVITYREASON$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerActivityReason" element
     */
    public void setOfferActivityReason(java.lang.String offerActivityReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERACTIVITYREASON$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERACTIVITYREASON$8);
            }
            target.setStringValue(offerActivityReason);
        }
    }
    
    /**
     * Sets (as xml) the "offerActivityReason" element
     */
    public void xsetOfferActivityReason(org.apache.xmlbeans.XmlString offerActivityReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERACTIVITYREASON$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERACTIVITYREASON$8);
            }
            target.set(offerActivityReason);
        }
    }
    
    /**
     * Gets the "customerOfferParameters" element
     */
    public amdocs.iam.pd.general.common.ParametersDimT getCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.ParametersDimT target = null;
            target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().find_element_user(CUSTOMEROFFERPARAMETERS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customerOfferParameters" element
     */
    public boolean isSetCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMEROFFERPARAMETERS$10) != 0;
        }
    }
    
    /**
     * Sets the "customerOfferParameters" element
     */
    public void setCustomerOfferParameters(amdocs.iam.pd.general.common.ParametersDimT customerOfferParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.ParametersDimT target = null;
            target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().find_element_user(CUSTOMEROFFERPARAMETERS$10, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().add_element_user(CUSTOMEROFFERPARAMETERS$10);
            }
            target.set(customerOfferParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "customerOfferParameters" element
     */
    public amdocs.iam.pd.general.common.ParametersDimT addNewCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.ParametersDimT target = null;
            target = (amdocs.iam.pd.general.common.ParametersDimT)get_store().add_element_user(CUSTOMEROFFERPARAMETERS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "customerOfferParameters" element
     */
    public void unsetCustomerOfferParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMEROFFERPARAMETERS$10, 0);
        }
    }
    
    /**
     * Gets the "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom getOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$12, 0);
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
            return get_store().count_elements(OFFERCUSTOM$12) != 0;
        }
    }
    
    /**
     * Sets the "OfferCustom" element
     */
    public void setOfferCustom(amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom offerCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$12, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$12);
            }
            target.set(offerCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom addNewOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteinputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$12);
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
            get_store().remove_element(OFFERCUSTOM$12, 0);
        }
    }
}
