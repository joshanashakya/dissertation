

// Java program to check if there exists 
// at least 1 sub-sequence in a string 
// which is not palindrome 
  
import java.util.*; 
class GFG 
{ 
      
    // Function to check if there exists 
    // at least 1 sub-sequence in a string 
    // which is not palindrome 
    static boolean isAnyNotPalindrome(String s) 
    { 
        // use set to count number of 
        // distinct characters 
        Set<Character> unique=new HashSet<Character>(); 
      
        // insert each character in set 
        for (int i = 0; i < s.length(); i++) 
            unique.add(s.charAt(i)); 
      
        // If there is more than 1 unique 
        // characters, return true 
        if (unique.size() > 1) 
            return true; 
        // Else, return false 
        else
            return false; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        String s = "aaaaab"; 
      
        if (isAnyNotPalindrome(s)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
      
    } 
} 

