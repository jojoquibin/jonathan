/**
 * GetAccountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetAccountResponse  implements java.io.Serializable {
    private com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult getAccountResult;

    public GetAccountResponse() {
    }

    public GetAccountResponse(
           com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult getAccountResult) {
           this.getAccountResult = getAccountResult;
    }


    /**
     * Gets the getAccountResult value for this GetAccountResponse.
     * 
     * @return getAccountResult
     */
    public com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult getGetAccountResult() {
        return getAccountResult;
    }


    /**
     * Sets the getAccountResult value for this GetAccountResponse.
     * 
     * @param getAccountResult
     */
    public void setGetAccountResult(com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult getAccountResult) {
        this.getAccountResult = getAccountResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccountResponse)) return false;
        GetAccountResponse other = (GetAccountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAccountResult==null && other.getGetAccountResult()==null) || 
             (this.getAccountResult!=null &&
              this.getAccountResult.equals(other.getGetAccountResult())));
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
        if (getGetAccountResult() != null) {
            _hashCode += getGetAccountResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetAccountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccountResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetAccountResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetAccountResponse>GetAccountResult"));
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
