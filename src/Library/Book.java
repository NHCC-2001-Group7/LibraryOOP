/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;

/**
 * This class is a sub-class of LibraryMaterial. It develops a book's attributes.
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
    private String hardcover, paperback, large;
    private int firstEdition, secondEdition, thirdEdition, fourthEdition;
    private int pageNumber;
    
    
    /** Concept #2 Default constructor */
    /** Concept #7 Method overloading */
    //no argument constructor (default)
    public Book(){
        this(null,null,0.0,0,null,null,null,0,0,0,0,0); //initialize all field variables to their default value (either null or zero).
    }
    
    /** Concept #7 Method overloading */
    //constructor to initialize all field variables (including super class's field variables)
    public Book(String a, String t, double p, int y, String hc, String pb, String lrg, int frst, int scnd, int thrd, int frth, int pn){
        
        /** Concept #5 super reference */
        //initialize variables
        super(a, t, p, y); //pass to LibraryMaterial constructor
        hardcover = hc;
        paperback = pb;
        large = lrg;
        firstEdition = frst;
        secondEdition = scnd;
        thirdEdition = thrd;
        fourthEdition = frth;
        setPageNumber(pn); //validate and store pageNumber
    }
    
    /** Concept #7 Method overloading */
    //constructor to initialize firstEdition only (including super class's field variables)
    public Book(String a, String t, double p, int y, int frst){
        
        /** Concept #5 super reference */
        //initialize variables
        super(a, t, p, y); //pass to LibraryMaterial constructor
        firstEdition = frst;
    }
    
    //set hardcover
    public void setHardcover(String hc){
        hardcover = hc;
    }
    
    //set paperback
    public void setPaperback(String pb){
        paperback = pb;
    }
    
    //set large
    public void setLarge(String lrg){
        large = lrg;
    }
    
    //set firstEdition
    public void setFirstEdition(int frst){
        firstEdition = frst;
    }
    
    //set secondEdition
    public void setSecondEdition(int scnd){
        secondEdition = scnd;
    }
    
    //set thirdEdition
    public void setThirdEdition(int thrd){
        thirdEdition = thrd;
    }
    
    //set fourthEdition
    public void setFourthEdition(int frth){
        fourthEdition = frth;
    }
    
    //validate and set pageNumber
    public void setPageNumber(int pn){
        if(pn >= 0){ //validate if pageNumber is positive
            pageNumber = pn;
        }
        else
            throw new IllegalArgumentException("Page Number must be >= 0"); //throws exception if pageNumber is negative
    }
    
    //get hardcover
    public String getHardcover(){
        return hardcover;
    }
    
    //get paperback
    public String getPaperback(){
        return paperback;
    }
    
    //get large
    public String getLarge(){
        return large;
    }
    
    //get firstEdition
    public int getFirstEdition(){
        return firstEdition;
    }
    
    //get secondEdition
    public int getSecondEdition(){
        return secondEdition;
    }
    
    //get thirdEdition
    public int getThirdEdition(){
        return thirdEdition;
    }
    
    //get fourthEdition
    public int getFourthEdition(){
        return fourthEdition;
    }
    
    //get pageNumber
    public int getPageNumber(){
        return pageNumber;
    }
    
    /** Concept #5 super reference */
    /** Concept #6 Method Overriding */
    //convert Book to String format
    @Override //this method overrides a superclass method (LibraryMaterial method toString)
    public String toString(){
        return String.format("%s\nBook Type: %s\nEdition: %d\nNumber of Pages: %d\n", super.toString(), getHardcover(), getFirstEdition(), getPageNumber());
    }
}
