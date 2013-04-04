/*
 * XML Type:  Attribute
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.impl;
/**
 * An XML Attribute(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public class AttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Attribute
{
    
    public AttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTECODE$0 = 
        new javax.xml.namespace.QName("", "attributeCode");
    private static final javax.xml.namespace.QName MAPPEDATTRIBUTECODE$2 = 
        new javax.xml.namespace.QName("", "mappedAttributeCode");
    
    
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
     * Gets the "mappedAttributeCode" element
     */
    public java.lang.String getMappedAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPEDATTRIBUTECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mappedAttributeCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMappedAttributeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPEDATTRIBUTECODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mappedAttributeCode" element
     */
    public void setMappedAttributeCode(java.lang.String mappedAttributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPEDATTRIBUTECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPPEDATTRIBUTECODE$2);
            }
            target.setStringValue(mappedAttributeCode);
        }
    }
    
    /**
     * Sets (as xml) the "mappedAttributeCode" element
     */
    public void xsetMappedAttributeCode(org.apache.xmlbeans.XmlString mappedAttributeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPEDATTRIBUTECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPPEDATTRIBUTECODE$2);
            }
            target.set(mappedAttributeCode);
        }
    }
}
