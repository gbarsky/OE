/*
 * An XML document type.
 * Localname: GetBrandListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBrandListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBrandListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument
{
    
    public GetBrandListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBRANDLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBrandListResponse");
    
    
    /**
     * Gets the "GetBrandListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse getGetBrandListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse)get_store().find_element_user(GETBRANDLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBrandListResponse" element
     */
    public void setGetBrandListResponse(amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse getBrandListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse)get_store().find_element_user(GETBRANDLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse)get_store().add_element_user(GETBRANDLISTRESPONSE$0);
            }
            target.set(getBrandListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBrandListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse addNewGetBrandListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse)get_store().add_element_user(GETBRANDLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetBrandListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBrandListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandListResponseDocument.GetBrandListResponse
    {
        
        public GetBrandListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/BrandListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.BrandListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
