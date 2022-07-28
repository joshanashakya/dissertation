

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the count of 
// set bits in all the integers 
// from the range [1, n] 
static int countSetBits(int n) 
{ 
  
    // To store the required count 
    // of the set bits 
    int cnt = 0; 
  
    // To store the count of set 
    // bits in every integer 
    int []setBits = new int[n + 1]; 
  
    // 0 has no set bit 
    setBits[0] = 0; 
  
    // 1 has a single set bit 
    setBits[1] = 1; 
  
    // For the rest of the elements 
    for (int i = 2; i <= n; i++)  
    { 
  
        // If current element i is even then 
        // it has set bits equal to the count 
        // of the set bits in i / 2 
        if (i % 2 == 0)  
        { 
            setBits[i] = setBits[i / 2]; 
        } 
  
        // Else it has set bits equal to one 
        // more than the previous element 
        else
        { 
            setBits[i] = setBits[i - 1] + 1; 
        } 
    } 
  
    // Sum all the set bits 
    for (int i = 0; i <= n; i++)  
    { 
        cnt = cnt + setBits[i]; 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 6; 
  
    System.out.println(countSetBits(n)); 
} 
} 
  
// This code is contributed by Princi Singh 

