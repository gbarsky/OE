/*
 * XML Type:  PopulatedField
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.impl;
/**
 * An XML PopulatedField(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public class PopulatedFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.PopulatedField
{
    
    public PopulatedFieldImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTECODE$0 = 
        new javax.xml.namespace.QName("", "attributeCode");
    private static final javax.xml.namespace.QName POPULATEDCOLUMN$2 = 
        new javax.xml.namespace.QName("", "populatedColumn");
    private static final javax.xml.namespace.QName POPULATEDFIELDCUSTOM$4 = 
        new javax.xml.namespace.QName("", "PopulatedFieldCustom");
    
    
    /**
     * Gets the "attributeCode" element
     */
    public java.lang.String getAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributeCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributeCode" element
     */
    public void setAttributeCode(java.lang.String attributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTECODE$0);
            }
            target.setStringValue(attributeCode);
        }
    }
    
    /**
     * Sets (as xml) the "attributeCode" element
     */
    public void xsetAttributeCode(org.apache.xmlbeans.XmlString attributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTECODE$0);
            }
            target.set(attributeCode);
        }
    }
    
    /**
     * Gets the "populatedColumn" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column getPopulatedColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().find_element_user(POPULATEDCOLUMN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "populatedColumn" element
     */
    public void setPopulatedColumn(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column populatedColumn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().find_element_user(POPULATEDCOLUMN$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().add_element_user(POPULATEDCOLUMN$2);
            }
            target.set(populatedColumn);
        }
    }
    
    /**
     * Appends and returns a new empty "populatedColumn" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column addNewPopulatedColumn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Column)get_store().add_element_user(POPULATEDCOLUMN$2);
            return target;
        }
    }
    
    /**
     * Gets the "PopulatedFieldCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom getPopulatedFieldCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom)get_store().find_element_user(POPULATEDFIELDCUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PopulatedFieldCustom" element
     */
    public boolean isSetPopulatedFieldCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POPULATEDFIELDCUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "PopulatedFieldCustom" element
     */
    public void setPopulatedFieldCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom populatedFieldCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom)get_store().find_element_user(POPULATEDFIELDCUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom)get_store().add_element_user(POPULATEDFIELDCUSTOM$4);
            }
            target.set(populatedFieldCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "PopulatedFieldCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom addNewPopulatedFieldCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.PopulatedFieldCustom)get_store().add_element_user(POPULATEDFIELDCUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "PopulatedFieldCustom" element
     */
    public void unsetPopulatedFieldCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POPULATEDFIELDCUSTOM$4, 0);
        }
    }
}
