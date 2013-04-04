/*
 * XML Type:  Brands
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/BrandListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.brandlistoutput.impl;
/**
 * An XML Brands(@http://amdocs/iam/pd/webservices/productOffer/BrandListOutput).
 *
 * This is a complex type.
 */
public class BrandsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands
{
    
    public BrandsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRAND$0 = 
        new javax.xml.namespace.QName("", "brand");
    
    
    /**
     * Gets array of all "brand" elements
     */
    public amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand[] getBrandArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BRAND$0, targetList);
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand[] result = new amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "brand" element
     */
    public amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand getBrandArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand target = null;
            target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand)get_store().find_element_user(BRAND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "brand" element
     */
    public int sizeOfBrandArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRAND$0);
        }
    }
    
    /**
     * Sets array of all "brand" element
     */
    public void setBrandArray(amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand[] brandArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(brandArray, BRAND$0);
        }
    }
    
    /**
     * Sets ith "brand" element
     */
    public void setBrandArray(int i, amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand target = null;
            target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand)get_store().find_element_user(BRAND$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(brand);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "brand" element
     */
    public amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand insertNewBrand(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand target = null;
            target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand)get_store().insert_element_user(BRAND$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "brand" element
     */
    public amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand addNewBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand target = null;
            target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brand)get_store().add_element_user(BRAND$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "brand" element
     */
    public void removeBrand(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRAND$0, i);
        }
    }
}
