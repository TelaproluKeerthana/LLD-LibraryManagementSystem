package com.lms;

// librarian class to manage library operations
// adds books, manages members, oversees loans

public class Librarian {
    private String name;
    private int employeeId; 
    private Library library;

    public String getName() {
        return name;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public Librarian(String name, int employeeId, Library library) {
        this.name = name;
        this.employeeId = employeeId;
        this.library = library;
    }

    public void addBookItem(BookItem bookItem) {
        if (bookItem == null) return;
        if (library == null) {
            System.out.println("No library assigned. Cannot add book item: " + (bookItem.getBook() != null ? bookItem.getBook().getTitle() : "<unknown>"));
            return;
        }
        library.addBookItem(bookItem);
        System.out.println("Added book item to library: " + (bookItem.getBook() != null ? bookItem.getBook().getTitle() : bookItem.getBarcode()));
    }

    public void registerMember(Member member) {
        // logic to register a new member

        if (library != null && member != null) {
            library.addMember(member);
            System.out.println("Registered member: " + member.getName());
        }

    }

    public void manageLoan(BookItem bookItem, Member member) {
        // logic to manage book loans
    }

}
