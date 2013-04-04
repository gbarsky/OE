/*
 * An XML document type.
 * Localname: GetProductTypeListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductTypeListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductTypeListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument
{
    
    public GetProductTypeListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTTYPELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductTypeListResponse");
    
    
    /**
     * Gets the "GetProductTypeListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse getGetProductTypeListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse)get_store().find_element_user(GETPRODUCTTYPELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductTypeListResponse" element
     */
    public void setGetProductTypeListResponse(amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse getProductTypeListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse)get_store().find_element_user(GETPRODUCTTYPELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse)get_store().add_element_user(GETPRODUCTTYPELISTRESPONSE$0);
            }
            target.set(getProductTypeListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductTypeListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse addNewGetProductTypeListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse)get_store().add_element_user(GETPRODUCTTYPELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductTypeListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductTypeListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductTypeListResponseDocument.GetProductTypeListResponse
    {
        
        public GetProductTypeListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/ProductTypeListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.producttypelistoutput.ProductTypeListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
