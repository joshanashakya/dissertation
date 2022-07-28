

// Java program to find  
// N-th term of the series:  
// 9, 23, 45, 75, 113...  
  
class GFG  
{ 
  
// calculate Nth term of series  
static int nthTerm(int N)  
{  
    return (2 * N + 3) *  
           (2 * N + 3) - 2 * N;  
}  
  
// Driver code 
public static void main(String[] args) 
{ 
      
    // Get the value of N  
    int N = 4;  
      
    // Find the Nth term  
    // and print it  
    System.out.println(nthTerm(N)); 
} 
} 
  
// This code is contributed by Bilal 

