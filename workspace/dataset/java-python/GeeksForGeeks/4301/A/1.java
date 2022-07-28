

// Java program to find SUM 
// upto N-th term of the series: 
// -1, 2, 11, 26, 47, 74, ..... 
import java.util.*; 
  
class solution 
{ 
 static int findSum(int N) 
{ 
 return (N * (N + 1) * (2 * N - 5) + 4 * N) / 2; 
} 
  
//driver function 
public static void main(String arr[]) 
{ 
  // Get the value of N 
    int N = 3; 
  
 // Get the sum of the series 
   System.out.println(findSum(N)); 
  
} 
} 
//THis code is contributed by  
//Surendra_Gangwar 

