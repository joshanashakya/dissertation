

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the time taken 
// per hour for stoppage 
static int numberOfMinutes(int S, int S1) 
{ 
    int Min = 0; 
  
    Min = (int) (((S - S1) / Math.floor(S)) * 60); 
  
    return Min; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int S = 30, S1 = 10; 
  
    System.out.println(numberOfMinutes(S, S1) + " min"); 
} 
} 
  
// This code is contributed by Princi Singh 

