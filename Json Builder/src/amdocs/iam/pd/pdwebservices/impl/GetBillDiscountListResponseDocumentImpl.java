/*
 * An XML document type.
 * Localname: GetBillDiscountListResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBillDiscountListResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBillDiscountListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument
{
    
    public GetBillDiscountListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBILLDISCOUNTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBillDiscountListResponse");
    
    
    /**
     * Gets the "GetBillDiscountListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse getGetBillDiscountListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse)get_store().find_element_user(GETBILLDISCOUNTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBillDiscountListResponse" element
     */
    public void setGetBillDiscountListResponse(amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse getBillDiscountListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse)get_store().find_element_user(GETBILLDISCOUNTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse)get_store().add_element_user(GETBILLDISCOUNTLISTRESPONSE$0);
            }
            target.set(getBillDiscountListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBillDiscountListResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse addNewGetBillDiscountListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse)get_store().add_element_user(GETBILLDISCOUNTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetBillDiscountListResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBillDiscountListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBillDiscountListResponseDocument.GetBillDiscountListResponse
    {
        
        public GetBillDiscountListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistoutput.BillDiscountOfferListOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
