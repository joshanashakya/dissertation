

// Java program to count the  
// different possible string  
// form by replacing two same  
// characters with one  
class GFG { 
      
    // Array to find the fibonacci  
    // sequence  
    static int fib[] = new int[100005];  
      
    // Function to find the  
    // fibonacci sequence  
    static void computeFibonacci()  
    {  
        fib[0] = 1;  
        fib[1] = 1;  
        for (int i = 2; i < 100005; i++) {  
            fib[i] = fib[i - 1] + fib[i - 2];  
        }  
    }  
      
    // Function to count all  
    // possible strings  
    static int countString(String str)  
    {  
      
        // Initialize ans = 1  
        int ans = 1;  
        int cnt = 1;  
      
        for (int i = 1; i<str.length(); i++) {  
      
            // If two consecutive  
            // char are same  
            // increase cnt  
            if (str.charAt(i) == str.charAt(i - 1)) {  
                cnt++;  
            }  
      
            // Else multiply the  
            // fib[cnt] to ans  
            // and initialize ans  
            // to 1  
            else {  
                ans = ans * fib[cnt];  
                cnt = 1;  
            }  
        }  
           
        // If str = abcdeeee, then  
        // for last "eeee" the  
        // count munst be updated  
        ans = ans * fib[cnt];  
      
        // Return the total count  
        return ans;  
    }  
      
    // Driver's Code  
    public static void main (String[] args)  
    {  
        String str = "abdllldefkkkk";  
      
        // Function to precompute  
        // all the fibonacci number  
        computeFibonacci();  
      
        // Function call to find  
        // the count  
        System.out.println(countString(str));  
    }  
} 
  
// This code is contributed by Yash_R 

