
/**
 * ResourceAdminServiceResourceServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.registry.resource.services;

public class ResourceAdminServiceResourceServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355392024562L;
    
    private org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException faultMessage;

    
        public ResourceAdminServiceResourceServiceExceptionException() {
            super("ResourceAdminServiceResourceServiceExceptionException");
        }

        public ResourceAdminServiceResourceServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public ResourceAdminServiceResourceServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ResourceAdminServiceResourceServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.registry.resource.services.ResourceAdminServiceResourceServiceException getFaultMessage(){
       return faultMessage;
    }
}
    