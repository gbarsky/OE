/*
 * An XML document type.
 * Localname: BundleValidationResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one BundleValidationResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class BundleValidationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument
{
    
    public BundleValidationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLEVALIDATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "BundleValidationResponse");
    
    
    /**
     * Gets the "BundleValidationResponse" element
     */
    public amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse getBundleValidationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse)get_store().find_element_user(BUNDLEVALIDATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BundleValidationResponse" element
     */
    public void setBundleValidationResponse(amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse bundleValidationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse)get_store().find_element_user(BUNDLEVALIDATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse)get_store().add_element_user(BUNDLEVALIDATIONRESPONSE$0);
            }
            target.set(bundleValidationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "BundleValidationResponse" element
     */
    public amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse addNewBundleValidationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse)get_store().add_element_user(BUNDLEVALIDATIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML BundleValidationResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class BundleValidationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.BundleValidationResponseDocument.BundleValidationResponse
    {
        
        public BundleValidationResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/bundleWS/BundleValidationOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput target = null;
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationoutput.BundleValidationOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
