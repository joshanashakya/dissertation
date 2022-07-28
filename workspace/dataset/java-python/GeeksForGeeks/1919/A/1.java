

import java.util.*; 
class GFG{ 
// Java program to check whether the number 
// can be made palindrome number after adding K 
  
// Function to check whether a number 
// is a palindrome or not 
static void checkPalindrome(int num) 
{ 
  
    // Convert num to string 
    String str = Integer.toString(num); 
  
    int l = 0, r = str.length() - 1; 
  
    // Comparing kth character from the 
    // beginning and N - kth character 
    // from the end. If all the characters 
    // match, then the number is a palindrome 
    while (l < r) { 
  
        if (str.charAt(l) != str.charAt(r)) { 
            System.out.print("No"); 
            return; 
        } 
        l++; 
        r--; 
    } 
  
    // If all the above conditions satisfy, 
    // it means that the number is a palindrome 
    System.out.print("Yes"); 
    return; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 19, k = 3; 
  
    checkPalindrome(n + k); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

