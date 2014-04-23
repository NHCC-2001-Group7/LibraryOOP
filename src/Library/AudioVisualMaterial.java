/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;


//import classes
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

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

    /** Concept #1 Encapsulation/Data Hiding*/
    //Declare field variables as private
    private String audioType;
    private final int x = 2;
    private BufferedImage[] coverImage = new BufferedImage[x]; 
    private File soundClip;
    
   
    
    /** Concept #2 Default Constructor */
    // no arg constructor acts as a default
    public AudioVisualMaterial(){
        this("Unknown", "Untitled",0,0, "Untitled", null, null); 
    }
           
        
     /** Concept #7 Method overloading */
     //constructor to initialize all field variables (including super class's field variables)
     public AudioVisualMaterial(String author, String title, double price, int pubYear, String audioType, BufferedImage[] coverImage, File soundClip) {
     
     /** Concept #5 super reference */
     super(author, title, price, pubYear); //pass to LibraryMaterial constructor
     //Initialize variables
     this.audioType = audioType;
    }

    
     //get AudioType
    public String getAudioType() {
        return audioType;
    }

    //set AudioType
    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }
      
     public BufferedImage[] getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(BufferedImage[] coverImage) {
        this.coverImage = coverImage;
    }

    public File getSoundClip() {
        return soundClip;
    }

    public void setSoundClip(File soundClip) {
        this.soundClip = soundClip;
    }
 
  
    //validate and set display cover
    public void setDisplayCover(BufferedImage[] coverImage){

        try {
            coverImage[0] = ImageIO.read(new File("image/monster.jpg"));
            coverImage[1] = ImageIO.read(new File("image/beatles.jpg"));
            coverImage[2] = ImageIO.read(new File("image/beatles.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(AudioVisualMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
 
   }
    
        public void playSoundClip(File soundClip){
         
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(soundClip); //open an audio input stream
            Clip clip = AudioSystem.getClip(); //get a sound clip resource
            clip.open(audio); //open audio clip and load samples from the audio input stream
            clip.start(); //plays sound clip
        } catch(  UnsupportedAudioFileException | IOException | LineUnavailableException uae){
            System.out.println(uae);
          }       
       
        }
        
//        //stop music when applet closes
//	public void stopMusic(){
//		if(oops != null) //checks if sound is still playing, if it is...
//			oops.stop(); //stop sound
//	}
    
    /** Concept #5 super reference */
    /** Concept #6 Method Overriding */
    //overrides abstract method displayInfo in LibraryMaterial
    @Override
    public String displayInfo(){
        return String.format("%s\nAudioType: %s\n", super.toString(), getAudioType());
    }
}
