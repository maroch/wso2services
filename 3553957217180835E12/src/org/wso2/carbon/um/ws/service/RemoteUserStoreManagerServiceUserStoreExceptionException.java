
/**
 * RemoteUserStoreManagerServiceUserStoreExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.um.ws.service;

public class RemoteUserStoreManagerServiceUserStoreExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395721660L;
    
    private org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException faultMessage;

    
        public RemoteUserStoreManagerServiceUserStoreExceptionException() {
            super("RemoteUserStoreManagerServiceUserStoreExceptionException");
        }

        public RemoteUserStoreManagerServiceUserStoreExceptionException(java.lang.String s) {
           super(s);
        }

        public RemoteUserStoreManagerServiceUserStoreExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RemoteUserStoreManagerServiceUserStoreExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.um.ws.service.RemoteUserStoreManagerServiceUserStoreException getFaultMessage(){
       return faultMessage;
    }
}
    