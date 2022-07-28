

// Java program to find the sum of all 
// perfect cubes in the given range 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
/* Name of the class has to be "Main" only if the class is public. */
class GFG 
{ 
    // Array to precompute the sum of cubes 
    // from 1 to 100010 so that for every 
    // query, the answer can be returned in O(1). 
     public static int []pref=new int[100010]; 
        
    // Function to check if a number is 
    // a perfect Cube or not 
    static int isPerfectCube(int x) 
    { 
        // Find floating point value of 
        // cube root of x. 
        double cr = Math.round(Math.cbrt(x)); 
        
        // If cube root of x is cr 
        // return the x, else 0 
        if(cr*cr*cr==(double)x) return x; 
        return 0; 
    } 
        
    // Function to precompute the perfect 
    // Cubes upto 100000. 
    static void compute() 
    { 
        for (int i = 1; i <= 100000; ++i) { 
            pref[i] = pref[i - 1]+ isPerfectCube(i); 
        } 
    } 
        
    // Function to print the sum for each query 
    static void printSum(int L, int R) 
    { 
        long sum = pref[R] - pref[L - 1]; 
        System.out.print(sum+" "); 
    } 
        
    
     
    // Driver code 
    public static void main (String[] args)  
    { 
         // To calculate the precompute function 
        compute(); 
        
        int Q = 4; 
        int [][] arr = { { 1, 10 }, 
                                { 1, 100 }, 
                                { 2, 25 }, 
                                { 4, 50 } }; 
        
        // Calling the printSum function 
        // for every query 
        for (int i = 0; i < Q; i++) { 
            printSum(arr[i][0], arr[i][1]); 
        } 
    } 
} 
  
// This code is contributed by chitranayal 

