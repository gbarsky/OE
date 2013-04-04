/*
 * An XML document type.
 * Localname: GetOfferListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetOfferListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetOfferListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument
{
    
    public GetOfferListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetOfferListResponse");
    
    
    /**
     * Gets the "GetOfferListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse getGetOfferListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse)get_store().find_element_user(GETOFFERLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferListResponse" element
     */
    public void setGetOfferListResponse(amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse getOfferListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse)get_store().find_element_user(GETOFFERLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse)get_store().add_element_user(GETOFFERLISTRESPONSE$0);
            }
            target.set(getOfferListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetOfferListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse addNewGetOfferListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse)get_store().add_element_user(GETOFFERLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetOfferListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetOfferListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferListResponseDocument.GetOfferListResponse
    {
        
        public GetOfferListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/OfferListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.OfferListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
