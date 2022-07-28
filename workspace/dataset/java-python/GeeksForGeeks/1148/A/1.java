

// Java program for the above approach 
class GFG{ 
   
// Function to find the sum of series 
static void printSeriesSum(int N) 
{ 
    long sum = 0; 
   
    for (int i = 1; i <= N; i++) { 
   
        // Generate the ith term and 
        // add it to the sum 
        sum += Math.pow(i, i - 1); 
    } 
   
    // Print the sum 
    System.out.print(sum +"\n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 5; 
   
    printSeriesSum(N); 
} 
} 
  
// This code is contributed by Princi Singh 

