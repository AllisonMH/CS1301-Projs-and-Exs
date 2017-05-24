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
