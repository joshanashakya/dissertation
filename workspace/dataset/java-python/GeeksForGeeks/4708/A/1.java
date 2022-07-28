

// Java code to calculate number 
// of ways of selecting 'p' non  
// consecutive stations out of  
// 'n' stations 
  
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
    public static int stopping_station(int p, int n) 
    { 
        int num = 1, dem = 1, s = p; 
  
        // selecting 's' positions out of 'n-s+1' 
        while (p != 1) 
        { 
            dem *= p; 
            p--; 
        } 
  
        int t = n - s + 1; 
        while (t != (n - 2 * s + 1)) 
        { 
            num *= t; 
            t--; 
        } 
  
        if ((n - s + 1) >= s) 
            System.out.print(num / dem); 
  
        else
            // if conditions does not satisfy of combinatorics 
            System.out.print("not possible"); 
  
        return 0; 
    } 
  
    public static void main (String[] args) 
    { 
        // n is total number of stations 
        // s is no. of stopping stations 
        int n, s; 
  
        // arguments of function are 
        // number of stopping station 
        // and total number of stations 
        stopping_station(4, 12); 
    } 
} 
// ""This code is contributed by Mohit Gupta_OMG "" 

