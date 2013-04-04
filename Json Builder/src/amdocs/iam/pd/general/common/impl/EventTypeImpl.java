/*
 * XML Type:  EventType
 * Namespace: http://amdocs/iam/pd/general/Common
 * Java type: amdocs.iam.pd.general.common.EventType
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.general.common.impl;
/**
 * An XML EventType(@http://amdocs/iam/pd/general/Common).
 *
 * This is a complex type.
 */
public class EventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.general.common.EventType
{
    
    public EventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "Type");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName CALLERID$4 = 
        new javax.xml.namespace.QName("", "CallerID");
    private static final javax.xml.namespace.QName CORRELATIONID$6 = 
        new javax.xml.namespace.QName("", "CorrelationID");
    private static final javax.xml.namespace.QName SOURCEID$8 = 
        new javax.xml.namespace.QName("", "SourceID");
    private static final javax.xml.namespace.QName ORIGINALAPPL$10 = 
        new javax.xml.namespace.QName("", "OriginalAppl");
    private static final javax.xml.namespace.QName ORIGINALPUBID$12 = 
        new javax.xml.namespace.QName("", "OriginalPubID");
    
    
    /**
     * Gets the "Type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "CallerID" element
     */
    public java.lang.String getCallerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallerID" element
     */
    public org.apache.xmlbeans.XmlString xgetCallerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLERID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CallerID" element
     */
    public boolean isSetCallerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLERID$4) != 0;
        }
    }
    
    /**
     * Sets the "CallerID" element
     */
    public void setCallerID(java.lang.String callerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLERID$4);
            }
            target.setStringValue(callerID);
        }
    }
    
    /**
     * Sets (as xml) the "CallerID" element
     */
    public void xsetCallerID(org.apache.xmlbeans.XmlString callerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLERID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALLERID$4);
            }
            target.set(callerID);
        }
    }
    
    /**
     * Unsets the "CallerID" element
     */
    public void unsetCallerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLERID$4, 0);
        }
    }
    
    /**
     * Gets the "CorrelationID" element
     */
    public java.lang.String getCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorrelationID" element
     */
    public org.apache.xmlbeans.XmlString xgetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CorrelationID" element
     */
    public boolean isSetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONID$6) != 0;
        }
    }
    
    /**
     * Sets the "CorrelationID" element
     */
    public void setCorrelationID(java.lang.String correlationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIONID$6);
            }
            target.setStringValue(correlationID);
        }
    }
    
    /**
     * Sets (as xml) the "CorrelationID" element
     */
    public void xsetCorrelationID(org.apache.xmlbeans.XmlString correlationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRELATIONID$6);
            }
            target.set(correlationID);
        }
    }
    
    /**
     * Unsets the "CorrelationID" element
     */
    public void unsetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONID$6, 0);
        }
    }
    
    /**
     * Gets the "SourceID" element
     */
    public java.lang.String getSourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceID" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceID" element
     */
    public boolean isSetSourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEID$8) != 0;
        }
    }
    
    /**
     * Sets the "SourceID" element
     */
    public void setSourceID(java.lang.String sourceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEID$8);
            }
            target.setStringValue(sourceID);
        }
    }
    
    /**
     * Sets (as xml) the "SourceID" element
     */
    public void xsetSourceID(org.apache.xmlbeans.XmlString sourceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEID$8);
            }
            target.set(sourceID);
        }
    }
    
    /**
     * Unsets the "SourceID" element
     */
    public void unsetSourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEID$8, 0);
        }
    }
    
    /**
     * Gets the "OriginalAppl" element
     */
    public java.lang.String getOriginalAppl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALAPPL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OriginalAppl" element
     */
    public org.apache.xmlbeans.XmlString xgetOriginalAppl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALAPPL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "OriginalAppl" element
     */
    public boolean isSetOriginalAppl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALAPPL$10) != 0;
        }
    }
    
    /**
     * Sets the "OriginalAppl" element
     */
    public void setOriginalAppl(java.lang.String originalAppl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALAPPL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINALAPPL$10);
            }
            target.setStringValue(originalAppl);
        }
    }
    
    /**
     * Sets (as xml) the "OriginalAppl" element
     */
    public void xsetOriginalAppl(org.apache.xmlbeans.XmlString originalAppl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALAPPL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGINALAPPL$10);
            }
            target.set(originalAppl);
        }
    }
    
    /**
     * Unsets the "OriginalAppl" element
     */
    public void unsetOriginalAppl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALAPPL$10, 0);
        }
    }
    
    /**
     * Gets the "OriginalPubID" element
     */
    public java.lang.String getOriginalPubID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALPUBID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OriginalPubID" element
     */
    public org.apache.xmlbeans.XmlString xgetOriginalPubID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALPUBID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "OriginalPubID" element
     */
    public boolean isSetOriginalPubID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALPUBID$12) != 0;
        }
    }
    
    /**
     * Sets the "OriginalPubID" element
     */
    public void setOriginalPubID(java.lang.String originalPubID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALPUBID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINALPUBID$12);
            }
            target.setStringValue(originalPubID);
        }
    }
    
    /**
     * Sets (as xml) the "OriginalPubID" element
     */
    public void xsetOriginalPubID(org.apache.xmlbeans.XmlString originalPubID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALPUBID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGINALPUBID$12);
            }
            target.set(originalPubID);
        }
    }
    
    /**
     * Unsets the "OriginalPubID" element
     */
    public void unsetOriginalPubID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALPUBID$12, 0);
        }
    }
}
