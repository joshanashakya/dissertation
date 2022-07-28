

// Java program to find the maximum  
// number of elements divisible by 3  
import java.io.*; 
  
class GFG  
{ 
      
    // Function to find the maximum  
    // number of elements divisible by 3  
    static int MaxNumbers(int a[], int n)  
    {  
        // To store frequency of each number  
        int []fre = { 0,0,0 };  
      
        for (int i = 0; i < n; i++) 
        {  
            // Store modulo value  
            a[i] %= 3;  
      
            // Strore frequency  
            fre[a[i]]++;  
        }  
      
        // Add numbers with zero modulo to answer  
        int ans = fre[0];  
      
        // Find minimum of elements with modulo  
        // frequency one and zero  
        int k = Math.min(fre[1], fre[2]);  
      
        // Add k to the answer  
        ans += k;  
      
        // Remove them from frequency  
        fre[1] -= k;  
        fre[2] -= k;  
      
        // Add numbers possible with  
        // remaining frequency  
        ans += fre[1] / 3 + fre[2] / 3;  
      
        // Return the required answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    { 
        int a[] = { 1, 4, 10, 7, 11, 2, 8, 5, 9 };  
      
        int n = a.length;  
      
        // Function call  
        System.out.println(MaxNumbers(a, n));  
    } 
} 
  
// This code is contributed by @@ajit.. 

