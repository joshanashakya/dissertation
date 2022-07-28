

// Java program to find total  
// possible numbers with n 
// digits and weight w 
  
class GFG 
{ 
      
// Function to find total  
// possible numbers with n 
// digits and weight w 
static int findNumbers(int n, int w) 
{ 
    int x = 0, sum = 0; 
  
    // When Weight of an  
    // integer is Positive 
    if (w >= 0 && w <= 8)  
    { 
        // Subtract the weight from 9 
        x = 9 - w; 
    } 
      
    // When weight of an 
    // integer is negative 
    else if (w >= -9 && w <= -1)  
    { 
        // add the weight to 10  
        // to make it positive 
        x = 10 + w; 
    } 
      
    sum = (int)Math.pow(10, n - 2); 
    sum = (x * sum); 
      
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n, w; 
  
    // number of digits in an 
    // integer and w as weight 
    n = 3; 
    w = 4; 
      
    // print the total possible numbers 
    // with n digits and weight w 
    System.out.println(findNumbers(n, w)); 
}  
} 
  
// This code is contributed  
// by ankita_saini 

