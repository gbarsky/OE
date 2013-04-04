/*
 * XML Type:  Values
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML Values(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class ValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Values
{
    
    public ValuesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "Value");
    
    
    /**
     * Gets array of all "Value" elements
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$0, targetList);
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value[] result = new amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Value" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0);
        }
    }
    
    /**
     * Sets array of all "Value" element
     */
    public void setValueArray(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$0);
        }
    }
    
    /**
     * Sets ith "Value" element
     */
    public void setValueArray(int i, amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value)get_store().insert_element_user(VALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Value)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, i);
        }
    }
}
