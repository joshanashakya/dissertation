

// Java code to implement above function 
import java.io.*; 
   
class GFG { 
      
// It's better to use long  
// to handle big integers 
// function to count no. of digits 
static long dig(long a) 
{ 
    long count = 0; 
    while (a > 0)  
    { 
        a /= 10; 
        count++; 
    } 
    return count; 
} 
   
// function to implement above approach 
 static void required_number(long num, long n, long d) 
{ 
    long i, j, power=1, a, flag = 0; 
    for (i = num; i >= 1; i--)  
    { 
        power = (long)Math.pow(10, i); 
        a = n % power; 
   
        // if difference between power 
        // and n doesn't exceed d 
        if (d > a) 
        { 
            flag = 1; 
            break; 
        } 
    } 
      
    if (flag>0)  
    { 
        long t = 0; 
   
        // loop to build a number from the 
        // appropriate no of digits containg 
        // only 9 
        for (j = 0; j < i; j++)  
        { 
            t += 9 * Math.pow(10, j); 
        } 
   
        // if the build number is 
        // same as original number(n) 
        if (n % power == t) 
            System.out.print( n); 
              
        else { 
   
            // observation 
            System.out.print( n - (n % power) - 1); 
        } 
    } 
    else
        System.out.print(n); 
} 
   
    // Driver Code 
    public static void main (String[] args)  
    { 
        long n = 1029, d = 102; 
       
        // variable that stores no  
        // of digits in n 
        long num = dig(n); 
        required_number(num, n, d); 
    } 
} 
   
// This code is contributed by chandan_jnu 

