

// Java implementation  
// of above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to print the 
// maximum intersection  
static int max_intersection(int center[],  
                            int length, int k)  
{  
    Arrays.sort(center);  
  
    // Case 1  
    if (center[2] - center[0] >= 2 * k + length)  
    {  
        return 0;  
    }  
  
    // Case 2  
    else if (center[2] - center[0] >= 2 * k) 
    {  
        return (2 * k - (center[2] -  
                center[0] - length));  
    }  
  
    // Case 3  
    else
        return length;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    int center[] = { 1, 2, 3 };  
    int L = 1;  
    int K = 1;  
    System.out.println( max_intersection(center, L, K));  
}  
} 
  
// This code is contributed 
// by Arnab Kundu 

