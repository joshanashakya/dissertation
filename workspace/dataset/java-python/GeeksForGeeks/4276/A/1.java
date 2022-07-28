

// java program to check if a given  
// character is vowel or consonant 
import java.io.*; 
  
public class GFG { 
  
    // Function to check whether a  
    // character is vowel or not 
    static void vowelOrConsonant(char x) 
    { 
        if (x == 'a' || x == 'e' || x == 'i' || 
            x == 'o' || x == 'u' || x == 'A' || 
            x == 'E' || x == 'I' || x == 'O' || x == 'U') 
            System.out.println("Vowel"); 
        else
            System.out.println("Consonant"); 
    } 
  
    // Driver code 
    static public void main(String[] args) 
    { 
        vowelOrConsonant('c'); 
        vowelOrConsonant('E'); 
    } 
} 
  
// This article is contributed by vt_m. 

