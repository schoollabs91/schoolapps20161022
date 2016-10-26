package com.lab.kot.school.ui.bean;

import com.lab.kot.school.ui.handler.utility.JSFUtil;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.model.binding.DCIteratorBindingDef;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class BookStoreSearchBean {
    public BookStoreSearchBean() {
        super();
    }

    public void AddToBasketActionListener(ActionEvent actionEvent) {
        DCIteratorBinding dcIt = JSFUtil.getDCIterator("SBookVO1Iterator");
        Row r1 = dcIt.getCurrentRow();
        Long bookId = (Long)r1.getAttribute("BookId");
        String isbn = (String)r1.getAttribute("Isbn");
        String title = (String)r1.getAttribute("BookTitle");
        String author = (String)r1.getAttribute("BookAuthor");   
        
        DCIteratorBinding bDcIt = JSFUtil.getDCIterator("BookBasketVO1Iterator");
        ViewObject bVo = bDcIt.getViewObject();
        Row nRow = bVo.createRow();
        nRow.setAttribute("BookId", bookId);
        nRow.setAttribute("Isbn", isbn);
        nRow.setAttribute("BookTitle", title);
        nRow.setAttribute("BookAuthor", author);
        bVo.insertRow(nRow);
    }
}
