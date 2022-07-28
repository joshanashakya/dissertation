

// Efficient Java Program to find the  
// largest divisor not divisible by any  
// perfect square greater than 1  
  
public class GFG 
{ 
  
    // Function to find the largest  
    // divisor not divisible by any  
    // perfect square greater than 1  
    static int findLargestDivisor(int n)  
    {  
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {  
              
            // If the number is divisible  
            // by i*i, then remove one i  
            while (n % (i * i) == 0) {  
                n = n / i;  
            }  
        }  
          
        // Now all squares are removed from n  
        return n;      
    }  
      
    // Driver Code  
    public static void main(String args[])  
    {  
        int n = 12;  
        System.out.println(findLargestDivisor(n)) ; 
      
        n = 97;  
        System.out.println(findLargestDivisor(n)) ; 
      
    }  
    // This code is contributed 
    // by Ryuga 
} 

