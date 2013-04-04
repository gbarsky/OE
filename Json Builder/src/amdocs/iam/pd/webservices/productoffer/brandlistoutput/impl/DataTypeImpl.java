/*
 * XML Type:  DataType
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/BrandListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.brandlistoutput.DataType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.brandlistoutput.impl;
/**
 * An XML DataType(@http://amdocs/iam/pd/webservices/productOffer/BrandListOutput).
 *
 * This is a complex type.
 */
public class DataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.brandlistoutput.DataType
{
    
    public DataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BRANDS$0 = 
        new javax.xml.namespace.QName("", "brands");
    
    
    /**
     * Gets the "brands" element
     */
    public amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands getBrands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands target = null;
            target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands)get_store().find_element_user(BRANDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "brands" element
     */
    public void setBrands(amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands brands)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands target = null;
            target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands)get_store().find_element_user(BRANDS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands)get_store().add_element_user(BRANDS$0);
            }
            target.set(brands);
        }
    }
    
    /**
     * Appends and returns a new empty "brands" element
     */
    public amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands addNewBrands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands target = null;
            target = (amdocs.iam.pd.webservices.productoffer.brandlistoutput.Brands)get_store().add_element_user(BRANDS$0);
            return target;
        }
    }
}
