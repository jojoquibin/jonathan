/**
 * GetEvents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetEvents  implements java.io.Serializable {
    private java.lang.String eventStartDate;

    private java.lang.String eventStartTime;

    private java.lang.String eventType;

    public GetEvents() {
    }

    public GetEvents(
           java.lang.String eventStartDate,
           java.lang.String eventStartTime,
           java.lang.String eventType) {
           this.eventStartDate = eventStartDate;
           this.eventStartTime = eventStartTime;
           this.eventType = eventType;
    }


    /**
     * Gets the eventStartDate value for this GetEvents.
     * 
     * @return eventStartDate
     */
    public java.lang.String getEventStartDate() {
        return eventStartDate;
    }


    /**
     * Sets the eventStartDate value for this GetEvents.
     * 
     * @param eventStartDate
     */
    public void setEventStartDate(java.lang.String eventStartDate) {
        this.eventStartDate = eventStartDate;
    }


    /**
     * Gets the eventStartTime value for this GetEvents.
     * 
     * @return eventStartTime
     */
    public java.lang.String getEventStartTime() {
        return eventStartTime;
    }


    /**
     * Sets the eventStartTime value for this GetEvents.
     * 
     * @param eventStartTime
     */
    public void setEventStartTime(java.lang.String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }


    /**
     * Gets the eventType value for this GetEvents.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this GetEvents.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEvents)) return false;
        GetEvents other = (GetEvents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventStartDate==null && other.getEventStartDate()==null) || 
             (this.eventStartDate!=null &&
              this.eventStartDate.equals(other.getEventStartDate()))) &&
            ((this.eventStartTime==null && other.getEventStartTime()==null) || 
             (this.eventStartTime!=null &&
              this.eventStartTime.equals(other.getEventStartTime()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType())));
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
        if (getEventStartDate() != null) {
            _hashCode += getEventStartDate().hashCode();
        }
        if (getEventStartTime() != null) {
            _hashCode += getEventStartTime().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEvents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEvents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EventStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EventStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EventType"));
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
