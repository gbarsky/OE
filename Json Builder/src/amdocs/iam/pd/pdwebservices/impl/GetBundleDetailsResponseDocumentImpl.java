/*
 * An XML document type.
 * Localname: GetBundleDetailsResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBundleDetailsResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBundleDetailsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument
{
    
    public GetBundleDetailsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBUNDLEDETAILSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBundleDetailsResponse");
    
    
    /**
     * Gets the "GetBundleDetailsResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse getGetBundleDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse)get_store().find_element_user(GETBUNDLEDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBundleDetailsResponse" element
     */
    public void setGetBundleDetailsResponse(amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse getBundleDetailsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse)get_store().find_element_user(GETBUNDLEDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse)get_store().add_element_user(GETBUNDLEDETAILSRESPONSE$0);
            }
            target.set(getBundleDetailsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBundleDetailsResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse addNewGetBundleDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse)get_store().add_element_user(GETBUNDLEDETAILSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetBundleDetailsResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBundleDetailsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleDetailsResponseDocument.GetBundleDetailsResponse
    {
        
        public GetBundleDetailsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsoutput.BundleDetailsOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
