

// Java implementation of the approach 
class GFG  
{ 
  
// Function to print the largest n-digit even 
// and odd numbers in octal number system 
static void findNumbers(int n) 
{ 
  
    // Append '7' (N - 1) times 
    String ans = ""; 
    for (int i = 0; i < n - 1; i++) 
        ans += '7'; 
  
    // Append '6' for an even number 
    String even = ans + '6'; 
  
    // Append '7' for an odd number 
    String odd = ans + '7'; 
  
    System.out.println("Even : " + even); 
    System.out.println("Odd : " + odd); 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int n = 4; 
  
    findNumbers(n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

