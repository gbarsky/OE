/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/offer/DiscountOfferListOutput
 * Java type: amdocs.iam.pd.webservices.offer.discountofferlistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.discountofferlistoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/offer/DiscountOfferListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.discountofferlistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTOFFERS$0 = 
        new javax.xml.namespace.QName("", "discountOffers");
    
    
    /**
     * Gets the "discountOffers" element
     */
    public amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers getDiscountOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers)get_store().find_element_user(DISCOUNTOFFERS$0, 0);
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
    public void setDiscountOffers(amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers discountOffers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers)get_store().find_element_user(DISCOUNTOFFERS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers)get_store().add_element_user(DISCOUNTOFFERS$0);
            }
            target.set(discountOffers);
        }
    }
    
    /**
     * Appends and returns a new empty "discountOffers" element
     */
    public amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers addNewDiscountOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers target = null;
            target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOffers)get_store().add_element_user(DISCOUNTOFFERS$0);
            return target;
        }
    }
}
