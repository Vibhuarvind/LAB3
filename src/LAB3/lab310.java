package LAB3;
import java.util.Scanner;
public class lab310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,x;
		 System.out.print("Input number of rows : ");
		 Scanner input = new Scanner(System.in);
		 x = input.nextInt();
		   for(i=1;i<=x;i++)
		   {
			for(j=1;j<=i;j++)
			  System.out.print(j);

		    System.out.println("");
		    }
	}

}
