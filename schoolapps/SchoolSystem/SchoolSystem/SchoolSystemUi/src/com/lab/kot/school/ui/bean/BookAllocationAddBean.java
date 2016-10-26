package com.lab.kot.school.ui.bean;

import com.lab.kot.school.ui.handler.utility.JSFUtil;

import java.sql.Date;


import javax.faces.event.ActionEvent;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;



public class BookAllocationAddBean {
    public BookAllocationAddBean() {
        super();
    }    
    String SId;
    java.util.Date allocatStartDate;
    java.util.Date allocatEndDate;
    String Remark;

    public void setSId(String SId) {
        this.SId = SId;
    }

    public String getSId() {
        return SId;
    }

    public void setAllocatStartDate(java.util.Date allocatStartDate) {
        this.allocatStartDate = allocatStartDate;
    }

    public java.util.Date getAllocatStartDate() {
        return allocatStartDate;
    }

    public void setAllocatEndDate(java.util.Date allocatEndDate) {
        this.allocatEndDate = allocatEndDate;
    }

    public java.util.Date getAllocatEndDate() {
        return allocatEndDate;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getRemark() {
        return Remark;
    }

    public void SaveActionListener(ActionEvent actionEvent) {
        DCIteratorBinding dcIt = JSFUtil.getDCIterator("BookBasketVO1Iterator");
        RowIterator rit = dcIt.getRowSetIterator();
        rit.reset();
        while(rit.hasNext())
        {
            Row r1 = rit.next();
            Long bookId = (Long)r1.getAttribute("BookId");
            String isbn = (String)r1.getAttribute("Isbn");
            String title = (String)r1.getAttribute("BookTitle");
            String author = (String)r1.getAttribute("BookAuthor");   
            
            DCIteratorBinding bDcIt  = JSFUtil.getDCIterator("SBookAllocationVO1Iterator");
            ViewObject bVo = bDcIt.getViewObject();
            Row nRow = bVo.createRow();
            nRow.setAttribute("BookId", bookId);
            oracle.jbo.domain.Date alloStartDate = new oracle.jbo.domain.Date();
            oracle.jbo.domain.Date alloEndDate = new oracle.jbo.domain.Date();
            nRow.setAttribute("AllocationStartDate", alloStartDate);
            nRow.setAttribute("AllocationEndDate", alloEndDate);
            nRow.setAttribute("Remarks", getRemark());
            nRow.setAttribute("SId", getSId());            
            bVo.insertRow(nRow);           
        }
        JSFUtil.invokeEL("#{bindings.Commit.execute}");
        JSFUtil.addFacesErrorMessage("Saved");
    }
}
