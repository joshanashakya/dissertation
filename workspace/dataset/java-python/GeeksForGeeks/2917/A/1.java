

// Java program to find Nth term 
// of the series 2, 3, 10, 15, 26.... 
class GFG 
{ 
  
// Function to find Nth term 
static int nthTerm(int N) 
{ 
    int nth = 0; 
  
    // Nth term  
    if (N % 2 == 1) 
        nth = (N * N) + 1; 
    else
        nth = (N * N) - 1; 
  
    return nth; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 5; 
  
    System.out.print(nthTerm(N) +"\n"); 
  
} 
} 
  
// This code is contributed by Rajput-Ji 

