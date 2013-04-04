/*
 * An XML document type.
 * Localname: GetBrandHierarchyResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBrandHierarchyResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBrandHierarchyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument
{
    
    public GetBrandHierarchyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBRANDHIERARCHYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBrandHierarchyResponse");
    
    
    /**
     * Gets the "GetBrandHierarchyResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse getGetBrandHierarchyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse)get_store().find_element_user(GETBRANDHIERARCHYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBrandHierarchyResponse" element
     */
    public void setGetBrandHierarchyResponse(amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse getBrandHierarchyResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse)get_store().find_element_user(GETBRANDHIERARCHYRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse)get_store().add_element_user(GETBRANDHIERARCHYRESPONSE$0);
            }
            target.set(getBrandHierarchyResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBrandHierarchyResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse addNewGetBrandHierarchyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse)get_store().add_element_user(GETBRANDHIERARCHYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetBrandHierarchyResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBrandHierarchyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandHierarchyResponseDocument.GetBrandHierarchyResponse
    {
        
        public GetBrandHierarchyResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput target = null;
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput target = null;
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput target = null;
                target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.GetBrandHierarchyOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
