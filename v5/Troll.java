/********************
Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
APCS1 pd08
HW 31 -- Ye Olde Role Playing Game, Expanded
2017-11-14
********************/

public class Troll extends Monster{

    //Constructor
    public Troll(String name){
	super(name);
	defense = 60;
	currentDef = 60; //Changes defense to 60 instead of default 40
    }

    public static String about(){
	return "Hailing from the caverns beneath the Western Plains, Trolls have an increased defense from 40 --> 60";
    }
}//ends Troll