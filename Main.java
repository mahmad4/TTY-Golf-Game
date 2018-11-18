/*
 * Muhammad Ahmad
 *mahmad4
 *project 2
 *lab M/W 2:00-3:15
 *workshop leader: Brandon
 *I did not collaborate with anyone for this project
 *And all the work is my own
 */

import java.util.*;

public class Main {

	public static int mean;
	public static int stddev;
	public int power;
	public static int course;	// course number 
	public int[] holes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18}; 
	public static int hole;//current hole
	public static int temp_H_yards;	// current yards
	public static int temp_H_par;	// current hole par
	public int disLeft;	//distance left
	public int quit = 0;	// quit or no
	
	public static int nextDistance(int mean, int stddev, int power) {				// method to calculate next distance
		double mean_adj = mean * power / 10.0;
		double stddev_adj = stddev * power / 10.0;
		Random random = new Random();
		double val = Math.abs(random.nextGaussian() * stddev_adj + mean_adj);
		return (int)val;
	}

	public int Distanceleft(int disCovered){					// method to calculate distance left
		disLeft = Math.abs(disLeft - disCovered);
		return disLeft;
	}
	
	public void letsplay(){		// Main lets play golf method
		Scanner scan = new Scanner(System.in);
		while (quit != 1){
			
			// Setting score
			Score score = new Score();
			
			System.out.println("Welcome to TTY Golf");
			System.out.println();
			System.out.println("Please select a course");
			System.out.println("1. Genese Valley Park North Course");
			System.out.println("2. The Old Course at St. Andrews");
			System.out.print("Your choice[1-2]: ");
			course = scan.nextInt();
			courses a = new courses(course);	// setting up course
			System.out.println();
			System.out.println("You are playing " + a.getCurr_course());
			score.setRound_s(0);	// round score to 0
			for (int i = 1; i<=18; i++){			// for loop for 18 holes
				hole = i;
				a.getHole(course, hole);		// hole info to temp variables
				disLeft = temp_H_yards;
				score.setHole_s(0);			// hole score to 0
				while (disLeft > 20){
					System.out.println();
					System.out.print("Choose your club [1-10]: ");
					// club details
					int club = scan.nextInt();
					Clubs a1 = new Clubs(club);
					mean = a1.getTemp_c_mean();
					stddev = a1.getTemp_c_stddev();
					System.out.print("Power [1-10]: ");
					int power = scan.nextInt();
					
					int disCovered = nextDistance(mean, stddev, power);			// distance ball travels
					System.out.println("You covered " + disCovered + " yards");
					disLeft = Distanceleft(disCovered);
					disLeft = Math.abs(disLeft); 						// absolute value of distance left
					System.out.println("You are left with " + disLeft +" yards");
					score.addone();				// score add 1 for every try
				}
				disLeft = disLeft*3;		// converting distance from yards to feet from yards to feet
				System.out.println("");
				System.out.println("You are left with " + disLeft +" feet");
				while (disLeft > 1){			//putter
					System.out.println();
					System.out.println("You are on the green.");
					System.out.print("Power [1-10]: ");
					int power = scan.nextInt();				// input putt power
					Putter putt = new Putter(power);
					mean = putt.getTemp_p_mean();
					stddev = putt.getTemp_p_stddev();
					int disCovered = nextDistance(mean, stddev, 10);		// distance ball travels 
					
					if (disCovered > (disLeft+60)){ 	disCovered = disLeft + 60;	}		// Ball does not go off the green patch
					
					System.out.println("You covered " + disCovered + " feet");
					disLeft = Distanceleft(disCovered);
					disLeft = Math.abs(disLeft); 						// absolute value of distance left
					System.out.println("You are left with " + disLeft +" feet");
						
					score.addone();			// score add 1 for every try
				}
				System.out.println("IT'S IN THE HOLE!");
				score.terminology(temp_H_par);		// printing hole score with name 
				score.roundScore(temp_H_par);		// keeping track of the round score
				System.out.println("");
				// if quit
				System.out.print("If you want to Quit enter 1 (otherwise enter any other number): ");	
				quit = scan.nextInt();
				if (quit == 1){	break; }
				System.out.println("");
			}
			
			score.printScore();		// prints out round score
			System.out.println("");
			// if quit
			System.out.print("If you really want to Quit enter 1 : ");
			quit = scan.nextInt();
			System.out.println("");
			
			
		}
		scan.close();			// clooses the scanner
	}
	
	
	public static void main(String[] args) {
		// Just constructs the player and calls the method
		Main player1 = new Main();
		player1.letsplay();
		System.out.println("Good Game! Come back again! :)");
	}
	
	
}
