

// Java program to find the minimum number  
// of elements the need to be changed  
// to get first N numbers of Fibonacci series  
import java.util.*; 
  
class geeks 
{ 
  
    // Function that finds minimum changes required 
    public static int fibonacciArray(int[] arr, int n)  
    { 
        Set<Integer> s = new HashSet<Integer>(); 
  
        // a and b are first two 
        // fibonacci numbers 
        int a = 1, b = 1; 
        int c; 
  
        // insert first n fibonacci elements to set 
        s.add(a); 
        if (n > 2) 
            s.add(b); 
  
        for (int i = 0; i < n - 2; i++) 
        { 
            c = a + b; 
            s.add(c); 
            a = b; 
            b = c; 
        } 
  
        for (int i = 0; i < n; i++) 
        { 
  
            // if fibonacci element is present 
            // in the array then remove it from set 
            if (s.contains(arr[i])) 
                s.remove(arr[i]); 
        } 
  
        // return the remaining number of 
        // elements in the set 
        return s.size(); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] arr = { 3, 1, 21, 4, 2, 1, 8, 9 }; 
        int n = arr.length; 
  
        System.out.print(fibonacciArray(arr, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

