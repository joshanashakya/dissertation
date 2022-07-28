

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
   
// Function to print the series 
static void printSeries(int N) 
{ 
   
    int ith_term = 0; 
   
    // Generate the ith term and 
    // print it 
    for (int i = 1; i <= N; i++) { 
   
        ith_term = i % 2 == 0
                       ? 2 * i * i + 1
                       : 2 * i * i - 1; 
        System.out.print(ith_term+ ", "); 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 7; 
   
    printSeries(N); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

