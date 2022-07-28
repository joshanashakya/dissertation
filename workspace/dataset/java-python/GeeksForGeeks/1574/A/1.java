

// Java program to find first 
// N Icanobif numbers 
  
public class GFG{ 
  
    // Iterative function to 
    // reverse digits of num 
    static int reversDigits(int num) 
    { 
        int rev_num = 0; 
      
        while (num > 0) { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
      
        return rev_num; 
    } 
      
    // Function to print first 
    // N Icanobif Numbers 
    static void icanobifNumbers(int N) 
    { 
        // Initialize first, second numbers 
        int first = 0, second = 1; 
      
        if (N == 1) 
            System.out.print(first); 
        else if (N == 2) 
             System.out.print(first + " " + second); 
        else { 
            // Print first two numbers 
            System.out.print(first + " " + second + " "); 
      
            for (int i = 3; i <= N; i++) { 
      
                // Reversing digit of previous 
                // two terms and adding them 
                int x = reversDigits(first); 
                int y = reversDigits(second); 
      
                 System.out.print(x + y + " "); 
      
                int temp = second; 
                second = x + y; 
                first = temp; 
            } 
        } 
    } 
      
    // Driver Code 
    public static void main(String []args){ 
        int N = 12; 
      
        icanobifNumbers(N); 
     } 
     // This code is contributed by ANKITRAI1 
} 

