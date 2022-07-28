

// Java implementation of the above approach 
import java.io.*; 
  
class GFG 
{ 
static int M = 3; 
static int N = 2; 
  
// Function to generate the index of the glass 
// containing the ball 
static void getIndex(int n, int shuffle[][]) 
{ 
    for (int i = 0; i < 3; i++)  
    { 
  
        // Checking if the glasses 
        // being shuffled contain 
        // the ball 
  
        // Change the index 
        if (shuffle[i][0] == n) 
            n = shuffle[i][1]; 
  
        // Change the index 
        else if (shuffle[i][1] == n) 
            n = shuffle[i][0]; 
    } 
  
    // Print the index 
    System.out.println (n); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 3; 
      
    // Storing all the shuffle operation 
    int shuffle[][] = {{ 3, 1 }, 
                       { 2, 1 }, 
                       { 1, 2 }}; 
      
    getIndex(n, shuffle); 
} 
} 
  
// This code is contributed by ajit.  

