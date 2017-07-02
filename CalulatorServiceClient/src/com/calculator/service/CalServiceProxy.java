package com.calculator.service;

public class CalServiceProxy implements com.calculator.service.CalService {
  private String _endpoint = null;
  private com.calculator.service.CalService calService = null;
  
  public CalServiceProxy() {
    _initCalServiceProxy();
  }
  
  public CalServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalServiceProxy();
  }
  
  private void _initCalServiceProxy() {
    try {
      calService = (new com.calculator.service.CalServiceServiceLocator()).getCalService();
      if (calService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calService != null)
      ((javax.xml.rpc.Stub)calService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.calculator.service.CalService getCalService() {
    if (calService == null)
      _initCalServiceProxy();
    return calService;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (calService == null)
      _initCalServiceProxy();
    return calService.add(i, j);
  }
  
  public int sub(int i, int j) throws java.rmi.RemoteException{
    if (calService == null)
      _initCalServiceProxy();
    return calService.sub(i, j);
  }
  
  
}