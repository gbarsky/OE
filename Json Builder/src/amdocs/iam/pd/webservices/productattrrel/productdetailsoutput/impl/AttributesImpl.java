/*
 * XML Type:  Attributes
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML Attributes(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class AttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attributes
{
    
    public AttributesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("", "Attribute");
    
    
    /**
     * Gets array of all "Attribute" elements
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$0, targetList);
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute[] result = new amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Attribute" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "Attribute" element
     */
    public void setAttributeArray(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "Attribute" element
     */
    public void setAttributeArray(int i, amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute)get_store().insert_element_user(ATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Attribute)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$0, i);
        }
    }
}
