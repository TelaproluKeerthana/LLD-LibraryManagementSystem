package com.lms;

public class Loan {
    private BookItem bookItem;
    private Member member;
    private String loanDate;
    private String dueDate;

    public Loan(BookItem bookItem, Member member, String loanDate, String dueDate) {
        this.bookItem = bookItem;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public Member getMember() {
        return member;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public String getDueDate() {
        return dueDate;
    }
    
}