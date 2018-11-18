Muhammad Ahmad
mahmad4
I did not collaborate with anyone for this project and all the work is my own
10/27/2016


I have done 2 of the extra credit tasks:

1. User can quit after everyhole <= 5%
2. Terminologies for each hole score <= 5%


Note:
For the project I have taken absolute values of the distance. 
So if ball goes over a longer distance and crosses the putt, The player will play the ball from the other side of the putt.
Same happens within the green area. But the ball will never leave the green area once it enters (as instructed by the manual). 


For this project I have divided my work into 7 classes:
1. Main class

This is the parent class. This is the main class with most of the printout statements and public variables used through other classes. It has 3 methods:
letsplay - the main play method that runs the whole game. This calls different methods from different classes.
nextDistance - which calculates the Distance the ball travels
Distanceleft - returns the distance left of the putt from the current ball location.

2. courses

Course class is for the two differnt golf courses, and allowing the user to choose one(Person chooses in the letsplay method of the main class)
The important method is the getHole one where it defines the hole and its information. It stores this to temparory variables. It also prints out the hole information.

3. H_Genesee && 4. H_Andrews

These class have all the information of their respective 18 holes (mostly in arrays). It has the getters and setters method for the holes and its information. 
I have use protected variables in both so I can have one getHole method in class Course for both genesee and st. andrews.
Both these classes are child classes of courses. Both have constructor for initializing the hole.

5. Clubs

This class has all the information of the 10 clubs. Most information is stored in arrays the the club in use, its information is also stored in the temp variables using a constructor.
It has getters and setters for the temparory variables.


6. Putter

This class is similiar to the Clubs class. It is NOT the child class of clubs but the child class of Main.\
It has the stddev and mean of the all the powers and using a constructor stores them in a temp variable.
It has getters and setters for the temp variables.

7. Score

This is the class that keep track of the score.
It is the child class of Main class.
It has 2 variables: the round score and the hole score.
It has getters and setter for the variables.
It has other methods:
addone - which adds 1 to the hole score. (Hole score is set to 0 after the hole is completed)
roundScore - this calculates the new round score after every hole
terminology - this method is for naming each holes score
printScore - this prints out the round score (ROund score is set to 0 after every round)




public static void main(String[] args)

Just constructs a player and calls the letsplay method!


