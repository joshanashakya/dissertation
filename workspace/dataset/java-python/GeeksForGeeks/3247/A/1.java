

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the minimized sum 
static int minSum(int arr[], int n, int x) 
{ 
    int sum = 0; 
  
    // To store the largest element 
    // from the array which is 
    // divisible by x 
    int largestDivisible = -1,  
        minimum = arr[0]; 
    for (int i = 0; i < n; i++)  
    { 
  
        // Sum of array elements before 
        // performing any operation 
        sum += arr[i]; 
  
        // If current element is divisible  
        // by x and it is maximum so far 
        if (arr[i] % x == 0 &&  
            largestDivisible < arr[i]) 
            largestDivisible = arr[i]; 
  
        // Update the minimum element 
        if (arr[i] < minimum) 
            minimum = arr[i]; 
    } 
  
    // If no element can be reduced then  
    // there's no point in performing the  
    // operation as we will end up increasing 
    // the sum when an element is multiplied by x 
    if (largestDivisible == -1) 
        return sum; 
  
    // Subtract the chosen elements from the  
    // sum and then add their updated values 
    int sumAfterOperation = sum - minimum - largestDivisible +  
                            (x * minimum) + (largestDivisible / x); 
  
    // Return the minimized sum 
    return Math.min(sum, sumAfterOperation); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 5, 5, 5, 6 }; 
    int n =arr.length; 
    int x = 3; 
    System.out.println(minSum(arr, n, x)); 
} 
} 
  
// This code is contributed  
// by Code_Mech 

