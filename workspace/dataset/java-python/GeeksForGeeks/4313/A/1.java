

// Java program to print the required pattern  
  
public class GFG{ 
  
    // Function to print the required pattern  
    static void printPattern(int n)  
    {  
        // arr[][] will store the pattern matrix  
        int arr[][] = new int[n][n] ; 
        int k, i, j, p = 1, f ;  
      
        // Store the values for upper triangle  
        // of the pattern  
        for (k = 0; k < n; k++) {  
            j = k;  
            i = 0;  
            while (j >= 0) {  
                arr[i][j] = p;  
                p++;  
                i = i + 1;  
                j = j - 1;  
            }  
        }  
      
        // Store the values for lower triangle  
        // of the pattern  
        for (k = 1; k < n; k++) {  
            i = k;  
            j = n - 1;  
            f = k;  
            while (j >= f) {  
                arr[i][j] = p;  
                p++;  
                i = i + 1;  
                j = j - 1;  
            }  
        }  
      
        // Print the pattern  
        for (i = 0; i < n; i++) {  
            for (j = 0; j < n; j++) {  
                System.out.print(arr[i][j] + " ") ;  
            }  
            System.out.println() ; 
        }  
    }  
      
    // Driver code  
    public static void main(String []args)  
    {  
        int n = 3;  
      
        printPattern(n);  
    }  
    // This code is contributed by Ryuga 
  
} 

