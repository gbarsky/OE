/*
 * An XML document type.
 * Localname: GetDiscountList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetDiscountListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetDiscountList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetDiscountListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetDiscountListDocument
{
    
    public GetDiscountListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDISCOUNTLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetDiscountList");
    
    
    /**
     * Gets the "GetDiscountList" element
     */
    public amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList getGetDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList)get_store().find_element_user(GETDISCOUNTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetDiscountList" element
     */
    public void setGetDiscountList(amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList getDiscountList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList)get_store().find_element_user(GETDISCOUNTLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList)get_store().add_element_user(GETDISCOUNTLIST$0);
            }
            target.set(getDiscountList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetDiscountList" element
     */
    public amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList addNewGetDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList)get_store().add_element_user(GETDISCOUNTLIST$0);
            return target;
        }
    }
    /**
     * An XML GetDiscountList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetDiscountListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetDiscountListDocument.GetDiscountList
    {
        
        public GetDiscountListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offer/DiscountOfferListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ROOT" element
         */
        public void setROOT(amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.offer.discountofferlistinput.DiscountOfferListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
