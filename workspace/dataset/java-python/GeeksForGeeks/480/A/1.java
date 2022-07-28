

// Java implementation of the approach 
class GFG 
{ 
  
// function to return the count 
static int count_greater(int arr[], int n) 
{ 
    int min = Integer.MAX_VALUE; 
    int counter = 0; 
  
    // Comparing the given element 
    // with minimum element till 
    // occurred till now. 
    for (int i = n - 1; i >= 0; i--) 
    { 
        if (arr[i] > min) 
        { 
            counter++; 
        } 
  
        // Updating the min variable 
        if (arr[i] <= min) 
        { 
            min = arr[i]; 
        } 
    } 
    return counter; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 2, 1, 2, 3, 4, 5 }; 
    int n = arr.length; 
  
    System.out.println(count_greater(arr, n)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

