

// Java program to find the series with  
// largest GCD and sum equals to n 
import java.io.*; 
  
class GFG { 
  
// function to generate and print the sequence 
static void print_sequence(int n, int k) 
{ 
    // stores the maximum gcd that can be 
    // possible of sequence. 
    int b = n / (k * (k + 1) / 2); 
  
    // if maximum gcd comes out to be 
    // zero then not possible 
    if (b == 0) { 
        System.out.println("-1"); 
  
    } else { 
  
        // the smallest gcd possible is 1 
        int r = 1; 
  
        // traverse the array to find out  
        // the max gcd possible 
        for (int x = 1; x * x <= n; x++) { 
  
            // checks if the number is  
            // divisible or not 
            if (n % x != 0) 
                continue; 
  
            // checks if x is smaller then  
            // the max gcd possible and x  
            // is greater then the resultant  
            // gcd till now, then r=x 
            if (x <= b && x > r) 
                r = x; 
  
            // checks if n/x is smaller than  
            // the max gcd possible and n/x  
            // is greater then the resultant  
            // gcd till now, then r=x 
            if (n / x <= b && n / x > r) 
                r = n / x; 
        } 
  
        // traverses and prints d, 2d, 3d,..., (k-1) 
        for (int i = 1; i < k; i++) 
            System.out.print(r * i + " "); 
  
        // computes the last element of 
        // the sequence n-s. 
        int res = n - (r * (k * (k - 1) / 2)); 
  
        // prints the last element 
        System.out.println(res); 
    } 
} 
  
// driver program to test the above function 
public static void main(String[] args) 
{ 
    int n = 24; 
    int k = 4; 
    print_sequence(n, k); 
  
    n = 24; k = 5; 
    print_sequence(n, k); 
  
    n = 6; k = 4; 
    print_sequence(n, k); 
} 
} 
  
// This code is contributed by Prerna Saini 

