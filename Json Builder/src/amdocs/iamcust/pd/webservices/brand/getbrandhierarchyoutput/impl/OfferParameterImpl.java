/*
 * XML Type:  OfferParameter
 * Namespace: http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput
 * Java type: amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter
 *
 * Automatically generated - do not modify.
 */
package amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.impl;
/**
 * An XML OfferParameter(@http://amdocs/iamcust/pd/webservices/brand/GetBrandHierarchyOutput).
 *
 * This is a complex type.
 */
public class OfferParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iamcust.pd.webservices.brand.getbrandhierarchyoutput.OfferParameter
{
    
    public OfferParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERCODE$0 = 
        new javax.xml.namespace.QName("", "parameterCode");
    private static final javax.xml.namespace.QName MAPPEDPARAMETERCODE$2 = 
        new javax.xml.namespace.QName("", "mappedParameterCode");
    
    
    /**
     * Gets the "parameterCode" element
     */
    public java.lang.String getParameterCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterCode" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parameterCode" element
     */
    public void setParameterCode(java.lang.String parameterCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERCODE$0);
            }
            target.setStringValue(parameterCode);
        }
    }
    
    /**
     * Sets (as xml) the "parameterCode" element
     */
    public void xsetParameterCode(org.apache.xmlbeans.XmlString parameterCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERCODE$0);
            }
            target.set(parameterCode);
        }
    }
    
    /**
     * Gets the "mappedParameterCode" element
     */
    public java.lang.String getMappedParameterCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPEDPARAMETERCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mappedParameterCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMappedParameterCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPEDPARAMETERCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mappedParameterCode" element
     */
    public void setMappedParameterCode(java.lang.String mappedParameterCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPEDPARAMETERCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPPEDPARAMETERCODE$2);
            }
            target.setStringValue(mappedParameterCode);
        }
    }
    
    /**
     * Sets (as xml) the "mappedParameterCode" element
     */
    public void xsetMappedParameterCode(org.apache.xmlbeans.XmlString mappedParameterCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPEDPARAMETERCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPPEDPARAMETERCODE$2);
            }
            target.set(mappedParameterCode);
        }
    }
}
