/**
 * GetStudentEnrolmentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetStudentEnrolmentsResponse  implements java.io.Serializable {
    private com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult getStudentEnrolmentsResult;

    public GetStudentEnrolmentsResponse() {
    }

    public GetStudentEnrolmentsResponse(
           com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult getStudentEnrolmentsResult) {
           this.getStudentEnrolmentsResult = getStudentEnrolmentsResult;
    }


    /**
     * Gets the getStudentEnrolmentsResult value for this GetStudentEnrolmentsResponse.
     * 
     * @return getStudentEnrolmentsResult
     */
    public com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult getGetStudentEnrolmentsResult() {
        return getStudentEnrolmentsResult;
    }


    /**
     * Sets the getStudentEnrolmentsResult value for this GetStudentEnrolmentsResponse.
     * 
     * @param getStudentEnrolmentsResult
     */
    public void setGetStudentEnrolmentsResult(com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult getStudentEnrolmentsResult) {
        this.getStudentEnrolmentsResult = getStudentEnrolmentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStudentEnrolmentsResponse)) return false;
        GetStudentEnrolmentsResponse other = (GetStudentEnrolmentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStudentEnrolmentsResult==null && other.getGetStudentEnrolmentsResult()==null) || 
             (this.getStudentEnrolmentsResult!=null &&
              this.getStudentEnrolmentsResult.equals(other.getGetStudentEnrolmentsResult())));
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
        if (getGetStudentEnrolmentsResult() != null) {
            _hashCode += getGetStudentEnrolmentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStudentEnrolmentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentEnrolmentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStudentEnrolmentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentEnrolmentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentEnrolmentsResponse>GetStudentEnrolmentsResult"));
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
