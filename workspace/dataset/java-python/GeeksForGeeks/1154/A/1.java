

// Java program for printing string  
// with duplicate vowels  
import java.util.*; 
  
class GFG  
{ 
  
    // Function to check for the Vowel 
    static boolean isVowel(char ch)  
    { 
        ch = Character.toUpperCase(ch); 
        return (ch == 'A' || ch == 'E' ||  
                ch == 'I' || ch == 'O' || ch == 'U'); 
    } 
  
    // Function to get the resultant string 
    // with vowels duplicated 
    static String duplicateVowels(String str) 
    { 
        int t = str.length(); 
  
        // Another string to store 
        // the resultant string 
        String res = ""; 
  
        // Loop to check for each character 
        for (int i = 0; i < t; i++)  
        { 
            if (isVowel(str.charAt(i))) 
                res += str.charAt(i); 
            res += str.charAt(i); 
        } 
        return res; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String str = "helloworld"; 
  
        // Print the original string 
        System.out.println("Original String: " + str); 
        String res = duplicateVowels(str); 
  
        // Print the resultant string 
        System.out.println("String with Vowels duplicated: " + res); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

