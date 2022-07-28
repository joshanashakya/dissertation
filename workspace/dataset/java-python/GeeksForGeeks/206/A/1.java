

// Java implementation to find the 
// minimum elements required to  
// be inserted into an array to 
// form an arithmetic progression 
   
class GFG{ 
   
    // Function to find the greatest  
    // common divisor of two numbers 
    static int gcdFunc(int a, int b) 
    { 
        if (b == 0)  
            return a;  
        return gcdFunc(b, a % b); 
    } 
       
    // Function to find the minimum  
    // the minimum number of elements 
    // required to be inserted into array 
    static int findMinimumElements(int[] a, int n) 
    { 
        int[] b = new int[n - 1]; 
           
        // Difference array of consecutive  
        // elements of the array 
        for (int i = 1; i < n; i++) { 
            b[i - 1] = a[i] - a[i - 1]; 
        } 
        int gcd = b[0]; 
           
        // GCD of the difference array 
        for (int i = 0; i < n - 1; i++) { 
            gcd = gcdFunc(gcd, b[i]); 
        } 
        int ans = 0; 
           
        // Loop to calculate the minimum 
        // number of elements required 
        for (int i = 0; i < n - 1; i++) { 
            ans += (b[i] / gcd) - 1; 
        } 
        return ans; 
    } 
       
 // Driver Code 
public static void main(String[] args) 
{ 
    int arr1[] = { 1, 6, 8, 10, 14, 16 }; 
    int n1 = arr1.length; 
    // Function calling 
    System.out.print(findMinimumElements(arr1, n1)  
         +"\n"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

