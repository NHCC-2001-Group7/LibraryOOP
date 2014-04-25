/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;


//import classes
import javax.swing.ImageIcon;


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
    private int printEdition; //(1rst/2nd/3rd/4th...)
    private int pageNumber;
    private ImageIcon coverImage;
    
    
    /** Concept #2 Default constructor */
    /** Concept #7 Method overloading */
    //no argument constructor (acts as default constructor)
    public Book(){
        this("Unknown", "Select a Book", 0, 0, "Unknown", 0, 0, null); //initialize all field variables to their default value (either null or zero).
    }
    
    /** Concept #7 Method overloading
     * @param author
     * @param title
     * @param bookType
     * @param pubYear
     * @param price
     * @param printEdition
     * @param coverImage
     * @param pageNumber  
     * constructor to initialize all field variables (including super class's field variables)
     */
    
    public Book(String author, String title, double price, int pubYear, String bookType, int printEdition, int pageNumber, ImageIcon coverImage){
        
        /** Concept #5 super reference */
        //initialize variables
        super(author, title, price, pubYear); //pass to LibraryMaterial constructor
        this.bookType = bookType;
        setPrintEdition(printEdition); //validate and store printEdition
        setPageNumber(pageNumber); //validate and store pageNumber
        this.coverImage = coverImage;
    }
    
    /** Concept #7 Method overloading
     * @param author
     * @param title
     * @param pubYear
     * @param price
     * @param printEdition
     * @param coverImage
     * constructor to initialize firstEdition only (including super class's field variables)
     */
    
    public Book(String author, String title, double price, int pubYear, int printEdition, ImageIcon coverImage){
        
        /** Concept #5 super reference */
        //initialize variables
        super(author, title, price, pubYear); //pass to LibraryMaterial constructor
        
        if(printEdition == 1){ //only initialize if book is a first edition
            this.printEdition = printEdition;
            this.coverImage = coverImage;
        }
    }
    
  

    /**
     * set bookType
     * @param bookType
     */
        public void setBookType(String bookType){
        this.bookType = bookType; //validate?
    }
    
   

    /**
     * validate and set printEdition
     * @param printEdition
     */
        public void setPrintEdition(int printEdition){
        if(printEdition >= 0){ //validate if printEdition is positive
            this.printEdition = printEdition;
        }
        else
            throw new IllegalArgumentException("Print Edtion must be > 0"); //throws exception if printEdition is negative
    }
    
  

    /**
     * validate and set pageNumber
     * @param pageNumber
     */
        public void setPageNumber(int pageNumber){
        if(pageNumber >= 0){ //validate if pageNumber is positive
            this.pageNumber = pageNumber;
        }
        else
            throw new IllegalArgumentException("Page Number must be > 0"); //throws exception if pageNumber is negative
    }
    
    

    /**
     * set coverImage
     * @param coverImage
     */
        public void setCoverImage(ImageIcon coverImage) {
        this.coverImage = coverImage;
    }
    
  
    /**
     * get bookType
     * @return
     */
         public String getBookType(){
        return bookType;
    }
    
     

    /**
     * get printEdition
     * @return
     */
        public int getPrintEdition(){
        return printEdition;
    }
    
  

    /**
     * get pageNumber
     * @return
     */
        public int getPageNumber(){
        return pageNumber;
    }
    
   

    /**
     * get coverImage
     * @return
     */
        public ImageIcon getCoverImage() {
        return coverImage;
    }
    
  

    /**
     * method to find appropriate ordinal suffix and include it at the end of the printEdition number
     * @param suffix
     * @return
     */
        public String getOrdinalSuffix(int suffix){
        if(suffix == 0){
            return ""; //if printEdition is zero, don't add suffix
        }
        int hundredRemainder = suffix % 100; //declare local variable...find 2 digit remainder
        if(hundredRemainder >= 10 && hundredRemainder <= 20){
            return "th"; //any number in the "teens"...11th, 15th, 112th...etc.
        }
        int tenRemainder = suffix % 10; //declare local variable...find 1 digit remainder
        switch(tenRemainder){
            case 1:
                return "rst"; //for all non teen numbers ending in 1...1rst, 21rst, 151rst...etc.
            case 2:
                return "nd"; //for all non teen numbers ending in 2...2nd, 22nd, 152nd...etc.
            case 3:
                return "rd"; //for all non teen numbers ending in 3...3rd, 23rd, 153rd...etc.
            default:
                return "th"; //all other numbers...4th, 128th, 156th...etc.
        }
    }
    
    
    /** Concept #6 Method Overriding
     * @return 
     * overrides abstract method displayInfo in LibraryMaterial
     * method to display information about a book
     */
  
    @Override 
    public String displayInfo(){
        return String.format("%s\nBook Type: %s\nEdition: %d%s\nNumber of Pages: %d\n", super.toString(), getBookType(), getPrintEdition(), 
                getOrdinalSuffix(getPrintEdition()), getPageNumber());
    }
}
