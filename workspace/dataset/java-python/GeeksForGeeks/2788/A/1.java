

// Java program to find the N-th number with 
// digital root as X 
  
class GfG 
{ 
  
    // Function to find the N-th number with 
    // digital root as X 
    static int findAnswer(int X, int N)  
    { 
        return (N - 1) * 9 + X; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int X = 7, N = 43; 
        System.out.println(findAnswer(X, N)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

