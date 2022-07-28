

// Java program to find quotient of array 
// elements 
  
import java.io.*; 
  
class GFG { 
  
    // Function to calculate the quotient 
    // of every element of the array 
    static void calculate(int a[], int b[],  
                                int n, int m) 
    { 
          
        int mul = 1; 
  
        // Calculate the product of all  
        // elements 
        for (int i = 0; i < m; i++) 
            if (b[i] != 0) 
                mul = mul * b[i]; 
  
        // To calculate the quotient of every 
        // array element 
        for (int i = 0; i < n; i++) { 
            int x = (int)Math.floor(a[i] / mul); 
            System.out.print(x + " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int a[] = { 5, 100, 8 }; 
        int b[] = { 2, 3 }; 
        int n = a.length; 
        int m = b.length; 
          
        calculate(a, b, n, m); 
    } 
} 
  
// This code is contributed by Ajit. 

