/*
 * XML Type:  OfferDetails
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML OfferDetails(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class OfferDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetails
{
    
    public OfferDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFER$0 = 
        new javax.xml.namespace.QName("", "Offer");
    
    
    /**
     * Gets array of all "Offer" elements
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail[] getOfferArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OFFER$0, targetList);
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail[] result = new amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Offer" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail getOfferArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail)get_store().find_element_user(OFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Offer" element
     */
    public int sizeOfOfferArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFER$0);
        }
    }
    
    /**
     * Sets array of all "Offer" element
     */
    public void setOfferArray(amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail[] offerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(offerArray, OFFER$0);
        }
    }
    
    /**
     * Sets ith "Offer" element
     */
    public void setOfferArray(int i, amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail offer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail)get_store().find_element_user(OFFER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(offer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Offer" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail insertNewOffer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail)get_store().insert_element_user(OFFER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Offer" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail addNewOffer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.OfferDetail)get_store().add_element_user(OFFER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Offer" element
     */
    public void removeOffer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFER$0, i);
        }
    }
}
