

// Java implementation of above approach 
  
import java.util.*; 
  
class GFG 
{ 
      
        static final int MAX=200006; 
        static final int CONS=32766; 
          
        // Function to calculate the value 
        static void calc(int a[], int b[], int lr[], int q, int n) 
        { 
            int M, m, i, j, k, l, r, suma, sumb, cc; 
            cc = 0; 
          
            // forming the prefix sum arrays 
            for (i = 0; i < n - 1; ++i)  
            { 
                a[i + 1] += a[i]; 
                b[i + 1] += b[i]; 
            } 
          
            while (q!=0) 
            { 
                // Taking the query 
                l = lr[cc++]; 
                r = lr[cc++]; 
                l -= 2; 
                r -= 1; 
          
                // finding the sum in the range l to r in array a 
                suma = a[r]; 
          
                // finding the sum in the range l to r in array b 
                sumb = b[r]; 
                if (l >= 0) { 
                    suma -= a[l]; 
                    sumb -= b[l]; 
                } 
          
                // Finding the max value of the function 
                M = Math.max(CONS * suma + CONS * sumb, 
                        -CONS * suma - CONS * sumb); 
                M = Math.max(M, Math.max(CONS * suma - CONS * sumb, 
                            -CONS * suma + CONS * sumb)); 
          
                // Finding the min value of the function 
                m = Math.min(CONS * suma + CONS * sumb, 
                        -CONS * suma - CONS * sumb); 
                m = Math.min(m, Math.min(CONS * suma - CONS * sumb, 
                            -CONS * suma + CONS * sumb)); 
          
                System.out.println((M - m) ); 
                q--; 
            } 
        } 
          
        // Driver code 
        public static void  main(String [] args) 
        { 
            int n = 5, q = 2; 
            int []a = { 0, 7, 3, 4, 5 }; 
            int []b = { 0, 3, 1, 2, 3 }; 
          
            int []lr=new int[q * 2]; 
            lr[0] = 1; 
            lr[1] = 1; 
            lr[2] = 1; 
            lr[3] = 3; 
          
            calc(a, b, lr, q, n); 
          
              
        } 
// This code is contributed by ihritik 
  
} 

