/**
 * GetUserBySecurityGroupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetUserBySecurityGroupResponse  implements java.io.Serializable {
    private com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult getUserBySecurityGroupResult;

    public GetUserBySecurityGroupResponse() {
    }

    public GetUserBySecurityGroupResponse(
           com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult getUserBySecurityGroupResult) {
           this.getUserBySecurityGroupResult = getUserBySecurityGroupResult;
    }


    /**
     * Gets the getUserBySecurityGroupResult value for this GetUserBySecurityGroupResponse.
     * 
     * @return getUserBySecurityGroupResult
     */
    public com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult getGetUserBySecurityGroupResult() {
        return getUserBySecurityGroupResult;
    }


    /**
     * Sets the getUserBySecurityGroupResult value for this GetUserBySecurityGroupResponse.
     * 
     * @param getUserBySecurityGroupResult
     */
    public void setGetUserBySecurityGroupResult(com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult getUserBySecurityGroupResult) {
        this.getUserBySecurityGroupResult = getUserBySecurityGroupResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserBySecurityGroupResponse)) return false;
        GetUserBySecurityGroupResponse other = (GetUserBySecurityGroupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserBySecurityGroupResult==null && other.getGetUserBySecurityGroupResult()==null) || 
             (this.getUserBySecurityGroupResult!=null &&
              this.getUserBySecurityGroupResult.equals(other.getGetUserBySecurityGroupResult())));
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
        if (getGetUserBySecurityGroupResult() != null) {
            _hashCode += getGetUserBySecurityGroupResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserBySecurityGroupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetUserBySecurityGroupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserBySecurityGroupResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetUserBySecurityGroupResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetUserBySecurityGroupResponse>GetUserBySecurityGroupResult"));
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
