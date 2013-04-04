/*
 * An XML document type.
 * Localname: GetBrandList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBrandListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBrandList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBrandListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandListDocument
{
    
    public GetBrandListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBRANDLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBrandList");
    
    
    /**
     * Gets the "GetBrandList" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList getGetBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList)get_store().find_element_user(GETBRANDLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBrandList" element
     */
    public void setGetBrandList(amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList getBrandList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList)get_store().find_element_user(GETBRANDLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList)get_store().add_element_user(GETBRANDLIST$0);
            }
            target.set(getBrandList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBrandList" element
     */
    public amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList addNewGetBrandList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList)get_store().add_element_user(GETBRANDLIST$0);
            return target;
        }
    }
    /**
     * An XML GetBrandList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBrandListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBrandListDocument.GetBrandList
    {
        
        public GetBrandListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/BrandListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ROOT" element
         */
        public void setROOT(amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.brandlistinput.BrandListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
