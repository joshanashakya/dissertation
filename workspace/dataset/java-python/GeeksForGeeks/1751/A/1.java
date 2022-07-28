

// Java Program to determine  
// the number of unmarked  
// integers in a special sieve 
import java.io.*; 
  
class GFG 
{ 
static int countUnmarked(int N) 
{ 
    if (N % 2 == 0) 
    return N / 2; 
    else
    return N / 2 + 1; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int N = 4; 
    System.out.println("Number of unmarked " +  
                                "elements: " +  
                            countUnmarked(N)); 
} 
} 
  
// This code is contributed 
// by anuj_67. 

