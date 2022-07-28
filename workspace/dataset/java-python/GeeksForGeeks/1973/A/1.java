

// Java program to find  
// XOR of pair sums. 
class GFG 
{  
      
static int xorPairSum(int ar[], 
                      int n) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++)  
    sum = sum ^ ar[i]; 
    return 2 * sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 2, 3 }; 
    int n = arr.length; 
    System.out.println( xorPairSum(arr, n)); 
} 
} 
  
// This code is contributed  
// by Arnab Kundu 

