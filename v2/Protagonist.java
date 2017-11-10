/********************
  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 30 -- Ye Olde Role Playing Game, Improved
  2017-11-13
********************/

public class Protagonist extends Character{
   // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    String name;


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    // ~~~~~~~~~~~~~~~  CONSTRUCTOR ~~~~~~~~~~~~~
    public Protagonist(String n){
	name = n;
	HP = 125;
	strength = 100;
        currentDef = defense;
	attackRate = aRate;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    public String getName(){
	return name;
    }

    public void specialize(){
	currentDef -= 2;
	attackRate+=.2;
    }

    public void normalize(){
	currentDef= defense;
	attackRate=aRate;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
}
