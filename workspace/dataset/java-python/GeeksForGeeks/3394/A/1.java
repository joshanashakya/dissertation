

//Java program for minimum insertions 
// to make a Co-prime Array. 
import java.io.*; 
  
class GFG { 
      
    // Recursive function to return  
    // gcd of a and b 
    static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0 || b == 0) 
        return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
  
        return gcd(a, b-a); 
    } 
      
    static void printResult(int arr[], int n) 
    { 
          
        // Counting adjacent pairs that are not 
        // co-prime. 
        int count = 0; 
  
        for (int i = 1; i < n; i++)      
            if (gcd(arr[i], arr[i - 1]) != 1) 
                count++; 
      
        // No.of insertions 
        System.out.println(count );  
        System.out.print (arr[0] + " "); 
  
        for (int i = 1; i < n; i++)  
        { 
              
            // If pair is not a co-prime insert 1. 
            if (gcd(arr[i], arr[i - 1]) != 1) 
                System.out.print( 1 + " "); 
            System.out.print(arr[i] + " "); 
        } 
    } 
      
    // Driver Function 
    public static void main(String args[]) 
    { 
        int A[] = { 5, 10, 20 }; 
        int n = A.length; 
        printResult(A, n); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

