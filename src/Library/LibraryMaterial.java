/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;

/**
 * This class is the Super class of the project.
 * 
 * @author
 * Class: CSCI 2001-51
 * Due Date: 04/30/14
 * 
 * Version: 1.00
 * 
 */


public abstract class LibraryMaterial {
    
    /** Concept #1 Encapsulation/Data hiding */
    //declare field variables as private
    private String author, title;
    private double price;
    private int pubYear;
    
    
    /** Concept #2 Default constructor */
    //no argument constructor (default)
    public LibraryMaterial(){
        this(null,null,0,0); //initialize each instance variable to their default value (either null or zero).
    }
    
    //constructor to initialize author, title, price and published year
    public LibraryMaterial(String a, String t, double p, int y){
        
        //initialize variables
        author = a;
        title = t;
        setPrice(p); //validate and store price
        pubYear = y;
    }
    
    //set author
    public void setAuthor(String a){
        author = a;
    }
    
    //set title
    public void setTitle(String t){
        title = t;
    }
    
    //validate and set price
    public void setPrice(double p){
        if(p >= 0.0){ //validate if price is positive
            price = p;
        }
        else
            throw new IllegalArgumentException("Price must be >= 0.0"); //throws exception if price is negative
    }
    
    //set published year
    public void setPubYear(int y){
        pubYear = y;
    }
    
    //get author
    public String getAuthor(){
        return author;
    }
    
    //get title
    public String getTitle(){
        return title;
    }
    
    //get price
    public double getPrice(){
        return price;
    }
    
    //get published year
    public int getPubYear(){
        return pubYear;
    }
    
    /** Concept #6 Method Overriding */
    //convert LibraryMaterial to String format
    @Override //this method overrides a superclass method (Object method toString)
    public String toString(){
        return String.format("Author: %s\nTitle: %s\nPrice: $%.2f\nPublication Year: %d\n", getAuthor(), getTitle(), getPrice(), getPubYear());
    }
}
