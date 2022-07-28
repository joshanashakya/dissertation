

// JAVA implementation of above approach 
  
import java.util.*; 
  
class GFG 
{ 
    public static int findY(int x) 
    { 
        if (x > 2) 
            return x - 2; 
      
        return x + 2; 
    } 
  
    // Driver code 
    public static void  main(String [] args) 
    { 
        int x = 5; 
        System.out.println(findY(x)); 
  
    } 
      
} 
  
  
// This code is contributed 
// by ihritik 

