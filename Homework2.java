//This is a simple java grade calculator 
import java.util.Scanner;
public class GradeProject{
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your numeric score: ");
		int score = keyboard.nextInt();
	
	if (score >= 90)
	{	
	System.out.print('A');
	}
	
	else if(score >= 80){
	System.out.print('B');
	}
	else if (score >= 70){
	System.out.print('C'); 
	}
	else if (score >= 60){
	System.out.print ('D');
	}
	else {
	System.out.print ('F');
	}
	}
}

//An update to the Grade Project File 
//if downloading and running, you must comment out one of these classes for the program to be sucessful or you will recieve an error



public class GradeProject2{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Please enter five numeric test scores rounded to the nearest whole number:\n");
		int score1 = keyboard.nextInt();
		int score2 = keyboard.nextInt();
		int score3 = keyboard.nextInt();
		int score4 = keyboard.nextInt();
		int score5 = keyboard.nextInt();
		double Average = calcAverage(score1, score2, score3, score4, score5); 
		System.out.println("Your average score is: \n" + Average);
		System.out.println("Please enter your numeric average as calculated above:");
		int testScore = keyboard.nextInt();
		determineGrade(testScore);
	}
	public static double calcAverage(int score1, int score2, int score3, int score4, int score5)
	{
		return ((score1 + score2 + score3 + score4 + score5)/5);
	}
	public static void determineGrade(int testScore)
	{
		
		if (testScore > 90)
		{	
			System.out.print('A');
		}

		else if(testScore >= 80){
			System.out.print('B');
		}
		else if (testScore >= 70){
			System.out.print('C'); 
		}
		else if (testScore >= 60){
			System.out.print ('D');
		}
		else {
			System.out.print ('F');
		}
	}

}
