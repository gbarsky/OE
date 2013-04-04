/*
 * An XML document type.
 * Localname: GetProductSetList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductSetListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductSetList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductSetListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductSetListDocument
{
    
    public GetProductSetListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTSETLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductSetList");
    
    
    /**
     * Gets the "GetProductSetList" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList getGetProductSetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList)get_store().find_element_user(GETPRODUCTSETLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductSetList" element
     */
    public void setGetProductSetList(amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList getProductSetList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList)get_store().find_element_user(GETPRODUCTSETLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList)get_store().add_element_user(GETPRODUCTSETLIST$0);
            }
            target.set(getProductSetList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductSetList" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList addNewGetProductSetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList)get_store().add_element_user(GETPRODUCTSETLIST$0);
            return target;
        }
    }
    /**
     * An XML GetProductSetList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductSetListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductSetListDocument.GetProductSetList
    {
        
        public GetProductSetListImpl(org.apache.xmlbeans.SchemaType sType)
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
}
