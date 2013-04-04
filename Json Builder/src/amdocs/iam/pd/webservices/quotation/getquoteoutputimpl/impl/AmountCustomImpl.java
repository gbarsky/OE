/*
 * XML Type:  AmountCustom
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.impl;
/**
 * An XML AmountCustom(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutputImpl).
 *
 * This is a complex type.
 */
public class AmountCustomImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom
{
    
    public AmountCustomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAXAMOUNTS$0 = 
        new javax.xml.namespace.QName("", "TaxAmounts");
    private static final javax.xml.namespace.QName AMOUNTSAFTERTAX$2 = 
        new javax.xml.namespace.QName("", "AmountsAfterTax");
    
    
    /**
     * Gets the "TaxAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts getTaxAmounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts)get_store().find_element_user(TAXAMOUNTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TaxAmounts" element
     */
    public void setTaxAmounts(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts taxAmounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts)get_store().find_element_user(TAXAMOUNTS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts)get_store().add_element_user(TAXAMOUNTS$0);
            }
            target.set(taxAmounts);
        }
    }
    
    /**
     * Appends and returns a new empty "TaxAmounts" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts addNewTaxAmounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts)get_store().add_element_user(TAXAMOUNTS$0);
            return target;
        }
    }
    
    /**
     * Gets the "AmountsAfterTax" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax getAmountsAfterTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax)get_store().find_element_user(AMOUNTSAFTERTAX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AmountsAfterTax" element
     */
    public void setAmountsAfterTax(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax amountsAfterTax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax)get_store().find_element_user(AMOUNTSAFTERTAX$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax)get_store().add_element_user(AMOUNTSAFTERTAX$2);
            }
            target.set(amountsAfterTax);
        }
    }
    
    /**
     * Appends and returns a new empty "AmountsAfterTax" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax addNewAmountsAfterTax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax)get_store().add_element_user(AMOUNTSAFTERTAX$2);
            return target;
        }
    }
    /**
     * An XML TaxAmounts(@).
     *
     * This is a complex type.
     */
    public static class TaxAmountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.TaxAmounts
    {
        
        public TaxAmountsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TOTALAMOUNT$0 = 
            new javax.xml.namespace.QName("", "totalAmount");
        private static final javax.xml.namespace.QName DISCOUNTAMOUNT$2 = 
            new javax.xml.namespace.QName("", "discountAmount");
        private static final javax.xml.namespace.QName AMOUNT$4 = 
            new javax.xml.namespace.QName("", "amount");
        
        
        /**
         * Gets the "totalAmount" element
         */
        public double getTotalAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNT$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "totalAmount" element
         */
        public org.apache.xmlbeans.XmlDouble xgetTotalAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TOTALAMOUNT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "totalAmount" element
         */
        public void setTotalAmount(double totalAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALAMOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALAMOUNT$0);
                }
                target.setDoubleValue(totalAmount);
            }
        }
        
        /**
         * Sets (as xml) the "totalAmount" element
         */
        public void xsetTotalAmount(org.apache.xmlbeans.XmlDouble totalAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(TOTALAMOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(TOTALAMOUNT$0);
                }
                target.set(totalAmount);
            }
        }
        
        /**
         * Gets the "discountAmount" element
         */
        public double getDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "discountAmount" element
         */
        public org.apache.xmlbeans.XmlDouble xgetDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "discountAmount" element
         */
        public boolean isSetDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCOUNTAMOUNT$2) != 0;
            }
        }
        
        /**
         * Sets the "discountAmount" element
         */
        public void setDiscountAmount(double discountAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCOUNTAMOUNT$2);
                }
                target.setDoubleValue(discountAmount);
            }
        }
        
        /**
         * Sets (as xml) the "discountAmount" element
         */
        public void xsetDiscountAmount(org.apache.xmlbeans.XmlDouble discountAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DISCOUNTAMOUNT$2);
                }
                target.set(discountAmount);
            }
        }
        
        /**
         * Unsets the "discountAmount" element
         */
        public void unsetDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCOUNTAMOUNT$2, 0);
            }
        }
        
        /**
         * Gets the "amount" element
         */
        public double getAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "amount" element
         */
        public org.apache.xmlbeans.XmlDouble xgetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "amount" element
         */
        public void setAmount(double amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$4);
                }
                target.setDoubleValue(amount);
            }
        }
        
        /**
         * Sets (as xml) the "amount" element
         */
        public void xsetAmount(org.apache.xmlbeans.XmlDouble amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AMOUNT$4);
                }
                target.set(amount);
            }
        }
    }
    /**
     * An XML AmountsAfterTax(@).
     *
     * This is a complex type.
     */
    public static class AmountsAfterTaxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.AmountCustom.AmountsAfterTax
    {
        
        public AmountsAfterTaxImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GROSSAMOUNT$0 = 
            new javax.xml.namespace.QName("", "grossAmount");
        private static final javax.xml.namespace.QName DISCOUNTAMOUNT$2 = 
            new javax.xml.namespace.QName("", "discountAmount");
        private static final javax.xml.namespace.QName NETAMOUNT$4 = 
            new javax.xml.namespace.QName("", "netAmount");
        
        
        /**
         * Gets the "grossAmount" element
         */
        public double getGrossAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAMOUNT$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "grossAmount" element
         */
        public org.apache.xmlbeans.XmlDouble xgetGrossAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GROSSAMOUNT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "grossAmount" element
         */
        public void setGrossAmount(double grossAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROSSAMOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROSSAMOUNT$0);
                }
                target.setDoubleValue(grossAmount);
            }
        }
        
        /**
         * Sets (as xml) the "grossAmount" element
         */
        public void xsetGrossAmount(org.apache.xmlbeans.XmlDouble grossAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(GROSSAMOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(GROSSAMOUNT$0);
                }
                target.set(grossAmount);
            }
        }
        
        /**
         * Gets the "discountAmount" element
         */
        public double getDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "discountAmount" element
         */
        public org.apache.xmlbeans.XmlDouble xgetDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "discountAmount" element
         */
        public boolean isSetDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCOUNTAMOUNT$2) != 0;
            }
        }
        
        /**
         * Sets the "discountAmount" element
         */
        public void setDiscountAmount(double discountAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISCOUNTAMOUNT$2);
                }
                target.setDoubleValue(discountAmount);
            }
        }
        
        /**
         * Sets (as xml) the "discountAmount" element
         */
        public void xsetDiscountAmount(org.apache.xmlbeans.XmlDouble discountAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DISCOUNTAMOUNT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DISCOUNTAMOUNT$2);
                }
                target.set(discountAmount);
            }
        }
        
        /**
         * Unsets the "discountAmount" element
         */
        public void unsetDiscountAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCOUNTAMOUNT$2, 0);
            }
        }
        
        /**
         * Gets the "netAmount" element
         */
        public double getNetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETAMOUNT$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "netAmount" element
         */
        public org.apache.xmlbeans.XmlDouble xgetNetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NETAMOUNT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "netAmount" element
         */
        public void setNetAmount(double netAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NETAMOUNT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NETAMOUNT$4);
                }
                target.setDoubleValue(netAmount);
            }
        }
        
        /**
         * Sets (as xml) the "netAmount" element
         */
        public void xsetNetAmount(org.apache.xmlbeans.XmlDouble netAmount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NETAMOUNT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(NETAMOUNT$4);
                }
                target.set(netAmount);
            }
        }
    }
}
