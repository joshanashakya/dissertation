

// Java implementation to check the number 
// is divisible by 75 or not 
  
import java.io.*; 
  
class GFG { 
  
  
// check divisibleBy3 
static boolean divisibleBy3(String number) 
{ 
    // to store sum of Digit 
    int sumOfDigit = 0; 
  
    // traversing through each digit 
    for (int i = 0; i < number.length(); i++) 
        // summing up Digit 
        sumOfDigit += number.charAt(i) - '0'; 
  
    // check if sumOfDigit is divisibleBy3 
    if (sumOfDigit % 3 == 0) 
        return true; 
  
    return false; 
} 
  
// check divisibleBy25 
static  boolean divisibleBy25(String number) 
{ 
    // if a single digit number 
    if (number.length() < 2) 
        return false; 
  
    // length of the number 
    int length = number.length(); 
  
    // taking the last two digit 
    int lastTwo = (number.charAt(length - 2) - '0') * 10
                + (number.charAt(length - 1) - '0'); 
  
    // checking if the lastTwo digit is divisibleBy25 
    if (lastTwo % 25 == 0) 
        return true; 
  
    return false; 
} 
  
// Function to check divisibleBy75 or not 
static boolean divisibleBy75(String number) 
{ 
  
    // check if divisibleBy3 and divisibleBy25 
    if (divisibleBy3(number) && divisibleBy25(number)) 
        return true; 
  
    return false; 
} 
  
// Drivers code 
  
    public static void main (String[] args) { 
    String number = "754586672150"; 
  
    // divisible 
    boolean divisible = divisibleBy75(number); 
  
    // if divisibleBy75 
    if (divisible) 
        System.out.println( "Yes"); 
    else
        System.out.println( "No"); 
    } 
} 
// This code is contributed  
// by inder_verma.. 

