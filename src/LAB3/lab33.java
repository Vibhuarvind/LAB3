package LAB3;
import java.util.Scanner;
public class lab33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
      	System.out.print("Enter an integer: ");
    	int n = input.nextInt();
    	int i = 1, t1 = 0, t2 = 1;
    	 while (i <= n)
         {
             System.out.print(t1 + " + ");

             int sum = t1 + t2;
             t1 = t2;
             t2 = sum;

             i++;
         }

	}

}
