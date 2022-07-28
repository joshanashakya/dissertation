

// Java program to find number of occurrences of 
// a subsequence of length 3 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    // Function to find number of occurrences of 
    // a subsequence of length three in a string 
    public static int findOccurrences(String str1, String substr1) 
    {  
        // variable to store no of occurrences 
        int counter = 0; 
          
        char[] str = str1.toCharArray(); 
        char[] substr = substr1.toCharArray(); 
          
        // loop to find first character 
        for (int i=0; i < str1.length(); i++) 
        { 
            if (str[i] == substr[0]) 
            {  
                // loop to find 2nd character 
                for (int j = i+1; j < str1.length(); j++) 
                { 
                    if (str[j] == substr[1]) 
                    {  
                        // loop to find 3rd character 
                        for (int k = j+1; k < str1.length(); k++) 
                        {  
                            // increment count if subsequence  
                            // is found 
                            if (str[k] == substr[2]) 
                                counter++; 
                        } 
                    } 
                } 
            } 
        } 
  
        return counter; 
    } 
      
    // Driver function 
    public static void main(String argc[]){ 
        String str = "GFGFGYSYIOIWIN"; 
        String substr = "GFG"; 
  
        System.out.println(findOccurrences(str, substr));  
    } 
      
} 
/* This code is contributed by Sagar Shukla */

