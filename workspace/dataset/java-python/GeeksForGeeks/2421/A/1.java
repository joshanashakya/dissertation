

// Java program to find Nth number 
import java.io.*; 
  
// calculate Nth term of this series 
class GFG  
{ 
public int nthTerm(int N) 
{ 
    // By using above formula 
    return (N * N * N) + (N * N) + N; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 3; 
    GFG a = new GFG(); 
  
    // call and print Nth term 
    System.out.println(a.nthTerm(N)); 
} 
} 

