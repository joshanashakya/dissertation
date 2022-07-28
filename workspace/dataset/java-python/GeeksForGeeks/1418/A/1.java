

// Java implementation of the above approach  
class GFG { 
      
    static int matrix[][] = new int[100][100];  
      
    // Function to find the square matrix  
    static void printRequiredMatrix(int n)  
    {  
        // For Matrix of order 1,  
        // it will contain only 1  
        if (n == 1) {  
            System.out.println("1"); 
        }  
      
        // For Matrix of odd order,  
        // it is not possible  
        else if (n % 2 != 0) {  
            System.out.println("-1"); 
        }  
      
        // For Matrix of even order  
        else {  
            // All diagonal elements of the  
            // matrix can be N itself.  
            for (int i = 0; i < n; i++) {  
                matrix[i][i] = n;  
            }  
            int u = n - 1;  
      
            // Assign values at desired  
            // place in the matrix  
            for (int i = 0; i < n - 1; i++) {  
      
                matrix[i][u] = i + 1;  
      
                for (int j = 1; j < n / 2; j++) {  
      
                    int a = (i + j) % (n - 1);  
                    int b = (i - j + n - 1) % (n - 1);  
                    if (a < b) { 
                        int temp = a; 
                        a = b;  
                        b = temp; 
                    } 
                    matrix[b][a] = i + 1;  
                }  
            }  
      
            // Loop to add N in the lower half  
            // of the matrix such that it contains  
            // elements from 1 to 2*N - 1  
            for (int i = 0; i < n; i++)  
                for (int j = 0; j < i; j++)  
                    matrix[i][j] = matrix[j][i] + n;  
      
            // Loop to print the matrix  
            for (int i = 0; i < n; i++) {  
                for (int j = 0; j < n; j++)  
                    System.out.print(matrix[i][j] + " ");  
                System.out.println() ; 
            }  
        }  
    System.out.println(); 
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int n = 1;  
        printRequiredMatrix(n);  
      
        n = 3;  
        printRequiredMatrix(n);  
      
        n = 6;  
        printRequiredMatrix(n);  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

