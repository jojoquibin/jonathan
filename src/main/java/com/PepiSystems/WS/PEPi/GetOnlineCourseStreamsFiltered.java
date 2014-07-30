/**
 * GetOnlineCourseStreamsFiltered.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class GetOnlineCourseStreamsFiltered  implements java.io.Serializable {
    private java.lang.String endDate;

    private java.lang.String discipline;

    private java.lang.String courseID;

    private java.lang.String location;

    private java.lang.String days;

    private java.lang.String times;

    public GetOnlineCourseStreamsFiltered() {
    }

    public GetOnlineCourseStreamsFiltered(
           java.lang.String endDate,
           java.lang.String discipline,
           java.lang.String courseID,
           java.lang.String location,
           java.lang.String days,
           java.lang.String times) {
           this.endDate = endDate;
           this.discipline = discipline;
           this.courseID = courseID;
           this.location = location;
           this.days = days;
           this.times = times;
    }


    /**
     * Gets the endDate value for this GetOnlineCourseStreamsFiltered.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetOnlineCourseStreamsFiltered.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the discipline value for this GetOnlineCourseStreamsFiltered.
     * 
     * @return discipline
     */
    public java.lang.String getDiscipline() {
        return discipline;
    }


    /**
     * Sets the discipline value for this GetOnlineCourseStreamsFiltered.
     * 
     * @param discipline
     */
    public void setDiscipline(java.lang.String discipline) {
        this.discipline = discipline;
    }


    /**
     * Gets the courseID value for this GetOnlineCourseStreamsFiltered.
     * 
     * @return courseID
     */
    public java.lang.String getCourseID() {
        return courseID;
    }


    /**
     * Sets the courseID value for this GetOnlineCourseStreamsFiltered.
     * 
     * @param courseID
     */
    public void setCourseID(java.lang.String courseID) {
        this.courseID = courseID;
    }


    /**
     * Gets the location value for this GetOnlineCourseStreamsFiltered.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this GetOnlineCourseStreamsFiltered.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the days value for this GetOnlineCourseStreamsFiltered.
     * 
     * @return days
     */
    public java.lang.String getDays() {
        return days;
    }


    /**
     * Sets the days value for this GetOnlineCourseStreamsFiltered.
     * 
     * @param days
     */
    public void setDays(java.lang.String days) {
        this.days = days;
    }


    /**
     * Gets the times value for this GetOnlineCourseStreamsFiltered.
     * 
     * @return times
     */
    public java.lang.String getTimes() {
        return times;
    }


    /**
     * Sets the times value for this GetOnlineCourseStreamsFiltered.
     * 
     * @param times
     */
    public void setTimes(java.lang.String times) {
        this.times = times;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOnlineCourseStreamsFiltered)) return false;
        GetOnlineCourseStreamsFiltered other = (GetOnlineCourseStreamsFiltered) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.discipline==null && other.getDiscipline()==null) || 
             (this.discipline!=null &&
              this.discipline.equals(other.getDiscipline()))) &&
            ((this.courseID==null && other.getCourseID()==null) || 
             (this.courseID!=null &&
              this.courseID.equals(other.getCourseID()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays()))) &&
            ((this.times==null && other.getTimes()==null) || 
             (this.times!=null &&
              this.times.equals(other.getTimes())));
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
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDiscipline() != null) {
            _hashCode += getDiscipline().hashCode();
        }
        if (getCourseID() != null) {
            _hashCode += getCourseID().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        if (getTimes() != null) {
            _hashCode += getTimes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOnlineCourseStreamsFiltered.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineCourseStreamsFiltered"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discipline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Discipline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "CourseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("times");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Times"));
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
