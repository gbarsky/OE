/*
 * An XML document type.
 * Localname: GetHeadingListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetHeadingListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetHeadingListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument
{
    
    public GetHeadingListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHEADINGLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetHeadingListResponse");
    
    
    /**
     * Gets the "GetHeadingListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse getGetHeadingListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse)get_store().find_element_user(GETHEADINGLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetHeadingListResponse" element
     */
    public void setGetHeadingListResponse(amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse getHeadingListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse)get_store().find_element_user(GETHEADINGLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse)get_store().add_element_user(GETHEADINGLISTRESPONSE$0);
            }
            target.set(getHeadingListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetHeadingListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse addNewGetHeadingListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse)get_store().add_element_user(GETHEADINGLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetHeadingListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetHeadingListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetHeadingListResponseDocument.GetHeadingListResponse
    {
        
        public GetHeadingListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/heading/HeadingListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput target = null;
                target = (amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput target = null;
                target = (amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput target = null;
                target = (amdocs.iam.pd.webservices.heading.headinglistoutput.HeadingListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
