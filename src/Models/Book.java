package Models;

/*
Create a project in IntelliJ called BookApplication.

Create a Models.Book class that allows for Models.Book title, author,
description, price and isInStock variables

The Models.Book class shall contain private member variables,
a default constructor, an overloaded constructor and a method
called getDisplayText() which prints the author, title and description.

The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method.
In the main method you shall create an instance of a Models.Book and print the Author,
Title and Description.
 */

 public class Book {


     private String title;
     private String author;
     private String description;
     private double price;
     private int    pNumber,units;
    // private boolean isInStock;


   /* Book(String title,
         String author,
         String description,
         double price, boolean isInStock){
         this.title = title;
         this.author= author;
         this.price = price;
         this.isInStock = isInStock;
    */

     // default constructor

     public Book() {

     }
     //overload constructor

     public Book(String title,
                  String author,
                  String description,
                  double price ,
                  int pNumber,
                  int units
                  /*boolean isInStock*/) {
         this.title = title;
         this.author = author;
         this.description = description;
         this.price = price;
         this.pNumber = pNumber;
         this.units=units;
        // this.isInStock = isInStock;

     }


     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;

     }

     public int getUnits(){
         return units;
     }
     public void setUnits(int units){
         this.units=units;
     }

     public int getpNumber(){
         return pNumber;
     }
     public void setpNumber(int pNumber){
         this.pNumber=pNumber;
     }

/*
     public boolean getisInStock() {
         return isInStock;
     }

     public void setisInStock(boolean isInStock) {
         this.isInStock = isInStock;
     }
*/
     public double calculateToalPrice(){
         return (units*price);
     }
    /* //calculate All Items total Price
     public double CalAllItemstotalP(){
         return(totalPrice);
     }*/

     public void getDisplayText() {
         System.out.println("Author: " + this.author + " , Title: " + this.title
                            + " , Description: " + this.description + " , Price: " +this.price
                            + " , Unit : " + this.units + ", Product Number" +this.pNumber
                            /*+ " , Instock."+ this.isInStock*/ );

     }
 }







