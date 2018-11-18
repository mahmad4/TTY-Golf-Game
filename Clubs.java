/*
 * Muhammad Ahmad
 *mahmad4
 *project 2
 *lab M/W 2:00-3:15
 *workshop leader: Brandon
 *I did not collaborate with anyone for this project
 *And all the work is my own
 */


public class Clubs extends Main{
	public int[] club_num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public int temp_c_num;
	public String[] club_name = {"Driver", "3-wood", "3-iron", "4-iron", "5-iron", "6-iron", "7-iron", "8-iron", "9-iron", "Wedge"};
	public String temp_c_name;
	public int[] club_mean = {230, 215, 180, 170, 155, 145, 135, 125, 110, 50};
	public int temp_c_mean;
	public int[] club_stddev = {30, 20, 20, 17, 15, 15, 15, 15, 10, 10};
	public int temp_c_stddev;
	
	
	public Clubs(int club) {
		club--;	// for index of the array
		this.temp_c_mean = club_mean[club];
		this.temp_c_name = club_name[club];
		this.temp_c_num = club_num[club];
		this.temp_c_stddev = club_stddev[club];
		
	}
	
	// getters and setters
	public int getTemp_c_num() {
		return temp_c_num;
	}


	public void setTemp_c_num(int temp_c_num) {
		this.temp_c_num = temp_c_num;
	}


	public String getTemp_c_name() {
		return temp_c_name;
	}


	public void setTemp_c_name(String temp_c_name) {
		this.temp_c_name = temp_c_name;
	}

	public int getTemp_c_mean() {
		return temp_c_mean;
	}


	public void setTemp_c_mean(int temp_c_mean) {
		this.temp_c_mean = temp_c_mean;
	}

	public int getTemp_c_stddev() {
		return temp_c_stddev;
	}


	public void setTemp_c_stddev(int temp_c_stddev) {
		this.temp_c_stddev = temp_c_stddev;
	}

	
}
