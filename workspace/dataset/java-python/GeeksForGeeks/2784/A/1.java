

// Java code for digital root 
import java.util.*; 
   
public class GfG { 
       
    static int digroot(int n) 
    { 
        int root = 0; 
   
        // Loop to do sum while 
        // sum is not less than 
        // or equal to 9 
        while (n > 0 || root > 9)  
        { 
             if (n == 0) { 
                n = root; 
                root = 0; 
            } 
              
            root += n % 10; 
            n /= 10; 
        } 
        return root; 
    } 
       
    // Driver code 
    public static void main(String argc[]) 
    { 
        int n = 65785412; 
        System.out.println(digroot(n)); 
    } 
} 
  
// This code is contributed by Gitanjali. 
// This code will run for 0000 testcase also. 

