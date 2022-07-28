

// Java implementation of above approach  
class GFG 
{ 
  
    // Function to check if the  
    // given number is divisible  
    // by sum of its digits  
    static String isDivisible(long n)  
    {  
        long temp = n;  
      
        // Find sum of digits  
        int sum = 0;  
        while (n != 0)  
        {  
            int k = (int) n % 10;  
            sum += k;  
            n /= 10;  
        }  
      
        // check if sum of digits divides n  
        if (temp % sum == 0)  
            return "YES";  
      
        return "NO";  
    }  
      
    // Driver Code  
    public static void main(String []args) 
    {  
        long n = 123;  
        System.out.println(isDivisible(n));  
    }  
} 
  
// This code is contributed by Ryuga 

