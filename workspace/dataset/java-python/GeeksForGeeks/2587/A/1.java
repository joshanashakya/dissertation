

// Java program to find the N-th  
// term in 1, 11, 55, 239, 991, .... 
class GFG 
{ 
// Function to find the N-th term 
static int numberSequence(int n) 
{ 
    // calculates the N-th term 
    int num = (int)(Math.pow(4, n) -  
                    Math.pow(2, n)) - 1; 
  
    return num; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 4; 
  
    System.out.println(numberSequence(n)); 
} 
} 
  
// This code is contributed  
// by Arnab Kundu 

