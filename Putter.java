/*
 * Muhammad Ahmad
 *mahmad4
 *project 2
 *lab M/W 2:00-3:15
 *workshop leader: Brandon
 *I did not collaborate with anyone for this project
 *And all the work is my own
 */


public class Putter extends Main{
	public int[] putt_mean = {1, 2, 4, 8, 12, 16, 20, 25, 30, 40};
	public int [] putt_stddev = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	public int temp_p_mean;		
	public int temp_p_stddev;
	
	
	public Putter (int power){
		power--;	// for index of the array
		this.temp_p_mean = putt_mean[power];
		this.temp_p_stddev = putt_stddev[power];
	}

	// getters and setters
	public int getTemp_p_mean() {
		return temp_p_mean;
	}


	public void setTemp_p_mean(int temp_p_mean) {
		this.temp_p_mean = temp_p_mean;
	}


	public int getTemp_p_stddev() {
		return temp_p_stddev;
	}


	public void setTemp_p_stddev(int temp_p_stddev) {
		this.temp_p_stddev = temp_p_stddev;
	}
	
	
	

}
