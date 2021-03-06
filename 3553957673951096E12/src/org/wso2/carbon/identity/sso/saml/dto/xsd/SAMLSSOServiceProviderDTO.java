
/**
 * SAMLSSOServiceProviderDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.wso2.carbon.identity.sso.saml.dto.xsd;
            

            /**
            *  SAMLSSOServiceProviderDTO bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SAMLSSOServiceProviderDTO
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SAMLSSOServiceProviderDTO
                Namespace URI = http://dto.saml.sso.identity.carbon.wso2.org/xsd
                Namespace Prefix = ns58
                */
            

                        /**
                        * field for AssertionConsumerUrl
                        */

                        
                                    protected java.lang.String localAssertionConsumerUrl ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssertionConsumerUrlTracker = false ;

                           public boolean isAssertionConsumerUrlSpecified(){
                               return localAssertionConsumerUrlTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAssertionConsumerUrl(){
                               return localAssertionConsumerUrl;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssertionConsumerUrl
                               */
                               public void setAssertionConsumerUrl(java.lang.String param){
                            localAssertionConsumerUrlTracker = true;
                                   
                                            this.localAssertionConsumerUrl=param;
                                    

                               }
                            

                        /**
                        * field for CertAlias
                        */

                        
                                    protected java.lang.String localCertAlias ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertAliasTracker = false ;

                           public boolean isCertAliasSpecified(){
                               return localCertAliasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertAlias(){
                               return localCertAlias;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertAlias
                               */
                               public void setCertAlias(java.lang.String param){
                            localCertAliasTracker = true;
                                   
                                            this.localCertAlias=param;
                                    

                               }
                            

                        /**
                        * field for DoSignAssertions
                        */

                        
                                    protected boolean localDoSignAssertions ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoSignAssertionsTracker = false ;

                           public boolean isDoSignAssertionsSpecified(){
                               return localDoSignAssertionsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoSignAssertions(){
                               return localDoSignAssertions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoSignAssertions
                               */
                               public void setDoSignAssertions(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDoSignAssertionsTracker =
                                       true;
                                   
                                            this.localDoSignAssertions=param;
                                    

                               }
                            

                        /**
                        * field for DoSingleLogout
                        */

                        
                                    protected boolean localDoSingleLogout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDoSingleLogoutTracker = false ;

                           public boolean isDoSingleLogoutSpecified(){
                               return localDoSingleLogoutTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDoSingleLogout(){
                               return localDoSingleLogout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DoSingleLogout
                               */
                               public void setDoSingleLogout(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localDoSingleLogoutTracker =
                                       true;
                                   
                                            this.localDoSingleLogout=param;
                                    

                               }
                            

                        /**
                        * field for Issuer
                        */

                        
                                    protected java.lang.String localIssuer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssuerTracker = false ;

                           public boolean isIssuerSpecified(){
                               return localIssuerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssuer(){
                               return localIssuer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Issuer
                               */
                               public void setIssuer(java.lang.String param){
                            localIssuerTracker = true;
                                   
                                            this.localIssuer=param;
                                    

                               }
                            

                        /**
                        * field for LogoutURL
                        */

                        
                                    protected java.lang.String localLogoutURL ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLogoutURLTracker = false ;

                           public boolean isLogoutURLSpecified(){
                               return localLogoutURLTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLogoutURL(){
                               return localLogoutURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LogoutURL
                               */
                               public void setLogoutURL(java.lang.String param){
                            localLogoutURLTracker = true;
                                   
                                            this.localLogoutURL=param;
                                    

                               }
                            

                        /**
                        * field for UseFullyQualifiedUsername
                        */

                        
                                    protected boolean localUseFullyQualifiedUsername ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUseFullyQualifiedUsernameTracker = false ;

                           public boolean isUseFullyQualifiedUsernameSpecified(){
                               return localUseFullyQualifiedUsernameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUseFullyQualifiedUsername(){
                               return localUseFullyQualifiedUsername;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseFullyQualifiedUsername
                               */
                               public void setUseFullyQualifiedUsername(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       localUseFullyQualifiedUsernameTracker =
                                       true;
                                   
                                            this.localUseFullyQualifiedUsername=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://dto.saml.sso.identity.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SAMLSSOServiceProviderDTO",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SAMLSSOServiceProviderDTO",
                           xmlWriter);
                   }

               
                   }
                if (localAssertionConsumerUrlTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "assertionConsumerUrl", xmlWriter);
                             

                                          if (localAssertionConsumerUrl==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAssertionConsumerUrl);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertAliasTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "certAlias", xmlWriter);
                             

                                          if (localCertAlias==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertAlias);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSignAssertionsTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSignAssertions", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSignAssertions cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignAssertions));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDoSingleLogoutTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "doSingleLogout", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("doSingleLogout cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSingleLogout));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssuerTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "issuer", xmlWriter);
                             

                                          if (localIssuer==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssuer);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLogoutURLTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "logoutURL", xmlWriter);
                             

                                          if (localLogoutURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLogoutURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUseFullyQualifiedUsernameTracker){
                                    namespace = "http://dto.saml.sso.identity.carbon.wso2.org/xsd";
                                    writeStartElement(null, namespace, "useFullyQualifiedUsername", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("useFullyQualifiedUsername cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseFullyQualifiedUsername));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://dto.saml.sso.identity.carbon.wso2.org/xsd")){
                return "ns58";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAssertionConsumerUrlTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "assertionConsumerUrl"));
                                 
                                         elementList.add(localAssertionConsumerUrl==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAssertionConsumerUrl));
                                    } if (localCertAliasTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "certAlias"));
                                 
                                         elementList.add(localCertAlias==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertAlias));
                                    } if (localDoSignAssertionsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "doSignAssertions"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSignAssertions));
                            } if (localDoSingleLogoutTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "doSingleLogout"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDoSingleLogout));
                            } if (localIssuerTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "issuer"));
                                 
                                         elementList.add(localIssuer==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuer));
                                    } if (localLogoutURLTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "logoutURL"));
                                 
                                         elementList.add(localLogoutURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogoutURL));
                                    } if (localUseFullyQualifiedUsernameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd",
                                                                      "useFullyQualifiedUsername"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseFullyQualifiedUsername));
                            }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SAMLSSOServiceProviderDTO parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SAMLSSOServiceProviderDTO object =
                new SAMLSSOServiceProviderDTO();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"SAMLSSOServiceProviderDTO".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SAMLSSOServiceProviderDTO)axis2.apache.org.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","assertionConsumerUrl").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAssertionConsumerUrl(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","certAlias").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertAlias(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","doSignAssertions").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"doSignAssertions" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoSignAssertions(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","doSingleLogout").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"doSingleLogout" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDoSingleLogout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","issuer").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssuer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","logoutURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLogoutURL(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://dto.saml.sso.identity.carbon.wso2.org/xsd","useFullyQualifiedUsername").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"useFullyQualifiedUsername" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUseFullyQualifiedUsername(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    