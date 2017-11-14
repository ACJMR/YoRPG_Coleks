/********************
Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
APCS1 pd08
HW 31 -- Ye Olde Role Playing Game, Expanded
2017-11-14
********************/

public class Wizard extends Protagonist{

    //Constructor
    public Wizard(String name){
	super(name);
	HP = 200; //adds 75 more HP to default protagonist

    }

    public static String about(){
	return "Hailing from the remote northern peaks, Wizards have an increased HP from 125 --> 200";
    }
} //end Wizard