/*
 * XML Type:  BrandSets
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.impl;
/**
 * An XML BrandSets(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutputImpl).
 *
 * This is a complex type.
 */
public class BrandSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSets
{
    
    public BrandSetsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDSET$0 = 
        new javax.xml.namespace.QName("", "BrandSet");
    
    
    /**
     * Gets array of all "BrandSet" elements
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet[] getBrandSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BRANDSET$0, targetList);
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet[] result = new amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BrandSet" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet getBrandSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet)get_store().find_element_user(BRANDSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BrandSet" element
     */
    public int sizeOfBrandSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDSET$0);
        }
    }
    
    /**
     * Sets array of all "BrandSet" element
     */
    public void setBrandSetArray(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet[] brandSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(brandSetArray, BRANDSET$0);
        }
    }
    
    /**
     * Sets ith "BrandSet" element
     */
    public void setBrandSetArray(int i, amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet brandSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet)get_store().find_element_user(BRANDSET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(brandSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BrandSet" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet insertNewBrandSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet)get_store().insert_element_user(BRANDSET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BrandSet" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet addNewBrandSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.BrandSet)get_store().add_element_user(BRANDSET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BrandSet" element
     */
    public void removeBrandSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDSET$0, i);
        }
    }
}
