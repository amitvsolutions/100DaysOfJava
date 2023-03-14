import java.util.Arrays;

public class Day015 {

   // merge two sorted arrays 
   public static void main(String[] args) {
      
      // array which should be merged
	  int arr1[] = {10, 20, 30, 40, 50};
	  int arr2[] = {9, 18, 27, 36, 45};
	  
	  // create new array
	  int newArray[] = new int[arr1.length + arr2.length];
	  
	  // copy first array to new array from 0 to arr1.length
	  System.arraycopy(arr1, 0, newArray, 0, arr1.length);
	  
	  // copy second array to new array arr1.length to arr2.length
	  System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
	  
	  // sort new array
      Arrays.sort(newArray);
	  
	  // display all arrays
	  System.out.println("Array1 = " + Arrays.toString(src1));
      System.out.println("Array2 = " + Arrays.toString(src2));
      System.out.println("Merged Array = " + Arrays.toString(newArray));
	  
   }
   
}