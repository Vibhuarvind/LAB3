package LAB3;
import java.util.Scanner;
public class lab35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  Temp, Reminder, Sum = 0, i, Fact;
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a Number : ");
		int N = input.nextInt();		
		
		Temp = N;
		do
		{
			Fact = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Fact = Fact * i;
		     	i++;
		    }
		     Sum = Sum + Fact;
		     Temp = Temp /10;  	
		   
		}
		while( Temp > 0);
		if ( N == Sum )
			   
	    	 System.out.println("\n " + N + " is a Strong Number");
	    else
	    	 System.out.println("\n " + N + " is Not a Strong Number");

	}

}
