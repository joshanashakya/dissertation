

//Java program to find Nth term of the series 
// 2 + 6 + 13 + 23 + 36 + ... 
import java.io.*; 
  
class GFG { 
  
// calculate Nth term of given series 
static int Nth_Term(int n) 
{ 
      
return (int)(3 * Math.pow(n, 2) - n + 2) / (2); 
  
} 
  
// Driver code 
  
    public static void main (String[] args) { 
    int N = 5; 
    System.out.println(Nth_Term(N)); 
    } 
} 
// This code is contributed by anuj_67.. 

