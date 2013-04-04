/*
 * An XML document type.
 * Localname: GetVoucherListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetVoucherListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetVoucherListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument
{
    
    public GetVoucherListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVOUCHERLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetVoucherListResponse");
    
    
    /**
     * Gets the "GetVoucherListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse getGetVoucherListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse)get_store().find_element_user(GETVOUCHERLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetVoucherListResponse" element
     */
    public void setGetVoucherListResponse(amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse getVoucherListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse)get_store().find_element_user(GETVOUCHERLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse)get_store().add_element_user(GETVOUCHERLISTRESPONSE$0);
            }
            target.set(getVoucherListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetVoucherListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse addNewGetVoucherListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse)get_store().add_element_user(GETVOUCHERLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetVoucherListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetVoucherListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetVoucherListResponseDocument.GetVoucherListResponse
    {
        
        public GetVoucherListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput target = null;
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput target = null;
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput target = null;
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
