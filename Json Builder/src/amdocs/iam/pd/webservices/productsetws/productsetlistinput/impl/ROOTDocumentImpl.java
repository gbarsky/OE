/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput
 * Java type: amdocs.iam.pd.webservices.productsetws.productsetlistinput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productsetws.productsetlistinput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productsetws.productsetlistinput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productSetWS/ProductSetListInput", "ROOT");
    
    
    /**
     * Gets the "ROOT" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput getROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput)get_store().find_element_user(ROOT$0, 0);
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
    public void setROOT(amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "ROOT" element
     */
    public amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput addNewROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput target = null;
            target = (amdocs.iam.pd.webservices.productsetws.productsetlistinput.ProductSetListInput)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
}
