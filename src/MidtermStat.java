// Name : Chintan Patel
// CSU ID : 2473177
// Assignment 4 : Midterm grade

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MidtermStat {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("C:\\Users\\chintan\\Desktop\\CIS 260\\Programs\\grades.txt"));
		
		int number;
		int highestGrade = 0;
		int lowestGrade = (int) 100.0;
		double average = 0; 
		
		System.out.println("Numbers are listed on file grades.txt : ");
		
		while (input.hasNextInt())
		{
			number = input.nextInt();
			
			if (highestGrade < number){
				highestGrade =  number;
			} 
			
			if (lowestGrade > number){
				lowestGrade = number;
			}
			
			average += number;
		}
		
		System.out.println("The highest number is" + " : " + highestGrade );
		System.out.println("The lowest number is " + " : " + lowestGrade );
		System.out.println("The average number is" + " : " + average/30);
		
		input.close();
	}

}
