

// Java program to answer multiple queries of 
// divisibility by 3 in substrings of a number 
class GFG  
{ 
  
    // Array to store the sum of digits 
    static int sum[] = new int[1000005]; 
  
    // Utility function to evaluate a character's 
    // integer value 
    static int toInt(char x)  
    { 
        return x - '0'; 
    } 
  
    // This function receives the string representation 
    // of the number and precomputes the sum array 
    static void prepareSum(String s) 
    { 
        sum[0] = 0; 
        for (int i = 0; i < s.length(); i++)  
        { 
            sum[i + 1] = sum[i] + toInt(s.charAt(i)); 
        } 
    } 
  
    // This function receives l and r representing 
    // the indices and prints the required output 
    static void query(int l, int r)  
    { 
        if ((sum[r + 1] - sum[l]) % 3 == 0)  
        { 
            System.out.println("Divisible by 3"); 
        }  
        else
        { 
            System.out.println("Not divisible by 3"); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String n = "12468236544"; 
  
        prepareSum(n); 
        query(0, 1); 
        query(1, 2); 
        query(3, 6); 
        query(0, 10); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

