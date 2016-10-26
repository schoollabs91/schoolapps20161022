package com.lab.kot.school.ui.bean;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class TeachAttendanceSearchBean {
    public TeachAttendanceSearchBean() {
        super();
    }
    public void createAttendanceList(ActionEvent actionEvent) {
    //       #{bindings.copyStudentToAttendance.execute}
        
        BindingContainer bindings =(BindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry(); 
        OperationBinding method = bindings.getOperationBinding("copyTeacherToAttendance");  
        Object result = method.execute(); 
        
    }
}
