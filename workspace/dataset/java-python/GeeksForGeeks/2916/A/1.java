

// Java program to find the Nth term 
// in series 12, 35, 81, 173, 357, ... 
class GFG 
{ 
  
// Function to find Nth term 
static int nthTerm(int N) 
{ 
    int nth = 0, first_term = 12; 
  
    // Nth term 
    nth = (int) ((first_term * (Math.pow(2, N - 1))) 
        + 11 * ((Math.pow(2, N - 1)) - 1)); 
  
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

