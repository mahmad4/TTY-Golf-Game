/*
 * Muhammad Ahmad
 *mahmad4
 *project 2
 *lab M/W 2:00-3:15
 *workshop leader: Brandon
 *I did not collaborate with anyone for this project
 *And all the work is my own
 */

public class courses extends Main{
	
	public String[] courses = {"Genesee Valley Park North Course", "The Old Course at St. Andrews"};
	public String Curr_course;
	
	public courses(int course){
		course--;
		this.Curr_course = courses[course];
	}
	
	public courses(){
	}
	
	
	public String getCurr_course() {
		return Curr_course;
	}
	
	
	// getting(stores into temp variables which are public - can be used in any class/method ) and printing hole information
	public void getHole(int course, int hole){
		course--;
		if (course == 0) { 		// Genesee
				H_Genesee b = new H_Genesee(hole);
				System.out.println("You are at the " + b.getCurr_H_num() + " tee. " + b.getCurr_H_yards() + " yards, " + "par " + b.getCurr_H_par() + "." );
				temp_H_yards = b.getCurr_H_yards();
				temp_H_par = b.getCurr_H_par();
				
		}
		else{  					// St. Andrews
			H_Andrews b = new H_Andrews(hole);
			System.out.println("You are at the " + b.getCurr_H_num() + " tee. " + b.getCurr_H_yards() + " yards, " + "par " + b.getCurr_H_par() + "." + " Hole name is " + b.getCurr_H_name());
			temp_H_yards = b.getCurr_H_yards();
			temp_H_par = b.getCurr_H_par();
			
		}
			
	}
	
}
