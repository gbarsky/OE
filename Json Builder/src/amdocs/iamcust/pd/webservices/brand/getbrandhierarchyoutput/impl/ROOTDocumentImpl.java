/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput", "ROOT");
    
    
    /**
     * Gets the "ROOT" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput getROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().find_element_user(ROOT$0, 0);
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
    public void setROOT(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "ROOT" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput addNewROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
}
