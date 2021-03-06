/********************
  Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
  APCS1 pd 8
  HW 31 -- Ye Olde Role Playing Game, Expanded
  2017-11-14
********************/

public class Character{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected int HP;
    protected int strength;
    protected int defense= 40;
    protected int currentDef;
    protected double aRate=0.4;
    protected double attackRate; 
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
	int damage = (int) (strength * attackRate) - character.getDefense();
	if (damage < 0){
	    damage = 0;
	}
        character.lowerHP(damage);
	return damage;
    }
}//end Character
