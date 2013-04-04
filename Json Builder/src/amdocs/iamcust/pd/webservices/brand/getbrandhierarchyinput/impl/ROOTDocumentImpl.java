/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyInput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyInput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyinput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
