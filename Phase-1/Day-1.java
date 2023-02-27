public class Day1{
	public static void main(String[] args){
		int[] items = { 10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55 };   // Min = 0, Max = 100
		
		// Approach-1
		max = items[0];
		min = items[0];

		for (int i = 1; i < items.length; i++) {
			if(items[i]>max){
				max= items[i];
			}else if(items[i]<min){
				min =items[i];
			}
		}
		System.out.println(max);	//100
		System.out.println(min);	//0
		
		// Approach-2
		int max = Arrays.stream(items).max().getAsInt(); // 100

		int min = Arrays.stream(items).min().getAsInt(); // 0
		
		// Approach-3: Try with Recursion !!!
		
	}
	
	// Puesdocode for Approach-1
	/*Initialize the max and min with first item in the array
          Iterate the array from second position (index 1)
	   Compare the ith item with max and min
	    if current item is greater than max
		set max = current item
	    elseif current item is lower than min
	 	set min = current item*/
}
