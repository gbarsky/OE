/*
 * An XML document type.
 * Localname: GetFullProductList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetFullProductListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetFullProductList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetFullProductListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullProductListDocument
{
    
    public GetFullProductListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULLPRODUCTLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetFullProductList");
    
    
    /**
     * Gets the "GetFullProductList" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList getGetFullProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList)get_store().find_element_user(GETFULLPRODUCTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFullProductList" element
     */
    public void setGetFullProductList(amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList getFullProductList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList)get_store().find_element_user(GETFULLPRODUCTLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList)get_store().add_element_user(GETFULLPRODUCTLIST$0);
            }
            target.set(getFullProductList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetFullProductList" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList addNewGetFullProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList)get_store().add_element_user(GETFULLPRODUCTLIST$0);
            return target;
        }
    }
    /**
     * An XML GetFullProductList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetFullProductListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullProductListDocument.GetFullProductList
    {
        
        public GetFullProductListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/product/FullProductListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput target = null;
                target = (amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput target = null;
                target = (amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput target = null;
                target = (amdocs.iam.pd.webservices.product.fullproductlistinput.FullProductListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
