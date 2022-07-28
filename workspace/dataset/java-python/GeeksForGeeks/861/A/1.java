

// Java program to find numbers that are product 
// of exactly two distinct prime numbers 
import java.util.*;   
  
class GFG{ 
// Function to check whether a number 
// is a PerfectSquare or not 
static boolean isPerfectSquare(double x) 
{ 
  
    double sr = Math.sqrt(x); 
  
    return ((sr - Math.floor(sr)) == 0); 
} 
  
// Function to check if a number is a 
// product of exactly two distinct primes 
static boolean isProduct(int num) 
{ 
    int cnt = 0; 
  
    for (int i = 2; cnt < 2 && i * i <= num; ++i) { 
        while (num % i == 0) { 
            num /= i; 
            ++cnt; 
        } 
    } 
  
    if (num > 1) 
        ++cnt; 
  
    return cnt == 2; 
} 
  
// Function to find numbers that are product 
// of exactly two distinct prime numbers. 
static void findNumbers(int N) 
{ 
    // Vector to store such numbers 
    Vector<Integer> vec = new Vector<Integer>(); 
  
    for (int i = 1; i <= N; i++) { 
        if (isProduct(i) && !isPerfectSquare(i)) { 
  
            // insert in the vector 
            vec.add(i); 
        } 
    } 
  
    // Print all numers till n from the vector 
    Iterator<Integer> itr = vec.iterator();   
            while(itr.hasNext()){   
                 System.out.print(itr.next()+" ");   
            }   
} 
  
// Driver function 
public static void main(String[] args) 
{ 
    int N = 30; 
  
    findNumbers(N); 
} 
} 
// This Code is Contributed by mits 

