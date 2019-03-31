package LAB3;

import java.util.Scanner;

public class lab34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
      	System.out.print("Enter an integer: ");
    	int v = input.nextInt();
    	//where v is the variable for starting range for factorial.
    	//user can enter the starting range of his wish.
			do
			{
			int i=1,fact=1;
			//number to calculate factorial
			while(i<=v){
			fact=fact*i;
			i=i+1;
			 }
			System.out.println("Factorial of "+v+" is: "+fact);
			v=v+1;
			}
			while(v<=15);  
	}

}
