

// Java implementation of the above approach 
class GFG 
{ 
      
// Function to find minimum number of  
// eliminations such that sum of all  
// adjacent elements is even 
static int min_elimination(int n, int arr[]) 
{ 
    int countOdd = 0; 
  
    // Stores the new value 
    for (int i = 0; i < n; i++) 
  
        // Count odd numbers 
        if (arr[i] % 2 == 1) 
            countOdd++; 
  
    // Return the minimum of even  
    // and odd count 
    return Math.min(countOdd, n - countOdd); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3, 7, 9 }; 
    int n = arr.length; 
  
    System.out.println(min_elimination(n, arr)); 
} 
} 
  
// This code is contributed by Code_Mech 

