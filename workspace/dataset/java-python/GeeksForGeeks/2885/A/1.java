

// Java program to Find m-th number whose 
// sum of digits of a number until 
// sum becomes single digit is N 
class GFG 
{ 
  
// Function to find the M-th 
// number whosesum till one digit is N 
static int findNumber(int n, int m) 
{ 
    int num = (m - 1) * 9 + n; 
    return num; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 2, m = 5; 
    System.out.print(findNumber(n, m)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai 

