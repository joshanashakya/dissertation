

// Java program to check if any repeated  
// subsequence exists in the string 
class GFG 
{ 
    static int MAX_CHAR = 256; 
  
    // A function to check  
    // if a string str is palindrome 
    public static boolean isPalindrome(String str,  
                                       int l, int h)  
    { 
          
        // l and h are leftmost and rightmost corners of str 
        // Keep comparing characters while they are same 
        while(h > l) 
            if (str.charAt(l++) != str.charAt(h--)) 
                return false; 
          
        return true; 
    } 
  
    // The main function that checks if repeated 
    // subsequence exists in the string 
    public static boolean check(String str) 
    {  
          
        // Find length of input string  
        int n = str.length();  
      
        // Create an array to store all characters  
        // and their frequencies in str[]  
        int[] freq = new int[MAX_CHAR];  
      
        // Traverse the input string and store frequencies  
        // of all characters in freq[] array.  
        for (int i = 0; i < n; i++)  
        {  
            freq[str.charAt(i)]++;  
      
            // If the character count is more than 2  
            // we found a repetition  
            if (freq[str.charAt(i)] > 2)  
                return true;  
        }  
      
        // In-place remove non-repeating characters  
        // from the string  
        int k = 0;  
        for (int i = 0; i < n; i++)  
            if (freq[str.charAt(i)] > 1)  
                str.replace(str.charAt(k++),  
                            str.charAt(i));  
        str.replace(str.charAt(k), '\0'); 
  
        // check if the resultant string is palindrome  
        if (isPalindrome(str, 0, k - 1))  
        {  
  
            // special case - if length is odd  
            // return true if the middle characer is  
            // same as previous one  
            if ((k & 1) == 1)  
            { 
  
                // It is checked so that  
                // StringIndexOutOfBounds can be avoided 
                if (k / 2 >= 1) 
                    return (str.charAt(k / 2) ==  
                            str.charAt(k / 2 - 1)); 
            } 
      
            // return false if string is a palindrome  
            return false;  
        }  
      
        // return true if string is not a palindrome  
        return true;  
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        String str = "ABCABD"; 
          
        if (check(str)) 
            System.out.println("Repeated Subsequence Exists"); 
        else
            System.out.println("Repeated Subsequence" +  
                               " Doesn't Exists");  
    } 
} 
  
// This code is contributed by sanjeev2552 

