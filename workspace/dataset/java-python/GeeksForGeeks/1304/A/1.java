

// Java implementation of the approach  
  
class GFG  
{  
      
    // Function to find the number of divisors  
    // of all numbers in the range [1, n]  
    static void findDivisors(int n)  
    {  
      
        // Array to store the count  
        // of divisors  
        int[] div = new int[n + 1];  
      
        // For every number from 1 to n  
        for (int i = 1; i <= n; i++)  
        {  
      
            // Increase divisors count for  
            // every number divisible by i  
            for (int j = 1; j * i <= n; j++)  
                div[i * j]++;  
        }  
      
        // Print the divisors  
        for (int i = 1; i <= n; i++)  
            System.out.print(div[i]+" ");  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int n = 10;  
        findDivisors(n);  
    }  
}  
  
// This code is contributed by Ryuga 

