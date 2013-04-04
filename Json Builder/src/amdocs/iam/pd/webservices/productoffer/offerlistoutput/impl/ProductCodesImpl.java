/*
 * XML Type:  ProductCodes
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/OfferListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.offerlistoutput.ProductCodes
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.offerlistoutput.impl;
/**
 * An XML ProductCodes(@http://amdocs/iam/pd/webservices/productOffer/OfferListOutput).
 *
 * This is a complex type.
 */
public class ProductCodesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.offerlistoutput.ProductCodes
{
    
    public ProductCodesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODE$0 = 
        new javax.xml.namespace.QName("", "productCode");
    
    
    /**
     * Gets array of all "productCode" elements
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers[] getProductCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTCODE$0, targetList);
            amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers[] result = new amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "productCode" element
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers getProductCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers)get_store().find_element_user(PRODUCTCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "productCode" element
     */
    public int sizeOfProductCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTCODE$0);
        }
    }
    
    /**
     * Sets array of all "productCode" element
     */
    public void setProductCodeArray(amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers[] productCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productCodeArray, PRODUCTCODE$0);
        }
    }
    
    /**
     * Sets ith "productCode" element
     */
    public void setProductCodeArray(int i, amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers productCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers)get_store().find_element_user(PRODUCTCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(productCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "productCode" element
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers insertNewProductCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers)get_store().insert_element_user(PRODUCTCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "productCode" element
     */
    public amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers addNewProductCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers target = null;
            target = (amdocs.iam.pd.webservices.productoffer.offerlistoutput.Offers)get_store().add_element_user(PRODUCTCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "productCode" element
     */
    public void removeProductCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTCODE$0, i);
        }
    }
}
