/*
 * An XML document type.
 * Localname: GetBundleDetails
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBundleDetails(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBundleDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument
{
    
    public GetBundleDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBUNDLEDETAILS$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBundleDetails");
    
    
    /**
     * Gets the "GetBundleDetails" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails getGetBundleDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails)get_store().find_element_user(GETBUNDLEDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBundleDetails" element
     */
    public void setGetBundleDetails(amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails getBundleDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails)get_store().find_element_user(GETBUNDLEDETAILS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails)get_store().add_element_user(GETBUNDLEDETAILS$0);
            }
            target.set(getBundleDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBundleDetails" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails addNewGetBundleDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails)get_store().add_element_user(GETBUNDLEDETAILS$0);
            return target;
        }
    }
    /**
     * An XML GetBundleDetails(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBundleDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleDetailsDocument.GetBundleDetails
    {
        
        public GetBundleDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.BundleDetailsInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
