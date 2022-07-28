

// Java code for Munchhausen Number 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
// pwr[i] is going to store i raised to 
// power i. 
static long[] pwr; 
   
// Function to check out whether 
// the number is Munchhausen 
// Number or not  
static Boolean isMunchhausen(int n) { 
    long sum = 0l; 
    int temp = n; 
   
    while (temp>0) { 
        int index= temp%10; 
        sum =sum + pwr[index]; 
        temp /= 10; 
    } 
   
    return (sum == n); 
} 
   
static void printMunchhausenNumbers(int n) 
{ 
    pwr= new long[10]; 
  
    // Precompute i raised to 
    // power i for every i 
    for (int i = 0; i < 10; i++ ) 
        pwr[i] = (long)Math.pow( (float)i, (float)i ); 
       
    // The input here is fixed i.e. it will 
    // check up to n 
    for (int i = 1; i <= n; i++)  
   
        // check the integer for Munchhausen Number,  
        // if yes then print out the number 
        if (isMunchhausen(i)==true) 
            System.out.println(i ); 
} 
    public static void main (String[] args) { 
    int n = 10000; 
    printMunchhausenNumbers(n); 
     } 
} 
// This code is contributed by Gitanjali. 

