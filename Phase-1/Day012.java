public class Day012{
	
    // Function to remove adjacent duplicates characters from a string
    public static String removeDuplicates(String s)
    {
        // base case
        if (s == null) {
            return null;
        }
 
        char[] chars = s.toCharArray();
        char prev = 0;
        int k = 0;
 
        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        } 
        return new String(chars).substring(0, k);
    }
 
    public static void main(String[] args)
    {
        String s = "AAABBCDDD";
        System.out.println(removeDuplicates(s));
    }
}
