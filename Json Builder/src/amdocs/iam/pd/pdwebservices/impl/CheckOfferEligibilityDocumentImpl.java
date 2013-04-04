/*
 * An XML document type.
 * Localname: CheckOfferEligibility
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one CheckOfferEligibility(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class CheckOfferEligibilityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument
{
    
    public CheckOfferEligibilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOFFERELIGIBILITY$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "CheckOfferEligibility");
    
    
    /**
     * Gets the "CheckOfferEligibility" element
     */
    public amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility getCheckOfferEligibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility)get_store().find_element_user(CHECKOFFERELIGIBILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckOfferEligibility" element
     */
    public void setCheckOfferEligibility(amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility checkOfferEligibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility)get_store().find_element_user(CHECKOFFERELIGIBILITY$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility)get_store().add_element_user(CHECKOFFERELIGIBILITY$0);
            }
            target.set(checkOfferEligibility);
        }
    }
    
    /**
     * Appends and returns a new empty "CheckOfferEligibility" element
     */
    public amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility addNewCheckOfferEligibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility)get_store().add_element_user(CHECKOFFERELIGIBILITY$0);
            return target;
        }
    }
    /**
     * An XML CheckOfferEligibility(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class CheckOfferEligibilityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckOfferEligibilityDocument.CheckOfferEligibility
    {
        
        public CheckOfferEligibilityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityinput.CheckOfferEligibilityInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
