/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput", "ROOT");
    
    
    /**
     * Gets the "ROOT" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput getROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput)get_store().find_element_user(ROOT$0, 0);
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
    public void setROOT(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "ROOT" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput addNewROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductDetailsOutput)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
}
