/*
 * An XML document type.
 * Localname: GetOfferList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetOfferListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetOfferList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetOfferListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferListDocument
{
    
    public GetOfferListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetOfferList");
    
    
    /**
     * Gets the "GetOfferList" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList getGetOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList)get_store().find_element_user(GETOFFERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferList" element
     */
    public void setGetOfferList(amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList getOfferList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList)get_store().find_element_user(GETOFFERLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList)get_store().add_element_user(GETOFFERLIST$0);
            }
            target.set(getOfferList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetOfferList" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList addNewGetOfferList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList)get_store().add_element_user(GETOFFERLIST$0);
            return target;
        }
    }
    /**
     * An XML GetOfferList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetOfferListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferListDocument.GetOfferList
    {
        
        public GetOfferListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productOffer/OfferListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput target = null;
                target = (amdocs.iam.pd.webservices.productoffer.offerlistinput.OfferListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
