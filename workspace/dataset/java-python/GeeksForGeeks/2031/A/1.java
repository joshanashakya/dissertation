

// Java program to print the  
// smallest integer not less 
// than N with all even digits 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
// function to return  
// the answer when the 
// first odd digit is 9 
static int trickyCase(String s,  
                      int index) 
{ 
  
    int index1 = -1; 
  
    // traverse towwars the left  
    // to find the non-8 digit 
    for (int i = index - 1; i >= 0; i--)  
    { 
        // index digit 
        int digit = s.charAt(i) - '0'; 
  
        // if digit is not 8, 
        // then break 
        if (digit != 8)  
        { 
            index1 = i; 
            break; 
        } 
    } 
      
    // if on the left side of the  
    // '9', no 8 is found then we 
    // return by adding a 2 and 0's 
    if (index1 == -1) 
        return 2 * (int)Math.pow(10, s.length()); 
  
    int num = 0; 
  
    // till non-8 digit  
    // add all numbers 
    for (int i = 0; i < index1; i++) 
        num = num * 10 + (s.charAt(i) - '0'); 
  
    // if non-8 is even or odd  
    // than add the next even. 
    if (s.charAt(index1) % 2 == 0) 
        num = num * 10 +  
            (s.charAt(index1) - '0' + 2); 
    else
        num = num * 10 +  
            (s.charAt(index1) - '0' + 1); 
  
    // add 0 to right of 9 
    for (int i = index1 + 1;  
            i < s.length(); i++) 
        num = num * 10; 
  
    return num; 
} 
  
// function to return  
// the smallest number 
// with all digits even 
static int smallestNumber(int n) 
{ 
    int num = 0; 
    String s = ""; 
  
    int duplicate = n; 
      
    // convert the number to  
    // string to perform operations 
    while (n > 0)  
    { 
        s = (char)(n % 10 + 48) + s; 
        n /= 10; 
    } 
  
    int index = -1; 
  
    // find out the 
    // first odd number 
    for (int i = 0; i < s.length(); i++)  
    { 
        int digit = s.charAt(i) - '0'; 
        int val = digit & 1; 
        if (val == 1) 
        { 
            index = i; 
            break; 
        } 
    } 
  
    // if no odd numbers are there, 
    // than n is the answer 
    if (index == -1) 
        return duplicate; 
  
    // if the odd number is 9, 
    // than tricky case handles it 
    if (s.charAt(index) == '9')  
    { 
        num = trickyCase(s, index); 
        return num; 
    } 
  
    // add all digits till first odd 
    for (int i = 0; i < index; i++) 
        num = num * 10 +  
             (s.charAt(i) - '0'); 
  
    // increase the  
    // odd digit by 1 
    num = num * 10 +  
        (s.charAt(index) - '0' + 1); 
  
    // add 0 to the right 
    // of the odd number 
    for (int i = index + 1;  
             i < s.length(); i++) 
        num = num * 10; 
  
    return num; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int N = 2397; 
    System.out.print(smallestNumber(N)); 
} 
} 
  
// This code is contributed 
// by Akanksha rai(Abby_akku) 

