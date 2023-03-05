import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day007{	  
	
   // Read input from console //
   public static void main(String args[]){
	   
	   // Appraoch-1: 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter anything: ");
		
        String str = br.readLine();
		while(!str.equals("stop")){
			System.out.println("You have Entered: ");
			System.out.println(str);  
		}
		br.close();        
	   
	   // Approach-2: 
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a String");
       String str = sc.nextLine();
       System.out.println("The String is: " +str);
       System.out.println("Enter an Integer");
       int i = sc.nextInt();
       System.out.println("The Integer is: " +i);
       System.out.println("Enter a Float value");
       float f = sc.nextFloat();
       System.out.println("The Float value is: " +f);
   }	
}

