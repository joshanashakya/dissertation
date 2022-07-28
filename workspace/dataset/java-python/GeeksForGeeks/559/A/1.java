

// Java program to find complement  
// of a number with any base b 
class GFG 
{ 
  
// Function to find (b-1)'s complement 
static int prevComplement(int n, int b) 
{ 
    int maxDigit, maxNum = 0,  
        digits = 0, num = n; 
      
    // Calculate number of digits  
    // in the given number 
    while(n != 0) 
    { 
        digits++; 
        n = n / 10; 
    } 
      
    // Largest digit in the number 
    // system with base b 
    maxDigit = b - 1; 
      
    // Largest number in the number 
    // system with base b 
    while((digits--) > 0) 
    { 
        maxNum = maxNum * 10 + maxDigit; 
    } 
      
    // return Complement 
    return maxNum - num; 
} 
  
// Function to find b's complement 
static int complement(int n, int b) 
{  
    // b's complement = (b-1)'s 
    // complement + 1 
    return prevComplement(n, b) + 1; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    System.out.println(prevComplement(25, 7)); 
      
    System.out.println(complement(25, 7)); 
} 
} 
  
// This code is contributed 
// by Kirti_Mangal 

