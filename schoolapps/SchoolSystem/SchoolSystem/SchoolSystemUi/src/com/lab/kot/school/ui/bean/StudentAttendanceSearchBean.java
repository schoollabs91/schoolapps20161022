package com.lab.kot.school.ui.bean;

import com.lab.kot.school.ui.handler.utility.JSFUtil;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;

public class StudentAttendanceSearchBean {
    public StudentAttendanceSearchBean() {
        super();
    }

    public void createAttendanceList(ActionEvent actionEvent) {
//       #{bindings.copyStudentToAttendance.execute}
        
        BindingContainer bindings =(BindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry(); 
        OperationBinding method = bindings.getOperationBinding("copyStudentToAttendance");  
        Object result = method.execute(); 
        
    }
}
