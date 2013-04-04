/*
 * An XML document type.
 * Localname: GetReferenceAttributeValuesResponse
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetReferenceAttributeValuesResponse(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetReferenceAttributeValuesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument
{
    
    public GetReferenceAttributeValuesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREFERENCEATTRIBUTEVALUESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetReferenceAttributeValuesResponse");
    
    
    /**
     * Gets the "GetReferenceAttributeValuesResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse getGetReferenceAttributeValuesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse)get_store().find_element_user(GETREFERENCEATTRIBUTEVALUESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetReferenceAttributeValuesResponse" element
     */
    public void setGetReferenceAttributeValuesResponse(amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse getReferenceAttributeValuesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse)get_store().find_element_user(GETREFERENCEATTRIBUTEVALUESRESPONSE$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse)get_store().add_element_user(GETREFERENCEATTRIBUTEVALUESRESPONSE$0);
            }
            target.set(getReferenceAttributeValuesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetReferenceAttributeValuesResponse" element
     */
    public amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse addNewGetReferenceAttributeValuesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse target = null;
            target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse)get_store().add_element_user(GETREFERENCEATTRIBUTEVALUESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetReferenceAttributeValuesResponse(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetReferenceAttributeValuesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesResponseDocument.GetReferenceAttributeValuesResponse
    {
        
        public GetReferenceAttributeValuesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput target = null;
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput target = null;
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput target = null;
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ReferenceAttributeValuesOutput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
