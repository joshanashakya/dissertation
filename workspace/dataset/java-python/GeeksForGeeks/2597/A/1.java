

// Java program to find sum of numbers 
// upto n whose 2 bits are set 
public class Main { 
  
    // To count number of set bits 
    static int countSetBits(int n) 
    { 
        int count = 0; 
        while (n > 0) { 
            n &= (n - 1); 
            count++; 
        } 
        return count; 
    } 
  
    // To calculate sum of numbers 
    static int findSum(int n) 
    { 
        int sum = 0; 
  
        // To count sum of number 
        // whose 2 bit are set 
        for (int i = 1; i <= n; i++) 
            if (countSetBits(i) == 2) 
                sum += i; 
  
        return sum; 
    } 
  
    // Driver program to test above function 
    public static void main(String[] args) 
    { 
        int n = 10; 
  
        System.out.println(findSum(n)); 
    } 
} 

