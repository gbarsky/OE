/*
 * XML Type:  Data
 * Namespace: http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityOutput
 * Java type: amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data
 *
 * Automatically generated - do not modify.
 */
package amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.impl;
/**
 * An XML Data(@http://amdocs/iam/pd/webservices/offer/CheckOfferEligibilityOutput).
 *
 * This is a complex type.
 */
public class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data
{
    
    public DataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELIGIBILITYRESULTS$0 = 
        new javax.xml.namespace.QName("", "EligibilityResults");
    
    
    /**
     * Gets the "EligibilityResults" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults getEligibilityResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults)get_store().find_element_user(ELIGIBILITYRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EligibilityResults" element
     */
    public void setEligibilityResults(amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults eligibilityResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults)get_store().find_element_user(ELIGIBILITYRESULTS$0, 0);
            if (target == null)
            {
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults)get_store().add_element_user(ELIGIBILITYRESULTS$0);
            }
            target.set(eligibilityResults);
        }
    }
    
    /**
     * Appends and returns a new empty "EligibilityResults" element
     */
    public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults addNewEligibilityResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults target = null;
            target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults)get_store().add_element_user(ELIGIBILITYRESULTS$0);
            return target;
        }
    }
    /**
     * An XML EligibilityResults(@).
     *
     * This is a complex type.
     */
    public static class EligibilityResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Data.EligibilityResults
    {
        
        public EligibilityResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULT$0 = 
            new javax.xml.namespace.QName("", "Result");
        
        
        /**
         * Gets array of all "Result" elements
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result[] getResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESULT$0, targetList);
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result[] result = new amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Result" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result getResultArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result)get_store().find_element_user(RESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Result" element
         */
        public int sizeOfResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULT$0);
            }
        }
        
        /**
         * Sets array of all "Result" element
         */
        public void setResultArray(amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result[] resultArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resultArray, RESULT$0);
            }
        }
        
        /**
         * Sets ith "Result" element
         */
        public void setResultArray(int i, amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result)get_store().find_element_user(RESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(result);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Result" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result insertNewResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result)get_store().insert_element_user(RESULT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Result" element
         */
        public amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result addNewResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result target = null;
                target = (amdocs.iam.pd.webservices.offer.checkoffereligibilityoutput.Result)get_store().add_element_user(RESULT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Result" element
         */
        public void removeResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULT$0, i);
            }
        }
    }
}
