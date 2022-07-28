

// Java program to find position 
// of only set bit in a given number 
  
class GFG { 
    static int Log2n(int n) 
    { 
        return (n > 1) ? 1 + Log2n(n / 2) : 0; 
    } 
  
    static boolean isPowerOfTwo(int n) 
    { 
        return n > 0 && ((n & (n - 1)) == 0); 
    } 
  
    static int findPosition(int n) 
    { 
        if (!isPowerOfTwo(n)) 
            return -1; 
        return Log2n(n) + 1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 0; 
        int pos = findPosition(n); 
        if (pos == -1) 
            System.out.println("n = " + n + ", Invalid number "); 
        else
            System.out.println("n = " + n + ", Position " + pos); 
  
        n = 12; 
        pos = findPosition(n); 
        if (pos == -1) 
            System.out.println("n = " + n + ", Invalid number "); 
        else
            System.out.println("n = " + n + ", Position " + pos); 
  
        n = 128; 
        pos = findPosition(n); 
        if (pos == -1) 
            System.out.println("n = " + n + ", Invalid number "); 
        else
            System.out.println("n = " + n + ", Position " + pos); 
    } 
} 
  
// This code is contributed by mits 

