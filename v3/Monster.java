/********************
  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 30 -- Ye Olde Role Playing Game, Improved
  2017-11-13
********************/

public class Monster extends Character{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    
    private String name;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~
    public Monster(){
	HP = 150;
	strength = 20 + (int) (Math.random() * (65 - 20));
	currentDef = 20;
	attackRate = 1.0;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
   
    public String getName(){
	return name;
    }
    
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
