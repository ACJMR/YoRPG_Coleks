/********************
  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 30 -- Ye Olde Role Playing Game, Improved
  2017-11-13
********************/

public class Monster extends Character{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
     static int HP;
     int strength;
     int defense;
     double attackRate;
     String name;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~
    public Monster(){
	HP = 150;
	strength = 20 + (int) (Math.random() * (65 - 20));
	defense = 20;
	attackRate = 1.0;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
    public boolean isAlive(){
	return HP > 0;
    }
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
    public void lowerHP(int damage){
	HP -= damage;
    }
    public int attack(Protagonist protagonist){
	int damage = (int) (strength * attackRate) - protagonist.currentDef;
	if (damage < 0){
	    damage = 0;
	}
        protagonist.lowerHP(damage);
	return damage;
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
