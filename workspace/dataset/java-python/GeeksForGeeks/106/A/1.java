

// Java program to find the 
// minimum number of digits 
// to be removed to make a  
// large number divisible by 3. 
import java.io.*; 
  
// function to count the no 
// of removal of digits 
// to make a very large  
// number divisible by 3 
class GFG 
{ 
static int divisible(String num) 
{ 
    int n = num.length(); 
  
    // add up all the 
    // digits of num 
    int sum = 0; 
    for(int i = 0; i < n; i++) 
    sum += (int)(num.charAt(i)); 
  
    // if num is already is  
    // divisible by 3 then  
    // no digits are to be  
    // removed 
    if (sum % 3 == 0) 
        return 0; 
  
    // if there is single digit,  
    // then it is not possible  
    // to remove one digit. 
    if (n == 1) 
        return -1; 
  
    // traverse through the number  
    // and find out if any number  
    // on removal makes the sum  
    // divisible by 3 
    for (int i = 0; i < n; i++) 
        if (sum % 3 == (num.charAt(i) - '0') % 3) 
            return 1; 
  
    // if there are two numbers  
    // then it is not possible  
    // to remove two digits. 
    if (n == 2) 
        return -1; 
  
    // Otherwise we can always  
    // make a number multiple  
    // of 2 by removing 2 digits. 
    return 2; 
} 
  
// Driver Code 
    public static void main (String[] args) { 
  
    String num = "1234"; 
    System.out.println(divisible(num)); 
} 
} 
  
// This code is contributed by Raj 

