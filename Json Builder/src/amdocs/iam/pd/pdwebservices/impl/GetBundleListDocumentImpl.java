/*
 * An XML document type.
 * Localname: GetBundleList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBundleListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBundleList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBundleListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleListDocument
{
    
    public GetBundleListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBUNDLELIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBundleList");
    
    
    /**
     * Gets the "GetBundleList" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList getGetBundleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList)get_store().find_element_user(GETBUNDLELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBundleList" element
     */
    public void setGetBundleList(amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList getBundleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList)get_store().find_element_user(GETBUNDLELIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList)get_store().add_element_user(GETBUNDLELIST$0);
            }
            target.set(getBundleList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBundleList" element
     */
    public amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList addNewGetBundleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList)get_store().add_element_user(GETBUNDLELIST$0);
            return target;
        }
    }
    /**
     * An XML GetBundleList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBundleListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBundleListDocument.GetBundleList
    {
        
        public GetBundleListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/bundleComponents/BundleListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput target = null;
                target = (amdocs.iam.pd.webservices.bundlecomponents.bundlelistinput.BundleListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
