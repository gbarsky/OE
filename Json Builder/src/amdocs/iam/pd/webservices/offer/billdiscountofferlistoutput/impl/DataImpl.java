/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput
 * Java type: amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTOFFERS$0 = 
        new javax.xml.namespace.QName("", "discountOffers");
    private static final javax.xml.namespace.QName DATACUSTOM$2 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "discountOffers" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers getDiscountOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers)get_store().find_element_user(DISCOUNTOFFERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "discountOffers" element
     */
    public void setDiscountOffers(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers discountOffers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers)get_store().find_element_user(DISCOUNTOFFERS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers)get_store().add_element_user(DISCOUNTOFFERS$0);
            }
            target.set(discountOffers);
        }
    }
    
    /**
     * Appends and returns a new empty "discountOffers" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers addNewDiscountOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers)get_store().add_element_user(DISCOUNTOFFERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$2, 0);
        }
    }
}
