/*
 * An XML document type.
 * Localname: GetVoucherList
 * Namespace: http://amdocs/iam/pd/pdwebservices
 * Java type: amdocs.iam.pd.pdwebservices.GetVoucherListDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.pdwebservices.impl;
/**
 * A document containing one GetVoucherList(@http://amdocs/iam/pd/pdwebservices) element.
 *
 * This is a complex type.
 */
public class GetVoucherListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetVoucherListDocument
{
    
    public GetVoucherListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVOUCHERLIST$0 = 
        new javax.xml.namespace.QName("http://amdocs/iam/pd/pdwebservices", "GetVoucherList");
    
    
    /**
     * Gets the "GetVoucherList" element
     */
    public amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList getGetVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList)get_store().find_element_user(GETVOUCHERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetVoucherList" element
     */
    public void setGetVoucherList(amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList getVoucherList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList)get_store().find_element_user(GETVOUCHERLIST$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList)get_store().add_element_user(GETVOUCHERLIST$0);
            }
            target.set(getVoucherList);
        }
    }
    
    /**
     * Appends and returns a new empty "GetVoucherList" element
     */
    public amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList addNewGetVoucherList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList target = null;
            target = (amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList)get_store().add_element_user(GETVOUCHERLIST$0);
            return target;
        }
    }
    /**
     * An XML GetVoucherList(@http://amdocs/iam/pd/pdwebservices).
     *
     * This is a complex type.
     */
    public static class GetVoucherListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.pdwebservices.GetVoucherListDocument.GetVoucherList
    {
        
        public GetVoucherListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("http://amdocs/iamcust/pd/webservices/offer/VoucherListInput", "ROOT");
        
        
        /**
         * Gets the "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput getROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput target = null;
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput)get_store().find_element_user(ROOT$0, 0);
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
        public void setROOT(amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput target = null;
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput)get_store().find_element_user(ROOT$0, 0);
                if (target == null)
                {
                    target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput)get_store().add_element_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Appends and returns a new empty "ROOT" element
         */
        public amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput addNewROOT()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput target = null;
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistinput.VoucherListInput)get_store().add_element_user(ROOT$0);
                return target;
            }
        }
    }
}
