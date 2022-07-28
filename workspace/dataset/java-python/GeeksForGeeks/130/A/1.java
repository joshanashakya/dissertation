

// JAVA program to find the number of  
// distinct Bitwise XORs formed by rearranging  
// two binary strings  
  
class GFG  
{ 
    // function to compute modular exponentiation 
    // i.e. to find (a^b) % mod  
    static long mod_power(long a, long b, 
                          long mod) 
    { 
        long result = 1l; 
        while(b > 0) 
        { 
            if((b&1) == 0) // b is even 
            { 
                result = a * a; 
                a %= mod; 
                b /= 2; 
            } 
            else // b is odd 
            { 
                result = result * a; 
                result %= mod; 
            } 
        } 
        return result; 
    } 
  
    // method to evaluate nCr modulo p 
    // over an interval 
    static long nCr_RangeSum(long n, long r1,  
                            long r2, long p) 
    { 
  
        // initializing numerator  
        // and denominator 
        long num = 1, den = 1; 
  
        // initialize the sum  
        long sum = 0l; 
  
        // nC0 is 1 
        if(r1 == 0) 
            sum += 1l; 
  
        // Iterating through the range 
        for(int i = 0; i < r2; i++) 
        { 
  
            // computing the numerator 
            num = (num * (n - i)) % p; 
              
            // computing the denominator 
            den = (den * (i + 1)) % p;  
  
            // If 'i' lies between the given range  
            // and is at an even interval from   
            // the starting range because   
            // the combinations at a step of 2   
            // is required  
            if(i - r1 >= -1 && (i - r1 + 1) % 2 == 0)  
            { 
                // Computing nCr and adding the value  
                // to the sum    
                sum += (num * mod_power(den, p - 2, p)) % p;  
                sum %= p;  
            } 
        } 
        return sum; 
    } 
      
    // method to find the number of 
    // distinct XORs formed by  
    // rearrangement of two binary strings 
    static long compute(String A, String B, int N) 
    { 
        // Initializing the counter variables  
        // to 0  
        int c0A = 0, c1A = 0, c0B = 0, c1B = 0;  
  
        // Iterating through A's characters  
        for (char c : A.toCharArray())  
        {  
  
            // Increment the c1A variable  
            // if the current element is 1  
            if (c == '1')  
                c1A += 1;  
  
            // Increment the c0A variable  
            // if the current element is 0  
            else if (c == '0')  
                c0A += 1;  
            }  
  
        // Iterating through B's characters  
        for (char c : B.toCharArray()) 
        {  
  
            // Increment the c1B variable  
            // if the current element is 1  
            if (c == '1')  
                c1B += 1;  
  
            // Increment the c0A variable  
            // if the current element is 0  
            else if (c == '0')  
                c0B += 1;  
        }  
        // Finding the minimum number of '1's in the XOR  
        // and the maximum number of '1's in the XOR  
        int max1xor = Math.min(c0A, c1B) + Math.min(c1A, c0B);  
        int min1xor = N - Math.min(c0B, c0A) - Math.min(c1A, c1B);  
  
        // Compute the number of combinations between  
        // the minimum number of 1's and the maximum  
        // number of 1's and perform modulo with 10^9 + 7  
        long ans =  nCr_RangeSum(N, min1xor, max1xor, 1000000000 + 7); 
  
        // Return the answer  
        return ans;  
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int N = 3; // length of each string 
          
        String A = "010";  
        String B = "100";  
          
        System.out.print(compute(A, B, N)); 
    } 
} 
  
// This Code is contributed by Soumitri Chattopadhyay. 

