

// C# code to check whether 
// a matrix is orthogonal or not 
using System; 
  
class GFG 
{ 
    //static int MAX =100; 
  
    static bool isOrthogonal(int[,]a,  
                             int m,  
                             int n)  
    { 
        if (m != n) 
            return false; 
          
        // Multiply A*A^t 
        for (int i = 0; i < n; i++)  
        { 
            for (int j = 0; j < n; j++) 
            { 
          
            int sum = 0; 
            for (int k = 0; k < n; k++)  
            { 
          
                // Since we are multiplying 
                // with transpose of itself.  
                // We use a[j][k] instead  
                // of a[k][j] 
                sum = sum + (a[i, k] * a[j, k]); 
            } 
          
            if (i == j && sum != 1) 
                return false; 
            if (i != j && sum != 0) 
                return false; 
            } 
        } 
          
        return true; 
    } 
      
    // Driver code  
    public static void Main () 
    { 
        int [,]a = {{1, 0, 0}, 
                    {0, 1, 0}, 
                    {0, 0, 1}}; 
        if (isOrthogonal(a, 3, 3)) 
            Console.WriteLine("Yes"); 
        else
            Console.WriteLine("No"); 
          
    } 
} 
  
// This code is contributed by vt_m 

