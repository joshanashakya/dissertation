

// Java implementation of the approach 
class GFG 
{ 
  
    // Function to return the GCD 
    // of a and b 
    static int GCD(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        return GCD(b, a % b); 
    } 
  
    // Function to return the count of reachable 
    // integers from the given array 
    static int findReachable(int[] arr, int D, int A, 
                    int B, int n) 
    { 
  
        // GCD of A and B 
        int gcd_AB = GCD(A, B); 
  
        // To store the count of reachable integers 
        int count = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // If current element can be reached 
            if ((arr[i] - D) % gcd_AB == 0) 
                count++; 
        } 
  
        // Return the count 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
  
        int arr[] = { 4, 5, 6, 7, 8, 9 }; 
        int n = arr.length; 
        int D = 4, A = 4, B = 6; 
  
        System.out.println(findReachable(arr, D, A, B, n)); 
  
    } 
} 
  
// This code is contributed by Rajput-Ji 

