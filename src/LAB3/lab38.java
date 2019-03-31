package LAB3;

import java.util.Scanner;

public class lab38 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,NUM,sum=0;

		  
		{
			Scanner input = new Scanner(System.in);
	      	System.out.print("Enter an integer: ");
	    	 NUM = input.nextInt();
		   for(i=1;i<=NUM;i++)

		   {
		     System.out.println (2*i-1);
		     sum+=2*i-1;
		   }
		   System.out.println ("The Sum of odd Natural Number upto " +NUM+" terms is: " +sum);

	}
	}
}
