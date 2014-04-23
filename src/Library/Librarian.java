/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;


//import classes


/**
 * This class generates the main GUI for the program as well as runs the program.
 * 
 * @author Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 04/30/14
 * 
 * Version: 1.00
 * 
 */


public class Librarian extends javax.swing.JFrame {
    
    private AudioVisualMaterial AV = new AudioVisualMaterial();
    
    //create subclass objects
    //create book objects
    Book TexasHomeownersAssociationLaw = new Book("Gregory S. Cagle", "Texas Homeowners Association Law", 37.74, 2013, "Paperback", 2, 822);
    Book MotivationalInterviewing = new Book("William R. Miller and Stephen Rollnick", "Motivational Interviewing", 51.00, 2012, "Hardcover", 3, 482);
    Book PsionicPower = new Book("Mike Mearls", "Psionic Power", 20.79, 2010, "Hardcover", 4, 160);
    Book GameOfThrones = new Book("George R.R. Martin", "A Game of Thrones", 19.77, 1996, "Hardcover", 1, 704);
    Book Divergent = new Book("Veronica Roth", "Divergent", 10.18, 2011, "Hardcover", 1, 496);
    Book FaultInOurStars = new Book("John Green", "The Fault in our Stars", 10.00, 2012, "Hardcover", 1, 318);
    
    //create audio objects
    AudioVisualMaterial TheBeatles = new AudioVisualMaterial("The Beatles", "On Air - Live At The BBC Volume 2 ", 15.07, 2013, "CD", AV.IMAGES[6], AV.SOUND[0]);
    AudioVisualMaterial Marley = new AudioVisualMaterial("Bob Marley", "Legend: The Best Of Bob Marley And The Wailers", 11.45, 2002, "CD", AV.IMAGES[7], AV.SOUND[0]);
    AudioVisualMaterial Sade = new AudioVisualMaterial("Sade", "The Best of Sade", 9.99, 2001, "CD", AV.IMAGES[8], AV.SOUND[0]);
    AudioVisualMaterial CharlieBrown = new AudioVisualMaterial("Fantasy", "Charlie Brown Christmas", 5.99, 2000, "Audio Cassette", AV.IMAGES[9], AV.SOUND[0]);
    AudioVisualMaterial EarthWindFire = new AudioVisualMaterial("Earth Wind and Fire", "Earth Wind and Fire: Greatest Hits", 10.00, 1998, "Audio Cassette", AV.IMAGES[10], AV.SOUND[0]);
    AudioVisualMaterial Rick = new AudioVisualMaterial("Rick Astley", "Whenever You Need Somebody", 7.95, 1990, "Audio Cassette", AV.IMAGES[11], AV.SOUND[0]);
    
