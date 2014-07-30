/**
 * PEPiEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class PEPiEntity implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PEPiEntity(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Person = "Person";
    public static final java.lang.String _Company = "Company";
    public static final java.lang.String _Student = "Student";
    public static final java.lang.String _Enquiry = "Enquiry";
    public static final java.lang.String _Application = "Application";
    public static final java.lang.String _Enrolment = "Enrolment";
    public static final java.lang.String _Address = "Address";
    public static final java.lang.String _Phone = "Phone";
    public static final java.lang.String _Email = "Email";
    public static final java.lang.String _EducationHxItem = "EducationHxItem";
    public static final java.lang.String _EmploymentHxItem = "EmploymentHxItem";
    public static final java.lang.String _ProductionHxItem = "ProductionHxItem";
    public static final java.lang.String _CourseData = "CourseData";
    public static final java.lang.String _Note = "Note";
    public static final java.lang.String _ApplicationInterview = "ApplicationInterview";
    public static final PEPiEntity Person = new PEPiEntity(_Person);
    public static final PEPiEntity Company = new PEPiEntity(_Company);
    public static final PEPiEntity Student = new PEPiEntity(_Student);
    public static final PEPiEntity Enquiry = new PEPiEntity(_Enquiry);
    public static final PEPiEntity Application = new PEPiEntity(_Application);
    public static final PEPiEntity Enrolment = new PEPiEntity(_Enrolment);
    public static final PEPiEntity Address = new PEPiEntity(_Address);
    public static final PEPiEntity Phone = new PEPiEntity(_Phone);
    public static final PEPiEntity Email = new PEPiEntity(_Email);
    public static final PEPiEntity EducationHxItem = new PEPiEntity(_EducationHxItem);
    public static final PEPiEntity EmploymentHxItem = new PEPiEntity(_EmploymentHxItem);
    public static final PEPiEntity ProductionHxItem = new PEPiEntity(_ProductionHxItem);
    public static final PEPiEntity CourseData = new PEPiEntity(_CourseData);
    public static final PEPiEntity Note = new PEPiEntity(_Note);
    public static final PEPiEntity ApplicationInterview = new PEPiEntity(_ApplicationInterview);
    public java.lang.String getValue() { return _value_;}
    public static PEPiEntity fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PEPiEntity enumeration = (PEPiEntity)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PEPiEntity fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PEPiEntity.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PEPiEntity"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
