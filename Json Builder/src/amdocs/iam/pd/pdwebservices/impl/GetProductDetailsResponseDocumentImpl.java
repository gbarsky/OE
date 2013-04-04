/*
 * An XML document type.
 * Localname: GetProductDetailsResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductDetailsResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductDetailsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument
{
    
    public GetProductDetailsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTDETAILSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductDetailsResponse");
    
    
    /**
     * Gets the "GetProductDetailsResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse getGetProductDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse)get_store().find_element_user(GETPRODUCTDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductDetailsResponse" element
     */
    public void setGetProductDetailsResponse(amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse getProductDetailsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse)get_store().find_element_user(GETPRODUCTDETAILSRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse)get_store().add_element_user(GETPRODUCTDETAILSRESPONSE$0);
            }
            target.set(getProductDetailsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductDetailsResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse addNewGetProductDetailsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse)get_store().add_element_user(GETPRODUCTDETAILSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductDetailsResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductDetailsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductDetailsResponseDocument.GetProductDetailsResponse
    {
        
        public GetProductDetailsResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
}
