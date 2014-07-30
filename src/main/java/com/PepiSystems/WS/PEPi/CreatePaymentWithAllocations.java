/**
 * CreatePaymentWithAllocations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class CreatePaymentWithAllocations  implements java.io.Serializable {
    private java.lang.String feeSelectionsForAllocation;

    private java.lang.String paymentTransactionXML;

    public CreatePaymentWithAllocations() {
    }

    public CreatePaymentWithAllocations(
           java.lang.String feeSelectionsForAllocation,
           java.lang.String paymentTransactionXML) {
           this.feeSelectionsForAllocation = feeSelectionsForAllocation;
           this.paymentTransactionXML = paymentTransactionXML;
    }


    /**
     * Gets the feeSelectionsForAllocation value for this CreatePaymentWithAllocations.
     * 
     * @return feeSelectionsForAllocation
     */
    public java.lang.String getFeeSelectionsForAllocation() {
        return feeSelectionsForAllocation;
    }


    /**
     * Sets the feeSelectionsForAllocation value for this CreatePaymentWithAllocations.
     * 
     * @param feeSelectionsForAllocation
     */
    public void setFeeSelectionsForAllocation(java.lang.String feeSelectionsForAllocation) {
        this.feeSelectionsForAllocation = feeSelectionsForAllocation;
    }


    /**
     * Gets the paymentTransactionXML value for this CreatePaymentWithAllocations.
     * 
     * @return paymentTransactionXML
     */
    public java.lang.String getPaymentTransactionXML() {
        return paymentTransactionXML;
    }


    /**
     * Sets the paymentTransactionXML value for this CreatePaymentWithAllocations.
     * 
     * @param paymentTransactionXML
     */
    public void setPaymentTransactionXML(java.lang.String paymentTransactionXML) {
        this.paymentTransactionXML = paymentTransactionXML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePaymentWithAllocations)) return false;
        CreatePaymentWithAllocations other = (CreatePaymentWithAllocations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feeSelectionsForAllocation==null && other.getFeeSelectionsForAllocation()==null) || 
             (this.feeSelectionsForAllocation!=null &&
              this.feeSelectionsForAllocation.equals(other.getFeeSelectionsForAllocation()))) &&
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
        if (getFeeSelectionsForAllocation() != null) {
            _hashCode += getFeeSelectionsForAllocation().hashCode();
        }
        if (getPaymentTransactionXML() != null) {
            _hashCode += getPaymentTransactionXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePaymentWithAllocations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreatePaymentWithAllocations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeSelectionsForAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "FeeSelectionsForAllocation"));
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