    //create video objects
    AudioVisualMaterial Frozen = new AudioVisualMaterial("Walt Disney Studios Home Entertainment", "Frozen", 26.96, 2013, "DVD", AV.IMAGES[12], AV.SOUND[0]);
    AudioVisualMaterial MonstersUniversity = new AudioVisualMaterial("Walt Disney Studios Home Entertainment","Monster's University", 15.96, 2013, "DVD", AV.IMAGES[13], AV.SOUND[0]);
    AudioVisualMaterial ToyStory = new AudioVisualMaterial("Disney Pixar", "Toy Story 3", 18.27, 2010, "DVD", AV.IMAGES[14], AV.SOUND[0]); 
    
    
    //create object arrays
    LibraryMaterial[] materials = {TexasHomeownersAssociationLaw, MotivationalInterviewing, PsionicPower, GameOfThrones, Divergent, FaultInOurStars, 
        Frozen, MonstersUniversity, ToyStory, TheBeatles, Marley, Sade, CharlieBrown, EarthWindFire, Rick}; //array of all library materials
    Book[] books = {TexasHomeownersAssociationLaw, MotivationalInterviewing, PsionicPower, GameOfThrones, Divergent, FaultInOurStars}; //array of books
    AudioVisualMaterial[] audio = {TheBeatles, Marley, Sade, CharlieBrown, EarthWindFire, Rick}; //array of audio materials
    AudioVisualMaterial[] video = {Frozen, MonstersUniversity, ToyStory}; //array of video materials
    
    
    /**
     * Creates new form Librarian
     */
    public Librarian() {
        initComponents();
        
//        //testing with println command
//        for(LibraryMaterial currentMaterial : materials){
//            System.out.println(currentMaterial.displayInfo()); //displays info for each library material
//        }
//        
//        for(Book currentBook : books){
//            System.out.println(currentBook.displayInfo()); //displays info for each book
//        }
//        
//       for(AudioVisualMaterial currentAudio : audio){
//            System.out.println(currentAudio.displayInfo()); //displays info for each audiovisual material
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        homeTab = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        libraryName = new javax.swing.JLabel();
        libraryInfo = new javax.swing.JLabel();
        homeBackground = new javax.swing.JLabel();
        bookTab = new javax.swing.JPanel();
        bookPanel = new javax.swing.JPanel();
        bookCB = new javax.swing.JComboBox();
        bookImage = new javax.swing.JLabel();
        bookInfo = new javax.swing.JScrollPane();
        bookText = new javax.swing.JTextArea();
        bookBackgound = new javax.swing.JLabel();
        audioTab = new javax.swing.JPanel();
        audioPanel = new javax.swing.JPanel();
        audioCB = new javax.swing.JComboBox();
        audioImage = new javax.swing.JLabel();
        audioInfo = new javax.swing.JScrollPane();
        audioText = new javax.swing.JTextArea();
        audioBackground = new javax.swing.JLabel();
        videoTab = new javax.swing.JPanel();
        videoPanel = new javax.swing.JPanel();
        videoCB = new javax.swing.JComboBox();
        videoImage = new javax.swing.JLabel();
        videoInfo = new javax.swing.JScrollPane();
        videoText = new javax.swing.JTextArea();
        videoBackground = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        topBookBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library OOM");
        setMinimumSize(new java.awt.Dimension(1080, 730));
        getContentPane().setLayout(null);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N

        homeTab.setLayout(null);

        homePanel.setLayout(null);

        libraryName.setFont(new java.awt.Font("Serif", 1, 56)); // NOI18N
        libraryName.setForeground(new java.awt.Color(102, 255, 102));
        libraryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libraryName.setText("Library");
        homePanel.add(libraryName);
        libraryName.setBounds(350, 40, 310, 70);

        libraryInfo.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        libraryInfo.setForeground(new java.awt.Color(255, 255, 153));
        libraryInfo.setText("Information About Library");
        homePanel.add(libraryInfo);
        libraryInfo.setBounds(240, 150, 630, 320);

        homeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Images/BookshelfHome.jpg"))); // NOI18N
        homeBackground.setText("jLabel1");
        homePanel.add(homeBackground);
        homeBackground.setBounds(-4, 2, 1094, 666);

        homeTab.add(homePanel);
        homePanel.setBounds(2, -2, 1084, 644);

        jTabbedPane1.addTab("   Home   ", homeTab);

        bookTab.setLayout(null);

        bookPanel.setLayout(null);

        bookCB.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bookCB.setMaximumRowCount(7);
        bookCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select a Book", "Texas Homeowners Association Law", "Motivational Interviewing", "Psionic Power", "A Game of Thrones", "Divergent", "The Fault in our Stars" }));
        bookCB.setToolTipText("");
        bookCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bookCBItemStateChanged(evt);
            }
        });
        bookPanel.add(bookCB);
        bookCB.setBounds(30, 260, 260, 40);

        bookImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/images/welcomeLibrary.jpg"))); // NOI18N
        bookPanel.add(bookImage);
        bookImage.setBounds(350, 30, 330, 490);

        bookText.setColumns(20);
        bookText.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bookText.setRows(5);
        bookInfo.setViewportView(bookText);

        bookPanel.add(bookInfo);
        bookInfo.setBounds(720, 200, 320, 170);

        bookBackgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Images/Bookshelf1.jpg"))); // NOI18N
        bookPanel.add(bookBackgound);
        bookBackgound.setBounds(0, -2, 1092, 688);

        bookTab.add(bookPanel);
        bookPanel.setBounds(2, 2, 1088, 678);

        jTabbedPane1.addTab("   Books   ", bookTab);

        audioTab.setLayout(null);

        audioPanel.setLayout(null);

        audioCB.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        audioCB.setMaximumRowCount(7);
        audioCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select an Artist", "The Beatles", "Bob Marley", "Sade", "Fantasy", "Earth Wind and Fire", "Rick Astley" }));
        audioCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                audioCBItemStateChanged(evt);
            }
        });
        audioPanel.add(audioCB);
        audioCB.setBounds(40, 260, 190, 40);

        audioImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/images/welcomeLibrary.jpg"))); // NOI18N
        audioPanel.add(audioImage);
        audioImage.setBounds(260, 50, 420, 490);

        audioText.setColumns(20);
        audioText.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        audioText.setRows(5);
        audioInfo.setViewportView(audioText);

        audioPanel.add(audioInfo);
        audioInfo.setBounds(690, 220, 380, 140);

        audioBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Images/Bookshelf2.jpg"))); // NOI18N
        audioPanel.add(audioBackground);
        audioBackground.setBounds(2, 0, 1092, 668);

        audioTab.add(audioPanel);
        audioPanel.setBounds(0, 0, 1094, 658);

        jTabbedPane1.addTab("    Audio    ", audioTab);

        videoTab.setLayout(null);

        videoPanel.setLayout(null);

        videoCB.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        videoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select a Movie", "Frozen", "Monster's University", "Toy Story 3" }));
        videoCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                videoCBItemStateChanged(evt);
            }
        });
        videoPanel.add(videoCB);
        videoCB.setBounds(70, 270, 170, 30);

        videoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/images/welcomeLibrary.jpg"))); // NOI18N
        videoPanel.add(videoImage);
        videoImage.setBounds(320, 40, 360, 500);

        videoText.setColumns(20);
        videoText.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        videoText.setRows(5);
        videoInfo.setViewportView(videoText);

        videoPanel.add(videoInfo);
        videoInfo.setBounds(700, 210, 350, 140);

        videoBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Images/Bookshelf3.jpg"))); // NOI18N
        videoPanel.add(videoBackground);
        videoBackground.setBounds(0, 0, 1088, 666);

        videoTab.add(videoPanel);
        videoPanel.setBounds(0, -2, 1092, 664);

        jTabbedPane1.addTab("   Video   ", videoTab);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(-4, 22, 1354, 692);

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Images/PlayButton.jpg"))); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton);
        playButton.setBounds(658, 8, 180, 45);

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Images/StopButton.jpg"))); // NOI18N
        stopButton.setPreferredSize(new java.awt.Dimension(180, 45));
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stopButton);
        stopButton.setBounds(858, 8, 180, 45);

        topBookBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/Images/PileOfBooks2.jpg"))); // NOI18N
        getContentPane().add(topBookBackground);
        topBookBackground.setBounds(-2, -120, 1080, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bookCBItemStateChanged
        String bookTitle = (String)bookCB.getSelectedItem(); //get user's selection and assign to variable
        
        //enhanced for loop scans through book array
        for(Book currentBook : books){
            if(currentBook.getTitle() == bookTitle){ //if comboBox selection matches book's title
                bookText.setText(currentBook.displayInfo()); //display book's info in TextArea
                //bookImage.setIcon(setDisplayCover()); //display book's image
            }
            else if(bookTitle == "Please Select a Book"){ //if no book is selected
                bookText.setText(""); //clear TextArea
                bookImage.setIcon(AV.IMAGES[15]); //set to default image
            }
        }
    }//GEN-LAST:event_bookCBItemStateChanged

    private void audioCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_audioCBItemStateChanged
        String audioArtist = (String)audioCB.getSelectedItem(); //get user's selection and assign to variable
        
        //enhanced for loop scans through audio array
        for(AudioVisualMaterial currentAudio : audio){
            if(currentAudio.getAuthor() == audioArtist){ //if comboBox selection matches audio's artist
                audioText.setText(currentAudio.displayInfo()); //display audio's info in TextArea
                audioImage.setIcon(currentAudio.getCoverImage()); //display audio's image
                currentAudio.playSoundClip(); //play audio's soundClip
            }
            else if(audioArtist == "Please Select an Artist"){ //if no audio is selected
                audioText.setText(""); //clear TextArea
                audioImage.setIcon(AV.IMAGES[15]); //set to default image
                //stop soundClip; //stop soundClip
            }
        }
    }//GEN-LAST:event_audioCBItemStateChanged

    private void videoCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_videoCBItemStateChanged
        //AV.stopSoundClip();
        String movieName = (String)videoCB.getSelectedItem(); //get user's selection and assign to variable
        
        //enhanced for loop scans through video array
        for(AudioVisualMaterial currentVideo : video){
            if(currentVideo.getTitle() == movieName){ //if comboBox selection matches video's title
                //currentVideo.stopSoundClip();
                videoText.setText(currentVideo.displayInfo()); //display video's info in TextArea
                videoImage.setIcon(currentVideo.getCoverImage()); //display video's image
                currentVideo.playSoundClip(); //play video's soundClip
            }
            else if(movieName == "Please Select a Movie"){ //if no video is selected
                videoText.setText(""); //clear TextArea
                videoImage.setIcon(AV.IMAGES[15]); //set to default image
                //AV.stopSoundClip(); //stop soundClip
            }
        }
    }//GEN-LAST:event_videoCBItemStateChanged

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        
        //AV.stopSoundClip(); //stop soundClip
        
        
    }//GEN-LAST:event_stopButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        
        
        
    }//GEN-LAST:event_playButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Librarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Librarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel audioBackground;
    private javax.swing.JComboBox audioCB;
    private javax.swing.JLabel audioImage;
    private javax.swing.JScrollPane audioInfo;
    private javax.swing.JPanel audioPanel;
    private javax.swing.JPanel audioTab;
    private javax.swing.JTextArea audioText;
    private javax.swing.JLabel bookBackgound;
    private javax.swing.JComboBox bookCB;
    private javax.swing.JLabel bookImage;
    private javax.swing.JScrollPane bookInfo;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JPanel bookTab;
    private javax.swing.JTextArea bookText;
    private javax.swing.JLabel homeBackground;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel homeTab;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel libraryInfo;
    private javax.swing.JLabel libraryName;
    private javax.swing.JButton playButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel topBookBackground;
    private javax.swing.JLabel videoBackground;
    private javax.swing.JComboBox videoCB;
    private javax.swing.JLabel videoImage;
    private javax.swing.JScrollPane videoInfo;
    private javax.swing.JPanel videoPanel;
    private javax.swing.JPanel videoTab;
    private javax.swing.JTextArea videoText;
    // End of variables declaration//GEN-END:variables
}
