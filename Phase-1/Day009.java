import java.util.*;

public class Day009{

	// reverse a string in java and check palindrome //
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String toBeReversed = sc.nextLine();
		sc.close();
		
		System.out.println("Actual String: "+ toBeReversed);
		String res= reverseString(toBeReversed);		
		
		if (toBeReversed.equals(res)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}		
    }
	
	public static String reverseString(String input){
		char[] letters = new char[input.length()];
		
		for(int i=0; i<input.length(); i++){
			System.out.println(input.charAt(i));			
		}
		System.out.println("Reversing the String:");
		
		int letterIndex=0;
		for(int i= input.length()-1; i>=0; i--) { // ** LOGIC ** //
			System.out.println(input.charAt(i));
			letters[letterIndex] = input.charAt(i);
			letterIndex++;  // ** LOGIC ** //
		}
		
		return String.valueOf(letters);
		
	}

}