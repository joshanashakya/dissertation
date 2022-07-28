

// Java program to Print Number 
// series without using loop 
  
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
    public static void PrintNumber(int N, int Original, int K, boolean flag) 
    { 
  
        // print the number 
        System.out.print(N + " "); 
  
        // change flag if number 
        // become negative 
        if (N <= 0) 
            flag = !flag; 
  
        // base condition for 
        // second_case (Adding K) 
        if (N == Original && !flag) 
  
            return; 
  
        // if flag is true 
        // we subtract value until 
        // number is greater then zero 
        if (flag == true) 
        { 
            PrintNumber(N - K, Original, K, flag); 
            return; 
        } 
  
        // second case (Addition ) 
        if (!flag) 
        { 
            PrintNumber(N + K, Original, K, flag); 
            return; 
        } 
    } 
  
    public static void main (String[] args) 
    { 
        int N = 20, K = 6; 
        PrintNumber(N, N, K, true); 
    } 
} 
// This code is contributed by Mohit Gupta_OMG 

