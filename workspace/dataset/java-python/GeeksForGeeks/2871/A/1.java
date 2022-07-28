

// Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
  
// Function that checks whether the vowel 
// characters in a string are 
// in alphabetical order or not 
static boolean areVowelsInOrder(String s) 
{ 
    int n = s.length(); 
  
    // ASCII Value 64 is less than 
    // all the alphabets 
    // so using it as a default value 
    char c = (char)64; 
  
    // check if the vowels in 
    // the string are sorted or not 
    for (int i = 1; i < n; i++) { 
        if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' 
               || s.charAt(i) == 'o' || s.charAt(i) == 'u') { 
  
            // if the vowel is smaller than the previous vowel 
            if (s.charAt(i) < c)  
                return false;      
            else { 
  
                // store the vowel 
                c = s.charAt(i); 
            } 
        } 
    }  
    return true; 
} 
  
// Driver code 
    public static void main (String[] args) { 
            String s = "aabbbddeecc"; 
  
    // check whether the vowel 
    // characters in a string are 
    // in alphabetical order or not 
    if (areVowelsInOrder(s)) 
    System.out.print("Yes"); 
    else
    System.out.print("No"); 
  
    } 
} 
  
// This Code is contributed 
// by anuj_67.... 

