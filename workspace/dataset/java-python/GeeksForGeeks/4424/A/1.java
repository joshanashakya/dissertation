

// Java Program to print the Diagonals of a Matrix  
class GFG  
{ 
      
    static final int MAX = 100;  
      
    // Function to print the Principal Diagonal  
    static void printPrincipalDiagonal(int mat[][], int n)  
    {  
        System.out.print("Principal Diagonal: ");  
      
        for (int i = 0; i < n; i++)  
        {  
      
            // Condition for principal diagonal  
            System.out.print(mat[i][i] + ", ");  
        }  
        System.out.println(); 
    }  
      
    // Function to print the Secondary Diagonal  
    static void printSecondaryDiagonal(int mat[][], int n)  
    {  
        System.out.print("Secondary Diagonal: ");  
      
        for (int i = 0; i < n; i++)  
        {  
      
            // Condition for secondary diagonal  
            System.out.print(mat[i][n - i - 1] + ", ");  
        }  
      
        System.out.println(); 
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 4;  
        int a[][] = { { 1, 2, 3, 4 },  
                        { 5, 6, 7, 8 },  
                        { 1, 2, 3, 4 },  
                        { 5, 6, 7, 8 } };  
      
        printPrincipalDiagonal(a, n);  
        printSecondaryDiagonal(a, n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

