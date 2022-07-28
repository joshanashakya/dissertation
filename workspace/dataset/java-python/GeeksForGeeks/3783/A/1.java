

// Java Program to find maximum  
// value of maximum of minimums 
// of k segments. 
import java .io.*; 
import java .util.*; 
  
class GFG 
{ 
  
    // function to calculate  
    // the max of all the  
    // minimum segments 
    static int maxOfSegmentMins(int []a, 
                                int n,  
                                int k) 
    { 
          
        // if we have to divide  
        // it into 1 segment then  
        // the min will be the answer 
        if (k == 1)  
        { 
            Arrays.sort(a); 
                return a[0]; 
        } 
      
        if (k == 2)  
            return Math.max(a[0],  
                            a[n - 1]);  
          
        // If k >= 3, return  
        // maximum of all  
        // elements. 
        return a[n - 1]; 
    } 
      
    // Driver Code 
    static public void main (String[] args) 
    { 
        int []a = {-10, -9, -8,  
                    2, 7, -6, -5}; 
        int n = a.length; 
        int k = 2; 
          
        System.out.println( 
                maxOfSegmentMins(a, n, k)); 
    } 
} 
  
// This code is contributed 
// by anuj_67. 

