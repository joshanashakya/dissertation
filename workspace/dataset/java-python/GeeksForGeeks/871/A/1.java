

// Java implementation to print elements of 
// the Array which can be expressed as 
// power of some integer to given exponent K 
  
class GFG{ 
   
// Method returns Nth power of A 
static double nthRoot(long A, long N) 
{ 
   
    double xPre = 7; 
   
    // Smaller eps, denotes more accuracy 
    double eps = 1e-3; 
   
    // Initializing difference between two 
    // roots by Integer.MAX_VALUE 
    double delX = Integer.MAX_VALUE; 
   
    // x^K denotes current value of x 
    double xK = 0; 
   
    // loop untill we reach desired accuracy 
    while (delX > eps) { 
   
        // calculating current value from previous 
        // value by newton's method 
        xK = ((N - 1.0) * xPre 
              + (double)A / Math.pow(xPre, N - 1)) 
             / (double)N; 
   
        delX = Math.abs(xK - xPre); 
        xPre = xK; 
    } 
   
    return xK; 
} 
   
// Function to check 
// whether its k root 
// is an integer or not 
static boolean check(long no, int k) 
{ 
    double kth_root = nthRoot(no, k); 
    long num = (long) kth_root; 
   
    if (Math.abs(num - kth_root) < 1e-4) 
        return true; 
   
    return false; 
} 
   
// Function to find the numbers 
static void printExpo(long arr[], int n, int k) 
{ 
    for (int i = 0; i < n; i++) { 
        if (check(arr[i], k)) 
            System.out.print(arr[i]+ " "); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    int K = 6; 
   
    long arr[] = { 46656, 64, 256, 
                 729, 16, 1000 }; 
    int n = arr.length; 
   
    printExpo(arr, n, K); 
   
} 
} 
  
// This code is contributed by sapnasingh4991 

