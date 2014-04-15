/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;


//import classes


/**
 * This class is a sub-class of LibraryMaterial.
 * 
 * @author 
 * Class: CSCI 2001-51
 * Due Date: 04/30/14
 * 
 * Version: 1.00
 * 
 */


/** Concept #3 Inheritance */
//AudioVisualMaterial class extends LibraryMaterial
public class AudioVisualMaterial extends LibraryMaterial {
    
    /** Concept #5 super reference */
    /** Concept #6 Method Overriding */
    //overrides abstract method displayInfo in LibraryMaterial
    @Override
    public String displayInfo(){
        return String.format("%s\n", super.toString());
    }
    
}
