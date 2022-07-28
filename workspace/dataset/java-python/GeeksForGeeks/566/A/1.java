

// Java program to check if Decimal  
// representation of an Octal number  
// is divisible by 7 or not 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
      
// Function to check Divisibility 
static int check(int n) 
{ 
    int sum = 0; 
  
    // Sum of all individual digits 
    while (n != 0)  
    { 
        sum += n % 10; 
        n = n / 10; 
    } 
  
    // Condition 
    if (sum % 7 == 0) 
        return 1; 
    else
        return 0; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    // Octal number 
    int n = 25; 
  
    String s=(check(n) == 1) ?  
                       "YES" : "NO"; 
    System.out.println(s); 
} 
} 
  
// This code is contributed 
// by Subhadeep 

