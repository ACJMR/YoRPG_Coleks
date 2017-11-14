/********************
Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
APCS1 pd08
HW 31 -- Ye Olde Role Playing Game, Expanded
2017-11-14
********************/

public class Tank extends Protagonist{

    //Constructor
    public Tank(String name){
	super(name);
	HP = 500; //adds 375 more HP to default protagonist
	strength= 200;//adds 100 more strength
	aRate=0.2;
	attackRate=aRate;//slows attack rate by 0.2

    }

    public static String about(){
	return "Pure muscle and steel, Tanks have an increased HP from 125 --> 500";
    }
} //end Tank
