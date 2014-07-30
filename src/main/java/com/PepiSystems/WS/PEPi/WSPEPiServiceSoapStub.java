/**
 * WSPEPiServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class WSPEPiServiceSoapStub extends org.apache.axis.client.Stub implements com.PepiSystems.WS.PEPi.WSPEPiServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[57];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSignOnToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCorresondenceFromEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Emails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Body"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EmailFrom"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Fetch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "entity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PEPiEntity"), com.PepiSystems.WS.PEPi.PEPiEntity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Persist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "entity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PEPiEntity"), com.PepiSystems.WS.PEPi.PEPiEntity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "editorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "entity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PEPiEntity"), com.PepiSystems.WS.PEPi.PEPiEntity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmailLoginCredentials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "mode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PasswordRecoveryMode"), com.PepiSystems.WS.PEPi.PasswordRecoveryMode.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuickSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "cohort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Cohort"), com.PepiSystems.WS.PEPi.Cohort.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "email1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "NSN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDuplicate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "firstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "lastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetDuplicateResponse>GetDuplicateResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetDuplicateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEnrolledStreamUnits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetEnrolledStreamUnitsResponse>GetEnrolledStreamUnitsResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEnrolledStreamUnitsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEnrolledUnits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "courseID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetEnrolledUnitsResponse>GetEnrolledUnitsResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEnrolledUnitsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentAnnouncements");
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCourseData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetCourseDataResponse>GetCourseDataResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetCourseDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNoteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetNoteCategoriesResponse>GetNoteCategoriesResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetNoteCategoriesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "personID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAccount_Role");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "personID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "RoleID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EntityID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetAccountResponse>GetAccountResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "personID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAccount_Role");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "personID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "RoleID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "personID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUserTCs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "personID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "acceptedTCs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRegistrationDetails");
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetRegistrationDetailsResponse>GetRegistrationDetailsResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetRegistrationDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StreamID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AmoutPaid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ReferenceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentEnrolments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentEnrolmentsResponse>GetStudentEnrolmentsResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentEnrolmentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLecturerStreams");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetLecturerStreamsResponse>GetLecturerStreamsResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetLecturerStreamsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentsByCourse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "CourseID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentsByCourseResponse>GetStudentsByCourseResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentsByCourseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentVOCHoursForLastYear");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PersonID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentVOCHoursForLastYearResponse>GetStudentVOCHoursForLastYearResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentVOCHoursForLastYearResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserBySecurityGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "RoleID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetUserBySecurityGroupResponse>GetUserBySecurityGroupResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetUserBySecurityGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOnlineDisciplines");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EndDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOnlineCourseStreams");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EndDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetOnlineCourseStreamsResponse>GetOnlineCourseStreamsResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetOnlineCourseStreamsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOnlineCourseStreamsFiltered");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EndDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Discipline"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "CourseID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Days"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Times"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetOnlineCourseStreamsFilteredResponse>GetOnlineCourseStreamsFilteredResult"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetOnlineCourseStreamsFilteredResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReEnrolmentStream");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StreamID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStreamForReEnrolment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStreamsForReEnrolment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEntityFinancialDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EntityID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPaymentReceipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PaymentDetailID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFeesToPay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EntityID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEnrolmentFeesToPay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EnrolmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTransactionDetailForPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EntityID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "FeeSelections"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PaymentTransactionXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePaymentWithAllocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "FeeSelectionsForAllocation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PaymentTransactionXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddPortalAlert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "DistributionGroupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Note"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Author"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AuthorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "RelatedPersonID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Priority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StartDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EndDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "useEscalation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetParentChildRelations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ParentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMarksAndGrades");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EnrolmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentsCurrentTimetableClasses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "studentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentsCurrentAttendanceRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "studentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentsCurrentAttendanceRecordByEnrolmentID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "enrolmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentTimetableClasses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EnrolmentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStreamTimetableClasses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StreamID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EventStartDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EventStartTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EventType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStreamByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StreamCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAssessmentByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AssessmentCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUnitGradeScheme");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "UnitCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkCommonAssessment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AssessmentCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StreamCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Mark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "DatePassMarkAchieved"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ProgramCompletionDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Assessor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "DateMarkedByAssessor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AssessmentSentDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Editor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MarkBinaryUnit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "UnitCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StreamCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Grade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Updated"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Editor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FetchByUpdatedDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PEPiEntity"), com.PepiSystems.WS.PEPi.PEPiEntity.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "UpdatedDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStudentDetailsLP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "StudentNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEnrolmentDetailsLP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PersonID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setReturnClass(com.PepiSystems.WS.PEPi.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

    }

    public WSPEPiServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSPEPiServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSPEPiServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi/AbstractTypes", "StringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetAccountResponse>GetAccountResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetCourseDataResponse>GetCourseDataResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetDuplicateResponse>GetDuplicateResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetEnrolledStreamUnitsResponse>GetEnrolledStreamUnitsResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetEnrolledUnitsResponse>GetEnrolledUnitsResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetLecturerStreamsResponse>GetLecturerStreamsResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetNoteCategoriesResponse>GetNoteCategoriesResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetOnlineCourseStreamsFilteredResponse>GetOnlineCourseStreamsFilteredResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetOnlineCourseStreamsResponse>GetOnlineCourseStreamsResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetRegistrationDetailsResponse>GetRegistrationDetailsResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentEnrolmentsResponse>GetStudentEnrolmentsResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentsByCourseResponse>GetStudentsByCourseResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetStudentVOCHoursForLastYearResponse>GetStudentVOCHoursForLastYearResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">>GetUserBySecurityGroupResponse>GetUserBySecurityGroupResult");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">AddAttachment");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.AddAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">AddAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.AddAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">AddPortalAlert");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.AddPortalAlert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">AddPortalAlertResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.AddPortalAlertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreateAccount");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreateAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreateAccount_Role");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreateAccount_Role.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreateAccount_RoleResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreateAccount_RoleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreateAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreatePayment");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreatePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreatePaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreatePaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreatePaymentWithAllocations");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreatePaymentWithAllocations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">CreatePaymentWithAllocationsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.CreatePaymentWithAllocationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">DataSet");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.DataSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">FetchByUpdatedDate");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.FetchByUpdatedDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">FetchByUpdatedDateResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.FetchByUpdatedDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetAccount");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetAssessmentByCode");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetAssessmentByCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetAssessmentByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetAssessmentByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetCourseData");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetCourseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetCourseDataResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetCourseDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetCurrentAnnouncements");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetCurrentAnnouncements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetCurrentAnnouncementsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetCurrentAnnouncementsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolledStreamUnits");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolledStreamUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolledStreamUnitsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolledUnits");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolledUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolledUnitsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolmentDetailsLP");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolmentDetailsLP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolmentDetailsLPResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolmentDetailsLPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolmentFeesToPay");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolmentFeesToPay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEnrolmentFeesToPayResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEnrolmentFeesToPayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEntityFinancialDetails");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEntityFinancialDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEntityFinancialDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEntityFinancialDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEvents");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetEventsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetEventsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetFeesToPay");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetFeesToPay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetFeesToPayResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetFeesToPayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetLecturerStreams");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetLecturerStreams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetLecturerStreamsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetLecturerStreamsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetMarksAndGrades");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetMarksAndGrades.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetMarksAndGradesResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetMarksAndGradesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetNoteCategories");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetNoteCategories.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetNoteCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetNoteCategoriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineCourseStreams");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineCourseStreams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineCourseStreamsFiltered");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFiltered.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineCourseStreamsFilteredResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineCourseStreamsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineDisciplines");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineDisciplines.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetOnlineDisciplinesResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetOnlineDisciplinesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetParentChildRelations");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetParentChildRelations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetParentChildRelationsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetParentChildRelationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetPaymentReceipt");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetPaymentReceipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetPaymentReceiptResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetPaymentReceiptResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetReEnrolmentStream");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetReEnrolmentStream.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetReEnrolmentStreamResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetReEnrolmentStreamResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetRegistrationDetails");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetRegistrationDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetRegistrationDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamByCode");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamByCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamByCodeResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamByCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamForReEnrolment");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamForReEnrolment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamForReEnrolmentResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamForReEnrolmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamsForReEnrolment");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamsForReEnrolment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamsForReEnrolmentResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamsForReEnrolmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamTimetableClasses");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamTimetableClasses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStreamTimetableClassesResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStreamTimetableClassesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentDetailsLP");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentDetailsLP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentDetailsLPResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentDetailsLPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentEnrolments");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentEnrolments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentEnrolmentsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsByCourse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsByCourse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsByCourseResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsByCourseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsCurrentAttendanceRecord");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsCurrentAttendanceRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsCurrentAttendanceRecordByEnrolmentID");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsCurrentAttendanceRecordByEnrolmentID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsCurrentAttendanceRecordByEnrolmentIDResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsCurrentAttendanceRecordByEnrolmentIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsCurrentAttendanceRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsCurrentAttendanceRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsCurrentTimetableClasses");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsCurrentTimetableClasses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentsCurrentTimetableClassesResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentsCurrentTimetableClassesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentTimetableClasses");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentTimetableClasses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentTimetableClassesResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentTimetableClassesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentVOCHoursForLastYear");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYear.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetStudentVOCHoursForLastYearResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetTransactionDetailForPayment");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetTransactionDetailForPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetTransactionDetailForPaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetTransactionDetailForPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetUnitGradeScheme");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetUnitGradeScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetUnitGradeSchemeResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetUnitGradeSchemeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetUserBySecurityGroup");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetUserBySecurityGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">GetUserBySecurityGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">MarkBinaryUnit");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.MarkBinaryUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">MarkBinaryUnitResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.MarkBinaryUnitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">MarkCommonAssessment");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.MarkCommonAssessment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">MarkCommonAssessmentResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.MarkCommonAssessmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">RemoveAccount");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.RemoveAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">RemoveAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.RemoveAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">UpdateAccount");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.UpdateAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">UpdateAccount_Role");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.UpdateAccount_Role.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">UpdateAccount_RoleResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.UpdateAccount_RoleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">UpdateAccountResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.UpdateAccountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">UpdateUserTCs");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.UpdateUserTCs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", ">UpdateUserTCsResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.UpdateUserTCsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Cohort");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.Cohort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PasswordRecoveryMode");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.PasswordRecoveryMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "PEPiEntity");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.PEPiEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSResponse");
            cachedSerQNames.add(qName);
            cls = com.PepiSystems.WS.PEPi.WSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.PepiSystems.WS.PEPi.WSResponse getSignOnToken(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetSignOnToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetSignOnToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse addCorresondenceFromEmail(java.lang.String[] emails, java.lang.String body, java.util.Calendar date, java.lang.String emailFrom) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/addCorresondenceFromEmail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "addCorresondenceFromEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emails, body, date, emailFrom});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse fetch(int id, com.PepiSystems.WS.PEPi.PEPiEntity entity, java.lang.String alias) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/Fetch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Fetch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id), entity, alias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse persist(java.lang.String data, com.PepiSystems.WS.PEPi.PEPiEntity entity, java.lang.String alias) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/Persist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Persist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {data, entity, alias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse delete(int id, int editorID, com.PepiSystems.WS.PEPi.PEPiEntity entity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id), new java.lang.Integer(editorID), entity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse emailLoginCredentials(com.PepiSystems.WS.PEPi.PasswordRecoveryMode mode, java.lang.String value) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/EmailLoginCredentials");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "EmailLoginCredentials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mode, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse quickSearch(java.lang.String name, com.PepiSystems.WS.PEPi.Cohort cohort, java.lang.String email1, java.lang.String NSN) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/QuickSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "QuickSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, cohort, email1, NSN});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult getDuplicate(java.lang.String firstName, java.lang.String lastName, java.lang.String email) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetDuplicate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetDuplicate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {firstName, lastName, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult getEnrolledStreamUnits(int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetEnrolledStreamUnits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEnrolledStreamUnits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult getEnrolledUnits(int id, int courseID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetEnrolledUnits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEnrolledUnits"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id), new java.lang.Integer(courseID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getCurrentAnnouncements() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetCurrentAnnouncements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetCurrentAnnouncements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult getCourseData(java.util.Calendar endDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetCourseData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetCourseData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult getNoteCategories(int userID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetNoteCategories");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetNoteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(userID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse createAccount(int personID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/CreateAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "CreateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID), username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse createAccount_Role(int personID, java.lang.String username, java.lang.String password, int roleID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/CreateAccount_Role");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "CreateAccount_Role"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID), username, password, new java.lang.Integer(roleID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult getAccount(int entityID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(entityID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse updateAccount(int personID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/UpdateAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "UpdateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID), username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse updateAccount_Role(int personID, java.lang.String username, java.lang.String password, int roleID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/UpdateAccount_Role");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "UpdateAccount_Role"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID), username, password, new java.lang.Integer(roleID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse removeAccount(int personID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/RemoveAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "RemoveAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse updateUserTCs(int personID, boolean acceptedTCs, java.util.Calendar date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/UpdateUserTCs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "UpdateUserTCs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID), new java.lang.Boolean(acceptedTCs), date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult getRegistrationDetails() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetRegistrationDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetRegistrationDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse createPayment(int studentID, int streamID, java.math.BigDecimal amoutPaid, java.lang.String description, java.lang.String referenceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/CreatePayment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "CreatePayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID), new java.lang.Integer(streamID), amoutPaid, description, referenceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult getStudentEnrolments(int studentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentEnrolments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentEnrolments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult getLecturerStreams(java.lang.String alias) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetLecturerStreams");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetLecturerStreams"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {alias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult getStudentsByCourse(int courseID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentsByCourse");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentsByCourse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(courseID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult getStudentVOCHoursForLastYear(int personID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentVOCHoursForLastYear");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentVOCHoursForLastYear"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult getUserBySecurityGroup(int roleID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetUserBySecurityGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetUserBySecurityGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(roleID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addAttachment(int ID, java.lang.String alias, java.lang.String fileName, java.lang.String description, byte[] content) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/AddAttachment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AddAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(ID), alias, fileName, description, content});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getOnlineDisciplines(java.lang.String endDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetOnlineDisciplines");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetOnlineDisciplines"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult getOnlineCourseStreams(java.lang.String endDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetOnlineCourseStreams");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetOnlineCourseStreams"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult getOnlineCourseStreamsFiltered(java.lang.String endDate, java.lang.String discipline, java.lang.String courseID, java.lang.String location, java.lang.String days, java.lang.String times) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetOnlineCourseStreamsFiltered");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetOnlineCourseStreamsFiltered"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {endDate, discipline, courseID, location, days, times});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getReEnrolmentStream(int streamID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetReEnrolmentStream");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetReEnrolmentStream"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(streamID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStreamForReEnrolment(int studentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStreamForReEnrolment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStreamForReEnrolment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStreamsForReEnrolment(int studentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStreamsForReEnrolment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStreamsForReEnrolment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getEntityFinancialDetails(int entityID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetEntityFinancialDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEntityFinancialDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(entityID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getPaymentReceipt(int paymentDetailID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetPaymentReceipt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetPaymentReceipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(paymentDetailID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getFeesToPay(int entityID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetFeesToPay");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetFeesToPay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(entityID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getEnrolmentFeesToPay(int enrolmentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetEnrolmentFeesToPay");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEnrolmentFeesToPay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(enrolmentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getTransactionDetailForPayment(int entityID, java.lang.String feeSelections, java.lang.String paymentTransactionXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetTransactionDetailForPayment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetTransactionDetailForPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(entityID), feeSelections, paymentTransactionXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse createPaymentWithAllocations(java.lang.String feeSelectionsForAllocation, java.lang.String paymentTransactionXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/CreatePaymentWithAllocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "CreatePaymentWithAllocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feeSelectionsForAllocation, paymentTransactionXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse addPortalAlert(java.lang.String distributionGroupName, java.lang.String title, java.lang.String note, java.lang.String author, int authorID, int relatedPersonID, java.lang.String priority, java.util.Calendar startDate, java.util.Calendar endDate, boolean useEscalation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/AddPortalAlert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "AddPortalAlert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {distributionGroupName, title, note, author, new java.lang.Integer(authorID), new java.lang.Integer(relatedPersonID), priority, startDate, endDate, new java.lang.Boolean(useEscalation)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getParentChildRelations(int parentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetParentChildRelations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetParentChildRelations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(parentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getMarksAndGrades(int enrolmentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetMarksAndGrades");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetMarksAndGrades"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(enrolmentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentTimetableClasses(int studentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentsCurrentTimetableClasses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentsCurrentTimetableClasses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentAttendanceRecord(int studentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentsCurrentAttendanceRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentsCurrentAttendanceRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentAttendanceRecordByEnrolmentID(int enrolmentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentsCurrentAttendanceRecordByEnrolmentID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentsCurrentAttendanceRecordByEnrolmentID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(enrolmentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStudentTimetableClasses(int enrolmentID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentTimetableClasses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentTimetableClasses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(enrolmentID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStreamTimetableClasses(int streamID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStreamTimetableClasses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStreamTimetableClasses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(streamID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getEvents(java.lang.String eventStartDate, java.lang.String eventStartTime, java.lang.String eventType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {eventStartDate, eventStartTime, eventType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStreamByCode(java.lang.String streamCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStreamByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStreamByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {streamCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getAssessmentByCode(java.lang.String assessmentCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetAssessmentByCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetAssessmentByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assessmentCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getUnitGradeScheme(java.lang.String unitCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetUnitGradeScheme");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetUnitGradeScheme"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unitCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse markCommonAssessment(int studentID, java.lang.String assessmentCode, java.lang.String streamCode, java.lang.String status, java.lang.String comment, int mark, java.lang.String datePassMarkAchieved, java.lang.String programCompletionDate, int assessor, java.lang.String dateMarkedByAssessor, java.lang.String assessmentSentDate, int editor) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/MarkCommonAssessment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "MarkCommonAssessment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID), assessmentCode, streamCode, status, comment, new java.lang.Integer(mark), datePassMarkAchieved, programCompletionDate, new java.lang.Integer(assessor), dateMarkedByAssessor, assessmentSentDate, new java.lang.Integer(editor)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse markBinaryUnit(int studentID, java.lang.String unitCode, java.lang.String streamCode, java.lang.String status, int grade, java.lang.String updated, int editor) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/MarkBinaryUnit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "MarkBinaryUnit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(studentID), unitCode, streamCode, status, new java.lang.Integer(grade), updated, new java.lang.Integer(editor)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse fetchByUpdatedDate(com.PepiSystems.WS.PEPi.PEPiEntity objectType, java.util.Calendar updatedDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/FetchByUpdatedDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "FetchByUpdatedDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objectType, updatedDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getStudentDetailsLP(java.lang.String studentNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetStudentDetailsLP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetStudentDetailsLP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {studentNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.PepiSystems.WS.PEPi.WSResponse getEnrolmentDetailsLP(int personID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://PepiSystems.com/WS/PEPi/GetEnrolmentDetailsLP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "GetEnrolmentDetailsLP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(personID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.PepiSystems.WS.PEPi.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.PepiSystems.WS.PEPi.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.PepiSystems.WS.PEPi.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
