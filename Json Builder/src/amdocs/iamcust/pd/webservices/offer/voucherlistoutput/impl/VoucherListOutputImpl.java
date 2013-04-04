/*
 * XML Type:  VoucherListOutput
 * Namespace: http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput
 * Java type: amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.offer.voucherlistoutput.impl;
/**
 * An XML VoucherListOutput(@http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput).
 *
 * This is a complex type.
 */
public class VoucherListOutputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput
{
    
    public VoucherListOutputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("", "Event");
    private static final javax.xml.namespace.QName DATA$2 = 
        new javax.xml.namespace.QName("", "DATA");
    
    
    /**
     * Gets the "Event" element
     */
    public amdocs.iam.pd.general.common.EventType getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EventType target = null;
            target = (amdocs.iam.pd.general.common.EventType)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Event" element
     */
    public void setEvent(amdocs.iam.pd.general.common.EventType event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EventType target = null;
            target = (amdocs.iam.pd.general.common.EventType)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.EventType)get_store().add_element_user(EVENT$0);
            }
            target.set(event);
        }
    }
    
    /**
     * Appends and returns a new empty "Event" element
     */
    public amdocs.iam.pd.general.common.EventType addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.EventType target = null;
            target = (amdocs.iam.pd.general.common.EventType)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "DATA" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data getDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DATA" element
     */
    public void setDATA(amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data)get_store().find_element_user(DATA$2, 0);
            if (target == null)
            {
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data)get_store().add_element_user(DATA$2);
            }
            target.set(data);
        }
    }
    
    /**
     * Appends and returns a new empty "DATA" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data addNewDATA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data)get_store().add_element_user(DATA$2);
            return target;
        }
    }
}
