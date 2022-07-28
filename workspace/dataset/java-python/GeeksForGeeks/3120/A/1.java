

// Java program to check if a number is formed 
// by Concatenation of 1, 14 or 144 only 
  
import java.io.*; 
  
class GFG { 
      
  
// Function to check if a number is formed 
// by Concatenation of 1, 14 or 144 only 
static String checkNumber(int N) 
{ 
    int temp = N; 
  
    while (temp > 0) { 
        // check for each possible digit 
        // if given number consist other then 
        // 1, 14, 144 print NO else print YES 
        if (temp % 1000 == 144) 
            temp /= 1000; 
        else if (temp % 100 == 14) 
            temp /= 100; 
        else if (temp % 10 == 1) 
            temp /= 10; 
        else { 
            return "NO"; 
        } 
    } 
  
    return "YES"; 
} 
  
// Driver Code 
  
  
    public static void main (String[] args) { 
        int N = 1414; 
  
    System.out.println(checkNumber(N)); 
    } 
} 
// This code is contributed by anuj_67.. 

