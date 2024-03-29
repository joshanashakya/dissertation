

// Java program to illustrate the given problem 
public class base_power { 
    static int calculate(int n, int power) 
    { 
        int sum = 0; 
        int bp = (int)Math.pow(n, power); 
        while (bp != 0) { 
            int d = bp % 10; 
            sum += d; 
            bp /= 10; 
        } 
        return sum; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 5; 
        int power = 4; 
        System.out.println(calculate(n, power)); 
    } 
} 

