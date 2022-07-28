

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the count 
// of the required numbers 
static int countNum(int N, int arr[]) 
{ 
    // To store the count of required numbers 
    int count = 0; 
    for (int i = 0; i < N; i++)  
    { 
  
        // Initialize sum to 0 
        int sum = 0; 
        for (int j = 0; j < N; j++) 
        { 
  
            // If current element and the 
            // chosen element are same 
            if (i == j) 
                continue; 
  
            // Add all other numbers of array 
            else
                sum += arr[j]; 
        } 
  
        // If sum is divisible by the chosen element 
        if (sum % arr[i] == 0) 
            count++; 
    } 
  
    // Return the count 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 10, 4, 6, 7 }; 
    int n = arr.length; 
    System.out.println(countNum(n, arr)); 
} 
} 
  
// This code is contributed by Code_Mech 

