

// Java implementation of the approach 
class GFG  
{ 
      
// Function to return the minimum cost 
// to make each array element equal 
static int minCost(int arr[], int n) 
{ 
    // To store the count of even numbers 
    // present in the array 
    int count_even = 0; 
  
    // To store the count of odd numbers 
    // present in the array 
    int count_odd = 0; 
  
    // Iterate through the array and 
    // find the count of even numbers 
    // and odd numbers 
    for (int i = 0; i < n; i++)  
    { 
        if (arr[i] % 2 == 0) 
            count_even++; 
        else
            count_odd++; 
    } 
  
    return Math.min(count_even, count_odd); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 4, 3, 1, 5 }; 
    int n = arr.length; 
  
    System.out.println(minCost(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

