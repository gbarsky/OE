/*
 * An XML document type.
 * Localname: ROOT
 * Namespace: http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput
 * Java type: amdocs.iamcust.pd.webservices.offer.voucherlistoutput.ROOTDocument
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.offer.voucherlistoutput.impl;
/**
 * A document containing one ROOT(@http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput) element.
 *
 * This is a complex type.
 */
public class ROOTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.offer.voucherlistoutput.ROOTDocument
{
    
    public ROOTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput", "ROOT");
    
    
    /**
     * Gets the "ROOT" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput getROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().find_element_user(ROOT$0, 0);
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
    public void setROOT(amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "ROOT" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput addNewROOT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherListOutput)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
}
