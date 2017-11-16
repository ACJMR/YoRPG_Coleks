/********************
Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
APCS1 pd08
HW 31 -- Ye Olde Role Playing Game, Expanded
2017-11-14
********************/

public class KoolAid extends Monster{

    //Constructor
    public KoolAid(){
	//super(name);
	defense = 150;
	currentDef = defense; //Changes defense to 150 instead of default 40
    }

    public static String about(){
	return "Flowing from the Rivers of Nebraskaid, KoolAids possess a defense change from 40 --> 150.";
    }
}//ends KoolAid
