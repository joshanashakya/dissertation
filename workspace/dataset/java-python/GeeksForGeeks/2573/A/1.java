

// Java implementation to find the 
// count of numbers those are  
// powers of K in range L to R 
class GFG{ 
   
// Function to find the  
// Nth root of the number 
static double nthRoot(int A, int N) 
{ 
    // intially guessing a random  
    // number between 0 to 9 
    double xPre = Math.random()*10 % 10; 
   
    // Smaller eps, 
    // denotes more accuracy 
    double eps = 1e-3; 
   
    // Initializing difference between two 
    // roots by Integer.MAX_VALUE 
    double delX = Integer.MAX_VALUE; 
   
    // xK denotes  
    // current value of x 
    double xK = 0; 
   
    // loop untill we reach desired accuracy 
    while (delX > eps)  
    { 
        // calculating current value 
        // from previous value 
        xK = ((N - 1.0) * xPre +  
        (double)A / Math.pow(xPre, N - 1))  
                        / (double)N; 
        delX = Math.abs(xK - xPre); 
        xPre = xK; 
    } 
    return xK; 
} 
   
// Function to count the perfect 
// powers of K in range L to R 
static int countPowers(int a, int b, int k) 
{ 
    return (int) (Math.floor(nthRoot(b, k)) - 
           Math.ceil(nthRoot(a, k)) + 1); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int a = 7, b = 28, k = 2; 
    System.out.print("Count of Powers is "
        + countPowers(a, b, k)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

