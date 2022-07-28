

// Java program for the above approach 
class GFG{ 
   
// Function to find the sum of series 
static void printSeriesSum(int N) 
{ 
    double sum = 0; 
   
    for (int i = 1; i <= N; i++) { 
   
        // Generate the ith term and 
        // add it to the sum if i is 
        // even and subtract if i is 
        // odd 
        if (i % 2 == 1) { 
            sum += (double)i / (i + 1); 
        } 
        else { 
            sum -= (double)i / (i + 1); 
        } 
    } 
   
    // Print the sum 
    System.out.print(sum +"\n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 10; 
   
    printSeriesSum(N); 
} 
} 
  
// This code is contributed by 29AjayKumar 

