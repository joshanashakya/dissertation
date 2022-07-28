

// Java implementation of the approach  
import java.util.*;  
  
class GFG  
{ 
  
    // Function to return the count  
    // of minimum coins required  
    static int findCount(int N) 
    {  
        Vector list = new Vector(); 
        int sum = 0; 
        int i; 
          
        // Creating list of the sum of all  
        // previous bit values including  
        // that bit value 
          
        for(i = 0; i < 20; i++)  
        { 
            sum += Math.pow(2, i); 
            list.add(sum); 
        } 
              
        for(i = 0; i < 20; i++) 
        { 
            if((int)list.get(i) > N) 
                return (list.indexOf(list.get(i)) + 1); 
        } 
        return 0; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int N = 10; 
        System.out.println(findCount(N)); 
    } 
} 
  
// This code is contributed by AnkitRai01 

