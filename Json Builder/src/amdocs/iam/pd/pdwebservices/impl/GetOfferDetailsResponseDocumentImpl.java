/*
 * An XML document type.
 * Localname: GetOfferDetailsResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetOfferDetailsResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetOfferDetailsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument
{
    
    public GetOfferDetailsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERDETAILSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetOfferDetailsResponse");
    
    
    /**
     * Gets the "GetOfferDetailsResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse getGetOfferDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse)get_store().find_element_user(GETOFFERDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferDetailsResponse" element
     */
    public void setGetOfferDetailsResponse(amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse getOfferDetailsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse)get_store().find_element_user(GETOFFERDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse)get_store().add_element_user(GETOFFERDETAILSRESPONSE$0);
            }
            target.set(getOfferDetailsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetOfferDetailsResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse addNewGetOfferDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse)get_store().add_element_user(GETOFFERDETAILSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOfferDetailsResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetOfferDetailsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferDetailsResponseDocument.GetOfferDetailsResponse
    {
        
        public GetOfferDetailsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput target = null;
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput target = null;
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput target = null;
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsoutput.OfferDetailsOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
