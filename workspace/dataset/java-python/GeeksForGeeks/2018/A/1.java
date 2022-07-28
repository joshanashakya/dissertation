

// Java implementation of the above approach 
class GFG  
{ 
    final static int TEN = 10;  
      
    // Function to return the  
    // sum of digits of n  
    static int digitSum(int n)  
    {  
        int sum = 0;  
        while (n > 0)  
        {  
      
            // Add last digit to the sum  
            sum += n % TEN;  
      
            // Remove last digit  
            n /= TEN;  
        }  
        return sum;  
    }  
      
    // Function to return the nth term  
    // of the required series  
    static int getNthTerm(int n)  
    {  
        int sum = digitSum(n);  
      
        // If sum of digit is already  
        // a multiple of 10 then append 0  
        if (sum % TEN == 0)  
            return (n * TEN);  
      
        // To store the minimum digit  
        // that must be appended  
        int extra = TEN - (sum % TEN);  
      
        // Return n after appending  
        // the required digit  
        return ((n * TEN) + extra);  
    }  
      
    // Function to print the first n terms  
    // of the requried series  
    static void firstNTerms(int n)  
    {  
        for (int i = 1; i <= n; i++)  
            System.out.print(getNthTerm(i) + " ");  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 10;  
      
        firstNTerms(n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

