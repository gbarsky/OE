/*
 * XML Type:  Offers
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/FullOfferListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.Offers
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.impl;
/**
 * An XML Offers(@http://amdocs/iam/pd/webservices/productOffer/FullOfferListOutput).
 *
 * This is a complex type.
 */
public class OffersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.Offers
{
    
    public OffersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERS$0 = 
        new javax.xml.namespace.QName("", "Offers");
    
    
    /**
     * Gets the "Offers" element
     */
    public amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList getOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList)get_store().find_element_user(OFFERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Offers" element
     */
    public void setOffers(amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList offers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList)get_store().find_element_user(OFFERS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList)get_store().add_element_user(OFFERS$0);
            }
            target.set(offers);
        }
    }
    
    /**
     * Appends and returns a new empty "Offers" element
     */
    public amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList addNewOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.OfferList)get_store().add_element_user(OFFERS$0);
            return target;
        }
    }
}
