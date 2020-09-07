/*********
 final project
 Name: Sam Schoenberg, Mason Dellutri
 *********/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.util.concurrent
public class datingSim extends JPanel{

    private JPanel graphicsPanel;         // To hold components
    BufferedImage defaultBackground;
    BufferedImage coffeeBackground;
    BufferedImage deskBackground;
    BufferedImage parkBackground;
    BufferedImage Sprite;
    BufferedImage Textbox;
    BufferedImage kissingBar;
    BufferedImage choiceUnselected;
    BufferedImage choiceSelected;
    BufferedImage Selection;
    BufferedImage Empty;
    BufferedImage laptopHappy;
    BufferedImage laptopGasp;
    BufferedImage laptopSad;
    BufferedImage smartphoneHappy;
    BufferedImage smartphoneGasp;
    BufferedImage smartphoneSad;
    BufferedImage desktopHappy;
    BufferedImage desktopGasp;
    BufferedImage desktopSad;
    String textLine1;
    String textLine2;
    String textLine3;
    Boolean selection1 = false;
    Boolean selection2 = false;
    Boolean selection3 = false;
    int counter = 0;
    int location = 0;
    int laptopAffection = 50;
    int smartphoneAffection = 50;
    int desktopAffection = 50;
    int kissingLineY = 380;
    boolean kissingDirectionUp = true;
    boolean kissingMiniGame = true;
    boolean miniGameWon = false;
    // private Timer timer;
    // private final int TIME_DELAY = 0;

    datingSim() throws java.io.IOException
    {
        init();
        loadSprites();
    }

    public void loadSprites() throws IOException{
        defaultBackground = ImageIO.read(new File("defaultBackground.png"));
        coffeeBackground = ImageIO.read(new File("coffeeBackground.png"));
        deskBackground = ImageIO.read(new File("deskBackground.png"));
        parkBackground = ImageIO.read(new File("parkBackground.png"));
        Sprite = ImageIO.read(new File("smartphoneHappy.png"));
        Textbox = ImageIO.read(new File("textboxSprite.png"));
        kissingBar = ImageIO.read(new File("kissingBar.png"));
        choiceUnselected = ImageIO.read(new File("choiceUnselected.png"));
        choiceSelected = ImageIO.read(new File("choiceSelected.png"));
        Selection = ImageIO.read(new File("selection.png"));
        Empty = ImageIO.read(new File("emptySprite.png"));
        laptopHappy = ImageIO.read(new File("laptopHappy.png"));;
        laptopGasp = ImageIO.read(new File("laptopGasp.png"));;
        laptopSad = ImageIO.read(new File("laptopSad.png"));;
        smartphoneHappy = ImageIO.read(new File("smartphoneHappy.png"));;
        smartphoneGasp = ImageIO.read(new File("smartphoneGasp.png"));;
        smartphoneSad = ImageIO.read(new File("smartphoneSad.png"));;
        desktopHappy = ImageIO.read(new File("desktopHappy.png"));;
        desktopGasp = ImageIO.read(new File("desktopGasp.png"));;
        desktopSad = ImageIO.read(new File("desktopSad.png"));;
        textLine1 = "Coffee Shop";
        textLine2 = "Home";
        textLine3 = "Park";
        
    }
    
