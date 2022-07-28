

// Java implementation of the approach  
  
class GFG  
{ 
  
    // Function that returns true if num 
    // is of the form x*x*x*...*y*y*... 
    public static boolean isDivisible(int num, int x, int y)  
    { 
  
        // While num divisible is divible 
        // by either x or y, keep dividing 
        while (num % x == 0 || num % y == 0) 
        { 
            if (num % x == 0) 
                num /= x; 
            if (num % y == 0) 
                num /= y; 
        } 
  
        // If num > 1, it means it cannot be 
        // further divided by either x or y 
        if (num > 1) 
            return false; 
  
        return true; 
    } 
  
    // Funcion to calculate gcd of two numbers 
    // using Euclid's algorithm 
    public static int _gcd(int a, int b)  
    { 
        while (a != b)  
        { 
            if (a > b) 
                a = a - b; 
            else
                b = b - a; 
        } 
  
        return a; 
    } 
  
    // Function that returns true if all 
    // the array elements can be made 
    // equal with the given operation 
    public static boolean isPossible(int[] arr, int n,  
                                        int x, int y) 
    { 
          
        // To store the gcd of the array elements 
        int gcd = arr[0]; 
        for (int i = 1; i < n; i++) 
            gcd = _gcd(gcd, arr[i]); 
  
        // For every element of the array 
        for (int i = 0; i < n; i++) 
        { 
  
            // Check if k is of the form x*x*..*y*y*... 
            // where (gcd * k = arr[i]) 
            if (!isDivisible(arr[i] / gcd, x, y)) 
                return false; 
        } 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int[] arr = { 2, 4, 6, 8 }; 
        int n = arr.length; 
        int x = 2, y = 3; 
        if (isPossible(arr, n, x, y)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

