

// Java implementation of above apporach 
import java.io.*; 
  
class GFG  
{ 
      
static int N = 4; 
  
// Function to count steps in 
// conversion of matrix into upper 
// Hessenberg matrix 
static int stepsRequired(int arr[][]) 
{ 
    int result = 0; 
    for (int i = 0; i < N; i++) 
    { 
  
        for (int j = 0; j < N; j++)  
        { 
            if (j > i + 1) 
                result += Math.abs(arr[i][j]); 
        } 
    } 
    return result; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
  
    int [][]arr = { {1, 2, 3, 2}, 
                    {3, 1, 0, 3}, 
                    {3, 2, 1, 3}, 
                    {-3, 4, 2, 1} 
                    }; 
  
    System.out.println (stepsRequired(arr)); 
} 
} 
  
// The code is contributed by ajit. 

