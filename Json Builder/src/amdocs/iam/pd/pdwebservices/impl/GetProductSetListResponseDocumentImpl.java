/*
 * An XML document type.
 * Localname: GetProductSetListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetProductSetListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetProductSetListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument
{
    
    public GetProductSetListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTSETLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetProductSetListResponse");
    
    
    /**
     * Gets the "GetProductSetListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse getGetProductSetListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse)get_store().find_element_user(GETPRODUCTSETLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductSetListResponse" element
     */
    public void setGetProductSetListResponse(amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse getProductSetListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse)get_store().find_element_user(GETPRODUCTSETLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse)get_store().add_element_user(GETPRODUCTSETLISTRESPONSE$0);
            }
            target.set(getProductSetListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductSetListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse addNewGetProductSetListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse)get_store().add_element_user(GETPRODUCTSETLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductSetListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetProductSetListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetProductSetListResponseDocument.GetProductSetListResponse
    {
        
        public GetProductSetListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productSetWS/ProductSetListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput target = null;
                target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput target = null;
                target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput target = null;
                target = (amdocs.iam.pd.webservices.productsetws.productsetlistoutput.ProductSetListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
