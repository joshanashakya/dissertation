

// Java program to remove the first 
// and last character of each word in a string. 
  
import java.util.*; 
  
class GFG { 
    static String FirstAndLast(String str) 
    { 
  
        // Split the String based on the space 
        String[] arrOfStr = str.split(" "); 
  
        // String to store the resultant String 
        String res = ""; 
  
        // Traverse the words and 
        // remove the first and last letter 
        for (String a : arrOfStr) { 
            res += a.substring(1, a.length() - 1) + " "; 
        } 
  
        return res; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        String str = "Geeks for Geeks"; 
        System.out.println(str); 
        System.out.println(FirstAndLast(str)); 
    } 
} 

