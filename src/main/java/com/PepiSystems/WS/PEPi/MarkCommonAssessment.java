/**
 * MarkCommonAssessment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class MarkCommonAssessment  implements java.io.Serializable {
    private int studentID;

    private java.lang.String assessmentCode;

    private java.lang.String streamCode;

    private java.lang.String status;

    private java.lang.String comment;

    private int mark;

    private java.lang.String datePassMarkAchieved;

    private java.lang.String programCompletionDate;

    private int assessor;

    private java.lang.String dateMarkedByAssessor;

    private java.lang.String assessmentSentDate;

    private int editor;

    public MarkCommonAssessment() {
    }

    public MarkCommonAssessment(
           int studentID,
           java.lang.String assessmentCode,
           java.lang.String streamCode,
           java.lang.String status,
           java.lang.String comment,
           int mark,
           java.lang.String datePassMarkAchieved,
           java.lang.String programCompletionDate,
           int assessor,
           java.lang.String dateMarkedByAssessor,
           java.lang.String assessmentSentDate,
           int editor) {
           this.studentID = studentID;
           this.assessmentCode = assessmentCode;
           this.streamCode = streamCode;
           this.status = status;
           this.comment = comment;
           this.mark = mark;
           this.datePassMarkAchieved = datePassMarkAchieved;
           this.programCompletionDate = programCompletionDate;
           this.assessor = assessor;
           this.dateMarkedByAssessor = dateMarkedByAssessor;
           this.assessmentSentDate = assessmentSentDate;
           this.editor = editor;
    }


    /**
     * Gets the studentID value for this MarkCommonAssessment.
     * 
     * @return studentID
     */
    public int getStudentID() {
        return studentID;
    }


    /**
     * Sets the studentID value for this MarkCommonAssessment.
     * 
     * @param studentID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    /**
     * Gets the assessmentCode value for this MarkCommonAssessment.
     * 
     * @return assessmentCode
     */
    public java.lang.String getAssessmentCode() {
        return assessmentCode;
    }


    /**
     * Sets the assessmentCode value for this MarkCommonAssessment.
     * 
     * @param assessmentCode
     */
    public void setAssessmentCode(java.lang.String assessmentCode) {
        this.assessmentCode = assessmentCode;
    }


    /**
     * Gets the streamCode value for this MarkCommonAssessment.
     * 
     * @return streamCode
     */
    public java.lang.String getStreamCode() {
        return streamCode;
    }


    /**
     * Sets the streamCode value for this MarkCommonAssessment.
     * 
     * @param streamCode
     */
    public void setStreamCode(java.lang.String streamCode) {
        this.streamCode = streamCode;
    }


    /**
     * Gets the status value for this MarkCommonAssessment.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MarkCommonAssessment.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the comment value for this MarkCommonAssessment.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this MarkCommonAssessment.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the mark value for this MarkCommonAssessment.
     * 
     * @return mark
     */
    public int getMark() {
        return mark;
    }


    /**
     * Sets the mark value for this MarkCommonAssessment.
     * 
     * @param mark
     */
    public void setMark(int mark) {
        this.mark = mark;
    }


    /**
     * Gets the datePassMarkAchieved value for this MarkCommonAssessment.
     * 
     * @return datePassMarkAchieved
     */
    public java.lang.String getDatePassMarkAchieved() {
        return datePassMarkAchieved;
    }


    /**
     * Sets the datePassMarkAchieved value for this MarkCommonAssessment.
     * 
     * @param datePassMarkAchieved
     */
    public void setDatePassMarkAchieved(java.lang.String datePassMarkAchieved) {
        this.datePassMarkAchieved = datePassMarkAchieved;
    }


    /**
     * Gets the programCompletionDate value for this MarkCommonAssessment.
     * 
     * @return programCompletionDate
     */
    public java.lang.String getProgramCompletionDate() {
        return programCompletionDate;
    }


    /**
     * Sets the programCompletionDate value for this MarkCommonAssessment.
     * 
     * @param programCompletionDate
     */
    public void setProgramCompletionDate(java.lang.String programCompletionDate) {
        this.programCompletionDate = programCompletionDate;
    }


    /**
     * Gets the assessor value for this MarkCommonAssessment.
     * 
     * @return assessor
     */
    public int getAssessor() {
        return assessor;
    }


    /**
     * Sets the assessor value for this MarkCommonAssessment.
     * 
     * @param assessor
     */
    public void setAssessor(int assessor) {
        this.assessor = assessor;
    }


    /**
     * Gets the dateMarkedByAssessor value for this MarkCommonAssessment.
     * 
     * @return dateMarkedByAssessor
     */
    public java.lang.String getDateMarkedByAssessor() {
        return dateMarkedByAssessor;
    }


    /**
     * Sets the dateMarkedByAssessor value for this MarkCommonAssessment.
     * 
     * @param dateMarkedByAssessor
     */
    public void setDateMarkedByAssessor(java.lang.String dateMarkedByAssessor) {
        this.dateMarkedByAssessor = dateMarkedByAssessor;
    }


    /**
     * Gets the assessmentSentDate value for this MarkCommonAssessment.
     * 
     * @return assessmentSentDate
     */
    public java.lang.String getAssessmentSentDate() {
        return assessmentSentDate;
    }


    /**
     * Sets the assessmentSentDate value for this MarkCommonAssessment.
     * 
     * @param assessmentSentDate
     */
    public void setAssessmentSentDate(java.lang.String assessmentSentDate) {
        this.assessmentSentDate = assessmentSentDate;
    }


    /**
     * Gets the editor value for this MarkCommonAssessment.
     * 
     * @return editor
     */
    public int getEditor() {
        return editor;
    }


    /**
     * Sets the editor value for this MarkCommonAssessment.
     * 
     * @param editor
     */
    public void setEditor(int editor) {
        this.editor = editor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarkCommonAssessment)) return false;
        MarkCommonAssessment other = (MarkCommonAssessment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.studentID == other.getStudentID() &&
            ((this.assessmentCode==null && other.getAssessmentCode()==null) || 
             (this.assessmentCode!=null &&
              this.assessmentCode.equals(other.getAssessmentCode()))) &&
            ((this.streamCode==null && other.getStreamCode()==null) || 
             (this.streamCode!=null &&
              this.streamCode.equals(other.getStreamCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            this.mark == other.getMark() &&
            ((this.datePassMarkAchieved==null && other.getDatePassMarkAchieved()==null) || 
             (this.datePassMarkAchieved!=null &&
              this.datePassMarkAchieved.equals(other.getDatePassMarkAchieved()))) &&
            ((this.programCompletionDate==null && other.getProgramCompletionDate()==null) || 
             (this.programCompletionDate!=null &&
              this.programCompletionDate.equals(other.getProgramCompletionDate()))) &&
            this.assessor == other.getAssessor() &&
            ((this.dateMarkedByAssessor==null && other.getDateMarkedByAssessor()==null) || 
             (this.dateMarkedByAssessor!=null &&
              this.dateMarkedByAssessor.equals(other.getDateMarkedByAssessor()))) &&
            ((this.assessmentSentDate==null && other.getAssessmentSentDate()==null) || 
             (this.assessmentSentDate!=null &&
              this.assessmentSentDate.equals(other.getAssessmentSentDate()))) &&
            this.editor == other.getEditor();
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
        _hashCode += getStudentID();
        if (getAssessmentCode() != null) {
            _hashCode += getAssessmentCode().hashCode();
        }
        if (getStreamCode() != null) {
            _hashCode += getStreamCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        _hashCode += getMark();
        if (getDatePassMarkAchieved() != null) {
            _hashCode += getDatePassMarkAchieved().hashCode();
        }
        if (getProgramCompletionDate() != null) {
            _hashCode += getProgramCompletionDate().hashCode();
        }
        _hashCode += getAssessor();
        if (getDateMarkedByAssessor() != null) {
            _hashCode += getDateMarkedByAssessor().hashCode();
        }
        if (getAssessmentSentDate() != null) {
            _hashCode += getAssessmentSentDate().hashCode();
        }
        _hashCode += getEditor();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarkCommonAssessment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">MarkCommonAssessment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AssessmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StreamCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Mark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePassMarkAchieved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "DatePassMarkAchieved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programCompletionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ProgramCompletionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Assessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateMarkedByAssessor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "DateMarkedByAssessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assessmentSentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AssessmentSentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Editor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
