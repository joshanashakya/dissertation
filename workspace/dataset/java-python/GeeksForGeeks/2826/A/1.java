

// Java program for string matching with *  
import java.util.*; 
  
public class GfG { 
      
    // Function to check if the two 
    // strings can be matched or not 
    public static int doMatch(String A, String B) {  
      
        for (int i = 0; i < A.length(); i++){ 
        
            // if the string don't have *  
            // then character at that position  
            // must be same.  
            if (A.charAt(i) != '*' && B.charAt(i) != '*'){   
                if (A.charAt(i) != B.charAt(i))  
                   return 0; 
            } 
        } 
    
        return 1;  
    }  
      
    // Driver code  
    public static void main(String []args){ 
          
        String A = "gee*sforgeeks";  
        String B = "geeksforgeeks";  
        System.out.println(doMatch(A, B)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

