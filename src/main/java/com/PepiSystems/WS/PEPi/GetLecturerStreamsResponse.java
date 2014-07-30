/**
 * GetLecturerStreamsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetLecturerStreamsResponse  implements java.io.Serializable {
    private com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult getLecturerStreamsResult;

    public GetLecturerStreamsResponse() {
    }

    public GetLecturerStreamsResponse(
           com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult getLecturerStreamsResult) {
           this.getLecturerStreamsResult = getLecturerStreamsResult;
    }


    /**
     * Gets the getLecturerStreamsResult value for this GetLecturerStreamsResponse.
     * 
     * @return getLecturerStreamsResult
     */
    public com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult getGetLecturerStreamsResult() {
        return getLecturerStreamsResult;
    }


    /**
     * Sets the getLecturerStreamsResult value for this GetLecturerStreamsResponse.
     * 
     * @param getLecturerStreamsResult
     */
    public void setGetLecturerStreamsResult(com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult getLecturerStreamsResult) {
        this.getLecturerStreamsResult = getLecturerStreamsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLecturerStreamsResponse)) return false;
        GetLecturerStreamsResponse other = (GetLecturerStreamsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLecturerStreamsResult==null && other.getGetLecturerStreamsResult()==null) || 
             (this.getLecturerStreamsResult!=null &&
              this.getLecturerStreamsResult.equals(other.getGetLecturerStreamsResult())));
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
        if (getGetLecturerStreamsResult() != null) {
            _hashCode += getGetLecturerStreamsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLecturerStreamsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetLecturerStreamsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLecturerStreamsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetLecturerStreamsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetLecturerStreamsResponse>GetLecturerStreamsResult"));
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
