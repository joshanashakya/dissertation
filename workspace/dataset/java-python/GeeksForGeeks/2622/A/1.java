

// Java program for the above approach 
class GFG{ 
   
// Function to find Nth term 
static void findNthTerm(int N) 
{ 
    int ans = 0; 
   
    // Iterate from 1 till Nth term 
    for (int i = 0; i < N; i++) { 
   
        // Check if i is even and 
        // then add 6 
        if (i % 2 == 0) { 
            ans = ans + 6; 
        } 
   
        // Else add 2 
        else { 
            ans = ans + 2; 
        } 
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
  
// This code is contributed by PrinciRaj1992 

