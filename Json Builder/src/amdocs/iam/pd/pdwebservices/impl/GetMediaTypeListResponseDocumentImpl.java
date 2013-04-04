/*
 * An XML document type.
 * Localname: GetMediaTypeListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetMediaTypeListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetMediaTypeListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument
{
    
    public GetMediaTypeListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEDIATYPELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetMediaTypeListResponse");
    
    
    /**
     * Gets the "GetMediaTypeListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse getGetMediaTypeListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse)get_store().find_element_user(GETMEDIATYPELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMediaTypeListResponse" element
     */
    public void setGetMediaTypeListResponse(amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse getMediaTypeListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse)get_store().find_element_user(GETMEDIATYPELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse)get_store().add_element_user(GETMEDIATYPELISTRESPONSE$0);
            }
            target.set(getMediaTypeListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMediaTypeListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse addNewGetMediaTypeListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse)get_store().add_element_user(GETMEDIATYPELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetMediaTypeListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetMediaTypeListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetMediaTypeListResponseDocument.GetMediaTypeListResponse
    {
        
        public GetMediaTypeListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/MediaTypeListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.mediatypelistoutput.MediaTypeListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
