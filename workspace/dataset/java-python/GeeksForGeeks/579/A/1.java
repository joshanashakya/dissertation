

// Java code to find the probability  
// of search key K present in array 
class GFG 
{ 
  
// Function to find the probability 
static float kPresentProbability(int a[], 
                                 int n,  
                                 int k) 
{ 
    float count = 0; 
      
    for (int i = 0; i < n; i++)  
        if (a[i] == k) 
            count++; 
      
    // find probability 
    return count/ n; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int A[] = { 4, 7, 2, 0, 8, 7, 5 }; 
    int K = 2; 
    int N = A.length; 
    double n = kPresentProbability(A, N, K); 
    double p = (double)Math.round(n * 100) / 100; 
    System.out.println(p); 
} 
} 
  
// This code is contributed 
// by ChitraNayal 

