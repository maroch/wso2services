
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

        
            package org.wso2.carbon.governance.generic.services;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://exceptions.core.registry.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "RegistryException".equals(typeName)){
                   
                            return  org.wso2.carbon.registry.core.exceptions.xsd.RegistryException.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.generic.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ArtifactsBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.generic.beans.xsd.ArtifactsBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://beans.generic.governance.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ArtifactBean".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.generic.beans.xsd.ArtifactBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://services.generic.governance.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.governance.generic.services.Exception.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    