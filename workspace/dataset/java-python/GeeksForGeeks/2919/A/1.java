

// Java program to find Nth term 
// of the series 4, 2, 2, 3, 6, ... 
class GFG 
{ 
  
// Function to find Nth term 
static int nthTerm(int N) 
{ 
    int nth = 0, first_term = 4; 
  
    int pi = 1, po = 1; 
    int n = N; 
    while (n > 1)  
    { 
        pi *= n - 1; 
        n--; 
        po *= 2; 
    } 
  
    // Nth term 
    nth = (first_term * pi) / po; 
  
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

