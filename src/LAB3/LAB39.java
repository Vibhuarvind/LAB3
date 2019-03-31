package LAB3;

public class LAB39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =0;
	       int numb =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (j = 1; j <= 100; j++)         
	       { 		  	  
	          int counter=0; 	  
	          for(numb =j; numb>=1; numb--)
		  {
	             if(j%numb==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + j + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
	}
