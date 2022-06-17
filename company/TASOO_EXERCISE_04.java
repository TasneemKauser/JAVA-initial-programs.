package com.company;

class Library{
    String[] books;int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBooks(String books){
        this.books[no_of_books]=books;
        no_of_books++;
        System.out.println("\n"+books+"; has been added");
    }
    void AvailableBooks(){
        System.out.println("* * * Available books are listed below: * * * ");
        for (String books:this.books){
            if(books==null){
                continue;
            }
            System.out.println("* "+books);
        }
    }
    void IssueBook(String books){
        for (int i=0;i<books.length();i++){
            if (this.books[i].equals(books)){
                System.out.println(books +"; book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println(books +" ; this book does not exist!");
    }
    void ReturnBook(String books){
     addBooks(books);    }
}

public class TASOO_EXERCISE_04 {
    public static void main(String[] args) {
        Library lib=new Library();
        lib.addBooks("Python Master");
        lib.addBooks("As you like it");
        lib.addBooks("Grab you success");
        lib.addBooks("CISCO mastering");
        lib.AvailableBooks();

        lib.IssueBook("C++");
        lib.IssueBook("Python Master");
        lib.AvailableBooks();

        lib.ReturnBook("Python Master");
        lib.AvailableBooks();
    }
}
