/*
 * XML Type:  Data
 * Namespace: http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput
 * Java type: amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.offer.voucherlistoutput.impl;
/**
 * An XML Data(@http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOUCHERS$0 = 
        new javax.xml.namespace.QName("", "vouchers");
    
    
    /**
     * Gets the "vouchers" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers getVouchers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers)get_store().find_element_user(VOUCHERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vouchers" element
     */
    public void setVouchers(amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers vouchers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers)get_store().find_element_user(VOUCHERS$0, 0);
            if (target == null)
            {
                target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers)get_store().add_element_user(VOUCHERS$0);
            }
            target.set(vouchers);
        }
    }
    
    /**
     * Appends and returns a new empty "vouchers" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers addNewVouchers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers)get_store().add_element_user(VOUCHERS$0);
            return target;
        }
    }
}
