

// Java program to check if sum of 
// digits of a number divides it 
  
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
// Function to check if sum of 
// digits of a number divides it 
static int isSumDivides(int N) 
{ 
    int temp = N; 
  
    int sum = 0; 
  
    // Calculate sum of all of digits of N 
    while (temp > 0) 
    { 
        sum += temp % 10; 
        temp /= 10; 
    } 
  
    if (N % sum == 0) 
        return 1; 
    else
        return 0; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int N = 12; 
  
    if (isSumDivides(N) == 1) 
        System.out.print("YES"); 
    else
        System.out.print("NO"); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

