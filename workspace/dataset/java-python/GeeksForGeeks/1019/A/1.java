

// Java program to make all array 
// element even 
class GFG 
{ 
  
// Function to count the total 
// number of operations needed to make 
// all array element even 
static int countOperations(int arr[], int n) 
{ 
    int count = 0; 
  
    // Traverse the given array 
    for (int i = 0; i < n - 1; i++) 
    { 
  
        // If an odd element occurs 
        // then increment that element 
        // and next adjacent element 
        // by 1 
        if (arr[i] % 2 == 1)  
        { 
            arr[i]++; 
            arr[i + 1]++; 
            count += 2; 
        } 
    } 
  
    // Traverse the array if any odd 
    // element occurs then return -1 
    for (int i = 0; i < n; i++) 
    { 
        if (arr[i] % 2 == 1) 
            return -1; 
    } 
  
    // Returns the count of operations 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 3, 4, 5, 6 }; 
    int n = arr.length; 
    System.out.print(countOperations(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

