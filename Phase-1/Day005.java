import java.util.Arrays;  
import java.util.Scanner;
import java.util.*;  

public class Main  
{  
   public static void main(String args[])   
   {  
      Scanner sc=new Scanner(System.in);

      int n;    //Declare array size
      System.out.println("Enter the number of elements ");
      n=sc.nextInt();     //Initialize array size

      int arr[]=new int[n];   //Declare array
      System.out.println("Enter the elements of the array ");
      for(int i=0; i<n ;i++)     //Initialize array
      {
          arr[i]=sc.nextInt();
      }
      //Display the original array
      System.out.println("Initial Array "+Arrays.toString(arr));
      
        int first = arr[0];  //Initialize the first element of the array to a variable
        int start = 0; 
        
        // swaping each element with the first element 
        for (int i = 1; i < arr.length; i++) { 
            arr[start++] = arr[i]; 
            arr[i] = first; 
        } 
      
       //Display the updated array
      System.out.println("Updated Array" +Arrays.toString(arr));    
       
   }  
}  

/*
Start
Declare an Array.
Initialize the Array
Declare another variable to store the first element of the array.
Use a for loop to swap each element of the array.
In each iteration swap each element with the first element.
Continue this swapping of elements in each iteration till the end of the loop.
Display the updated array.
Stop.
*/