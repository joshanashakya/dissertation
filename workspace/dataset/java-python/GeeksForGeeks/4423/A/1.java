

// Java program to interchange  
// the diagonals of matrix 
import java.io.*; 
  
class GFG  
{ 
    public static int N = 3; 
      
    // Function to interchange diagonals 
    static void interchangeDiagonals(int array[][]) 
    { 
        // swap elements of diagonal 
        for (int i = 0; i < N; ++i) 
            if (i != N / 2) 
            { 
                int temp = array[i][i]; 
                array[i][i] = array[i][N - i - 1]; 
                array[i][N - i - 1] = temp; 
            } 
  
        for (int i = 0; i < N; ++i) 
        { 
            for (int j = 0; j < N; ++j) 
                System.out.print(array[i][j]+" "); 
            System.out.println(); 
        } 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int array[][] = { {4, 5, 6}, 
                        {1, 2, 3}, 
                        {7, 8, 9} 
                        }; 
        interchangeDiagonals(array); 
    } 
} 
  
// This code is contributed by Pramod Kumar 

