package Models;

import java.util.*;

public class Main {

    public static void main(String[]args){


        Scanner sc= new Scanner(System.in);
        ArrayList<Double> order = new ArrayList<Double>();
        Book book1=new Book();

        //Type:Book
        //Object name"book1

        book1.setTitle("Core Java.");
        book1.setAuthor("xxx.");
        book1.setDescription("A Beginner's Guide");
        book1.setPrice(20);
        book1.setUnits(10);
        book1.setpNumber(234567891);
      //  book1.setisInStock(true);
        book1.getDisplayText();
        order.add(book1.getPrice());

        //add book
        Book book2 = new Book("HTML.", "Elizabeth","Visual QUickStar Gudie.",20,23456789,20 );
        book2.getDisplayText();
        order.add(book2.getPrice());

        Book book3 = new Book("Java for Object", "Dheeraj", "Object Oriented Design", 20,3456789,20);
        book3.getDisplayText();
        order.add(book3.getPrice());

        Book book4 = new Book("Java Web Application", "Luciano","Step by Step explanation", 20,456789123,10);
        book4.getDisplayText();
        order.add(book4.getPrice());

        Book book5 = new Book("500 Social media Marketing", "Andrew", "Essential Advice",20,567891234,20);
        book5.getDisplayText();
        order.add(book5.getPrice());




        int number;
        System.out.println("How many book you would like buy?");
        number = sc.nextInt();
        if (number<=order.size()){
            int total=0;

            for (int i=0; i<number; i++){
                total+=order.get(i);

            }
            System.out.println("This five books total is:$" + total);

        } else{
            System.out.println("Not enough book to purchase");
        }



        //orverloaded constructor
     //  Book book2=new Book("OOPs Java","SSSS");
/*
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
