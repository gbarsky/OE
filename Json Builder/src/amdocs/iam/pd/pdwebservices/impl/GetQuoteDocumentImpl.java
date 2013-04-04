/*
 * An XML document type.
 * Localname: GetQuote
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetQuoteDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetQuote(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetQuoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetQuoteDocument
{
    
    public GetQuoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUOTE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetQuote");
    
    
    /**
     * Gets the "GetQuote" element
     */
    public amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote getGetQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote target = null;
            target = (amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote)get_store().find_element_user(GETQUOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuote" element
     */
    public void setGetQuote(amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote getQuote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote target = null;
            target = (amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote)get_store().find_element_user(GETQUOTE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote)get_store().add_element_user(GETQUOTE$0);
            }
            target.set(getQuote);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuote" element
     */
    public amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote addNewGetQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote target = null;
            target = (amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote)get_store().add_element_user(GETQUOTE$0);
            return target;
        }
    }
    /**
     * An XML GetQuote(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetQuoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetQuoteDocument.GetQuote
    {
        
        public GetQuoteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/quotation/GetQuoteInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput target = null;
                target = (amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput target = null;
                target = (amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput target = null;
                target = (amdocs.iam.pd.webservices.quotation.getquoteinput.GetQuoteInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
