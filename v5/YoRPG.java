/**********************************************

  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 28 -- Ye Olde Role Playing Game
  2017-11-08

 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 5;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;   //Is it man or woman?
  private Monster smaug; //Friendly generic monster name?

  private int moveCount;
  private boolean gameOver;
  private int difficulty;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG()
  {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in );
    in = new BufferedReader( isr );
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:  
    post: according to user input, modifies instance var for difficulty 
    and instantiates a Protagonist
    =============================================*/
  public void newGame()
  {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    }
    catch ( IOException e ) { }

    //=================== CLASS SELECTION ====================
 
     String s1 = "\nChoose your class:";
     s1+= "\n1: Wizard";
     s1+= "\n2: Tank";
     s1+= "\n3: Archer";
     s1+= "\nSelection: ";
     
     System.out.print(s1); //prints out text prompting class selection

     int classNum = 0;
     
     try {
	  classNum = Integer.parseInt( in.readLine() );  //classNum is set to the user's input
     } 
     catch ( IOException e ) { }

    //instantiate the player's character

     String c = ""; //used to store class name

     if (classNum == 1){
        pat = new Wizard( name );  //pat is a Wizard, but is created with the Protagonist template
	c = "Wizard";
     }
      if (classNum == 2){
        pat = new Tank( name );  //pat is a Tank, but is created with the Protagonist template
	c = "Tank";
     }
      if (classNum == 3){
        pat = new Archer( name );  //pat is a Archer, but is created with the Protagonist template
	c = "Archer";
     }
      
    System.out.println();
    System.out.println("You have selected the " + c + " class.");
    System.out.println(pat.about());
    //=========================================================
        //=================== Monster SELECTION ====================
 
     String s2 = "\nChoose your worthy opponent:";
     s2+= "\n1: Orc";
     s2+= "\n2: Slime";
     s2+= "\n3: KoolAid";
     s2+= "\n4: Troll";
     s2+= "\nSelection: ";
     
     System.out.print(s2); //prints out text prompting monster selection

     int monsNum = 0;
     
     try {
	  monsNum = Integer.parseInt( in.readLine() );  //monsNum is set to the user's input
     } 
     catch ( IOException e ) { }

    //instantiate the player's opponent
     if (monsNum == 1){
	 smaug = new Orc();  //smaug is an Orc, but is created with the Monster template
     }
      if (monsNum == 2){
	  smaug = new Slime();  //smaug is a Slime, but is created with the Monster template
     }
      if (monsNum == 3){
	  smaug = new KoolAid();  //smaug is a KoolAid, but is created with the Monster template
     }
      if (monsNum == 4){
	  smaug = new Troll(); //smaug is a Troll, but is created with the Monster template
      }
      //========================================================

  }//end newGame()



  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
          Monster smaug initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    //smaug = new Monster();

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

        if ( i == 2 )
          pat.specialize();
        else
          pat.normalize();

        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " + 
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  public static void main( String[] args )
  {
    //As usual, move the begin-comment bar down as you progressively 
    //test each new bit of functionality...

    
    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;
    
    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
		break;
    encounters++;
    System.out.println();
    }

    System.out.println( "Thy game doth be over." );
    /*================================================
	  ================================================*/
  }//end main

}//end class YoRPG


