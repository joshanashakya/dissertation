

// Java program to find sum of numbers 
// upto n whose 2 bits are set 
public class Main { 
  
    // To calculate sum of numbers 
    static int findSum(int n) 
    { 
        int sum = 0; 
  
        // Find numbers whose 2 bits are set 
        for (int i = 1; 1 << i < n; i++) { 
            for (int j = 0; j < i; j++) { 
                int num = (1 << i) + (1 << j); 
  
                // If number is greater then n 
                // we don't include this in sum 
                if (num <= n) 
                    sum += num; 
            } 
        } 
  
        // Return sum of numbers 
        return sum; 
    } 
  
    // Driver program to test findSum() 
    public static void main(String[] args) 
    { 
        int n = 10; 
        System.out.println(findSum(n)); 
    } 
} 

