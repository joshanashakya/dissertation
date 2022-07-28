

// Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
      
  
  
// function to return the odd sum 
static long  Odd_Sum(int n) 
{ 
  
    // total odd elements upto n 
    long  total = (n + 1) / 2; 
  
    // sum of odd elements upto n 
    long  odd = total * total; 
  
    return odd; 
} 
  
// function to return the even sum 
static long  Even_Sum(int n) 
{ 
  
    // total even elements upto n 
    long  total = (n) / 2; 
  
    // sum of even elements upto n 
    long  even = total * (total + 1); 
  
    return even; 
} 
  
// Function to find sum from L to R. 
static long sumLtoR(int L, int R) 
{ 
  
    long  odd_sum, even_sum; 
  
    odd_sum = Odd_Sum(R) - Odd_Sum(L - 1); 
  
    even_sum = Even_Sum(R) - Even_Sum(L - 1); 
  
    // return final sum from L to R 
    return even_sum - odd_sum; 
} 
  
// Driver Program 
  
    public static void main (String[] args) { 
        int L = 1, R = 5; 
  
    // function call to print answer 
    System.out.println( sumLtoR(L, R)); 
    } 
} 
// This code is contributed by shs.. 

