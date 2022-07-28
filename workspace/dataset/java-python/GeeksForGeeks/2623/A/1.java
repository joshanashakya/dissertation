

// Java program for the above approach 
  
  
class GFG{ 
   
// Function to find Nth term 
static void findNthTerm(int N) 
{ 
    int ans; 
   
    // Check if N is even 
    if (N % 2 == 0) { 
   
        // Formula for n is even 
        ans = (N / 2) * 6
              + (N / 2) * 2; 
    } 
   
    // Check if N is odd 
    else { 
        // Formula for N is odd 
        ans = (N / 2 + 1) * 6
              + (N / 2) * 2; 
    } 
   
    // Print ans 
    System.out.print(ans +"\n"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 3; 
    findNthTerm(N); 
} 
} 
  
// This code contributed by PrinciRaj1992 

