/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput
 * Java type: amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/productAttrRel/ProductDetailsOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTENTITY$0 = 
        new javax.xml.namespace.QName("", "productEntity");
    private static final javax.xml.namespace.QName DATACUSTOM$2 = 
        new javax.xml.namespace.QName("", "DataCustom");
    
    
    /**
     * Gets the "productEntity" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity getProductEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity)get_store().find_element_user(PRODUCTENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "productEntity" element
     */
    public void setProductEntity(amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity productEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity)get_store().find_element_user(PRODUCTENTITY$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity)get_store().add_element_user(PRODUCTENTITY$0);
            }
            target.set(productEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "productEntity" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity addNewProductEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutput.ProductEntity)get_store().add_element_user(PRODUCTENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom getDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
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
            return get_store().count_elements(DATACUSTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "DataCustom" element
     */
    public void setDataCustom(amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom dataCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom)get_store().find_element_user(DATACUSTOM$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
            }
            target.set(dataCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "DataCustom" element
     */
    public amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom addNewDataCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom target = null;
            target = (amdocs.iam.pd.webservices.productattrrel.productdetailsoutputimpl.DataCustom)get_store().add_element_user(DATACUSTOM$2);
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
            get_store().remove_element(DATACUSTOM$2, 0);
        }
    }
}
