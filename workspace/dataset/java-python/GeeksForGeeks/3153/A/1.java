

// Java program to find number of squares 
// of a*a required to cover n*m rectangle 
import java.util.*; 
  
class solution 
{ 
  
// function to find a number of squares 
// of a*a required to cover n*m rectangle 
static int Squares(int n, int m, int a) 
{ 
  
    return ((m + a - 1) / a) * ((n + a - 1) / a); 
  
} 
  
// Driver code 
public static void main(String arr[]) 
{ 
    int n = 6, m = 6, a = 4; 
  
    // function call 
    System.out.println(Squares(n, m, a)); 
  
} 
  
} 
//This code is contributed by Surendra_Gangwar 

