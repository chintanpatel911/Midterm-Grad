/*
 * Name : Chintan Patel 
 * CSU ID : 2473177	
 * Assigment 4 : Roll two dies until the total on the dies comes up to 12
 */
public class Rollfor12 {

	public static void main(String[] args) {
		int numberOfRolls ;
		numberOfRolls = 12;
		int die1;
		int die2;
		int roll = 0;
		int rollCt = 0;
		
		while (roll != 12) {	
		die1 = (int) (Math.random()*6) + 1;
		die2 = (int) (Math.random()*6) + 1;
		roll = die1 + die2;
		rollCt++;
		} 
		
		System.out.println("The roll counts are" + " : " + rollCt);
	}
}

