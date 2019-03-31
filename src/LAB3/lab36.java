package LAB3;

import java.util.Scanner;

public class lab36 {

	public static void main(String[] args) {
		 //Scanner input = new Scanner(System.in);
        //System.out.println("enter the no. whose prime you want = ");
        //int p = input.nextInt();
        int i=1,p=348;
        do
        {
        	if(p%i==0)
        		System.out.println("the factors of given number are "+i);
        	    p=p/i;
        	    i++;
        }
       while(i<=p);
	}

}
