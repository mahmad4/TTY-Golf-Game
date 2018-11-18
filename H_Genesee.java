/*
 * Muhammad Ahmad
 *mahmad4
 *project 2
 *lab M/W 2:00-3:15
 *workshop leader: Brandon
 *I did not collaborate with anyone for this project
 *And all the work is my own
 */


public class H_Genesee extends courses{
	// variables protected
	protected String[] H_num = {"first", "second", "third", "fourth", "fifth" , "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteen", "fourtennth", "fifteenth", "sixteenth", "seventeenth", "eighteenth"};
	protected int[] H_yards = {530, 305, 331, 201, 500, 226, 409, 410, 229, 433, 363, 174, 545, 419, 512, 410, 320, 170};
	protected int[] H_par = {5, 4, 4, 3, 5, 3, 4, 4, 3, 4, 4, 3, 5, 4, 5, 4, 4, 3};
	// current hole info variables
	protected String Curr_H_num;
	protected int Curr_H_yards;
	protected int Curr_H_par;
	
	
	
	public H_Genesee(int hole){		
		hole--;		// for index of the array
		this.Curr_H_num = H_num[hole];
		this.Curr_H_yards = H_yards[hole];
		this.Curr_H_par = H_par[hole];
		
	}

	// getters and setters
	public String getCurr_H_num() {
		return Curr_H_num;
	}
	public void setCurr_H_num(String curr_H_num) {
		Curr_H_num = curr_H_num;
	}
	public int getCurr_H_yards() {
		return Curr_H_yards;
	}
	public void setCurr_H_yards(int curr_H_yards) {
		Curr_H_yards = curr_H_yards;
	}
	public int getCurr_H_par() {
		return Curr_H_par;
	}
	public void setCurr_H_par(int curr_H_par) {
		Curr_H_par = curr_H_par;
	}
	
	
	
}
