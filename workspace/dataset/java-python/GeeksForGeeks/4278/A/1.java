

// Java program to find least value of 
// k for which R(k) is divisible by n 
import java.util.*; 
  
class GFG { 
  
    // To find least value of k 
    public static int repUnitValue(int n) 
    { 
          
        // To check n is coprime or not 
        if (n % 2 == 0 || n % 5 == 0) 
            return 0; 
  
        // to store the R(k) mod n and  
        // 10^k mod n value 
        int rem = 1; 
        int power = 1; 
        int k = 1; 
        while (rem % n != 0) 
        { 
            k++; 
            power = power * 10 % n; 
            rem = (rem + power) % n; 
        } 
          
        return k; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 13; 
        System.out.println(repUnitValue(n)); 
    } 
} 

