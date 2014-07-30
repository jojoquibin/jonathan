/**
 * GetEnrolledUnitsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetEnrolledUnitsResponse  implements java.io.Serializable {
    private com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult getEnrolledUnitsResult;

    public GetEnrolledUnitsResponse() {
    }

    public GetEnrolledUnitsResponse(
           com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult getEnrolledUnitsResult) {
           this.getEnrolledUnitsResult = getEnrolledUnitsResult;
    }


    /**
     * Gets the getEnrolledUnitsResult value for this GetEnrolledUnitsResponse.
     * 
     * @return getEnrolledUnitsResult
     */
    public com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult getGetEnrolledUnitsResult() {
        return getEnrolledUnitsResult;
    }


    /**
     * Sets the getEnrolledUnitsResult value for this GetEnrolledUnitsResponse.
     * 
     * @param getEnrolledUnitsResult
     */
    public void setGetEnrolledUnitsResult(com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult getEnrolledUnitsResult) {
        this.getEnrolledUnitsResult = getEnrolledUnitsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEnrolledUnitsResponse)) return false;
        GetEnrolledUnitsResponse other = (GetEnrolledUnitsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEnrolledUnitsResult==null && other.getGetEnrolledUnitsResult()==null) || 
             (this.getEnrolledUnitsResult!=null &&
              this.getEnrolledUnitsResult.equals(other.getGetEnrolledUnitsResult())));
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
        if (getGetEnrolledUnitsResult() != null) {
            _hashCode += getGetEnrolledUnitsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEnrolledUnitsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolledUnitsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEnrolledUnitsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEnrolledUnitsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetEnrolledUnitsResponse>GetEnrolledUnitsResult"));
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
