/*
 * An XML document type.
 * Localname: BundleValidation
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.BundleValidationDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one BundleValidation(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class BundleValidationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.BundleValidationDocument
{
    
    public BundleValidationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUNDLEVALIDATION$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "BundleValidation");
    
    
    /**
     * Gets the "BundleValidation" element
     */
    public amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation getBundleValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation target = null;
            target = (amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation)get_store().find_element_user(BUNDLEVALIDATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BundleValidation" element
     */
    public void setBundleValidation(amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation bundleValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation target = null;
            target = (amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation)get_store().find_element_user(BUNDLEVALIDATION$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation)get_store().add_element_user(BUNDLEVALIDATION$0);
            }
            target.set(bundleValidation);
        }
    }
    
    /**
     * Appends and returns a new empty "BundleValidation" element
     */
    public amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation addNewBundleValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation target = null;
            target = (amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation)get_store().add_element_user(BUNDLEVALIDATION$0);
            return target;
        }
    }
    /**
     * An XML BundleValidation(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class BundleValidationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.BundleValidationDocument.BundleValidation
    {
        
        public BundleValidationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/bundleWS/BundleValidationInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput target = null;
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput target = null;
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput target = null;
                target = (amdocs.iam.pd.webservices.bundlews.bundlevalidationinput.BundleValidationInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
