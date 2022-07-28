

// Java implementation of the approach  
class GFG 
{ 
  
// Function to generate the required matrix  
static void solve(long n)  
{  
    long initial_array[][]= new long[(int)n - 1][(int)n - 1],  
                    final_array[][]= new long[(int)n][(int)n];  
  
    for (long i = 0; i < n - 1; ++i)  
        initial_array[0][(int)i] = i + 1;  
  
    // Form cyclic array of elements 1 to n-1  
    for (long i = 1; i < n - 1; ++i)  
        for (long j = 0; j < n - 1; ++j)  
            initial_array[(int)i][(int)j]  
                = initial_array[(int)i - 1][(int)((int)j + 1) % ((int)n - 1)];  
  
    // Store initial array into final array  
    for (long i = 0; i < n - 1; ++i)  
        for (long j = 0; j < n - 1; ++j)  
            final_array[(int)i][(int)j] = initial_array[(int)i][(int)j];  
  
    // Fill the last row and column with 0's  
    for (long i = 0; i < n; ++i)  
        final_array[(int)i][(int)n - 1] = final_array[(int)n - 1][(int)i] = 0;  
  
    for (long i = 0; i < n; ++i)  
    {  
        long t0 = final_array[(int)i][(int)i];  
        long t1 = final_array[(int)i][(int)n - 1];  
  
        // Swap 0 and the number present  
        // at the current indexed row  
        long s = final_array[(int)i][(int)i]; 
        final_array[(int)i][(int)i]=final_array[(int)i][(int)n - 1]; 
        final_array[(int)i][(int)n - 1]=s; 
  
        // Also make changes in the last row  
        // with the number we swapped  
        final_array[(int)n - 1][(int)i] = t0;  
    }  
  
    // Print the final array  
    for (long i = 0; i < n; ++i)  
    {  
        for (long j = 0; j < n; ++j)  
            System.out.print( final_array[(int)i][(int)j] + " ");  
        System.out.println(); 
    }  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    long n = 5;  
    solve(n);  
} 
} 
  
// This code is contributed by Arnab Kundu  
    

