

// Program to find average of odd numbers 
// till a given odd number. 
import java.io.*; 
  
class GFG { 
      
    // Function to calculate the average 
    // of odd numbers 
    static int averageOdd(int n) 
    { 
        if (n % 2 == 0) { 
            System.out.println("Invalid Input"); 
            return -1; 
        } 
       
        int sum = 0, count = 0; 
        while (n >= 1) { 
       
            // count odd numbers 
            count++; 
       
            // store the sum of odd numbers 
            sum += n; 
       
            n = n - 2; 
        } 
        return sum / count; 
    } 
       
    // driver function 
    public static void main(String args[]) 
    { 
        int n = 15; 
        System.out.println(averageOdd(n)); 
    } 
} 
  
/*This code is contributed by Nikita tiwari.*/

