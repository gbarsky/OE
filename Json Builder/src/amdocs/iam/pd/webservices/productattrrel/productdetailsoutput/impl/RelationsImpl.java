/*
 * XML Type:  Relations
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML Relations(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class RelationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relations
{
    
    public RelationsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATION$0 = 
        new javax.xml.namespace.QName("", "Relation");
    
    
    /**
     * Gets array of all "Relation" elements
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation[] getRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATION$0, targetList);
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation[] result = new amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Relation" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation getRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation)get_store().find_element_user(RELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Relation" element
     */
    public int sizeOfRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATION$0);
        }
    }
    
    /**
     * Sets array of all "Relation" element
     */
    public void setRelationArray(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation[] relationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relationArray, RELATION$0);
        }
    }
    
    /**
     * Sets ith "Relation" element
     */
    public void setRelationArray(int i, amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation relation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation)get_store().find_element_user(RELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Relation" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation insertNewRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation)get_store().insert_element_user(RELATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Relation" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation addNewRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Relation)get_store().add_element_user(RELATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Relation" element
     */
    public void removeRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATION$0, i);
        }
    }
}
