

// Java Program to determine if 
// number N of given form is  
// divisible by 3 or not  
import java.io.*; 
  
public class GFG { 
  
// function returns true if number N is  
// divisible by 3 otherwise false,  
// dig0 - most significant digit  
// dig1 - 2nd most significant digit 
// K - number of digits  
static boolean multipleOfThree(int K,  
                               int dig0,  
                               int dig1) 
{ 
      
    // sum of digits 
    long sum = 0; 
  
    // store the sum of first two digits 
    // modulo 10 in a temporary variable 
    int temp = (dig0 + dig1) % 10; 
  
    sum = dig0 + dig1; 
  
    // if the number N is a two digit number 
    if (K == 2) { 
        if (sum % 3 == 0) 
            return true; 
        else
            return false; 
    } 
  
    // add temp to sum to get the sum 
    // of first three digits which are 
    // not a part of cycle 
    sum += temp; 
  
    // get the number of groups in cycle 
    long numberofGroups = (K - 3) / 4; 
  
    // get the remaining number of digits 
    int remNumberofDigits = (K - 3) % 4; 
  
    // add sum of 20 for each group (2, 4, 8, 6) 
    sum += (numberofGroups * 20); 
  
    // find the remaining sum of  
    // remaining digits 
    for (int i = 0; i < remNumberofDigits; i++) 
    { 
        temp = (2 * temp) % 10; 
        sum += temp; 
    } 
  
    // check if it is divisible by 3 or not 
    if (sum % 3 == 0) 
        return true; 
    else
        return false; 
} 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
            int K = 5, dig0 = 3, dig1 = 4; 
            if (multipleOfThree(K, dig0, dig1)) 
                System.out.println("Yes"); 
            else
                System.out.println("No"); 
          
    } 
} 
  
// This code is contributed by vt_m. 

