
/**
 * TransactionConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v3  Built on : Oct 26, 2011 (07:42:27 PDT)
 */

            
                package org.apache.axis2.transaction.xsd;
            

            /**
            *  TransactionConfiguration bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TransactionConfiguration
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TransactionConfiguration
                Namespace URI = http://transaction.axis2.apache.org/xsd
                Namespace Prefix = ns26
                */
            

                        /**
                        * field for TransactionManager
                        */

                        
                                    protected java.lang.Object localTransactionManager ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionManagerTracker = false ;

                           public boolean isTransactionManagerSpecified(){
                               return localTransactionManagerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getTransactionManager(){
                               return localTransactionManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionManager
                               */
                               public void setTransactionManager(java.lang.Object param){
                            localTransactionManagerTracker = true;
                                   
                                            this.localTransactionManager=param;
                                    

                               }
                            

                        /**
                        * field for TransactionTimeout
                        */

                        
                                    protected int localTransactionTimeout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionTimeoutTracker = false ;

                           public boolean isTransactionTimeoutSpecified(){
                               return localTransactionTimeoutTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTransactionTimeout(){
                               return localTransactionTimeout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionTimeout
                               */
                               public void setTransactionTimeout(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localTransactionTimeoutTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localTransactionTimeout=param;
                                    

                               }
                            

                        /**
                        * field for UserTransaction
                        */

                        
                                    protected java.lang.Object localUserTransaction ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserTransactionTracker = false ;

                           public boolean isUserTransactionSpecified(){
                               return localUserTransactionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.Object
                           */
                           public  java.lang.Object getUserTransaction(){
                               return localUserTransaction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserTransaction
                               */
                               public void setUserTransaction(java.lang.Object param){
                            localUserTransactionTracker = true;
                                   
                                            this.localUserTransaction=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://transaction.axis2.apache.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TransactionConfiguration",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TransactionConfiguration",
                           xmlWriter);
                   }

               
                   }
                if (localTransactionManagerTracker){
                            
                            if (localTransactionManager!=null){
                                if (localTransactionManager instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localTransactionManager).serialize(
                                               new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd","transactionManager"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://transaction.axis2.apache.org/xsd", "transactionManager", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localTransactionManager, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://transaction.axis2.apache.org/xsd", "transactionManager", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        } if (localTransactionTimeoutTracker){
                                    namespace = "http://transaction.axis2.apache.org/xsd";
                                    writeStartElement(null, namespace, "transactionTimeout", xmlWriter);
                             
                                               if (localTransactionTimeout==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("transactionTimeout cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionTimeout));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserTransactionTracker){
                            
                            if (localUserTransaction!=null){
                                if (localUserTransaction instanceof org.apache.axis2.databinding.ADBBean){
                                    ((org.apache.axis2.databinding.ADBBean)localUserTransaction).serialize(
                                               new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd","userTransaction"),
                                               xmlWriter,true);
                                 } else {
                                    writeStartElement(null, "http://transaction.axis2.apache.org/xsd", "userTransaction", xmlWriter);
                                    org.apache.axis2.databinding.utils.ConverterUtil.serializeAnyType(localUserTransaction, xmlWriter);
                                    xmlWriter.writeEndElement();
                                 }
                            } else {
                                
                                        // write null attribute
                                           writeStartElement(null, "http://transaction.axis2.apache.org/xsd", "userTransaction", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                            }


                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://transaction.axis2.apache.org/xsd")){
                return "ns26";
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

                 if (localTransactionManagerTracker){
                            elementList.add(new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd",
                                                                      "transactionManager"));
                            
                            
                                    elementList.add(localTransactionManager==null?null:
                                    localTransactionManager);
                                } if (localTransactionTimeoutTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd",
                                                                      "transactionTimeout"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionTimeout));
                            } if (localUserTransactionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd",
                                                                      "userTransaction"));
                            
                            
                                    elementList.add(localUserTransaction==null?null:
                                    localUserTransaction);
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
        public static TransactionConfiguration parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TransactionConfiguration object =
                new TransactionConfiguration();

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
                    
                            if (!"TransactionConfiguration".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TransactionConfiguration)org.apache.axis2.clustering.management.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd","transactionManager").equals(reader.getName())){
                                
                                     object.setTransactionManager(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.apache.axis2.clustering.management.xsd.ExtensionMapper.class));
                                       
                                         reader.next();
                                     
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd","transactionTimeout").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"transactionTimeout" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionTimeout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setTransactionTimeout(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://transaction.axis2.apache.org/xsd","userTransaction").equals(reader.getName())){
                                
                                     object.setUserTransaction(org.apache.axis2.databinding.utils.ConverterUtil.getAnyTypeObject(reader,
                                                org.apache.axis2.clustering.management.xsd.ExtensionMapper.class));
                                       
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
           
    