    public void init() throws java.io.IOException
    {
        // tempBackground = ImageIO.read(new File("tempBackground.png"));
        // tempSprite = ImageIO.read(new File("tempSprite.png"));
        //  textboxSprite = ImageIO.read(new File("textboxSprite.png"));
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseMotionListener());
        // timer = new Timer(TIME_DELAY, new TimerListener());
        // timer.start();
    }
    
     public void paintComponent(Graphics g)
     {
    //     if(kissingMiniGame == true)
    //     {
    //         if (miniGameWon == true)
    //         {
    //             g.drawImage(defaultBackground, 0, 0, null);
    //             g.setColor(Color.GREEN);
    //             g.fillRect(10, 10, 100, 100);
    //             g.setColor(Color.WHITE);
    //             g.drawString("you win", 20, 20);
    //         }
    //         else{
    //             g.drawImage(defaultBackground, 0, 0, null);
    //             g.setColor(Color.GREEN);
    //             g.fillRect(310, 90, 90, laptopAffection);
    //             g.setColor(Color.RED);
    //             g.fillRect(310, kissingLineY, 90, 20);
    //             g.drawImage(kissingBar, 0, 0, null);
    //         }
    //     }
        if(counter == 0){
            g.drawImage(defaultBackground, 0, 0, null);
            g.drawImage(Textbox, 0, 50, null);
            g.drawString("Where would you like to go today?", 40, 80);
            g.drawImage(choiceUnselected, 50, 350, null);
            g.drawImage(choiceUnselected, 200, 350, null);
            g.drawImage(choiceUnselected, 350, 350, null);
            g.drawString(textLine1, 65, 380);
            g.drawString(textLine2, 230, 380);
            g.drawString(textLine3, 390, 380);
        }
        
        if(counter == 1){
            if(selection1 == true) {
                location = 1;
                Sprite = laptopHappy;
                g.drawImage(coffeeBackground, 0, 0, null);
                g.drawImage(Sprite, 0, 0, null);
                g.drawImage(Textbox, 0, 50, null);
                g.drawString("This is Lappy, the laptop. It is social, talk to them!", 40, 80);
                g.drawImage(choiceUnselected, 50, 350, null);
                g.drawImage(choiceUnselected, 200, 350, null);
                g.drawImage(choiceUnselected, 350, 350, null);
                g.drawString("Hello Love", 65, 380);
                g.drawString("Sup", 230, 380);
                g.drawString("What", 390, 380);
            }
            if(selection2 == true) {
                location = 2;
                Sprite = desktopHappy;
                g.drawImage(deskBackground, 0, 0, null);
                g.drawImage(Sprite, 0, 0, null);
                g.drawImage(Textbox, 0, 50, null);
                g.drawString("This is Peecee, the desktop. It is social, talk to them!", 40, 80);
                g.drawImage(choiceUnselected, 50, 350, null);
                g.drawImage(choiceUnselected, 200, 350, null);
                g.drawImage(choiceUnselected, 350, 350, null);
                g.drawString("Hello Love", 65, 380);
                g.drawString("Sup", 230, 380);
                g.drawString("What", 390, 380);
            }
            if(selection3 == true) {
                location = 3;
                Sprite = smartphoneHappy;
                g.drawImage(parkBackground, 0, 0, null);
                g.drawImage(Sprite, 0, 0, null);
                g.drawImage(Textbox, 0, 50, null);
                g.drawString("This is Celly, the smartphone. It is social, talk to them!", 40, 80);
                g.drawImage(choiceUnselected, 50, 350, null);
                g.drawImage(choiceUnselected, 200, 350, null);
                g.drawImage(choiceUnselected, 350, 350, null);
                g.drawString("Hello Love", 65, 380);
                g.drawString("Sup", 230, 380);
                g.drawString("What", 390, 380);
            }
        }
        
        if(counter == 2){
            if(selection1 == true) {
                if(location == 1) {
                    Sprite = laptopHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: You are so sweet!", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
                if(location == 2) {
                    Sprite = desktopHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: You are so sweet!", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
                if(location == 3) {
                    Sprite = smartphoneHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: You are so sweet!", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
            }
            if(selection2 == true) {
                if(location == 1) {
                    Sprite = laptopGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: You are so okay!", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
                if(location == 2) {
                    Sprite = desktopGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: You are so okay!", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
                if(location == 3) {
                    Sprite = smartphoneGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: You are so okay!", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
            }
            if(selection3 == true) {
                if(location == 1) {
                    Sprite = laptopSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: No need to be rude :/", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
                if(location == 2) {
                    Sprite = desktopSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: No need to be rude :/", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
                if(location == 3) {
                    Sprite = smartphoneSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: No need to be rude :/", 40, 80);
                    g.drawString("Where are you from?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Spokane", 65, 380);
                    g.drawString("North Pole", 210, 380);
                    g.drawString("Moraga", 390, 380);
                }
            }
        }
        
        if(counter == 3) {
            if(selection1 == true) {
                if(location == 1) {
                    Sprite = laptopHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: I love Spokane, go Zags!", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
                if(location == 2) {
                    Sprite = desktopHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: I love Spokane, go Zags!", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
                if(location == 3) {
                    Sprite = smartphoneHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: I love Spokane, go Zags!", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
            }
            if(selection2 == true) {
                if(location == 1) {
                    Sprite = laptopGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: The North Pole?? That's crazy!", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
                if(location == 2) {
                    Sprite = desktopGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: The North Pole?? That's crazy!", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
                if(location == 3) {
                    Sprite = smartphoneGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: The North Pole?? That's crazy!", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
            }
            if(selection3 == true) {
                if(location == 1) {
                    Sprite = laptopSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: Moraga? Oh :/", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
                if(location == 2) {
                    Sprite = desktopSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: Moraga? Oh :/", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
                if(location == 3) {
                    Sprite = smartphoneSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: Moraga? Oh :/", 40, 80);
                    g.drawString("What do you like to do for leisure?", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 360, 380);
                }
            }
        }
        
        if(counter == 4){
            if(selection1 == true) {
                if(location == 1) {
                    g.drawImage(coffeeBackground, 0, 0, null);
                    Sprite = laptopHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: Yay! I love #thosewhocode", 40, 80);
                    /* what we will choose for insuing days is in comments for now.
                    g.drawString("NEXT QUESTION", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 390, 380);
                     */
                }
                if(location == 2) {
                    g.drawImage(deskBackground, 0, 0, null);
                    Sprite = desktopHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: Yay! I love #thosewhocode", 40, 80);
                    /*
                    g.drawString("NEXT QUESTION", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 390, 380);
                    */
                }
                if(location == 3) {
                    g.drawImage(parkBackground, 0, 0, null);
                    Sprite = smartphoneHappy;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: Yay! I love #thosewhocode", 40, 80);
                    /*
                    g.drawString("NEXT QUESTION", 40, 95);
                    g.drawImage(choiceUnselected, 50, 350, null);
                    g.drawImage(choiceUnselected, 200, 350, null);
                    g.drawImage(choiceUnselected, 350, 350, null);
                    g.drawString("Coding", 65, 380);
                    g.drawString("Eat food", 230, 380);
                    g.drawString("Illegal Activity", 390, 380);
                     */
                }
            }
            if(selection2 == true) {
                if(location == 1) {
                    g.drawImage(coffeeBackground, 0, 0, null);
                    Sprite = laptopGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: Wow! I wish I could eat", 40, 80);
                    /* what we will choose for insuing days is in comments for now.
                     g.drawString("NEXT QUESTION", 40, 95);
                     g.drawImage(choiceUnselected, 50, 350, null);
                     g.drawImage(choiceUnselected, 200, 350, null);
                     g.drawImage(choiceUnselected, 350, 350, null);
                     g.drawString("Coding", 65, 380);
                     g.drawString("Eat food", 230, 380);
                     g.drawString("Illegal Activity", 390, 380);
                     */
                }
                if(location == 2) {
                    g.drawImage(deskBackground, 0, 0, null);
                    Sprite = desktopGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: Wow! I wish I could eat", 40, 80);
                    /*
                     g.drawString("NEXT QUESTION", 40, 95);
                     g.drawImage(choiceUnselected, 50, 350, null);
                     g.drawImage(choiceUnselected, 200, 350, null);
                     g.drawImage(choiceUnselected, 350, 350, null);
                     g.drawString("Coding", 65, 380);
                     g.drawString("Eat food", 230, 380);
                     g.drawString("Illegal Activity", 390, 380);
                     */
                }
                if(location == 3) {
                    g.drawImage(parkBackground, 0, 0, null);
                    Sprite = smartphoneGasp;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: Wow! I wish I could eat", 40, 80);
                    /*
                     g.drawString("NEXT QUESTION", 40, 95);
                     g.drawImage(choiceUnselected, 50, 350, null);
                     g.drawImage(choiceUnselected, 200, 350, null);
                     g.drawImage(choiceUnselected, 350, 350, null);
                     g.drawString("Coding", 65, 380);
                     g.drawString("Eat food", 230, 380);
                     g.drawString("Illegal Activity", 390, 380);
                     */
                }
            }
            if(selection3 == true) {
                if(location == 1) {
                    g.drawImage(coffeeBackground, 0, 0, null);
                    Sprite = laptopSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Lappy: I don't like criminals :(", 40, 80);
                    /* what we will choose for insuing days is in comments for now.
                     g.drawString("NEXT QUESTION", 40, 95);
                     g.drawImage(choiceUnselected, 50, 350, null);
                     g.drawImage(choiceUnselected, 200, 350, null);
                     g.drawImage(choiceUnselected, 350, 350, null);
                     g.drawString("Coding", 65, 380);
                     g.drawString("Eat food", 230, 380);
                     g.drawString("Illegal Activity", 390, 380);
                     */
                }
                if(location == 2) {
                    g.drawImage(deskBackground, 0, 0, null);
                    Sprite = desktopSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Peecee: I don't like criminals :(", 40, 80);
                    /*
                     g.drawString("NEXT QUESTION", 40, 95);
                     g.drawImage(choiceUnselected, 50, 350, null);
                     g.drawImage(choiceUnselected, 200, 350, null);
                     g.drawImage(choiceUnselected, 350, 350, null);
                     g.drawString("Coding", 65, 380);
                     g.drawString("Eat food", 230, 380);
                     g.drawString("Illegal Activity", 390, 380);
                     */
                }
                if(location == 3) {
                    g.drawImage(parkBackground, 0, 0, null);
                    Sprite = smartphoneSad;
                    g.drawImage(Sprite, 0, 0, null);
                    g.drawImage(Textbox, 0, 50, null);
                    g.drawString("Celly: I don't like criminals :(", 40, 80);
                    /*
                     g.drawString("NEXT QUESTION", 40, 95);
                     g.drawImage(choiceUnselected, 50, 350, null);
                     g.drawImage(choiceUnselected, 200, 350, null);
                     g.drawImage(choiceUnselected, 350, 350, null);
                     g.drawString("Coding", 65, 380);
                     g.drawString("Eat food", 230, 380);
                     g.drawString("Illegal Activity", 390, 380);
                     */
               }
            }
       }

        counter++;
    }
    
    /**
     Mouse listener class
     */
    
    private class MyMouseListener
    implements MouseListener
    {
        public void mousePressed(MouseEvent e)
        {
            // if ((e.getY()>390)&&(e.getY()<410)){
            //     Sprite = smartphoneGasp;
            //     repaint();
            // }
            // else if((e.getY()>410)&&(e.getY()<440)){
            //     Sprite = smartphoneSad;
            //     repaint();
            // }
        }
        
        //
        // The following methods are unused, but still
        // required by the MouseListener interface.
        //
        
        public void mouseClicked(MouseEvent e)
        {
            // if(kissingMiniGame == true)
            // {
            //     if(kissingLineY < (90 + laptopAffection))
            //     {
            //         miniGameWon = true;
            //     }
            // }
        if ((e.getY()>349)&&(e.getY()<450)){
            if ((e.getX()>50)&&(e.getX()<150)){
                //if(selection1 == false)
                //{
                    selection1 = true;
                //}
                //else if(selection1 == true)
                //{
                  //  selection1 = false;
                //}
                selection2 = false;
                selection3 = false;
            }
            else if ((e.getX()>200)&&(e.getX()<300)){
                //if(selection2 == false)
                //{
                    selection2 = true;
                //}
                //else if(selection2 == true)
                //{
                  //  selection2 = false;
                //}
                selection1 = false;
                selection3 = false;
            }
            else if ((e.getX()>350)&&(e.getX()<450)){
                //if(selection3 == false)
                //{
                    selection3 = true;
                //}
                //else if(selection3 == true)
                //{
                  //  selection3 = false;
                //}
                selection2 = false;
                selection1 = false;
            }
            repaint();
        }
        }
        
        public void mouseReleased(MouseEvent e)
        {

        }
        
        public void mouseEntered(MouseEvent e)
        {
        }
        
        public void mouseExited(MouseEvent e)
        {
        }
    }
    
    /**
     Mouse Motion listener class
     */
    
    private class MyMouseMotionListener
    implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {

        }
        
        /**
         The mouseMoved method is unused, but still
         required by the MouseMotionListener interface.
         */
        
        public void mouseMoved(MouseEvent e)
        {
            // if ((e.getY()>390)&&(e.getY()<410)){
            //     selection2 = true;
            //     repaint();
            // }
            // else if((e.getY()>410)&&(e.getY()<440)){
            //     selection3 = true;
            //     repaint();
            // }
            // else
            // {
            //     selection2 = false;
            //     selection3 = false;
            //     repaint();
            // }
        }
    }
    
    private class TimerListener
    implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            if(kissingDirectionUp == true)
            {
                if(kissingLineY > 95)
                {
                    kissingLineY += -1;
                }
                else{
                    kissingDirectionUp = false;
                }
            }
            else{
                if(kissingLineY < 380)
                {
                    kissingLineY += 1;
                }
                else{
                    kissingDirectionUp = true;
                }
            }
            repaint();
        }
    }
    
    
    public static void main(String[] args) throws java.io.IOException
    {
        try {
        JFrame frame = new JFrame("dating Sim");
		frame.add(new datingSim());
		frame.setSize(500, 500);
		frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        }
    catch(IOException e) {
       // Code to handle an IOException here
       System.out.println("Could not find file");
    }
    }
}	
