

// Java program to find count of numbers having 
// odd number of divisors in given range 
  
import java.io.*; 
  
class GFG { 
    // Function to count numbers having odd 
    // number of divisors in range [A, B] 
    static int OddDivCount(int a, int b) 
    { 
        // variable to odd divisor count 
        int res = 0; 
        // iterate from a to b and count their 
        // number of divisors 
        for (int i = a; i <= b; ++i) { 
  
            // variable to divisor count 
            int divCount = 0; 
            for (int j = 1; j <= i; ++j) { 
                if (i % j == 0) { 
                    ++divCount; 
                } 
            } 
  
            // if count of divisor is odd 
            // then increase res by 1 
            if ((divCount % 2) != 0) { 
                ++res; 
            } 
        } 
        return res; 
    } 
  
    // Driver code 
  
    public static void main(String[] args) 
    { 
  
        int a = 1, b = 10; 
        System.out.println(OddDivCount(a, b)); 
    } 
    // This code is contributed by ajit. 
} 

