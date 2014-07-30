/**
 * WSPEPiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.PepiSystems.WS.PEPi;

public class WSPEPiServiceLocator extends org.apache.axis.client.Service implements com.PepiSystems.WS.PEPi.WSPEPiService {

    public WSPEPiServiceLocator() {
    }


    public WSPEPiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSPEPiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSPEPiServiceSoap
    private java.lang.String WSPEPiServiceSoap_address = "http://pepiuat.skysoftware.com:8080/webservice/pepiservice.asmx";

    public java.lang.String getWSPEPiServiceSoapAddress() {
        return WSPEPiServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSPEPiServiceSoapWSDDServiceName = "WSPEPiServiceSoap";

    public java.lang.String getWSPEPiServiceSoapWSDDServiceName() {
        return WSPEPiServiceSoapWSDDServiceName;
    }

    public void setWSPEPiServiceSoapWSDDServiceName(java.lang.String name) {
        WSPEPiServiceSoapWSDDServiceName = name;
    }

    public com.PepiSystems.WS.PEPi.WSPEPiServiceSoap getWSPEPiServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSPEPiServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSPEPiServiceSoap(endpoint);
    }

    public com.PepiSystems.WS.PEPi.WSPEPiServiceSoap getWSPEPiServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.PepiSystems.WS.PEPi.WSPEPiServiceSoapStub _stub = new com.PepiSystems.WS.PEPi.WSPEPiServiceSoapStub(portAddress, this);
            _stub.setPortName(getWSPEPiServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSPEPiServiceSoapEndpointAddress(java.lang.String address) {
        WSPEPiServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.PepiSystems.WS.PEPi.WSPEPiServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.PepiSystems.WS.PEPi.WSPEPiServiceSoapStub _stub = new com.PepiSystems.WS.PEPi.WSPEPiServiceSoapStub(new java.net.URL(WSPEPiServiceSoap_address), this);
                _stub.setPortName(getWSPEPiServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSPEPiServiceSoap".equals(inputPortName)) {
            return getWSPEPiServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSPEPiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PepiSystems.com/WS/PEPi", "WSPEPiServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSPEPiServiceSoap".equals(portName)) {
            setWSPEPiServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
