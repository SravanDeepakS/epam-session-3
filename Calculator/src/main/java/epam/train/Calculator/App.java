package epam.train.Calculator;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the operands");
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	Operations ope=new Operations();
    	ope.setData(a,b);
    	System.out.println("Enter the type of operation that you want to perform\n"
    			+ "1)Addition\n"
    			+ "2)Subtraction\n"
    			+ "3)Multiplication\n"
    			+ "4)Division");
    	System.out.println("Enter the number of operation that you want to perform,like "
    			+ "enter 1 for addition,etc");
    	int d=sc.nextInt();
    	switch(d)
    	{
    		case 1:
    			ope.add();
    			break;
    		case 2:
    			ope.subtract();
    			break;
    		case 3:
    			ope.multiply();
    			break;
    		case 4:
    			ope.divide();
    			break;
    		default:
    			System.out.println("Choose an appropriate operation!!");
    	}
    }
}
