/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productOffer/FullOfferListOutput
 * Java type: amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productOffer/FullOfferListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTCODES$0 = 
        new javax.xml.namespace.QName("", "productCodes");
    
    
    /**
     * Gets the "productCodes" element
     */
    public amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes getProductCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes)get_store().find_element_user(PRODUCTCODES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "productCodes" element
     */
    public void setProductCodes(amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes productCodes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes)get_store().find_element_user(PRODUCTCODES$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes)get_store().add_element_user(PRODUCTCODES$0);
            }
            target.set(productCodes);
        }
    }
    
    /**
     * Appends and returns a new empty "productCodes" element
     */
    public amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes addNewProductCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes target = null;
            target = (amdocs.iam.pd.webservices.productoffer.fullofferlistoutput.ProductCodes)get_store().add_element_user(PRODUCTCODES$0);
            return target;
        }
    }
}
