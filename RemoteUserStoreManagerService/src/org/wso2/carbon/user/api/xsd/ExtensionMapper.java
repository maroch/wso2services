
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.user.api.xsd;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "UserStoreException".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.xsd.UserStoreException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.ws.um.carbon.wso2.org".equals(namespaceURI) &&
                  "ArrayOfString".equals(typeName)){
                   
                            return  org.wso2.carbon.um.ws.service.ArrayOfString.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://core.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Permission".equals(typeName)){
                   
                            return  org.wso2.carbon.user.core.xsd.Permission.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.mgt.user.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ClaimValue".equals(typeName)){
                   
                            return  org.wso2.carbon.user.mgt.common.xsd.ClaimValue.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    