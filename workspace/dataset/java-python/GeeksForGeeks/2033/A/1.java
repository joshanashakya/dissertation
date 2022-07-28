

// Java program to print the largest 
// integer not greater than N with all even digits 
class GFG 
{ 
      
// function to return the largest number 
// with all digits even 
static int largestNumber(int n) 
{ 
    String s = ""; 
    int duplicate = n; 
  
    // convert the number to a string for  
    // easy operations 
    while (n > 0)  
    { 
        s = (char)(n % 10 + 48) + s; 
        n /= 10; 
    } 
  
    int index = -1; 
  
    // find first odd digit 
    for (int i = 0; i < s.length(); i++) 
    { 
        if ((((int)(s.charAt(i) - '0') % 2) & 1) > 0) 
        { 
            index = i; 
            break; 
        } 
    } 
  
    // if no digit, then N is the answer 
    if (index == -1) 
        return duplicate; 
  
    int num = 0; 
  
    // till first odd digit, add all even numbers 
    for (int i = 0; i < index; i++) 
        num = num * 10 + (int)(s.charAt(i) - '0'); 
  
    // decrease 1 from the odd digit 
    num = num * 10 + ((int)s.charAt(index) - (int)('0') - 1); 
  
    // add 0 in the rest of the digits 
    for (int i = index + 1; i < s.length(); i++) 
        num = num * 10 + 8; 
  
    return num; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int N = 24578; 
  
    System.out.println(largestNumber(N)); 
} 
} 
  
// This code is contributed by mits 

