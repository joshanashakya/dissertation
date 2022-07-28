

// Java implementation of the approach  
class GFG  
{ 
  
// Function to return the maximum count  
// of required elements  
static int findMax(int arr[], int n) 
{  
    int res = 0; 
    int i, j; 
      
    // For every element in the array starting  
    // from the second element  
    for(i = 0; i < n ; i++) 
    { 
          
        // Check all the elements on the left  
        // of current element which are divisible  
        // by the current element  
        int count = 0; 
        for(j = 0; j < i; j++) 
        {  
            if (arr[j] % arr[i] == 0)  
                count += 1; 
        } 
        res = Math.max(count, res); 
    } 
    return res; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int arr[] = {8, 1, 28, 4, 2, 6, 7}; 
    int n = arr.length;  
    System.out.println(findMax(arr, n)); 
} 
} 
  
// This code is contributed by AnkitRai01 

