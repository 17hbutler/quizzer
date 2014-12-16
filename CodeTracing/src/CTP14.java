import java.util.Collections;
import java.util.Scanner; 
import java.util.ArrayList; 
public class CTP14 
{
	static boolean negOne = false;  
	static ArrayList myArray = new ArrayList(); 
	public static void main(String[] args) 
	{
		userInput();
		target();
		quiz(); 
	}
	
	public static void userInput() 
		{
		System.out.println("Please input the numbers.");
		System.out.println("Once you are finshed type -1.");
		System.out.println("The number cannot be greater than twenty.");
		do 
			{
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			if(number == -1) 
				{
				negOne = true; 
				}
			else if(number > 20) 
				{
				System.out.println("The number that you inputed is not valid.");
				}
			else if(myArray.contains(number)) 
				{
				System.out.println("You have already inputed that number.");
				}
			else 
				{
				myArray.add(number); 
				}
			}
		while(negOne == false);
		Collections.sort(myArray);
		System.out.println();
		for(int i = 0; i < myArray.size(); i++) 
			{
			System.out.println(myArray.get(i));
			}
		}
	public static void target() 
		{
		System.out.println("----------------------------------------------");
		int length = myArray.size();
		int ranNum = (int)(Math.random()*myArray.size()-1); 
		int target = (int)myArray.get(ranNum);
		System.out.println("The target is " + ranNum);
		System.out.println("----------------------------------------------");
		}
	public static void quiz() 
		{
		System.out.println("What is the left, right, and middle index");
		Scanner scanner = new Scanner(System.in); 
		int left = scanner.nextInt();
		int right = scanner.nextInt();
		int middle = scanner.nextInt(); 
		if(left < 0 || left > 0) 
			{
			System.out.println("The first left index must be a zero.");
			}
		else 
			{
			
			}
		}

}
