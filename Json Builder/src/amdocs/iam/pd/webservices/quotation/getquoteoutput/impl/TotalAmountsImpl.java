/*
 * XML Type:  TotalAmounts
 * Namespace: http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput
 * Java type: amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.quotation.getquoteoutput.impl;
/**
 * An XML TotalAmounts(@http://amdocs/iam/pd/webservices/quotation/GetQuoteOutput).
 *
 * This is a complex type.
 */
public class TotalAmountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.quotation.getquoteoutput.TotalAmounts
{
    
    public TotalAmountsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OC$0 = 
        new javax.xml.namespace.QName("", "OC");
    private static final javax.xml.namespace.QName RC$2 = 
        new javax.xml.namespace.QName("", "RC");
    private static final javax.xml.namespace.QName TOTALAMOUNTSCUSTOM$4 = 
        new javax.xml.namespace.QName("", "totalAmountsCustom");
    
    
    /**
     * Gets the "OC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts getOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().find_element_user(OC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OC" element
     */
    public boolean isSetOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OC$0) != 0;
        }
    }
    
    /**
     * Sets the "OC" element
     */
    public void setOC(amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts oc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().find_element_user(OC$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().add_element_user(OC$0);
            }
            target.set(oc);
        }
    }
    
    /**
     * Appends and returns a new empty "OC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts addNewOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().add_element_user(OC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "OC" element
     */
    public void unsetOC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OC$0, 0);
        }
    }
    
    /**
     * Gets the "RC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts getRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().find_element_user(RC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RC" element
     */
    public boolean isSetRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RC$2) != 0;
        }
    }
    
    /**
     * Sets the "RC" element
     */
    public void setRC(amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts rc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().find_element_user(RC$2, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().add_element_user(RC$2);
            }
            target.set(rc);
        }
    }
    
    /**
     * Appends and returns a new empty "RC" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts addNewRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutput.Amounts)get_store().add_element_user(RC$2);
            return target;
        }
    }
    
    /**
     * Unsets the "RC" element
     */
    public void unsetRC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RC$2, 0);
        }
    }
    
    /**
     * Gets the "totalAmountsCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom getTotalAmountsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom)get_store().find_element_user(TOTALAMOUNTSCUSTOM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalAmountsCustom" element
     */
    public boolean isSetTotalAmountsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALAMOUNTSCUSTOM$4) != 0;
        }
    }
    
    /**
     * Sets the "totalAmountsCustom" element
     */
    public void setTotalAmountsCustom(amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom totalAmountsCustom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom)get_store().find_element_user(TOTALAMOUNTSCUSTOM$4, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom)get_store().add_element_user(TOTALAMOUNTSCUSTOM$4);
            }
            target.set(totalAmountsCustom);
        }
    }
    
    /**
     * Appends and returns a new empty "totalAmountsCustom" element
     */
    public amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom addNewTotalAmountsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom target = null;
            target = (amdocs.iam.pd.webservices.quotation.getquoteoutputimpl.TotalAmountsCustom)get_store().add_element_user(TOTALAMOUNTSCUSTOM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "totalAmountsCustom" element
     */
    public void unsetTotalAmountsCustom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALAMOUNTSCUSTOM$4, 0);
        }
    }
}
