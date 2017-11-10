/********************
  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 28 -- Ye Olde Role Playing Game
  2017-11-08
********************/

public class Protagonist{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    String name;
    static int HP;
    int strength;
    final int defense= 40;
    int currentDef;
    final double aRate=0.4;
    double attackRate;

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
    public boolean isAlive(){
	if (HP <= 0){ return false;}
	return true;
    }

    public int getDefense(){
	return defense;
    }

    public String getName(){
	return name;
    }

    public void lowerHP(int num){
	HP -= num;
    }

    public int attack(Monster n){
	int damage;
	damage= (int)((strength*attackRate)-n.defense); //would have to be Monster.defense
        n.lowerHP(damage);
	return damage;
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
