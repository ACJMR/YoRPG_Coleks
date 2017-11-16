/********************
Team Coleks - Colin Hosking, Aleksandra Koroza, Johnny Wong
APCS1 pd08
HW 31 -- Ye Olde Role Playing Game, Expanded
2017-11-14
********************/

public class Archer extends Protagonist{

    //Constructor
    public Archer(String name){
	super(name);
	HP = 175; //adds 50 more HP to default protagonist
	attackRate = 0.6; // adds 0.2 more attackRate to default protagonist
	

    }

    public String about(){
	return "Adventuring from the eastern Emerald Plains, Archers have an increased HP from 125 --> 175 and an increased attackRate from 0.4 --> 0.6";
    }

     public void normalize(){
	currentDef= defense;
	attackRate=aRate;
    }

    public void specialize(){
	currentDef -= 2;
	attackRate+=.2;
    }
} //end Archer
