/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput
 * Java type: amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/referenceAttributeValues/ReferenceAttributeValuesOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTECODE$0 = 
        new javax.xml.namespace.QName("", "attributeCode");
    private static final javax.xml.namespace.QName ISLVLOGICALNAME$2 = 
        new javax.xml.namespace.QName("", "iSLVLogicalName");
    private static final javax.xml.namespace.QName ATTRIBUTEVALUES$4 = 
        new javax.xml.namespace.QName("", "attributeValues");
    private static final javax.xml.namespace.QName DATACUSTOM$6 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
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
     * Gets the "iSLVLogicalName" element
     */
    public java.lang.String getISLVLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLVLOGICALNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iSLVLogicalName" element
     */
    public org.apache.xmlbeans.XmlString xgetISLVLogicalName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISLVLOGICALNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "iSLVLogicalName" element
     */
    public void setISLVLogicalName(java.lang.String islvLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISLVLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISLVLOGICALNAME$2);
            }
            target.setStringValue(islvLogicalName);
        }
    }
    
    /**
     * Sets (as xml) the "iSLVLogicalName" element
     */
    public void xsetISLVLogicalName(org.apache.xmlbeans.XmlString islvLogicalName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISLVLOGICALNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISLVLOGICALNAME$2);
            }
            target.set(islvLogicalName);
        }
    }
    
    /**
     * Gets the "attributeValues" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues getAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues)get_store().find_element_user(ATTRIBUTEVALUES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attributeValues" element
     */
    public void setAttributeValues(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues attributeValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues)get_store().find_element_user(ATTRIBUTEVALUES$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues)get_store().add_element_user(ATTRIBUTEVALUES$4);
            }
            target.set(attributeValues);
        }
    }
    
    /**
     * Appends and returns a new empty "attributeValues" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues addNewAttributeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutput.ValidValues)get_store().add_element_user(ATTRIBUTEVALUES$4);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataCustom" element
     */
    public boolean isSetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACUSTOM$6) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$6, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$6);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.referenceattributevalues.referenceattributevaluesoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$6);
            return target;
        }
    }
    
    /**
     * Unsets the "DataCustom" element
     */
    public void unsetDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACUSTOM$6, 0);
        }
    }
}
