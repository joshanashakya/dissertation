

// Java implementation of 
// the above approach 
class GFG  
{ 
static int distinct(int []arr, int n) 
{ 
    int count = 0; 
  
    // if array has only one element,  
    // return 1 
    if (n == 1) 
        return 1; 
  
    for (int i = 0; i < n - 1; i++) 
    { 
  
        // For first element compare 
        // with only next element 
        if(i == 0) 
        { 
            if(arr[i] != arr[i + 1]) 
                count += 1; 
        } 
  
        // For remaining elements compare with 
        // both prev and next elements 
        else
        { 
            if(arr[i] != arr[i + 1] ||  
               arr[i] != arr[i - 1]) 
                count += 1; 
        } 
    } 
      
    // For last element compare 
    // with only prev element 
    if(arr[n - 1] != arr[n - 2]) 
        count += 1; 
  
    return count; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = {0, 0, 0, 0, 0, 1, 0}; 
    int n = arr.length; 
    System.out.println(distinct(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

