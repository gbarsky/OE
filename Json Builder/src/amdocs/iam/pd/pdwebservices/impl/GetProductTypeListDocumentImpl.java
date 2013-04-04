/*
 * An XML document type.
 * Localname: GetProductTypeList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductTypeListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductTypeList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductTypeListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductTypeListDocument
{
    
    public GetProductTypeListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTTYPELIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductTypeList");
    
    
    /**
     * Gets the "GetProductTypeList" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList getGetProductTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList)get_store().find_element_user(GETPRODUCTTYPELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductTypeList" element
     */
    public void setGetProductTypeList(amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList getProductTypeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList)get_store().find_element_user(GETPRODUCTTYPELIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList)get_store().add_element_user(GETPRODUCTTYPELIST$0);
            }
            target.set(getProductTypeList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductTypeList" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList addNewGetProductTypeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList)get_store().add_element_user(GETPRODUCTTYPELIST$0);
            return target;
        }
    }
    /**
     * An XML GetProductTypeList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductTypeListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductTypeListDocument.GetProductTypeList
    {
        
        public GetProductTypeListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/ProductTypeListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistinput.ProductTypeListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
