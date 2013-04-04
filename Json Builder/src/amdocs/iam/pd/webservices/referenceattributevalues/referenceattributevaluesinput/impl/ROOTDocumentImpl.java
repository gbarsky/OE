/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesInput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesinput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
