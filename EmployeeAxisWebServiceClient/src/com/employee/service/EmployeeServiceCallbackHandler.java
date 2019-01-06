
/**
 * EmployeeServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package com.employee.service;

    /**
     *  EmployeeServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class EmployeeServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public EmployeeServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public EmployeeServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getAllEmployees method
            * override this method for handling normal response from getAllEmployees operation
            */
           public void receiveResultgetAllEmployees(
                    com.employee.service.EmployeeServiceStub.GetAllEmployeesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllEmployees operation
           */
            public void receiveErrorgetAllEmployees(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSalaryForEmployee method
            * override this method for handling normal response from getSalaryForEmployee operation
            */
           public void receiveResultgetSalaryForEmployee(
                    com.employee.service.EmployeeServiceStub.GetSalaryForEmployeeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSalaryForEmployee operation
           */
            public void receiveErrorgetSalaryForEmployee(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getDepartmentForEmployee method
            * override this method for handling normal response from getDepartmentForEmployee operation
            */
           public void receiveResultgetDepartmentForEmployee(
                    com.employee.service.EmployeeServiceStub.GetDepartmentForEmployeeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDepartmentForEmployee operation
           */
            public void receiveErrorgetDepartmentForEmployee(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getEmployeeData method
            * override this method for handling normal response from getEmployeeData operation
            */
           public void receiveResultgetEmployeeData(
                    com.employee.service.EmployeeServiceStub.GetEmployeeDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getEmployeeData operation
           */
            public void receiveErrorgetEmployeeData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAgeForEmployee method
            * override this method for handling normal response from getAgeForEmployee operation
            */
           public void receiveResultgetAgeForEmployee(
                    com.employee.service.EmployeeServiceStub.GetAgeForEmployeeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAgeForEmployee operation
           */
            public void receiveErrorgetAgeForEmployee(java.lang.Exception e) {
            }
                


    }
    