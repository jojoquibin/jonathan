package com.PepiSystems.WS.PEPi;

public class WSPEPiServiceSoapProxy implements com.PepiSystems.WS.PEPi.WSPEPiServiceSoap {
  private String _endpoint = null;
  private com.PepiSystems.WS.PEPi.WSPEPiServiceSoap wSPEPiServiceSoap = null;
  
  public WSPEPiServiceSoapProxy() {
    _initWSPEPiServiceSoapProxy();
  }
  
  public WSPEPiServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSPEPiServiceSoapProxy();
  }
  
  private void _initWSPEPiServiceSoapProxy() {
    try {
      wSPEPiServiceSoap = (new com.PepiSystems.WS.PEPi.WSPEPiServiceLocator()).getWSPEPiServiceSoap();
      if (wSPEPiServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSPEPiServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSPEPiServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSPEPiServiceSoap != null)
      ((javax.xml.rpc.Stub)wSPEPiServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.PepiSystems.WS.PEPi.WSPEPiServiceSoap getWSPEPiServiceSoap() {
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap;
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getSignOnToken(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getSignOnToken(username, password);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse addCorresondenceFromEmail(java.lang.String[] emails, java.lang.String body, java.util.Calendar date, java.lang.String emailFrom) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.addCorresondenceFromEmail(emails, body, date, emailFrom);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse fetch(int id, com.PepiSystems.WS.PEPi.PEPiEntity entity, java.lang.String alias) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.fetch(id, entity, alias);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse persist(java.lang.String data, com.PepiSystems.WS.PEPi.PEPiEntity entity, java.lang.String alias) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.persist(data, entity, alias);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse delete(int id, int editorID, com.PepiSystems.WS.PEPi.PEPiEntity entity) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.delete(id, editorID, entity);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse emailLoginCredentials(com.PepiSystems.WS.PEPi.PasswordRecoveryMode mode, java.lang.String value) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.emailLoginCredentials(mode, value);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse quickSearch(java.lang.String name, com.PepiSystems.WS.PEPi.Cohort cohort, java.lang.String email1, java.lang.String NSN) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.quickSearch(name, cohort, email1, NSN);
  }
  
  public com.PepiSystems.WS.PEPi.GetDuplicateResponseGetDuplicateResult getDuplicate(java.lang.String firstName, java.lang.String lastName, java.lang.String email) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getDuplicate(firstName, lastName, email);
  }
  
  public com.PepiSystems.WS.PEPi.GetEnrolledStreamUnitsResponseGetEnrolledStreamUnitsResult getEnrolledStreamUnits(int id) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getEnrolledStreamUnits(id);
  }
  
  public com.PepiSystems.WS.PEPi.GetEnrolledUnitsResponseGetEnrolledUnitsResult getEnrolledUnits(int id, int courseID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getEnrolledUnits(id, courseID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getCurrentAnnouncements() throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getCurrentAnnouncements();
  }
  
  public com.PepiSystems.WS.PEPi.GetCourseDataResponseGetCourseDataResult getCourseData(java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getCourseData(endDate);
  }
  
  public com.PepiSystems.WS.PEPi.GetNoteCategoriesResponseGetNoteCategoriesResult getNoteCategories(int userID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getNoteCategories(userID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse createAccount(int personID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.createAccount(personID, username, password);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse createAccount_Role(int personID, java.lang.String username, java.lang.String password, int roleID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.createAccount_Role(personID, username, password, roleID);
  }
  
  public com.PepiSystems.WS.PEPi.GetAccountResponseGetAccountResult getAccount(int entityID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getAccount(entityID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse updateAccount(int personID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.updateAccount(personID, username, password);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse updateAccount_Role(int personID, java.lang.String username, java.lang.String password, int roleID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.updateAccount_Role(personID, username, password, roleID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse removeAccount(int personID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.removeAccount(personID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse updateUserTCs(int personID, boolean acceptedTCs, java.util.Calendar date) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.updateUserTCs(personID, acceptedTCs, date);
  }
  
  public com.PepiSystems.WS.PEPi.GetRegistrationDetailsResponseGetRegistrationDetailsResult getRegistrationDetails() throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getRegistrationDetails();
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse createPayment(int studentID, int streamID, java.math.BigDecimal amoutPaid, java.lang.String description, java.lang.String referenceID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.createPayment(studentID, streamID, amoutPaid, description, referenceID);
  }
  
  public com.PepiSystems.WS.PEPi.GetStudentEnrolmentsResponseGetStudentEnrolmentsResult getStudentEnrolments(int studentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentEnrolments(studentID);
  }
  
  public com.PepiSystems.WS.PEPi.GetLecturerStreamsResponseGetLecturerStreamsResult getLecturerStreams(java.lang.String alias) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getLecturerStreams(alias);
  }
  
  public com.PepiSystems.WS.PEPi.GetStudentsByCourseResponseGetStudentsByCourseResult getStudentsByCourse(int courseID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentsByCourse(courseID);
  }
  
  public com.PepiSystems.WS.PEPi.GetStudentVOCHoursForLastYearResponseGetStudentVOCHoursForLastYearResult getStudentVOCHoursForLastYear(int personID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentVOCHoursForLastYear(personID);
  }
  
  public com.PepiSystems.WS.PEPi.GetUserBySecurityGroupResponseGetUserBySecurityGroupResult getUserBySecurityGroup(int roleID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getUserBySecurityGroup(roleID);
  }
  
  public void addAttachment(int ID, java.lang.String alias, java.lang.String fileName, java.lang.String description, byte[] content) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    wSPEPiServiceSoap.addAttachment(ID, alias, fileName, description, content);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getOnlineDisciplines(java.lang.String endDate) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getOnlineDisciplines(endDate);
  }
  
  public com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsResponseGetOnlineCourseStreamsResult getOnlineCourseStreams(java.lang.String endDate) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getOnlineCourseStreams(endDate);
  }
  
  public com.PepiSystems.WS.PEPi.GetOnlineCourseStreamsFilteredResponseGetOnlineCourseStreamsFilteredResult getOnlineCourseStreamsFiltered(java.lang.String endDate, java.lang.String discipline, java.lang.String courseID, java.lang.String location, java.lang.String days, java.lang.String times) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getOnlineCourseStreamsFiltered(endDate, discipline, courseID, location, days, times);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getReEnrolmentStream(int streamID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getReEnrolmentStream(streamID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStreamForReEnrolment(int studentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStreamForReEnrolment(studentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStreamsForReEnrolment(int studentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStreamsForReEnrolment(studentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getEntityFinancialDetails(int entityID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getEntityFinancialDetails(entityID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getPaymentReceipt(int paymentDetailID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getPaymentReceipt(paymentDetailID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getFeesToPay(int entityID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getFeesToPay(entityID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getEnrolmentFeesToPay(int enrolmentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getEnrolmentFeesToPay(enrolmentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getTransactionDetailForPayment(int entityID, java.lang.String feeSelections, java.lang.String paymentTransactionXML) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getTransactionDetailForPayment(entityID, feeSelections, paymentTransactionXML);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse createPaymentWithAllocations(java.lang.String feeSelectionsForAllocation, java.lang.String paymentTransactionXML) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.createPaymentWithAllocations(feeSelectionsForAllocation, paymentTransactionXML);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse addPortalAlert(java.lang.String distributionGroupName, java.lang.String title, java.lang.String note, java.lang.String author, int authorID, int relatedPersonID, java.lang.String priority, java.util.Calendar startDate, java.util.Calendar endDate, boolean useEscalation) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.addPortalAlert(distributionGroupName, title, note, author, authorID, relatedPersonID, priority, startDate, endDate, useEscalation);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getParentChildRelations(int parentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getParentChildRelations(parentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getMarksAndGrades(int enrolmentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getMarksAndGrades(enrolmentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentTimetableClasses(int studentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentsCurrentTimetableClasses(studentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentAttendanceRecord(int studentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentsCurrentAttendanceRecord(studentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStudentsCurrentAttendanceRecordByEnrolmentID(int enrolmentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentsCurrentAttendanceRecordByEnrolmentID(enrolmentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStudentTimetableClasses(int enrolmentID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentTimetableClasses(enrolmentID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStreamTimetableClasses(int streamID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStreamTimetableClasses(streamID);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getEvents(java.lang.String eventStartDate, java.lang.String eventStartTime, java.lang.String eventType) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getEvents(eventStartDate, eventStartTime, eventType);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStreamByCode(java.lang.String streamCode) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStreamByCode(streamCode);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getAssessmentByCode(java.lang.String assessmentCode) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getAssessmentByCode(assessmentCode);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getUnitGradeScheme(java.lang.String unitCode) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getUnitGradeScheme(unitCode);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse markCommonAssessment(int studentID, java.lang.String assessmentCode, java.lang.String streamCode, java.lang.String status, java.lang.String comment, int mark, java.lang.String datePassMarkAchieved, java.lang.String programCompletionDate, int assessor, java.lang.String dateMarkedByAssessor, java.lang.String assessmentSentDate, int editor) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.markCommonAssessment(studentID, assessmentCode, streamCode, status, comment, mark, datePassMarkAchieved, programCompletionDate, assessor, dateMarkedByAssessor, assessmentSentDate, editor);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse markBinaryUnit(int studentID, java.lang.String unitCode, java.lang.String streamCode, java.lang.String status, int grade, java.lang.String updated, int editor) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.markBinaryUnit(studentID, unitCode, streamCode, status, grade, updated, editor);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse fetchByUpdatedDate(com.PepiSystems.WS.PEPi.PEPiEntity objectType, java.util.Calendar updatedDate) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.fetchByUpdatedDate(objectType, updatedDate);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getStudentDetailsLP(java.lang.String studentNumber) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getStudentDetailsLP(studentNumber);
  }
  
  public com.PepiSystems.WS.PEPi.WSResponse getEnrolmentDetailsLP(int personID) throws java.rmi.RemoteException{
    if (wSPEPiServiceSoap == null)
      _initWSPEPiServiceSoapProxy();
    return wSPEPiServiceSoap.getEnrolmentDetailsLP(personID);
  }
  
  
}