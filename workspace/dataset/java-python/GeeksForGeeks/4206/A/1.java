

// Java implementation of the approach 
  
class GFG 
{ 
      
// Function to return the count of valid pairs 
static int countPairs(int arr[], int n) 
{ 
    int cnt = 0; 
  
    // Check all possible pairs 
    for (int i = 0; i < n - 1; i++) 
        for (int j = i + 1; j < n; j++) 
            if ((arr[i] | arr[j]) <= Math.max(arr[i], arr[j])) 
                cnt++; 
  
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3 }; 
    int n = arr.length; 
    System.out.println(countPairs(arr, n)); 
} 
} 
  
// This code is Contributed by Code_Mech. 

