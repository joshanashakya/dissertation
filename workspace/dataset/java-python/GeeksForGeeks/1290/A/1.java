

// Java implementation of the approach  
class GFG  
{ 
      
    // Function that returns true if n divides  
    // the sum of the factorials of its digits  
    static boolean isPossible(int n)  
    {  
      
        // To store factorials of digits  
        int fac[] = new int[10];  
        fac[0] = fac[1] = 1;  
      
        for (int i = 2; i < 10; i++)  
            fac[i] = fac[i - 1] * i;  
      
        // To store sum of the factorials  
        // of the digits  
        int sum = 0;  
      
        // Store copy of the given number  
        int x = n;  
      
        // Store sum of the factorials  
        // of the digits  
        while (x != 0)  
        {  
            sum += fac[x % 10];  
            x /= 10;  
        }  
      
        // If it is divisible  
        if (sum % n == 0)  
            return true;  
      
        return false;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 19;  
      
        if (isPossible(n))  
            System.out.println("Yes");  
        else
            System.out.println("No");  
      
    }  
} 
  
// This code is contributed by Ryuga 

