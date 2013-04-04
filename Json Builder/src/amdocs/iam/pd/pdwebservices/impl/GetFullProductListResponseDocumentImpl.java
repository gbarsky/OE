/*
 * An XML document type.
 * Localname: GetFullProductListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetFullProductListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetFullProductListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument
{
    
    public GetFullProductListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULLPRODUCTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetFullProductListResponse");
    
    
    /**
     * Gets the "GetFullProductListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse getGetFullProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse)get_store().find_element_user(GETFULLPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFullProductListResponse" element
     */
    public void setGetFullProductListResponse(amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse getFullProductListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse)get_store().find_element_user(GETFULLPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse)get_store().add_element_user(GETFULLPRODUCTLISTRESPONSE$0);
            }
            target.set(getFullProductListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetFullProductListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse addNewGetFullProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse)get_store().add_element_user(GETFULLPRODUCTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetFullProductListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetFullProductListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullProductListResponseDocument.GetFullProductListResponse
    {
        
        public GetFullProductListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/product/FullProductListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput target = null;
                target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput target = null;
                target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput target = null;
                target = (amdocs.iam.pd.webservices.product.fullproductlistoutput.FullProductListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
