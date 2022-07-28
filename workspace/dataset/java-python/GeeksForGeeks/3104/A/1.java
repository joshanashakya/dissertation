

// Java implementation of the approach 
class GFG  
{ 
  
    // Function to print the uncommon 
    // characters in the given string 
    // in sorted order 
    static void printUncommon(String str1, String str2)  
    { 
        int a1 = 0, a2 = 0; 
        for (int i = 0; i < str1.length(); i++) 
        { 
  
            // Converting character to ASCII code 
            int ch = (str1.charAt(i)) - 'a'; 
  
            // Bit operation 
            a1 = a1 | (1 << ch); 
        } 
        for (int i = 0; i < str2.length(); i++)  
        { 
  
            // Converting character to ASCII code 
            int ch = (str2.charAt(i)) - 'a'; 
  
            // Bit operation 
            a2 = a2 | (1 << ch); 
        } 
  
        // XOR operation leaves only uncommon 
        // characters in the ans variable 
        int ans = a1 ^ a2; 
  
        int i = 0; 
        while (i < 26)  
        { 
            if (ans % 2 == 1) 
            { 
                System.out.print((char) ('a' + i)); 
            } 
            ans = ans / 2; 
            i++; 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str1 = "geeksforgeeks"; 
        String str2 = "geeksquiz"; 
  
        printUncommon(str1, str2); 
    } 
} 
  
// This code contributed by Rajput-Ji 

