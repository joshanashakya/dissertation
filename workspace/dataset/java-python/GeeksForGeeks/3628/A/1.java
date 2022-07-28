

// Java implementation of the approach  
class GFG  
{ 
      
    // Recursive function to  
    // return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        if (b == 0)  
            return a;  
        return __gcd(b, a % b);  
    }  
      
    // Function that returns true if  
    // the exchange is possible  
    static boolean isPossible(int []arr,  
                              int n, int p)  
    {  
      
        // Find the GCD of the array elements  
        int gcd = 0;  
        for (int i = 0; i < n; i++)  
            gcd = __gcd(gcd, arr[i]);  
      
        // If the exchange is possible  
        if (p % gcd == 0)  
            return true;  
      
        return false;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 6, 9 };  
        int n = arr.length;  
        int p = 3;  
      
        if (isPossible(arr, n, p))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
    }  
} 
  
// This code is contributed by AnkitRai01 

