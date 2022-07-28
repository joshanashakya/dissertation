

// A simple Java program to find first natural 
// number whose factorial divides x 
class GFG { 
  
    // Returns first number whose factorial 
    // divides x. 
    static int firstFactorialDivisibleNumber(int x) 
    { 
        int i = 1; // Result 
        int fact = 1; 
        for (i = 1; i < x; i++) { 
            fact = fact * i; 
            if (fact % x == 0) 
                break; 
        } 
  
        return i; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int x = 16; 
        System.out.print(firstFactorialDivisibleNumber(x)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

