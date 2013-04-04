
/**
 * WebServiceUALExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package amdocs.iam.pd.pdwebservices;

public class WebServiceUALExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1361848812855L;
    
    private amdocs.iam.pd.pdwebservices.WebServiceUALExceptionDocument faultMessage;

    
        public WebServiceUALExceptionException() {
            super("WebServiceUALExceptionException");
        }

        public WebServiceUALExceptionException(java.lang.String s) {
           super(s);
        }

        public WebServiceUALExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public WebServiceUALExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(amdocs.iam.pd.pdwebservices.WebServiceUALExceptionDocument msg){
       faultMessage = msg;
    }
    
    public amdocs.iam.pd.pdwebservices.WebServiceUALExceptionDocument getFaultMessage(){
       return faultMessage;
    }
}
    