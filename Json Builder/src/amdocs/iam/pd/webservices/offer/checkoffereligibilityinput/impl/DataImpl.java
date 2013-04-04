/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityInput
 * Java type: amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityInput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERS$0 = 
        new javax.xml.namespace.QName("", "Offers");
    private static final javax.xml.namespace.QName CUSTOMERGLOBALPARAMETERS$2 = 
        new javax.xml.namespace.QName("", "CustomerGlobalParameters");
    private static final javax.xml.namespace.QName DATACUSTOM$4 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "Offers" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers getOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers)get_store().find_element_user(OFFERS$0, 0);
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
    public void setOffers(amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers offers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers)get_store().find_element_user(OFFERS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers)get_store().add_element_user(OFFERS$0);
            }
            target.set(offers);
        }
    }
    
    /**
     * Appends and returns a new empty "Offers" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers addNewOffers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers)get_store().add_element_user(OFFERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "CustomerGlobalParameters" element
     */
    public amdocs.iam.pd.general.common.GlobalParameters getCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalParameters target = null;
            target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().find_element_user(CUSTOMERGLOBALPARAMETERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerGlobalParameters" element
     */
    public boolean isSetCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERGLOBALPARAMETERS$2) != 0;
        }
    }
    
    /**
     * Sets the "CustomerGlobalParameters" element
     */
    public void setCustomerGlobalParameters(amdocs.iam.pd.general.common.GlobalParameters customerGlobalParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalParameters target = null;
            target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().find_element_user(CUSTOMERGLOBALPARAMETERS$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().add_element_user(CUSTOMERGLOBALPARAMETERS$2);
            }
            target.set(customerGlobalParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerGlobalParameters" element
     */
    public amdocs.iam.pd.general.common.GlobalParameters addNewCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.general.common.GlobalParameters target = null;
            target = (amdocs.iam.pd.general.common.GlobalParameters)get_store().add_element_user(CUSTOMERGLOBALPARAMETERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerGlobalParameters" element
     */
    public void unsetCustomerGlobalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERGLOBALPARAMETERS$2, 0);
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
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
            return get_store().count_elements(DATACUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$4);
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
            get_store().remove_element(DATACUSTOM$4, 0);
        }
    }
    /**
     * An XML Offers(@).
     *
     * This is a complex type.
     */
    public static class OffersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Data.Offers
    {
        
        public OffersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OFFER$0 = 
            new javax.xml.namespace.QName("", "Offer");
        
        
        /**
         * Gets array of all "Offer" elements
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer[] getOfferArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OFFER$0, targetList);
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer[] result = new amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Offer" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer getOfferArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer)get_store().find_element_user(OFFER$0, i);
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
        public void setOfferArray(amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer[] offerArray)
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
        public void setOfferArray(int i, amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer offer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer)get_store().find_element_user(OFFER$0, i);
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
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer insertNewOffer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer)get_store().insert_element_user(OFFER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Offer" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer addNewOffer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.Offer)get_store().add_element_user(OFFER$0);
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
}
