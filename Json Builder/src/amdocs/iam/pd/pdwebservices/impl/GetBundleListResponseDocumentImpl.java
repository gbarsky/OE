/*
 * An XML document type.
 * Localname: GetBundleListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBundleListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBundleListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument
{
    
    public GetBundleListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBUNDLELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBundleListResponse");
    
    
    /**
     * Gets the "GetBundleListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse getGetBundleListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse)get_store().find_element_user(GETBUNDLELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBundleListResponse" element
     */
    public void setGetBundleListResponse(amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse getBundleListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse)get_store().find_element_user(GETBUNDLELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse)get_store().add_element_user(GETBUNDLELISTRESPONSE$0);
            }
            target.set(getBundleListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBundleListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse addNewGetBundleListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse)get_store().add_element_user(GETBUNDLELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetBundleListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBundleListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleListResponseDocument.GetBundleListResponse
    {
        
        public GetBundleListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/bundleComponents/BundleListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistoutput.BundleListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
