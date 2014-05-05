package defaultPackage;

import java.util.*;

public class JavaBasicProgram
{
    public static void main(String[] args)
    {
    	System.out.println("The code will go here for Java Eclipse project.");
//    	Scanner in = new Scanner(System.in);
    	
//    	System.out.println("What is your name?");
//    	String name = in.nextLine();
//    	System.out.println("Hello " + name);
    	
    	double x = 1000 / 3.0;
    	System.out.printf("%8.2f \n", x);
    	
    	for (int i = 1; i <= 10; i++)
    	{
    		System.out.println(i);
    		if (i == 5)
    		{
    			break;
    		}
    	}
    }
}

