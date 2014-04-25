/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;


//import classes
import java.io.*;
import javax.sound.sampled.*;
import java.net.URL;
import javax.swing.ImageIcon;


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
    //private final int x = 14;
    //private BufferedImage[] coverImage = new BufferedImage[x]; 
    private ImageIcon coverImage;
    private URL soundClip;
    private Clip clip;
    
    //create sound files
    
    private final URL FROZENCLIP = this.getClass().getResource("Sound/Let it Go - Frozen.wav");
    private final URL MONSTERClIP = this.getClass().getResource("Sound/MonstersUniversity.wav");
    private final URL TOYCLIP = this.getClass().getResource("Sound/Friend in Me.wav");
    private final URL BEATLESCLIP = this.getClass().getResource("Sound/Beatles.wav");
    private final URL BOBCLIP = this.getClass().getResource("Sound/Bob.wav");
    private final URL SADECLIP = this.getClass().getResource("Sound/SadeClip.wav");
    private final URL CHARLIECLIP = this.getClass().getResource("Sound/charlie.wav");
    private final URL EARTHCLIP = this.getClass().getResource("Sound/earthwind.wav");
    private final URL RICKCLIP = this.getClass().getResource("Sound/rickAstley.wav");
    private final URL BLANK = this.getClass().getResource("Sound/Blank.wav");
    
    //create soundClip array
    final URL[] SOUND = {FROZENCLIP, MONSTERClIP, TOYCLIP, BEATLESCLIP, BOBCLIP, SADECLIP, CHARLIECLIP, EARTHCLIP, RICKCLIP, BLANK};
    
    //create book image files
    private final ImageIcon TEXASIMG = new ImageIcon(getClass().getResource("images/TexasHomeownersAssociationLaw2.jpg"));
    private final ImageIcon MOTIVATIONIMG = new ImageIcon(getClass().getResource("images/MotivationalInterviewing2.jpg"));
    private final ImageIcon PSIONICIMG = new ImageIcon(getClass().getResource("images/PsionicPower2.jpg"));
    private final ImageIcon GAMEIMG = new ImageIcon(getClass().getResource("images/AGameOfThrones2.jpg"));
    private final ImageIcon DIVERGENTIMG = new ImageIcon(getClass().getResource("images/Divergent2.jpg"));
    private final ImageIcon FAULTIMG = new ImageIcon(getClass().getResource("images/TheFaultInOurStars2.jpg"));
    
    //create audio image files
    private final ImageIcon BEATLESIMG = new ImageIcon(getClass().getResource("images/beatlesImg2.jpg"));
    private final ImageIcon BOBIMG = new ImageIcon(getClass().getResource("images/marleyImg2.jpg"));
    private final ImageIcon SADEIMG = new ImageIcon(getClass().getResource("images/sadeImg2.jpg"));
    private final ImageIcon CHARLIEIMG = new ImageIcon(getClass().getResource("images/charlieImg2.jpg"));
    private final ImageIcon EARTHIMG = new ImageIcon(getClass().getResource("images/earthImg2.jpg"));
    private final ImageIcon RICKIMG = new ImageIcon(getClass().getResource("images/rickAstleyImg2.jpg"));
    
    //create video image files
    private final ImageIcon FROZENIMG = new ImageIcon(getClass().getResource("images/frozenImg2.jpg"));
    private final ImageIcon MONSTERIMG = new ImageIcon(getClass().getResource("images/monsterImg.jpg"));
    private final ImageIcon TOYIMG = new ImageIcon(getClass().getResource("images/toyStoryImg.jpg"));
    
    //create default image file
    private final ImageIcon WELCOME = new ImageIcon(getClass().getResource("images/welcomeLibrary.jpg"));
    
    //create images array
    final ImageIcon[] IMAGES = {TEXASIMG, MOTIVATIONIMG, PSIONICIMG, GAMEIMG, DIVERGENTIMG, FAULTIMG, BEATLESIMG, BOBIMG, SADEIMG, CHARLIEIMG, 
        EARTHIMG, RICKIMG, FROZENIMG, MONSTERIMG, TOYIMG, WELCOME};
    
    
    /** Concept #2 Default Constructor */
    // no arg constructor acts as a default
    public AudioVisualMaterial(){
        this("Select an Artist", "Select a Movie",0,0, "Unknown", null, null); 
        soundClip = SOUND[9];
    }
           
        
     /** Concept #7 Method overloading
     * @param author
     * @param audioType
     * @param price
     * @param pubYear
     * @param title
     * @param coverImage
     * @param soundClip 
     *  constructor to initialize all field variables (including super class's field variables)
     */
    
     public AudioVisualMaterial(String author, String title, double price, int pubYear, String audioType, ImageIcon coverImage, URL soundClip) {
     
     /** Concept #5 super reference */
     super(author, title, price, pubYear); //pass to LibraryMaterial constructor
     //Initialize variables
     this.audioType = audioType;
     this.coverImage = coverImage;
     this.soundClip = soundClip;
    }

    
     

    /**
     * get AudioType
     * @return
     */
        public String getAudioType() {
        return audioType;
    }

    

    /**
     * set AudioType
     * @param audioType
     */
        public void setAudioType(String audioType) {
        this.audioType = audioType;
    }
    
   

    /**
     * get coverImage
     * @return
     */
         public ImageIcon getCoverImage() {
        return coverImage;
    }
    
 

    /**
     * set coverImage
     * @param coverImage
     */
        public void setCoverImage(ImageIcon coverImage) {
        this.coverImage = coverImage;
    }
    
    

    /**
     * get soundClip
     * @return
     */
        public URL getSoundClip() {
        return soundClip;
    }
    
 

    /** 
     *  set soundClip
     * @param soundClip
     */
        public void setSoundClip(URL soundClip) {
        this.soundClip = soundClip;
    }

    /**
     * Method to setup sound clip
     */
    public void setupSoundClip(){
        if(clip != null && clip.isRunning()){
            System.out.println("Stopping audio");
            clip.stop();
            clip.close();
        }
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(soundClip); //open an audio input stream
            clip = AudioSystem.getClip(); //get a sound clip resource
            clip.open(audio); //open audio clip and load samples from the audio input stream
        }catch(  UnsupportedAudioFileException | IOException | LineUnavailableException uae){
            System.out.println(uae);
        }          
    }
        
    /**
     * Method to play sound clip
     */
    public void playSoundClip(){
        if(clip != null && clip.isRunning()){
            System.out.println("Stopping audio");
            clip.stop();
            clip.close();
        }
        clip.setFramePosition(0);
        clip.start();
    }
    
    /**
     * Method to stop sound clip
     */
    public void stopSoundClip(){
        if(clip != null && clip.isRunning()){
            System.out.println("Stopping audio");
            clip.stop();
            clip.close();
        }
    }
    
   
    /** Concept #6 Method Overriding
     * @return  
     * overrides abstract method displayInfo in LibraryMaterial
     */
   
    @Override
    public String displayInfo(){
        return String.format("%s\nAudioType: %s\n", super.toString(), getAudioType());
    }
}
