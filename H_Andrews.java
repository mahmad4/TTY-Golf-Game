/*
 * Muhammad Ahmad
 *mahmad4
 *project 2
 *lab M/W 2:00-3:15
 *workshop leader: Brandon
 *I did not collaborate with anyone for this project
 *And all the work is my own
 */


public class H_Andrews extends courses{
	
	
	
	
	// protected variables
	protected String[] H_num = {"first", "second", "third", "fourth", "fifth" , "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteen", "fourtennth", "fifteenth", "sixteenth", "seventeenth", "eighteenth"};
	protected int[] H_yards = {376, 453, 397, 480, 568, 412, 371, 175, 352, 386, 174, 348, 465, 618, 455, 423, 495, 357};
	protected int[] H_par = {4, 4, 4, 4, 5, 4, 4, 3, 4, 4, 3, 4, 4, 5, 4, 4, 4, 4};
	protected String[] H_name = {"Burn","Dyke", "Cartage (Out)", "Ginger Beer","Hole O'Cross(Out)", "Heathery(Out)", "High(Out)", "Short", "End", "Bobby Jones", "High(In)", "Heathery(In)", "Hole O'Cross(In)", "Long", "Cartgate(In)", "Corner of the Dyke", "Road", "Tom Morris"};
	// Current hole info
	protected String Curr_H_num;
	protected int Curr_H_yards;
	protected int Curr_H_par;
	protected String Curr_H_name;
	
	
	public H_Andrews(int hole) {
		hole--;	// for index of the array
		this.Curr_H_num = H_num[hole];
		this.Curr_H_yards = H_yards[hole];
		this.Curr_H_par = H_par[hole];
		this.Curr_H_name = H_name[hole];
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
	public String getCurr_H_name() {
		return Curr_H_name;
	}
	public void setCurr_H_name(String curr_H_name) {
		Curr_H_name = curr_H_name;
	}
	
	
	
	

}
