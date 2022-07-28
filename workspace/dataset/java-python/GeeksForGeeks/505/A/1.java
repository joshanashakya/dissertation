

// Java Program to check if  
// the nth is odd or even  
// in a sequence where each  
// term is sum of previous 
// two term 
  
// Return if the nth  
// term is even or odd. 
class GFG 
{ 
public static int findNature(int a,  
                             int b, int n) 
{ 
    int[] seq = new int[100]; 
  
    seq[0] = a; 
    seq[1] = b; 
  
    for (int i = 2; i <= n; i++) 
        seq[i] = seq[i - 1] + seq[i - 2]; 
  
    // Return true if odd 
    if((seq[n] & 1) != 0) 
    return 1; 
    else
    return 0; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a = 2, b = 4; 
    int n = 3; 
    if(findNature(a, b, n) == 1) 
    System.out.println("Odd "); 
    else
    System.out.println("Even "); 
} 
} 
  
// This code is contributed 
// by mits 

