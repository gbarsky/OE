/*
 * An XML document type.
 * Localname: GetProductList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductListDocument
{
    
    public GetProductListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductList");
    
    
    /**
     * Gets the "GetProductList" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList getGetProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList)get_store().find_element_user(GETPRODUCTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductList" element
     */
    public void setGetProductList(amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList getProductList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList)get_store().find_element_user(GETPRODUCTLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList)get_store().add_element_user(GETPRODUCTLIST$0);
            }
            target.set(getProductList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductList" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList addNewGetProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList)get_store().add_element_user(GETPRODUCTLIST$0);
            return target;
        }
    }
    /**
     * An XML GetProductList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductListDocument.GetProductList
    {
        
        public GetProductListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productRelations/ProductListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.productlistinput.ProductListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
