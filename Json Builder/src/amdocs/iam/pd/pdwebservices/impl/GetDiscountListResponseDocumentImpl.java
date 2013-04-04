/*
 * An XML document type.
 * Localname: GetDiscountListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetDiscountListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetDiscountListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument
{
    
    public GetDiscountListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDISCOUNTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetDiscountListResponse");
    
    
    /**
     * Gets the "GetDiscountListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse getGetDiscountListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse)get_store().find_element_user(GETDISCOUNTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetDiscountListResponse" element
     */
    public void setGetDiscountListResponse(amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse getDiscountListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse)get_store().find_element_user(GETDISCOUNTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse)get_store().add_element_user(GETDISCOUNTLISTRESPONSE$0);
            }
            target.set(getDiscountListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetDiscountListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse addNewGetDiscountListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse)get_store().add_element_user(GETDISCOUNTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetDiscountListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetDiscountListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetDiscountListResponseDocument.GetDiscountListResponse
    {
        
        public GetDiscountListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offer/DiscountOfferListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.discountofferlistoutput.DiscountOfferListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
