

// Java program to find minimum speed 
// to finish all jobs 
class GFG 
{ 
  
// Function To findmax value in Array 
static int findmax(int[] A) 
{ 
    int r = A[0]; 
    for(int i = 1; i < A.length; i++) 
    r = Math.max(r, A[i]); 
    return r; 
} 
  
// Function to check if the person can do 
// all jobs in H hours with speed K 
static boolean isPossible(int[] A, int n,  
                          int H, int K) 
{ 
    int time = 0; 
  
    for (int i = 0; i < n; ++i) 
        time += (A[i] - 1) / K + 1; 
  
    return time <= H; 
} 
  
// Function to return the minimum speed 
// of person to complete all jobs 
static int minJobSpeed(int[] A,  
                       int n, int H) 
{ 
    // If H < N it is not possible to  
    // complete all jobs as person can  
    // not move from one element to  
    // another during current hour 
    if (H < n) 
        return -1; 
  
    // Max element of array 
    int max = findmax(A); 
  
    int lo = 1, hi = max; 
  
    // Use binary search to find  
    // smallest K 
    while (lo < hi)  
    { 
        int mi = lo + (hi - lo) / 2; 
        if (!isPossible(A, n, H, mi)) 
            lo = mi + 1; 
        else
            hi = mi; 
    } 
  
    return lo; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int[] A = { 3, 6, 7, 11 }; 
    int H = 8; 
  
    int n = A.length; 
  
    // Print required maxLenwer 
    System.out.println(minJobSpeed(A, n, H)); 
} 
} 
  
// This code is contributed by mits 

