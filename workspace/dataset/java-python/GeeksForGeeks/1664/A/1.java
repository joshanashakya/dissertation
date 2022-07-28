

// Java implementation to find the  
// sum of all perfect numbers  
// lying in the range [L, R]  
class GFG { 
      
    // Array to store the sum  
    static int pref [] = new int[10000];  
      
    // Function to check if a number is  
    // a perfect number or not  
    static int isPerfect(int n)  
    {  
        int sum = 1;  
      
        // Iterating till the square root  
        // of the number and checking if  
        // the sum of divisors is equal  
        // to the number or not  
        for (int i = 2; i * i <= n; i++) {  
            if (n % i == 0) {  
                if (i * i != n)  
                    sum = sum + i + n / i;  
                else
                    sum = sum + i;  
            }  
        }  
      
        // If it is a perfect number, then  
        // return the number  
        if (sum == n && n != 1)  
            return n;  
      
        // Else, return 0  
        return 0;  
    }  
      
    // Function to precompute the sum  
    // of perfect squares and store  
    // then in an array  
    static void precomputation()  
    {  
        for (int i = 1; i < 10000; ++i) {  
            pref[i] = pref[i - 1] + isPerfect(i);  
        }  
    }  
      
    public static void main (String[] args) 
    {  
      
        int L = 6, R = 28;  
      
        precomputation();  
      
        System.out.println(pref[R] - pref[L - 1]);  
      
    }  
  
} 
  
// This code is contributed by AnkitRai01 

