/*
 * An XML document type.
 * Localname: GetProductDetails
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductDetails(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductDetailsDocument
{
    
    public GetProductDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTDETAILS$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductDetails");
    
    
    /**
     * Gets the "GetProductDetails" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails getGetProductDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails)get_store().find_element_user(GETPRODUCTDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductDetails" element
     */
    public void setGetProductDetails(amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails getProductDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails)get_store().find_element_user(GETPRODUCTDETAILS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails)get_store().add_element_user(GETPRODUCTDETAILS$0);
            }
            target.set(getProductDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductDetails" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails addNewGetProductDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails)get_store().add_element_user(GETPRODUCTDETAILS$0);
            return target;
        }
    }
    /**
     * An XML GetProductDetails(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductDetailsDocument.GetProductDetails
    {
        
        public GetProductDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsinput.ProductDetailsInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
