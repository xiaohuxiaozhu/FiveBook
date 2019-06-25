package Models;

import java.util.*;

public class Main {

    public static void main(String[]args){

        Book book1=new Book();
        //Type:Book
        //Object name"book1

        book1.setTitle("Core Java.");
        book1.setAuthor("xxx.");
        book1.setDescription("A Beginner's Guide");
        book1.setPrice(25);
        book1.setisInStock(true);
        book1.getDisplayText();



        //orverloaded constructor
     //  Book book2=new Book("OOPs Java","SSSS");

        String title = book1.getTitle();
        String author=book1.getAuthor();
        String description=book1.getDescription();
        double price=book1.getPrice();
        boolean isInStock=book1.getisInStock();

        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Description: "+ description);
        System.out.println("Price: "+ price);
        System.out.println("Is in Stock:" + isInStock);

        /*
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input);

        Book book2=new Book();
        */










    }
}
