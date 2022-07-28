

// Java program to find the converging element 
// of the diagonals in a square matrix 
class GFG 
{ 
  
    // Driver code 
    public static void main(String args[])  
    { 
        int n = 5; 
        int a[][] = {{1, 2, 3, 4, 5}, 
                     {5, 6, 7, 8, 6}, 
                     {9, 5, 6, 8, 7}, 
                     {2, 3, 5, 6, 8}, 
                     {1, 2, 3, 4, 5}}; 
  
        int convergingele, mid; 
        int i, j; 
  
        // If n is even, then convergence 
        // element will be null. 
        if (n % 2 == 0)  
        { 
            System.out.printf("NULL\n"); 
        }  
        else 
        { 
            // finding the mid 
            mid = n / 2; 
  
            // finding the converging element 
            convergingele = a[mid][mid]; 
  
            System.out.printf("%d\n", convergingele); 
        } 
    } 
} 
  
// This code is contributed by Rajput-Ji 

