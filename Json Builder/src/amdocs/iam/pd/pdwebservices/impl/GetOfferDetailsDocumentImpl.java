/*
 * An XML document type.
 * Localname: GetOfferDetails
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetOfferDetails(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetOfferDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument
{
    
    public GetOfferDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETOFFERDETAILS$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetOfferDetails");
    
    
    /**
     * Gets the "GetOfferDetails" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails getGetOfferDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails)get_store().find_element_user(GETOFFERDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetOfferDetails" element
     */
    public void setGetOfferDetails(amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails getOfferDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails)get_store().find_element_user(GETOFFERDETAILS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails)get_store().add_element_user(GETOFFERDETAILS$0);
            }
            target.set(getOfferDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "GetOfferDetails" element
     */
    public amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails addNewGetOfferDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails target = null;
            target = (amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails)get_store().add_element_user(GETOFFERDETAILS$0);
            return target;
        }
    }
    /**
     * An XML GetOfferDetails(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetOfferDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetOfferDetailsDocument.GetOfferDetails
    {
        
        public GetOfferDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offerAdvPkg/OfferDetailsInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput target = null;
                target = (amdocs.iam.pd.webservices.offeradvpkg.offerdetailsinput.OfferDetailsInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
