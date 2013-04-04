/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsInput
 * Java type: amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iam/pd/webservices/bundleComponents/BundleDetailsInput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.bundlecomponents.bundledetailsinput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
