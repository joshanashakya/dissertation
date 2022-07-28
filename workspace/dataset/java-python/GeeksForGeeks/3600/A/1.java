

// Java implementation of above approach 
  
class GFG { 
      
// function that calculates the 
// maximum no. of cuts 
static int numberOfCuts(int M, int N) 
{ 
    int result = 0; 
  
    result = (M - 1) * (N - 1); 
  
    return result; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int M = 4, N = 4; 
  
    // Calling function. 
    int Cuts = numberOfCuts(M, N); 
  
    System.out.println("Maximum cuts = " + Cuts); 
  
} 
} 

