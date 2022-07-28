

// Java to check whether given 
// array is breakable or not 
  
class GFG 
{ 
      
// Function to check 
static int checkArray(int []arr, int n) 
{ 
    // Check the result by processing 
    // the first & last element and size 
    return ((arr[0] % 2) > 0 &&  
            (arr[n - 1] % 2) > 0 && 
            (n % 2) > 0) ? 1 : 0; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int []arr = { 1, 2, 3, 4, 5 }; 
    int n = arr.length; 
    System.out.println(checkArray(arr, n)); 
} 
} 
  
// This code contributed by Rajput-Ji 

