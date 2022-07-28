

// Java Implementation to Count the no. of 
// Sub-arrays which contains all elements 
// from 1 to length of subarray 
class GFG 
{ 
  
// Function to count the number 
// Sub-arrays which contains all elements 
// 1 to length of subarray 
static int countOfSubarrays(int []arr, int n) 
{ 
    int count = 0; 
    int []v = new int[n + 1]; 
  
    // Map all elements of array with their index 
    for (int i = 0; i < n; i++) 
        v[arr[i]] = i; 
  
    // Set the max and min index equal to the 
    // min and max value of integer respectively. 
    int maximum = Integer.MIN_VALUE; 
    int minimum = Integer.MAX_VALUE; 
  
    for (int i = 1; i <= n; i++)  
    { 
  
        // Update the value of maximum index 
        maximum = Math.max(maximum, v[i]); 
  
        // Update the value of minimum index 
        minimum = Math.min(minimum, v[i]); 
  
        // Increase the counter if difference of 
        // max. and min. index is less than the 
        // elements iterated till now 
        if (maximum - minimum < i) 
            count = count + 1; 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 1, 3, 2, 5, 6 }; 
    int n = arr.length; 
    System.out.print(countOfSubarrays(arr, n) +"\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

