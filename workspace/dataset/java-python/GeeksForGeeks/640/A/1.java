

// Java program to find Fibonacci series numbers 
// in a given array 
import java.io.*; 
import java.math.*; 
  
class GFG { 
    // Function to check number is a 
    // perfect square or not 
    static boolean isPerfectSquare(int num) 
    { 
        int n = (int)(Math.sqrt(num)); 
        return (n * n == num); 
    } 
  
    // Function to check if the number 
    // is in Fibonacci or not 
    static void checkFib(int array[], int n) 
    { 
        int count = 0; 
        for (int i = 0; i < n; i++) { 
            if (isPerfectSquare(5 * array[i] * array[i] + 4) || isPerfectSquare(5 * array[i] * array[i] - 4)) { 
                System.out.print(array[i] + " "); 
                count++; 
            } 
        } 
        if (count == 0) 
            System.out.println("None Present"); 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        int array[] = { 4, 2, 8, 5, 20, 1, 40, 13, 23 }; 
        int n = array.length; 
        checkFib(array, n); 
    } 
} 
  
// Contributed by Pramod Kumar 

