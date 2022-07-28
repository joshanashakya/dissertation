

// Java program to find sum 
// upto N-th term of the series: 
// 23, 45, 75, 113... 
import java.util.*; 
  
class solution  
{ 
      
static int findSum(int N) 
{ 
    //return the final sum 
    return (2 * N * (N + 1) * (4 * N + 17) + 54 * N) / 6; 
} 
  
//Driver program 
public static void main(String arr[]) 
{ 
// Get the value of N 
    int N = 4; 
  
// Get the sum of the series 
 System.out.println(findSum(N)); 
  
} 
} 

