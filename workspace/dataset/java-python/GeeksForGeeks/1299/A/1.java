

// Java implementation of the approach 
class GFG 
{ 
  
// Function to find the required fractions 
static void find_numbers(int N) 
{ 
    // Base condition 
    if (N == 1)  
    { 
        System.out.print(-1); 
    } 
  
    // For N > 1 
    else 
    { 
        System.out.print(N + " " + (N + 1) +  
                             " " + (N * (N + 1))); 
    } 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int N = 5; 
  
    find_numbers(N); 
} 
} 
  
// This code is contributed by Rajput-Ji 

