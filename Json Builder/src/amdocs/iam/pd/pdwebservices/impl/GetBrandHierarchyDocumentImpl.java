/*
 * An XML document type.
 * Localname: GetBrandHierarchy
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBrandHierarchy(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBrandHierarchyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument
{
    
    public GetBrandHierarchyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBRANDHIERARCHY$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBrandHierarchy");
    
    
    /**
     * Gets the "GetBrandHierarchy" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy getGetBrandHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy)get_store().find_element_user(GETBRANDHIERARCHY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBrandHierarchy" element
     */
    public void setGetBrandHierarchy(amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy getBrandHierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy)get_store().find_element_user(GETBRANDHIERARCHY$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy)get_store().add_element_user(GETBRANDHIERARCHY$0);
            }
            target.set(getBrandHierarchy);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBrandHierarchy" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy addNewGetBrandHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy)get_store().add_element_user(GETBRANDHIERARCHY$0);
            return target;
        }
    }
    /**
     * An XML GetBrandHierarchy(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBrandHierarchyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandHierarchyDocument.GetBrandHierarchy
    {
        
        public GetBrandHierarchyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput target = null;
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput target = null;
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput target = null;
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.GetBrandHierarchyInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
