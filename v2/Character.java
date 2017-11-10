/********************
  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 30 -- Ye Olde Role Playing Game, Improved
  2017-11-13
********************/

public class Character{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    int HP;
    int strength;
    final int defense= 40;
    int currentDef;
    final double aRate=0.4;
    double attackRate; 
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

     // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~~

    public boolean isAlive(){
	return HP > 0;
    }
    
    public int getDefense(){
	return defense;
    }

    public void lowerHP(int damage){
	HP -= damage;
    }

    public int attack(Character character){
	int damage = (int) (strength * attackRate) - character.currentDef;
	if (damage < 0){
	    damage = 0;
	}
        character.lowerHP(damage);
	return damage;
    }
}//end Character
