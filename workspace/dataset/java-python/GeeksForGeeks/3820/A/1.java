

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the number 
// of set bits in n 
static int setBits(int n) 
{ 
    int count = 0; 
  
    while (n > 0)  
    { 
        n = n & (n - 1); 
        count++; 
    } 
    return count; 
} 
  
// Function to return the count of  
// required pairs 
static int countPairs(int a[], int n) 
{ 
    int count = 0; 
  
    for (int i = 0; i < n - 1; i++) 
    { 
  
        // Set bits for first element  
        // of the pair 
        int setbits_x = setBits(a[i]); 
  
        for (int j = i + 1; j < n; j++)  
        { 
  
            // Set bits for second element  
            // of the pair 
            int setbits_y = setBits(a[j]); 
  
            // Set bits of the resultant number which is 
            // the XOR of both the elements of the pair 
            int setbits_xor_xy = setBits(a[i] ^ a[j]); 
  
            // If the condition is satisfied 
            if (setbits_x + setbits_y == setbits_xor_xy) 
  
                // Increment the count 
                count++; 
        } 
    } 
  
    // Return the total count 
    return count; 
} 
  
    // Driver code 
    public static void main (String[] args) 
    { 
  
        int []a = { 2, 3, 4, 5, 6 }; 
        int n = a.length; 
        System.out.println(countPairs(a, n)); 
    } 
} 
  
// This code is contributed by ajit. 

