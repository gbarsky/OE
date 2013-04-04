/*
 * An XML document type.
 * Localname: GetFullOfferList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetFullOfferListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetFullOfferList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetFullOfferListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullOfferListDocument
{
    
    public GetFullOfferListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFULLOFFERLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetFullOfferList");
    
    
    /**
     * Gets the "GetFullOfferList" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList getGetFullOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList)get_store().find_element_user(GETFULLOFFERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetFullOfferList" element
     */
    public void setGetFullOfferList(amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList getFullOfferList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList)get_store().find_element_user(GETFULLOFFERLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList)get_store().add_element_user(GETFULLOFFERLIST$0);
            }
            target.set(getFullOfferList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetFullOfferList" element
     */
    public amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList addNewGetFullOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList)get_store().add_element_user(GETFULLOFFERLIST$0);
            return target;
        }
    }
    /**
     * An XML GetFullOfferList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetFullOfferListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetFullOfferListDocument.GetFullOfferList
    {
        
        public GetFullOfferListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/FullOfferListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.fullofferlistinput.FullOfferListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
