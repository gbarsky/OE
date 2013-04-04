/*
 * An XML document type.
 * Localname: GetBillDiscountList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetBillDiscountList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetBillDiscountListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument
{
    
    public GetBillDiscountListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBILLDISCOUNTLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetBillDiscountList");
    
    
    /**
     * Gets the "GetBillDiscountList" element
     */
    public amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList getGetBillDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList)get_store().find_element_user(GETBILLDISCOUNTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetBillDiscountList" element
     */
    public void setGetBillDiscountList(amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList getBillDiscountList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList)get_store().find_element_user(GETBILLDISCOUNTLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList)get_store().add_element_user(GETBILLDISCOUNTLIST$0);
            }
            target.set(getBillDiscountList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetBillDiscountList" element
     */
    public amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList addNewGetBillDiscountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList)get_store().add_element_user(GETBILLDISCOUNTLIST$0);
            return target;
        }
    }
    /**
     * An XML GetBillDiscountList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetBillDiscountListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetBillDiscountListDocument.GetBillDiscountList
    {
        
        public GetBillDiscountListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iam/pd/webservices/offer/BillDiscountOfferListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput target = null;
                target = (amdocs.iam.pd.webservices.offer.billdiscountofferlistinput.BillDiscountOfferListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
