/*
 * An XML document type.
 * Localname: CheckOfferEligibilityResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one CheckOfferEligibilityResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class CheckOfferEligibilityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument
{
    
    public CheckOfferEligibilityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOFFERELIGIBILITYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "CheckOfferEligibilityResponse");
    
    
    /**
     * Gets the "CheckOfferEligibilityResponse" element
     */
    public amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse getCheckOfferEligibilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse)get_store().find_element_user(CHECKOFFERELIGIBILITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckOfferEligibilityResponse" element
     */
    public void setCheckOfferEligibilityResponse(amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse checkOfferEligibilityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse)get_store().find_element_user(CHECKOFFERELIGIBILITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse)get_store().add_element_user(CHECKOFFERELIGIBILITYRESPONSE$0);
            }
            target.set(checkOfferEligibilityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CheckOfferEligibilityResponse" element
     */
    public amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse addNewCheckOfferEligibilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse)get_store().add_element_user(CHECKOFFERELIGIBILITYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CheckOfferEligibilityResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class CheckOfferEligibilityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckOfferEligibilityResponseDocument.CheckOfferEligibilityResponse
    {
        
        public CheckOfferEligibilityResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.CheckOfferEligibilityOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
