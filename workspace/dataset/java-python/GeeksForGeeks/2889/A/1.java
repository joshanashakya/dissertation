

// Java program to find nth number  
// made up of odd digits only  
  
import java.io.*; 
  
class GFG { 
    // Function to return nth number made up of odd digits only  
static int findNthOddDigitNumber(int n)  
{  
  
    // Variable to keep track of how many  
    // such elements have been found  
    int count = 0;  
    for (int i = 1;; i++) {  
        int num = i;  
        boolean isMadeOfOdd = true;  
  
        // Checking each digit of the number  
        while (num != 0) {  
  
            // If 0, 2, 4, 6 or 8 is found  
            // then the number is not made up of odd digits  
            if (num % 10 == 0 
                || num % 10 == 2 
                || num % 10 == 4 
                || num % 10 == 6 
                || num % 10 == 8) {  
                isMadeOfOdd = false;  
                break;  
            }  
  
            num = num / 10;  
        }  
  
        // If the number is made up of odd digits only  
        if (isMadeOfOdd == true)  
            count++;  
  
        // If it is the nth number  
        if (count == n)  
            return i;  
    }  
}  
  
// Driver Code  
      
    public static void main (String[] args) { 
    int n = 10;  
    System.out.println (findNthOddDigitNumber(n));  
          
    } 
//This code is contributed by ajit     
} 

