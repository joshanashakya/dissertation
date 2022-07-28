

// Simple Java program to count passing cars 
class GFG 
{ 
  
// Returns count of passing cars 
static int getPassingCars(int[] A, int n) 
{ 
    int result = 0; 
    for (int i = 0; i < n - 1; i++) 
    { 
    if (A[i] == 0) 
    { 
        for (int j = i + 1; j < n; j++)  
            if (A[j] == 1) 
                result++;  
    }  
    } 
    return result; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int[] A = {0, 1, 0, 1, 1}; 
    int n = A.length; 
    System.out.println(getPassingCars(A, n)); 
} 
} 
  
// This code is contributed 
// by Code_Mech 

