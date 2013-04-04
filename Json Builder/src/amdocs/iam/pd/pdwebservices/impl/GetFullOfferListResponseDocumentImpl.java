/*
 * An XML document type.
 * Localname: GetFullOfferListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetFullOfferListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetFullOfferListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument
{
    
    public GetFullOfferListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULLOFFERLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetFullOfferListResponse");
    
    
    /**
     * Gets the "GetFullOfferListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse getGetFullOfferListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse)get_store().find_element_user(GETFULLOFFERLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFullOfferListResponse" element
     */
    public void setGetFullOfferListResponse(amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse getFullOfferListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse)get_store().find_element_user(GETFULLOFFERLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse)get_store().add_element_user(GETFULLOFFERLISTRESPONSE$0);
            }
            target.set(getFullOfferListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetFullOfferListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse addNewGetFullOfferListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse)get_store().add_element_user(GETFULLOFFERLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetFullOfferListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetFullOfferListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullOfferListResponseDocument.GetFullOfferListResponse
    {
        
        public GetFullOfferListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/FullOfferListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.FullOfferListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
