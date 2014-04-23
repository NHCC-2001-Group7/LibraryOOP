/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;


//import classes
//import java.awt.*;
import java.io.*;
import javax.sound.sampled.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import javax.swing.*;

/**
 * This class is a sub-class of LibraryMaterial.
 * 
 * @author Xavier Porter
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
    private final int x = 14;
    //private BufferedImage[] coverImage = new BufferedImage[x]; 
    private ImageIcon coverImage;
    private URL soundClip;
    private Clip clip;
    
    //create sound files
    private final URL FROZENCLIP = this.getClass().getResource("Sound/Let it Go - Frozen.wav");
    private final URL MONSTERClIP = this.getClass().getResource("Sound/Monster.wav");
    private final URL TOYCLIP = this.getClass().getResource("Sound/toystory.wav");
    private final URL BEATLESCLIP = this.getClass().getResource("Sound/Beatles.wav");
    private final URL BOBCLIP = this.getClass().getResource("Sound/Bob.wav");
    private final URL SADECLIP = this.getClass().getResource("Sound/SadeClip.wav");
    private final URL CHARLIECLIP = this.getClass().getResource("Sound/charlie.wav");
    private final URL EARTHCLIP = this.getClass().getResource("Sound/earthwind.wav");
    private final URL RICKCLIP = this.getClass().getResource("Sound/rickAstley.wav");
    
    //create soundClip array
    final URL[] SOUND = {FROZENCLIP, MONSTERClIP, TOYCLIP, BEATLESCLIP, BOBCLIP, SADECLIP, CHARLIECLIP, EARTHCLIP, RICKCLIP};
    
//    //create book image files
//    private final ImageIcon TEXASIMG = new ImageIcon(getClass().getResource("images/TexasHomeownersAssociationLaw.jpg"));
//    private final ImageIcon MOTIVATIONIMG = new ImageIcon(getClass().getResource("images/MotivationalInterviweing.jpg"));
//    private final ImageIcon PSIONICIMG = new ImageIcon(getClass().getResource("images/PsionicPower.jpg"));
//    private final ImageIcon GAMEIMG = new ImageIcon(getClass().getResource("images/AGameOfThrones.jpg"));
//    private final ImageIcon DIVERGENTIMG = new ImageIcon(getClass().getResource("images/Divergent.jpg"));
//    private final ImageIcon FAULTIMG = new ImageIcon(getClass().getResource("images/TheFaultInOurStars.jpg"));
//    
//    //create audio image files
//    private final ImageIcon BEATLESIMG = new ImageIcon(getClass().getResource("images/beatlesImg.jpg"));
//    private final ImageIcon BOBIMG = new ImageIcon(getClass().getResource("images/marleyImg.jpg"));
//    private final ImageIcon SADEIMG = new ImageIcon(getClass().getResource("images/sadeImg.jpg"));
//    private final ImageIcon CHARLIEIMG = new ImageIcon(getClass().getResource("images/charlieImg.jpg"));
//    private final ImageIcon EARTHIMG = new ImageIcon(getClass().getResource("images/earthImg.jpg"));
//    private final ImageIcon RICKIMG = new ImageIcon(getClass().getResource("images/rickAstleyImg.jpg"));
//    
//    //create video image files
//    private final ImageIcon FROZENIMG = new ImageIcon(getClass().getResource("images/frozen.jpg"));
//    private final ImageIcon MONSTERIMG = new ImageIcon(getClass().getResource("images/monsterImg.jpg"));
//    private final ImageIcon TOYIMG = new ImageIcon(getClass().getResource("images/toyStoryImg.jpg"));
//    
//    //create images array
//    final ImageIcon[] IMAGES = {TEXASIMG, MOTIVATIONIMG, PSIONICIMG, GAMEIMG, DIVERGENTIMG, FAULTIMG, BEATLESIMG, BOBIMG, SADEIMG, CHARLIEIMG, 
//        EARTHIMG, RICKIMG, FROZENIMG, MONSTERIMG, TOYIMG};
    
    
    
    
    /** Concept #2 Default Constructor */
    // no arg constructor acts as a default
    public AudioVisualMaterial(){
        this("Unknown", "Untitled",0,0, "Untitled", null, null); 
    }
           
        
     /** Concept #7 Method overloading */
     //constructor to initialize all field variables (including super class's field variables)
     public AudioVisualMaterial(String author, String title, double price, int pubYear, String audioType, ImageIcon coverImage, URL soundClip) {
     
     /** Concept #5 super reference */
     super(author, title, price, pubYear); //pass to LibraryMaterial constructor
     //Initialize variables
     this.audioType = audioType;
     this.soundClip = soundClip;
     //this.coverImage = coverImage;
    }

    
     //get AudioType
    public String getAudioType() {
        return audioType;
    }

    //set AudioType
    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }
      
//     public BufferedImage[] getCoverImage() {
//        return coverImage;
//    }
//
//    public void setCoverImage(BufferedImage[] coverImage) {
//        this.coverImage = coverImage;
//    }

    public URL getSoundClip() {
        return soundClip;
    }

    public void setSoundClip(URL soundClip) {
        this.soundClip = soundClip;
    }
 
  
    //validate and set display cover
    public void displayCover(BufferedImage[] coverImage){

        try {
            coverImage[0] = ImageIO.read(new File("image/monster.jpg"));
            coverImage[1] = ImageIO.read(new File("image/beatles.jpg"));
            coverImage[2] = ImageIO.read(new File("image/beatles.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(AudioVisualMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    public void playSoundClip(){
    try{
        AudioInputStream audio = AudioSystem.getAudioInputStream(soundClip); //open an audio input stream
        clip = AudioSystem.getClip(); //get a sound clip resource
        clip.open(audio); //open audio clip and load samples from the audio input stream
        clip.start(); //plays sound clip
    }catch(  UnsupportedAudioFileException | IOException | LineUnavailableException uae){
            System.out.println(uae);
    }          
    }
        
    //stop soundClip
    public void stopSoundClip(){
//        if(clip != null){ //checks if sound is still playing, if it is...
//            clip.stop(); //stop sound
//        }
        clip.stop();
    }
    
    /** Concept #5 super reference */
    /** Concept #6 Method Overriding */
    //overrides abstract method displayInfo in LibraryMaterial
    @Override
    public String displayInfo(){
        return String.format("%s\nAudioType: %s\n", super.toString(), getAudioType());
    }
}
