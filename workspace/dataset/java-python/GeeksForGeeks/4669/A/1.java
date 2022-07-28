

// JAVA code to generate first  
// 'n' terms of Logic sequence 
  
class GFG { 
  
// Function to generate 
// a fixed \number 
public static int logicOfSequence(int N) 
{ 
    if (N % 2 == 0)  
        N = N * N;  
    else
        N = N * N * N;  
    return N; 
} 
  
// Driver Method 
public static void main(String args[]) 
{ 
    int N = 6; 
    System.out.println(logicOfSequence(N)); 
} 
} 
  
// This code is contributed by Jaideep Pyne 

