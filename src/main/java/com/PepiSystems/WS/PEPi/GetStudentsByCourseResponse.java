/**
 * GetStudentsByCourseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetStudentsByCourseResponse  implements java.io.Serializable {
    private com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult getStudentsByCourseResult;

    public GetStudentsByCourseResponse() {
    }

    public GetStudentsByCourseResponse(
           com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult getStudentsByCourseResult) {
           this.getStudentsByCourseResult = getStudentsByCourseResult;
    }


    /**
     * Gets the getStudentsByCourseResult value for this GetStudentsByCourseResponse.
     * 
     * @return getStudentsByCourseResult
     */
    public com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult getGetStudentsByCourseResult() {
        return getStudentsByCourseResult;
    }


    /**
     * Sets the getStudentsByCourseResult value for this GetStudentsByCourseResponse.
     * 
     * @param getStudentsByCourseResult
     */
    public void setGetStudentsByCourseResult(com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult getStudentsByCourseResult) {
        this.getStudentsByCourseResult = getStudentsByCourseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStudentsByCourseResponse)) return false;
        GetStudentsByCourseResponse other = (GetStudentsByCourseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStudentsByCourseResult==null && other.getGetStudentsByCourseResult()==null) || 
             (this.getStudentsByCourseResult!=null &&
              this.getStudentsByCourseResult.equals(other.getGetStudentsByCourseResult())));
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
        if (getGetStudentsByCourseResult() != null) {
            _hashCode += getGetStudentsByCourseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStudentsByCourseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsByCourseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStudentsByCourseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentsByCourseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentsByCourseResponse>GetStudentsByCourseResult"));
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
