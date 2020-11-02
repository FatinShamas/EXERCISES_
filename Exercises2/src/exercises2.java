import java.util.*;
public class exercises2 {

	public static void main(String[] args) {
		
		printExercise11();
		 printExercise12();
		printExercise13();	
		 printExercise14();
		 printExercise15();
		 printExercise16();
		 printExercise17();
		 printExercise18();
		 printExercise19();	
		 printExercise20();	
			
		
		
	}
    public static void printExercise11() {
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("*****Exercise 11*****");
	System.out.print("Input first number: ");
	int number = in.nextInt();
	System.out.print("Input second number: ");
	int number2 = in.nextInt();
	
	int add, minus, multiply, remainder,mode;
	
	//addition
	add = (number + number2);
	System.out.println(number + " + " + number2 + " = " + add);
	
   //minus
	minus = (number - number2);
	System.out.println(number + " - " + number2 + " = " + minus);
	
  //multiply
	multiply = (number * number2);
	System.out.println(number + " x " + number2 + " = " + multiply);
	
  //remainder
	remainder = (number / number2);
	System.out.println(number + " / " + number2 + " = " + remainder);
	
  //mod (%)
	mode = (number % number2);
	System.out.println(number + " mod " + number2 + " = " + mode);
	
	System.out.println();
		
		
	}	
    public static void printExercise12() {
    	Scanner in = new Scanner (System.in);
    	System.out.println("*****Exercise 12*****");
    	
    	long binaryNumber, decimalNumber = 0, j = 1, remainder;
    	  System.out.print("Input a binary number: ");
    	  binaryNumber = in.nextLong();

    	  while (binaryNumber != 0) 
    	  {
    	   remainder = binaryNumber % 10;
    	   decimalNumber = decimalNumber + remainder * j;
    	   j = j * 2;
    	   binaryNumber = binaryNumber / 10;
    	  }
    	  System.out.println("Decimal Number: " + decimalNumber);
    	  System.out.println();
    	 
	}
	  public static void printExercise13() {
        	Scanner in = new Scanner (System.in);
        	
        	System.out.println("*****Exercise 13*****");
        	
        	String string1 = "Hello how are you?";
        	System.out.println(string1.startsWith("Hello"));
        	
        	System.out.println();
        	
	  }
	   public static void printExercise14() {
        	Scanner in = new Scanner (System.in);
        	
        	System.out.println("*****Exercise 14*****");
        	
        	int[]array_num = {20,30,40};
        	System.out.println("Original Array: " +Arrays.toString(array_num));
        	int[] new_array_num = {array_num[1], array_num[2], array_num[0]};
        	
        	System.out.println("Rotated Array: " +Arrays.toString(new_array_num));
        	System.out.println();
        	
	   }
	   public static void printExercise15() {
        	Scanner in = new Scanner (System.in);
        	
        	//Hexadecimal ada 16 decimal
        	
        	System.out.println("*****Exercise 15*****"); 	
        	
        	int[] hex = new int [1000];
        	int i = 1, j = 0, rem, decimal = 0, binary;
        	//rem = remainder
        	
        	System.out.print("Input a Binary Number: ");
        	binary = in.nextInt();
        	
        	while (binary > 0) {
        		rem = binary % 2;
        		decimal = decimal + rem * i;
        		i = i * 2;
        		binary = binary /10;
        	}
        	i=0;
        	while (decimal != 0) {
        		hex[i] = decimal % 16;
        		decimal = decimal / 16;
        		i++;
        	}
        	System.out.print("HexaDecimal value: ");
        	for (j = i - 1; j >= 0; j--)
        	{
        		if (hex[j] > 9)
        		{
        			System.out.print((char)(hex[j] + 55)+ "\n");
        		}
        		else
        		{
        			System.out.print(hex[j]+ "\n");
                	System.out.println();
        		}
        	}
	   }
	   public static void printExercise16() {
        	Scanner in = new Scanner (System.in);
    
        	
        	System.out.println("*****Exercise 16*****"); 	
        	System.out.print("Input a= " );
    		int a1 = in.nextInt();
    		System.out.print("Input b= ");
    		int b1 = in.nextInt();

    		
    		int swap;
    		swap = a1; // a = num1
    		a1 = b1; // num1 = num2
    		b1 = swap; // num2 = swap
    		
    		System.out.println("a = " + a1 + " ,  b = " +b1 );
        	System.out.println();
    	
     }
	 public static void printExercise17() {
        	Scanner in = new Scanner (System.in);
   
        	System.out.println("*****Exercise 17*****"); 
        	
        	System.out.println("\nJava Version: " +System.getProperty("java.version"));
        	System.out.println("Java Runtime Version: " +System.getProperty("java.runtime.version"));
        	System.out.println("Java Home: " +System.getProperty("java.home"));
        	System.out.println("Java Vendor: " +System.getProperty("java.vendor"));
        	System.out.println("Java Vendor URL: " +System.getProperty("java.vendor.url"));
        	System.out.println("Java Class Path: " +System.getProperty("java.class.path")+"\n");
        	
        	System.out.println();
        	
	 }
	 public static void printExercise18() {
        	Scanner in = new Scanner (System.in);
   
        	System.out.println("*****Exercise 18*****"); 
        	//return method
        
        	System.out.print("Input the length of a side of the hexagon: ");
        	double s = in.nextDouble();
        	//return output
        	System.out.println("The area of the Hexagon is: " + hexArea(s) );
	 }
	 public static double hexArea(double s) {
		 
        	//Calculate Area of Hexagon
        	return (6 * (s*s))/(4*Math.tan(Math.PI/6));
        	
	       
	 }
	 public static void printExercise19() {
        	Scanner in = new Scanner (System.in);
        	System.out.println();
        	
        	System.out.println("*****Exercise 19*****"); 
        	
        	//return method
        	System.out.print("Input the number of sides on the polygon: ");
        	double n = in.nextDouble();
        	System.out.print("Input the length of one of the sides: ");
        	double s = in.nextDouble();
        	
        	//return output for area of polygon
        	System.out.println("The area is: " + polygon(n,s) );
	 }
	 public static double polygon(double n, double s) {
		 //calculate area of polygon
		 return (n * (s*s))/(4*Math.tan(Math.PI/n));
		 
		 
		 
	 }
	 public static void printExercise20() {
        	Scanner in = new Scanner (System.in);
        	System.out.println();
        	
        	System.out.println("*****Exercise 20*****"); 
        	long binary, dec =0, i=1, rem;
        	
        	System.out.print("Input a binary number: ");
        	binary = in.nextLong();
        	
        	while (binary !=0)
        	{
        		rem = binary % 10;
        		dec = dec + rem * i;
        		i = i * 2;
        		binary = binary / 10;
        	}
        	System.out.println("Decimal Number : " + dec);
	 }
}
        	
        	
        	
        
        	
     
 
