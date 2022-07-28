

// Java implementation of above approach 
  
import java.io.*; 
  
  
class GFG { 
    // Recursive function to return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        // Everything divides 0   
        if (a == 0)  
          return b;  
        if (b == 0)  
          return a;  
         
        // base case  
        if (a == b)  
            return a;  
         
        // a is greater  
        if (a > b)  
            return __gcd(a-b, b);  
        return __gcd(a, b-a);  
    }  
       
  
// Function to return the number of cuts 
// required to divide a circle into equal parts 
static int Parts(int Arr[], int N) 
{ 
    int factor = Arr[1] - Arr[0]; 
    for (int i = 2; i < N; i++) { 
        factor = __gcd(factor, Arr[i] - Arr[i - 1]); 
    } 
  
    // Since last part is connected with the first 
    factor = __gcd(factor, 360 - Arr[N - 1] + Arr[0]); 
  
    int cuts = (360 / factor) - N; 
  
    return cuts; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
    int Arr[] = { 0, 1 }; 
    int N = Arr.length; 
  
    System.out.println( Parts(Arr, N)); 
    } 
} 
// This code is contributed by anuj_67.. 

