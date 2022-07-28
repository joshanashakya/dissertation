

// Efficient Java program to count passing cars 
class GFG 
{ 
      
// Returns count of passing cars 
static int getPassingCars(int A[], int n) 
{ 
    // Initialize count of 1s from right 
    // and result 
    int countOne = 0, result = 0; 
    while (n >= 1) 
    { 
        if (A[n-1] == 1) 
            countOne++; 
        else
            result += countOne; 
        n--; 
    } 
  
    return result; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int A[] = {0, 1, 0, 1, 1}; 
    int n = A.length; 
    System.out.println(getPassingCars(A, n)); 
} 
} 
  
// This code is contributed by Mukul Singh. 

