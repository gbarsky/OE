/*
 * An XML document type.
 * Localname: CheckProductEligibility
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one CheckProductEligibility(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class CheckProductEligibilityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument
{
    
    public CheckProductEligibilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKPRODUCTELIGIBILITY$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "CheckProductEligibility");
    
    
    /**
     * Gets the "CheckProductEligibility" element
     */
    public amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility getCheckProductEligibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility)get_store().find_element_user(CHECKPRODUCTELIGIBILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckProductEligibility" element
     */
    public void setCheckProductEligibility(amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility checkProductEligibility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility)get_store().find_element_user(CHECKPRODUCTELIGIBILITY$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility)get_store().add_element_user(CHECKPRODUCTELIGIBILITY$0);
            }
            target.set(checkProductEligibility);
        }
    }
    
    /**
     * Appends and returns a new empty "CheckProductEligibility" element
     */
    public amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility addNewCheckProductEligibility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility target = null;
            target = (amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility)get_store().add_element_user(CHECKPRODUCTELIGIBILITY$0);
            return target;
        }
    }
    /**
     * An XML CheckProductEligibility(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class CheckProductEligibilityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.CheckProductEligibilityDocument.CheckProductEligibility
    {
        
        public CheckProductEligibilityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/productRelations/CheckProductEligibilityInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput target = null;
                target = (amdocs.iam.pd.webservices.productrelations.checkproducteligibilityinput.CheckProductEligibilityInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
