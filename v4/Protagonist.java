/********************
  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 31 -- Ye Olde Role Playing Game, Expanded
  2017-11-14
********************/

public abstract class Protagonist extends Character{
   // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String name;


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

    public abstract void specialize();
	//currentDef -= 2;
	//attackRate+=.2;
    

    public abstract void normalize();
	//currentDef= defense;
	//attackRate=aRate;

    public abstract String about();
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
}
