

// Java implementation of the approach 
class GFG  
{ 
  
// Function that will find out 
// the valid position 
static int validPosition(int arr[], int N, int K) 
{ 
    int count = 0, sum = 0; 
  
    // find sum of all the elements 
    for (int i = 0; i < N; i++)  
    { 
        sum += arr[i]; 
    } 
  
    // adding K to the element and check 
    // whether it is greater than sum of 
    // all other elements 
    for (int i = 0; i < N; i++) 
    { 
        if ((arr[i] + K) > (sum - arr[i])) 
            count++; 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 1, 6, 7 }, K = 4; 
    int N = arr.length; 
    System.out.println(validPosition(arr, N, K)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

