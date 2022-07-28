

import java.util.*; 
// Efficient Java program to  
// find n-th number made of 
// even digits only 
  
class GFG { 
  
// function to find nth number 
// made of even digits only 
    static int findNthEvenDigitNumber(int n) { 
        // If n=1 return 0 
        if (n == 1) { 
            return 0; 
        } 
  
        // vector to store the digits  
        // when converted into base 5 
        Vector< Integer> v = new Vector<>(); 
  
        // Reduce n to n-1 to exclude 0 
        n = n - 1; 
  
        // Reduce n to base 5  
        // number and store digits 
        while (n > 0) { 
            // pushing the digits 
            // into vector 
            v.add(n % 5); 
            n = n / 5; 
        } 
  
        // variable to represent the  
        // number after converting it  
        // to base 5. Since the digits  
        // are be in reverse order,  
        // we traverse vector from back 
        int result = 0; 
        for (int i = v.size() - 1; i >= 0; i--) { 
            result = result * 10; 
            result = result + v.get(i); 
        } 
  
        // return 2*result (to convert  
        // digits 0, 1, 2, 3, 4 to  
        // 0, 2, 4, 6, 8. 
        return 2 * result; 
    } 
  
// Driver Code 
    public static void main(String[] args) { 
        System.out.println(findNthEvenDigitNumber(2)); 
        System.out.println(findNthEvenDigitNumber(10)); 
    } 
} 
// This code is contributed by PrinciRaj1992 

