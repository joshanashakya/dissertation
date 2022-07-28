

// Java code to demonstrate  
// Circular Permutation  
import java.io.*; 
  
class GFG 
{ 
// Function to find no.  
// of permutations  
static int Circular(int n)  
{  
  
    int Result = 1;  
  
    while (n > 0)  
    {  
        Result = Result * n;  
        n--;  
    }  
  
    return Result;  
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 4; 
      
    System.out.println(Circular(n - 1)); 
} 
} 
  
// This code is contributed  
// by Naman_Garg 

