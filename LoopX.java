import java.util.Scanner;
public class LoopX
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int aNum= sc.nextInt();
		int count=0;
		while (count <aNum)
		{
			count+=1;
			System.out.print("X");
			
		}
	System.out.println("");
	}
	
}