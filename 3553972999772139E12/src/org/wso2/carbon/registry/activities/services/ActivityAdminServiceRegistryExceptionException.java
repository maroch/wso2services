
/**
 * ActivityAdminServiceRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.registry.activities.services;

public class ActivityAdminServiceRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397299955L;
    
    private org.wso2.carbon.registry.activities.services.ActivityAdminServiceRegistryException faultMessage;

    
        public ActivityAdminServiceRegistryExceptionException() {
            super("ActivityAdminServiceRegistryExceptionException");
        }

        public ActivityAdminServiceRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public ActivityAdminServiceRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ActivityAdminServiceRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.registry.activities.services.ActivityAdminServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.registry.activities.services.ActivityAdminServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    