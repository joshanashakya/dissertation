

// Java program to find minimum 
// operations required to 
// make two numbers equal 
class GFG{ 
   
// Function to return the 
// minimum operations required 
static int  minOperations( 
    int  A, 
    int  B) 
{ 
   
    // Keeping B always greater 
    if (A > B) { 
        A = A+B; 
        B = A-B; 
        A = A-B; 
    } 
   
    // Reduce B such that 
    // gcd(A, B) becomes 1. 
    B = B / __gcd(A, B); 
   
    return B - 1; 
} 
static int __gcd(int a, int b)   
{   
    return b == 0? a:__gcd(b, a % b);      
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int  A = 7, B = 15; 
   
    System.out.print(minOperations(A, B) 
         +"\n"); 
   
} 
} 
  
// This code contributed by sapnasingh4991 

