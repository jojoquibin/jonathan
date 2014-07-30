/**
 * GetTransactionDetailForPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetTransactionDetailForPayment  implements java.io.Serializable {
    private int entityID;

    private java.lang.String feeSelections;

    private java.lang.String paymentTransactionXML;

    public GetTransactionDetailForPayment() {
    }

    public GetTransactionDetailForPayment(
           int entityID,
           java.lang.String feeSelections,
           java.lang.String paymentTransactionXML) {
           this.entityID = entityID;
           this.feeSelections = feeSelections;
           this.paymentTransactionXML = paymentTransactionXML;
    }


    /**
     * Gets the entityID value for this GetTransactionDetailForPayment.
     * 
     * @return entityID
     */
    public int getEntityID() {
        return entityID;
    }


    /**
     * Sets the entityID value for this GetTransactionDetailForPayment.
     * 
     * @param entityID
     */
    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }


    /**
     * Gets the feeSelections value for this GetTransactionDetailForPayment.
     * 
     * @return feeSelections
     */
    public java.lang.String getFeeSelections() {
        return feeSelections;
    }


    /**
     * Sets the feeSelections value for this GetTransactionDetailForPayment.
     * 
     * @param feeSelections
     */
    public void setFeeSelections(java.lang.String feeSelections) {
        this.feeSelections = feeSelections;
    }


    /**
     * Gets the paymentTransactionXML value for this GetTransactionDetailForPayment.
     * 
     * @return paymentTransactionXML
     */
    public java.lang.String getPaymentTransactionXML() {
        return paymentTransactionXML;
    }


    /**
     * Sets the paymentTransactionXML value for this GetTransactionDetailForPayment.
     * 
     * @param paymentTransactionXML
     */
    public void setPaymentTransactionXML(java.lang.String paymentTransactionXML) {
        this.paymentTransactionXML = paymentTransactionXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionDetailForPayment)) return false;
        GetTransactionDetailForPayment other = (GetTransactionDetailForPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.entityID == other.getEntityID() &&
            ((this.feeSelections==null && other.getFeeSelections()==null) || 
             (this.feeSelections!=null &&
              this.feeSelections.equals(other.getFeeSelections()))) &&
            ((this.paymentTransactionXML==null && other.getPaymentTransactionXML()==null) || 
             (this.paymentTransactionXML!=null &&
              this.paymentTransactionXML.equals(other.getPaymentTransactionXML())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getEntityID();
        if (getFeeSelections() != null) {
            _hashCode += getFeeSelections().hashCode();
        }
        if (getPaymentTransactionXML() != null) {
            _hashCode += getPaymentTransactionXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionDetailForPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetTransactionDetailForPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EntityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeSelections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "FeeSelections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTransactionXML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PaymentTransactionXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
