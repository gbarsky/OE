/*
 * XML Type:  Vouchers
 * Namespace: http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput
 * Java type: amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.offer.voucherlistoutput.impl;
/**
 * An XML Vouchers(@http://amdocs/iamcust/pd/webservices/offer/VoucherListOutput).
 *
 * This is a complex type.
 */
public class VouchersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.offer.voucherlistoutput.Vouchers
{
    
    public VouchersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VOUCHER$0 = 
        new javax.xml.namespace.QName("", "voucher");
    
    
    /**
     * Gets array of all "voucher" elements
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer[] getVoucherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VOUCHER$0, targetList);
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer[] result = new amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "voucher" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer getVoucherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer)get_store().find_element_user(VOUCHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "voucher" element
     */
    public int sizeOfVoucherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOUCHER$0);
        }
    }
    
    /**
     * Sets array of all "voucher" element
     */
    public void setVoucherArray(amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer[] voucherArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(voucherArray, VOUCHER$0);
        }
    }
    
    /**
     * Sets ith "voucher" element
     */
    public void setVoucherArray(int i, amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer voucher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer)get_store().find_element_user(VOUCHER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(voucher);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "voucher" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer insertNewVoucher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer)get_store().insert_element_user(VOUCHER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "voucher" element
     */
    public amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer addNewVoucher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer target = null;
            target = (amdocs.iamcust.pd.webservices.offer.voucherlistoutput.VoucherOffer)get_store().add_element_user(VOUCHER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "voucher" element
     */
    public void removeVoucher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOUCHER$0, i);
        }
    }
}
