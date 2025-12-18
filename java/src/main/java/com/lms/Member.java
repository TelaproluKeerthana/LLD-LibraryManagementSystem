package com.lms;

public class Member {
    private String name;
    private int memberId;   
    private String email;
    private String phoneNumber;

    public Member(String name, int memberId, String email, String phoneNumber) {
        this.name = name;
        this.memberId = memberId;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



}