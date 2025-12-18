package com.lms;

public class BookItem {
    private Book book;
    private String barcode;     
    private Status status;  
    private int id;


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public int getId() {
        return id;
    }   

    public void setId(int id) {
        this.id = id;
    }


}
