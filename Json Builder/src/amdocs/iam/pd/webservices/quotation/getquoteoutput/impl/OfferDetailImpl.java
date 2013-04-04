/*
 * XML Type:  OfferDetail
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML OfferDetail(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class OfferDetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail
{
    
    public OfferDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName OFFERINSTANCE$2 = 
        new javax.xml.namespace.QName("", "offerInstance");
    private static final javax.xml.namespace.QName CHARGES$4 = 
        new javax.xml.namespace.QName("", "charges");
    private static final javax.xml.namespace.QName TOTALAMOUNTS$6 = 
        new javax.xml.namespace.QName("", "totalAmounts");
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
     * Gets the "offerInstance" element
     */
    public java.lang.String getOfferInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINSTANCE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINSTANCE$2, 0);
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
            return get_store().count_elements(OFFERINSTANCE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINSTANCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERINSTANCE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINSTANCE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERINSTANCE$2);
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
            get_store().remove_element(OFFERINSTANCE$2, 0);
        }
    }
    
    /**
     * Gets the "charges" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes getCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes)get_store().find_element_user(CHARGES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "charges" element
     */
    public void setCharges(amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes charges)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes)get_store().find_element_user(CHARGES$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes)get_store().add_element_user(CHARGES$4);
            }
            target.set(charges);
        }
    }
    
    /**
     * Appends and returns a new empty "charges" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes addNewCharges()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.ChargeAttributes)get_store().add_element_user(CHARGES$4);
            return target;
        }
    }
    
    /**
     * Gets the "totalAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts getTotalAmounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts)get_store().find_element_user(TOTALAMOUNTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "totalAmounts" element
     */
    public void setTotalAmounts(amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts totalAmounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts)get_store().find_element_user(TOTALAMOUNTS$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts)get_store().add_element_user(TOTALAMOUNTS$6);
            }
            target.set(totalAmounts);
        }
    }
    
    /**
     * Appends and returns a new empty "totalAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts addNewTotalAmounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts)get_store().add_element_user(TOTALAMOUNTS$6);
            return target;
        }
    }
    
    /**
     * Gets the "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom getOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$8, 0);
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
    public void setOfferCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom offerCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom)get_store().find_element_user(OFFERCUSTOM$8, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$8);
            }
            target.set(offerCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "OfferCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom addNewOfferCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.OfferCustom)get_store().add_element_user(OFFERCUSTOM$8);
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
