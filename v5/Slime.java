/********************
Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
APCS1 pd08
HW 31 -- Ye Olde Role Playing Game, Expanded
2017-11-14
********************/

public class Slime extends Monster{

    //Constructor
    public Slime(){
	//super(name);
	defense = 10;
	currentDef = defense; //Changes defense to 10 instead of default 40
    }

    public static String about(){
	return "Bouncing from the Forests of Piloticus, slimes boast a defense change from 40 --> 10.";
    }
}//ends Slime
