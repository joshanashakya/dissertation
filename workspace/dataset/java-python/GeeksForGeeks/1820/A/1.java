

// Java program to check if  
// octal representation of  
// a number is prime 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
static int MAX_DIGITS = 20; 
  
/* Function to Check no  
is in octal or not */
static int isOctal(int n) 
{ 
    while (n > 0) 
    { 
        if ((n % 10) >= 8) 
            return 0; 
        else
            n = n / 10; 
    } 
    return 1; 
} 
  
/* Function To check no  
is palindrome or not*/
static int isPalindrome(int n) 
{ 
    // If number is already in  
    // octal, we traverse digits 
    // using repeated division  
    // with 10. Else we traverse  
    // digits using repeated  
    // division with 8 
    int divide = (isOctal(n) == 0) ? 8 : 10; 
  
    // To store individual digits  
    int octal[] = new int[MAX_DIGITS]; 
  
    // Traversing all digits 
    int i = 0; 
    while (n != 0) 
    { 
        octal[i++] = n % divide; 
        n = n / divide; 
    } 
  
    // checking if octal  
    // no is palindrome 
    for (int j = i - 1,  
            k = 0; k <= j; j--, k++) 
        if (octal[j] != octal[k]) 
            return 0; 
  
    return 1; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 97; 
    if (isPalindrome(n) > 0) 
    System.out.print("Yes"); 
    else
    System.out.print("No"); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

