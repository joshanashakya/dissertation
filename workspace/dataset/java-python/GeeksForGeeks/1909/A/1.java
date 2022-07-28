

// Java program to count all distinct  
// binary strings with two consecutive 1's 
  
class GFG { 
  
    // Returns count of n length binary  
    // strings with consecutive 1's 
    static int countStrings(int n) 
    { 
     // Count binary strings without consecutive 1's. 
     // See the approach discussed on be 
     // ( http://goo.gl/p8A3sW ) 
        int a[] = new int[n], b[] = new int[n]; 
        a[0] = b[0] = 1; 
  
        for (int i = 1; i < n; i++) { 
            a[i] = a[i - 1] + b[i - 1]; 
            b[i] = a[i - 1]; 
        } 
  
       // Subtract a[n-1]+b[n-1] 
 from 2^n 
        return (1 << n) - a[n - 1] - b[n - 1]; 
    } 
  
// Driver program to test above functions 
   public static void main(String args[]) 
    { 
        System.out.println(countStrings(5)); 
    } 
} 
  
//This code is contributed by Nikita tiwari. 

