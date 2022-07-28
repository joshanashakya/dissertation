

// Java program to find number of digits in N that 
// divide N. 
import java.util.*; 
  
class solution 
{ 
  
// Utility function to check divisibility by digit 
static boolean divisible(String N, int digit) 
{ 
    int ans = 0; 
    for (int i = 0; i < N.length(); i++) 
    { 
        // (N[i]-'0') gives the digit value and 
        // form the number 
        ans = (ans*10 + (N.charAt(i)-'0')); 
        ans %= digit; 
    } 
    return (ans == 0); 
} 
  
// Function to count digits which appears in N and 
// divide N 
// divide[10] --> array which tells that particular 
//                 digit divides N or not 
// count[10] --> counts frequency of digits which 
//                 divide N 
static int allDigits(String N) 
{ 
    // We initialize all digits of N as not divisible 
    // by N. 
    Boolean[] divide = new Boolean[10]; 
    Arrays.fill(divide, Boolean.FALSE); 
    divide[1] = true; // 1 divides all numbers 
  
    // start checking divisibility of N by digits 2 to 9 
    for (int digit=2; digit<=9; digit++) 
    { 
        // if digit divides N then mark it as true 
        if (divisible(N, digit)) 
            divide[digit] = true; 
    } 
  
    // Now traverse the number string to find and increment 
    // result whenever a digit divides N. 
    int result = 0; 
    for (int i=0; i<N.length(); i++) 
    { 
        if (divide[N.charAt(i)-'0'] == true) 
            result++; 
    } 
  
    return result; 
} 
  
// Driver program to run the case 
public static void main(String args[]) 
{ 
    String N = "122324"; 
    System.out.println(allDigits(N)); 
} 
  
} 
// This code is contributed by Surendra_Gangwar 

