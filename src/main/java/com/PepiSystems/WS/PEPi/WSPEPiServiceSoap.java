/**
 * WSPEPiServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public interface WSPEPiServiceSoap extends java.rmi.Remote {
    public com.PepiSystems.WS.PEPi.WSResponse getSignOnToken(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse addCorresondenceFromEmail(java.lang.String[] emails, java.lang.String body, java.util.Calendar date, java.lang.String emailFrom) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse fetch(int id, com.PepiSystems.WS.PEPi.PEPiEntity entity, java.lang.String alias) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse persist(java.lang.String data, com.PepiSystems.WS.PEPi.PEPiEntity entity, java.lang.String alias) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse delete(int id, int editorID, com.PepiSystems.WS.PEPi.PEPiEntity entity) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse emailLoginCredentials(com.PepiSystems.WS.PEPi.PasswordRecoveryMode mode, java.lang.String value) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse quickSearch(java.lang.String name, com.PepiSystems.WS.PEPi.Cohort cohort, java.lang.String email1, java.lang.String NSN) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult getDuplicate(java.lang.String firstName, java.lang.String lastName, java.lang.String email) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult getEnrolledStreamUnits(int id) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult getEnrolledUnits(int id, int courseID) throws java.rmi.RemoteException;

    /**
     * Returns all Announcements relative to Today()
     */
    public com.PepiSystems.WS.PEPi.WSResponse getCurrentAnnouncements() throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult getCourseData(java.util.Calendar endDate) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult getNoteCategories(int userID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse createAccount(int personID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse createAccount_Role(int personID, java.lang.String username, java.lang.String password, int roleID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult getAccount(int entityID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse updateAccount(int personID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse updateAccount_Role(int personID, java.lang.String username, java.lang.String password, int roleID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse removeAccount(int personID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse updateUserTCs(int personID, boolean acceptedTCs, java.util.Calendar date) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult getRegistrationDetails() throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse createPayment(int studentID, int streamID, java.math.BigDecimal amoutPaid, java.lang.String description, java.lang.String referenceID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult getStudentEnrolments(int studentID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult getLecturerStreams(java.lang.String alias) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult getStudentsByCourse(int courseID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult getStudentVOCHoursForLastYear(int personID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult getUserBySecurityGroup(int roleID) throws java.rmi.RemoteException;
    public void addAttachment(int ID, java.lang.String alias, java.lang.String fileName, java.lang.String description, byte[] content) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getOnlineDisciplines(java.lang.String endDate) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult getOnlineCourseStreams(java.lang.String endDate) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult getOnlineCourseStreamsFiltered(java.lang.String endDate, java.lang.String discipline, java.lang.String courseID, java.lang.String location, java.lang.String days, java.lang.String times) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getReEnrolmentStream(int streamID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getStreamForReEnrolment(int studentID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getStreamsForReEnrolment(int studentID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getEntityFinancialDetails(int entityID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getPaymentReceipt(int paymentDetailID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getFeesToPay(int entityID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getEnrolmentFeesToPay(int enrolmentID) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse getTransactionDetailForPayment(int entityID, java.lang.String feeSelections, java.lang.String paymentTransactionXML) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse createPaymentWithAllocations(java.lang.String feeSelectionsForAllocation, java.lang.String paymentTransactionXML) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse addPortalAlert(java.lang.String distributionGroupName, java.lang.String title, java.lang.String note, java.lang.String author, int authorID, int relatedPersonID, java.lang.String priority, java.util.Calendar startDate, java.util.Calendar endDate, boolean useEscalation) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getParentChildRelations(int parentID) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getMarksAndGrades(int enrolmentID) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentTimetableClasses(int studentID) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentAttendanceRecord(int studentID) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentAttendanceRecordByEnrolmentID(int enrolmentID) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getStudentTimetableClasses(int enrolmentID) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getStreamTimetableClasses(int streamID) throws java.rmi.RemoteException;

    /**
     * S&P Portal
     */
    public com.PepiSystems.WS.PEPi.WSResponse getEvents(java.lang.String eventStartDate, java.lang.String eventStartTime, java.lang.String eventType) throws java.rmi.RemoteException;

    /**
     * Sky Learning
     */
    public com.PepiSystems.WS.PEPi.WSResponse getStreamByCode(java.lang.String streamCode) throws java.rmi.RemoteException;

    /**
     * Sky Learning
     */
    public com.PepiSystems.WS.PEPi.WSResponse getAssessmentByCode(java.lang.String assessmentCode) throws java.rmi.RemoteException;

    /**
     * Sky Learning
     */
    public com.PepiSystems.WS.PEPi.WSResponse getUnitGradeScheme(java.lang.String unitCode) throws java.rmi.RemoteException;

    /**
     * Sky Learning
     */
    public com.PepiSystems.WS.PEPi.WSResponse markCommonAssessment(int studentID, java.lang.String assessmentCode, java.lang.String streamCode, java.lang.String status, java.lang.String comment, int mark, java.lang.String datePassMarkAchieved, java.lang.String programCompletionDate, int assessor, java.lang.String dateMarkedByAssessor, java.lang.String assessmentSentDate, int editor) throws java.rmi.RemoteException;

    /**
     * Sky Learning
     */
    public com.PepiSystems.WS.PEPi.WSResponse markBinaryUnit(int studentID, java.lang.String unitCode, java.lang.String streamCode, java.lang.String status, int grade, java.lang.String updated, int editor) throws java.rmi.RemoteException;
    public com.PepiSystems.WS.PEPi.WSResponse fetchByUpdatedDate(com.PepiSystems.WS.PEPi.PEPiEntity objectType, java.util.Calendar updatedDate) throws java.rmi.RemoteException;

    /**
     * COLLAW Learning Portal Service Method
     */
    public com.PepiSystems.WS.PEPi.WSResponse getStudentDetailsLP(java.lang.String studentNumber) throws java.rmi.RemoteException;

    /**
     * COLLAW Learning Portal Service Method
     */
    public com.PepiSystems.WS.PEPi.WSResponse getEnrolmentDetailsLP(int personID) throws java.rmi.RemoteException;
}
