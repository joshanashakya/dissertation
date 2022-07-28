

// Java program to find minimum number 
// of elements to add so that its  
// median equals x. 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    public static int minNumber(int a[], 
                           int n, int x) 
    { 
        int l = 0, h = 0, e = 0; 
        for (int i = 0; i < n; i++) 
        { 
  
            // no. of elements equals to 
            // x, that is, e. 
            if (a[i] == x) 
                e++; 
  
            // no. of elements greater 
            // than x, that is, h. 
            else if (a[i] > x) 
                h++; 
  
            // no. of elements smaller 
            // than x, that is, l. 
            else if (a[i] < x) 
                l++; 
        } 
  
        int ans = 0; 
        if (l > h)  
            ans = l - h; 
        else if (l < h)  
            ans = h - l - 1; 
      
        // subtract the no. of elements  
        // that are equal to x. 
        return ans + 1 - e; 
    } 
  
    // Driven Program 
    public static void main(String[] args) 
    { 
        int x = 10; 
        int a[] = { 10, 20, 30 }; 
        int n = a.length; 
        System.out.println( 
                      minNumber(a, n, x)); 
    } 
} 
  
// This code is contributed by  
// Prasad Kshirsagar 

