/*
 * XML Type:  Offer
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.impl;
/**
 * An XML Offer(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public class OfferImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.Offer
{
    
    public OfferImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFFERCODE$0 = 
        new javax.xml.namespace.QName("", "offerCode");
    private static final javax.xml.namespace.QName LOCKEDPARAMETERS$2 = 
        new javax.xml.namespace.QName("", "lockedParameters");
    private static final javax.xml.namespace.QName LINKEDPARAMETERS$4 = 
        new javax.xml.namespace.QName("", "linkedParameters");
    
    
    /**
     * Gets the "offerCode" element
     */
    public java.lang.String getOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "offerCode" element
     */
    public org.apache.xmlbeans.XmlString xgetOfferCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "offerCode" element
     */
    public void setOfferCode(java.lang.String offerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERCODE$0);
            }
            target.setStringValue(offerCode);
        }
    }
    
    /**
     * Sets (as xml) the "offerCode" element
     */
    public void xsetOfferCode(org.apache.xmlbeans.XmlString offerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERCODE$0);
            }
            target.set(offerCode);
        }
    }
    
    /**
     * Gets array of all "lockedParameters" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] getLockedParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCKEDPARAMETERS$2, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lockedParameters" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter getLockedParametersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().find_element_user(LOCKEDPARAMETERS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lockedParameters" element
     */
    public int sizeOfLockedParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCKEDPARAMETERS$2);
        }
    }
    
    /**
     * Sets array of all "lockedParameters" element
     */
    public void setLockedParametersArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] lockedParametersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lockedParametersArray, LOCKEDPARAMETERS$2);
        }
    }
    
    /**
     * Sets ith "lockedParameters" element
     */
    public void setLockedParametersArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter lockedParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().find_element_user(LOCKEDPARAMETERS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lockedParameters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lockedParameters" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter insertNewLockedParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().insert_element_user(LOCKEDPARAMETERS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lockedParameters" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter addNewLockedParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().add_element_user(LOCKEDPARAMETERS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "lockedParameters" element
     */
    public void removeLockedParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCKEDPARAMETERS$2, i);
        }
    }
    
    /**
     * Gets array of all "linkedParameters" elements
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] getLinkedParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKEDPARAMETERS$4, targetList);
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] result = new amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "linkedParameters" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter getLinkedParametersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().find_element_user(LINKEDPARAMETERS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "linkedParameters" element
     */
    public int sizeOfLinkedParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKEDPARAMETERS$4);
        }
    }
    
    /**
     * Sets array of all "linkedParameters" element
     */
    public void setLinkedParametersArray(amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter[] linkedParametersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkedParametersArray, LINKEDPARAMETERS$4);
        }
    }
    
    /**
     * Sets ith "linkedParameters" element
     */
    public void setLinkedParametersArray(int i, amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter linkedParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().find_element_user(LINKEDPARAMETERS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkedParameters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkedParameters" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter insertNewLinkedParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().insert_element_user(LINKEDPARAMETERS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkedParameters" element
     */
    public amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter addNewLinkedParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter target = null;
            target = (amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter)get_store().add_element_user(LINKEDPARAMETERS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "linkedParameters" element
     */
    public void removeLinkedParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKEDPARAMETERS$4, i);
        }
    }
}
