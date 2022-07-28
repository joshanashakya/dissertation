

// Java program to check if XOR of 
// all numbers in range [L, R] 
// is Even or odd 
  
class GFG { 
  
    // Function to check if XOR of all numbers 
    // in range [L, R] is Even or Odd 
  
    static String isEvenOrOdd(int L, int R) 
    { 
        // Count odd Numbers in range [L, R] 
        int oddCount = (R - L) / 2; 
  
        if (R % 2 == 1 || L % 2 == 1) 
            oddCount++; 
  
        // Check if count of odd Numbers 
        // is even or odd 
  
        if (oddCount % 2 == 0) 
            return "Even"; 
        else
            return "Odd"; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        int L = 5, R = 15; 
  
        System.out.println(isEvenOrOdd(L, R)); 
    } 
} 

