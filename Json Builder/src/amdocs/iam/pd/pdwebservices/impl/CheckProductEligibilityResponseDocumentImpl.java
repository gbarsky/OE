/*
 * An XML document type.
 * Localname: CheckProductEligibilityResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one CheckProductEligibilityResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class CheckProductEligibilityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument
{
    
    public CheckProductEligibilityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKPRODUCTELIGIBILITYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "CheckProductEligibilityResponse");
    
    
    /**
     * Gets the "CheckProductEligibilityResponse" element
     */
    public amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse getCheckProductEligibilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse)get_store().find_element_user(CHECKPRODUCTELIGIBILITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckProductEligibilityResponse" element
     */
    public void setCheckProductEligibilityResponse(amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse checkProductEligibilityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse)get_store().find_element_user(CHECKPRODUCTELIGIBILITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse)get_store().add_element_user(CHECKPRODUCTELIGIBILITYRESPONSE$0);
            }
            target.set(checkProductEligibilityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CheckProductEligibilityResponse" element
     */
    public amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse addNewCheckProductEligibilityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse)get_store().add_element_user(CHECKPRODUCTELIGIBILITYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CheckProductEligibilityResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class CheckProductEligibilityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckProductEligibilityResponseDocument.CheckProductEligibilityResponse
    {
        
        public CheckProductEligibilityResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityoutput.CheckProductEligibilityOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
