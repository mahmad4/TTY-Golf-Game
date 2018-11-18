/*
 * Muhammad Ahmad
 *mahmad4
 *project 2
 *lab M/W 2:00-3:15
 *workshop leader: Brandon
 *I did not collaborate with anyone for this project
 *And all the work is my own
 */


public class Score extends Main{

	public int round_s; 	//round score
	public int hole_s;		// hole score
	
	
	public Score(){
		this.hole_s = 0;	// sets both to zero
		this.round_s = 0;
	}
	
	public int getRound_s() {
		return round_s;
	}
	public void setRound_s(int round_s) {
		this.round_s = round_s;
	}
	public int getHole_s() {
		return hole_s;
	}
	public void setHole_s(int hole_s) {
		this.hole_s = hole_s;
	}
	
	
	
	public void addone(){		// adds one for every try
		this.hole_s = this.hole_s + 1;
	}
	
	public void roundScore(int temp_H_par){		// keeps track of the round score
		this.round_s = this.round_s + this.hole_s - temp_H_par;
	}
	
	public void terminology(int temp_H_par){		// naming of the hole score
		int diff = this.hole_s - temp_H_par; // difference of shots and par 
		if (diff == 1){
			System.out.println("You scored a BOGEY");
		}
		else if (diff == 0){
			System.out.println("You scored a PAR");
		}
		else if (diff == -1){
			System.out.println("You scored a BIRDIE");
		}
		else if (diff == -2){
			System.out.println("You scored a EAGLE");
		}
		else if (diff == -3){
			System.out.println("You scored a ALBATROSS");
		}
		else {
			System.out.println("You took " + diff + " extra shots than par to complete the hole");
		}
		
	}
	
	
	public void printScore(){			// printing round score (over, under or par)
		int s = this.round_s;
		if (s < 0){
			s = s * (-1);
			System.out.println("Your final score for the round is: " + s + " under. Good Job!");
		}
		else if (s == 0){			
			System.out.println("Your final score for the round is: " + s + " (par). Nice!");
		}
		else{
			System.out.println("Your final score for the round is: " + s + " over. Better luck next time!");
		}
	}
}
