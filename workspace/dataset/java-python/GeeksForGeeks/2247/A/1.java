

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the number of ways 
// the array can be divided into sub-arrays 
// satisfying the given condition 
static int countWays(int arr[], int n) 
{ 
    int pos[] = new int[n];  
    int p = 0, i; 
  
    // for loop for saving the  
    // positions of all 1s 
    for (i = 0; i < n; i++)  
    { 
        if (arr[i] == 1)  
        { 
            pos[p] = i + 1; 
            p++; 
        } 
    } 
  
    // If array contains only 0s 
    if (p == 0) 
        return 0; 
  
    int ways = 1; 
    for (i = 0; i < p - 1; i++)  
    { 
        ways *= pos[i + 1] - pos[i]; 
    } 
  
    // Return the total ways 
    return ways; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int[] arr = { 1, 0, 1, 0, 1 }; 
    int n = arr.length; 
    System.out.println(countWays(arr, n)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai 

