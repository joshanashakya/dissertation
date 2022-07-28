

// Java program to find XOR of pair sums. 
import java.io.*; 
   
class GFG { 
  
// method to find XOR of pair sums 
static int xorPairSum(int ar[], int n) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++)  
        for (int j = 0; j < n; j++)  
            sum = sum ^ (ar[i] + ar[j]); 
    return sum; 
} 
   
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = {1, 2, 3}; 
        int n = arr.length; 
        System.out.print( xorPairSum(arr, n)); 
    } 
} 
  
// This code is contributed by chandan_jnu. 

