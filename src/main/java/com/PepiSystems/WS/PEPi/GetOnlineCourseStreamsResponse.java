/**
 * GetOnlineCourseStreamsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetOnlineCourseStreamsResponse  implements java.io.Serializable {
    private com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult getOnlineCourseStreamsResult;

    public GetOnlineCourseStreamsResponse() {
    }

    public GetOnlineCourseStreamsResponse(
           com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult getOnlineCourseStreamsResult) {
           this.getOnlineCourseStreamsResult = getOnlineCourseStreamsResult;
    }


    /**
     * Gets the getOnlineCourseStreamsResult value for this GetOnlineCourseStreamsResponse.
     * 
     * @return getOnlineCourseStreamsResult
     */
    public com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult getGetOnlineCourseStreamsResult() {
        return getOnlineCourseStreamsResult;
    }


    /**
     * Sets the getOnlineCourseStreamsResult value for this GetOnlineCourseStreamsResponse.
     * 
     * @param getOnlineCourseStreamsResult
     */
    public void setGetOnlineCourseStreamsResult(com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult getOnlineCourseStreamsResult) {
        this.getOnlineCourseStreamsResult = getOnlineCourseStreamsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOnlineCourseStreamsResponse)) return false;
        GetOnlineCourseStreamsResponse other = (GetOnlineCourseStreamsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOnlineCourseStreamsResult==null && other.getGetOnlineCourseStreamsResult()==null) || 
             (this.getOnlineCourseStreamsResult!=null &&
              this.getOnlineCourseStreamsResult.equals(other.getGetOnlineCourseStreamsResult())));
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
        if (getGetOnlineCourseStreamsResult() != null) {
            _hashCode += getGetOnlineCourseStreamsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOnlineCourseStreamsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineCourseStreamsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOnlineCourseStreamsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetOnlineCourseStreamsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetOnlineCourseStreamsResponse>GetOnlineCourseStreamsResult"));
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
