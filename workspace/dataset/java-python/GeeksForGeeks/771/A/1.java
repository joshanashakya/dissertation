

// Java program to count the 
// number of numbers between  
// 1 and 1000, including both,  
// that are divisible by 3 or 4 
import java.io.*; 
  
class GFG  
{ 
      
// function to count the divisors 
public static int countDivisors(int N,  
                                int a,  
                                int b) 
{ 
    // Counts of numbers  
    // divisible by a and b  
    int count1 = N / a;  
    int count2 = N / b;  
  
    // inclusion-exclusion  
    // principle applied 
    int count3 = (N / (a * b)); 
  
    return count1 + count2 - count3; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int N = 1000, a = 3, b = 4; 
    System.out.println (countDivisors(N, a, b)); 
} 
} 
  
// This code is contributed by m_kit 

