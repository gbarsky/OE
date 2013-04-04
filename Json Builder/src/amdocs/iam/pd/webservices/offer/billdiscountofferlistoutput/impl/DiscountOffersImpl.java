/*
 * XML Type:  DiscountOffers
 * Namespace: http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput
 * Java type: amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.impl;
/**
 * An XML DiscountOffers(@http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput).
 *
 * This is a complex type.
 */
public class DiscountOffersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffers
{
    
    public DiscountOffersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCOUNTOFFER$0 = 
        new javax.xml.namespace.QName("", "discountOffer");
    
    
    /**
     * Gets array of all "discountOffer" elements
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer[] getDiscountOfferArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISCOUNTOFFER$0, targetList);
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer[] result = new amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "discountOffer" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer getDiscountOfferArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer)get_store().find_element_user(DISCOUNTOFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "discountOffer" element
     */
    public int sizeOfDiscountOfferArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCOUNTOFFER$0);
        }
    }
    
    /**
     * Sets array of all "discountOffer" element
     */
    public void setDiscountOfferArray(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer[] discountOfferArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(discountOfferArray, DISCOUNTOFFER$0);
        }
    }
    
    /**
     * Sets ith "discountOffer" element
     */
    public void setDiscountOfferArray(int i, amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer discountOffer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer)get_store().find_element_user(DISCOUNTOFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(discountOffer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "discountOffer" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer insertNewDiscountOffer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer)get_store().insert_element_user(DISCOUNTOFFER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "discountOffer" element
     */
    public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer addNewDiscountOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer target = null;
            target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.DiscountOffer)get_store().add_element_user(DISCOUNTOFFER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "discountOffer" element
     */
    public void removeDiscountOffer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCOUNTOFFER$0, i);
        }
    }
}
