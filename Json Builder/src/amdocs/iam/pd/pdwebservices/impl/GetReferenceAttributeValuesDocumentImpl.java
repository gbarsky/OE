/*
 * An XML document type.
 * Localname: GetReferenceAttributeValues
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetReferenceAttributeValues(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetReferenceAttributeValuesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument
{
    
    public GetReferenceAttributeValuesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREFERENCEATTRIBUTEVALUES$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetReferenceAttributeValues");
    
    
    /**
     * Gets the "GetReferenceAttributeValues" element
     */
    public amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues getGetReferenceAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues target = null;
            target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues)get_store().find_element_user(GETREFERENCEATTRIBUTEVALUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetReferenceAttributeValues" element
     */
    public void setGetReferenceAttributeValues(amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues getReferenceAttributeValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues target = null;
            target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues)get_store().find_element_user(GETREFERENCEATTRIBUTEVALUES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues)get_store().add_element_user(GETREFERENCEATTRIBUTEVALUES$0);
            }
            target.set(getReferenceAttributeValues);
        }
    }
    
    /**
     * Appends and returns a new empty "GetReferenceAttributeValues" element
     */
    public amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues addNewGetReferenceAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues target = null;
            target = (amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues)get_store().add_element_user(GETREFERENCEATTRIBUTEVALUES$0);
            return target;
        }
    }
    /**
     * An XML GetReferenceAttributeValues(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetReferenceAttributeValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetReferenceAttributeValuesDocument.GetReferenceAttributeValues
    {
        
        public GetReferenceAttributeValuesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput target = null;
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput target = null;
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput target = null;
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ReferenceAttributeValuesInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
