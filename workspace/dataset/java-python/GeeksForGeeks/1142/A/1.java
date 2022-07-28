

      
// Java program to print the final String 
// after removing all the occurrences of 
// "10" and "01" from the given binary String 
import java.util.*; 
  
class GFG{ 
   
// Function to print the final String 
// after removing all the occurrences of 
// "10" and "01" from the given binary String 
static void finalString(String str) 
{ 
   
    // Variables to store the 
    // count of 1's and 0's 
    int x = 0, y = 0; 
   
    // Variable left will store 
    // whether 0's or 1's is left 
    // in the final String 
    int left; 
   
    // Length of the String 
    int n = str.length(); 
   
    // For loop to count the occurrences 
    // of 1's and 0's in the String 
    for (int i = 0; i < n; i++) { 
        if (str.charAt(i) == '1') 
            x++; 
        else
            y++; 
    } 
   
    // To check if the count of 1's is 
    // greater than the count of 0's or not. 
    // If x is greater, then those many 1's 
    // are printed. 
    if (x > y) 
        left = 1; 
    else
        left = 0; 
   
    // Length of the final remaining String 
    // after removing all the occurrences 
    int length = n - 2 * Math.min(x, y); 
   
    // Printing the final String 
    for (int i = 0; i < length; i++) { 
        System.out.print(left); 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    String str = "010110100100000"; 
    finalString(str); 
} 
} 
  
// This code is contributed by sapnasingh4991 

