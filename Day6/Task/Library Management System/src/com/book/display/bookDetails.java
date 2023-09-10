package com.book.display;


public class bookDetails {
    String title;
    String author;

    public bookDetails(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("<<<-----------Book Details------------------->>>");
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of the Book: " + author);
    }


    //copy constructor
        bookDetails(bookDetails bookeD){
        this.title = bookeD.title;
        this.author = bookeD.author;
    }
//    String showTitle(){
//        return title;
//    }
//    String shoeAuthor(){
//        return author;
//    }
}
