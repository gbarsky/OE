/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iam/pd/webservices/productRelations/ProductListOutput
 * Java type: amdocs.iam.pd.webservices.productrelations.productlistoutput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productrelations.productlistoutput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iam/pd/webservices/productRelations/ProductListOutput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productrelations.productlistoutput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productRelations/ProductListOutput", "ROOT");
    
    
    /**
     * Gets the "ROOT" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput getROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().find_element_user(ROOT$0, 0);
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
    public void setROOT(amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "ROOT" element
     */
    public amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput addNewROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput target = null;
            target = (amdocs.iam.pd.webservices.productrelations.productlistoutput.ProductListOutput)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
}
