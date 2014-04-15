/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;


//import classes


/**
 * This class is a sub-class of LibraryMaterial. It develops a books attributes.
 * 
 * @author Mike Plucker
 * Class: CSCI 2001-51
 * Due Date: 04/30/14
 * 
 * Version: 1.00
 * 
 */


/** Concept #3 Inheritance */
//Book class extends LibraryMaterial
public class Book extends LibraryMaterial {
    
    /** Concept #1 Encapsulation/Data hiding */
    //declare field variables as private
    private String bookType; //(hardcover/paperback/large)
    private String printEdition; //(1rst/2nd/3rd/4th...)
    private int pageNumber;
    
    
    /** Concept #2 Default constructor */
    /** Concept #7 Method overloading */
    //no argument constructor (acts as default constructor)
    public Book(){
        this(null,null,0,0,null,null,0); //initialize all field variables to their default value (either null or zero).
    }
    
    /** Concept #7 Method overloading */
    //constructor to initialize all field variables (including super class's field variables)
    public Book(String author, String title, double price, int pubYear, String bookType, String printEdition, int pageNumber){
        
        /** Concept #5 super reference */
        //initialize variables
        super(author, title, price, pubYear); //pass to LibraryMaterial constructor
        this.bookType = bookType;
        this.printEdition = printEdition.toLowerCase();
        setPageNumber(pageNumber); //validate and store pageNumber
    }
    
    /** Concept #7 Method overloading */
    //constructor to initialize firstEdition only (including super class's field variables)
    public Book(String author, String title, double price, int pubYear, String printEdition){
        
        /** Concept #5 super reference */
        //initialize variables
        super(author, title, price, pubYear); //pass to LibraryMaterial constructor
        
        //if book is a first edition
        if(printEdition.equalsIgnoreCase("1rst")){
            this.printEdition = printEdition.toLowerCase(); //initialize printEdition to first edition
        }
        else{
            this.printEdition = null; //otherwise printEdition is set to default (zero)
        }
    }
    
    //set bookType
    public void setBookType(String bookType){
        this.bookType = bookType;
    }
    
    //set printEdition
    public void setPrintEdition(String printEdition){
            this.printEdition = printEdition;
    }
    
    //validate and set pageNumber
    public void setPageNumber(int pageNumber){
        if(pageNumber >= 0){ //validate if pageNumber is positive
            this.pageNumber = pageNumber;
        }
        else
            throw new IllegalArgumentException("Page Number must be >= 0"); //throws exception if pageNumber is negative
    }
    
    //get bookType
     public String getBookType(){
        return bookType;
    }
    
     //get printEdition
    public String getPrintEdition(){
        return printEdition;
    }
    
    //get pageNumber
    public int getPageNumber(){
        return pageNumber;
    }
    
    /** Concept #5 super reference */
    /** Concept #6 Method Overriding */
    //method to display information about a book
    @Override //overrides abstract method displayInfo in LibraryMaterial
    public String displayInfo(){
        return String.format("%s\nBook Type: %s\nEdition: %s\nNumber of Pages: %d\n", super.toString(), getBookType(), getPrintEdition(), getPageNumber());
    }
    
//    /** Concept #5 super reference */
//    /** Concept #6 Method Overriding */
//    //convert Book to String format
//    @Override //this method overrides a superclass method (LibraryMaterial method toString)
//    public String toString(){
//        return String.format("%s\nBook Type: %s\nEdition: %s\nNumber of Pages: %d\n", super.toString(), getBookType(), getPrintEdition(), getPageNumber());
//    }
}
