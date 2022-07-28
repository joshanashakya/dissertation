

// Java program to check for 
// even or odd 
import java.io.*; 
import java.util.*; 
   
public class GFG { 
       
    // Function to find k-th  
    // missing element 
    static int missingK(int []a, int k,  
                                 int n) 
    { 
        int difference = 0,  
            ans = 0, count = k; 
        boolean flag = false; 
           
        // interating over the array 
        for(int i = 0 ; i < n - 1; i++) 
        {  
            difference = 0; 
               
            // check if i-th and  
            // (i + 1)-th element  
            // are not consecutive 
            if ((a[i] + 1) != a[i + 1])  
            { 
                   
                // save their difference 
                difference +=  
                    (a[i + 1] - a[i]) - 1; 
                   
                // check for difference 
                // and given k 
                if (difference >= count) 
                    { 
                        ans = a[i] + count; 
                        flag = true; 
                        break; 
                    } 
                else
                    count -= difference; 
            } 
        } 
           
        // if found 
        if(flag) 
            return ans; 
        else
            return -1; 
    } 
       
    // Driver code 
    public static void main(String args[]) 
    { 
           
        // Input array 
        int []a = {1, 5, 11, 19}; 
           
        // k-th missing element  
        // to be found in the array 
        int k = 11; 
        int n = a.length; 
           
        // calling function to 
        // find missing element 
        int missing = missingK(a, k, n); 
           
        System.out.print(missing); 
    } 
   
} 
   
// This code is contributed by 
// Manish Shaw (manishshaw1) 

