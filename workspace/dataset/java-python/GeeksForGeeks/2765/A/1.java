

// Java code to check if a two character string can  
// be made using given strings 
import java.util.*; 
  
class GFG 
{ 
  
// Function to check if str can be made using 
// given words 
static boolean makeAndCheckString(Vector<String> words,  
                                            String str) 
{ 
    int n = words.size(); 
    boolean first = false, second = false; 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // If str itself is present  
        if (words.get(i) == str) 
            return true; 
      
        // Match first character of str 
        // with second of word and vice versa 
        if (str.charAt(0) == words.get(i).charAt(1))  
            first = true;          
        if (str.charAt(1) == words.get(i).charAt(0))  
            second = true; 
  
        // If both characters found. 
        if (first && second) 
            return true;  
    } 
      
    return false;  
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    String str = "ya";  
    String[] array = { "ah", "oy", "to", "ha"}; 
    Vector<String> words = new Vector<String>(Arrays.asList(array));      
    if (makeAndCheckString(words, str)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

