/********************
Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
APCS1 pd08
HW 31 -- Ye Olde Role Playing Game, Expanded
2017-11-14
********************/

public class Orc extends Monster{

    //Constructor
    public Orc(){
	//super(name);
	HP = 600; //adds 450  more HP to default monster
	attackRate= 0.5;// attackRate halved

    }

    public String about(){
	return "Terrifying ethereal beings, Orcs have an increased HP from 150 --> 600, but a greatly reduced attack rate.";
    }
} //end Orc
