/*
 * An XML document type.
 * Localname: GetQuoteResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetQuoteResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetQuoteResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument
{
    
    public GetQuoteResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUOTERESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetQuoteResponse");
    
    
    /**
     * Gets the "GetQuoteResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse getGetQuoteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse)get_store().find_element_user(GETQUOTERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuoteResponse" element
     */
    public void setGetQuoteResponse(amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse getQuoteResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse)get_store().find_element_user(GETQUOTERESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse)get_store().add_element_user(GETQUOTERESPONSE$0);
            }
            target.set(getQuoteResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuoteResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse addNewGetQuoteResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse)get_store().add_element_user(GETQUOTERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetQuoteResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetQuoteResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetQuoteResponseDocument.GetQuoteResponse
    {
        
        public GetQuoteResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput target = null;
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput target = null;
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput target = null;
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.GetQuoteOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
