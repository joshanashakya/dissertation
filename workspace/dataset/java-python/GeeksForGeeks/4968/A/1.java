

// Java program to find a  
// subset in which sum of  
// every pair in it is a prime 
import java.io.*; 
  
class GFG 
{ 
    static int MAX = 100001; 
      
    static int []isPrime = new int[MAX]; 
      
    static int sieve() 
    { 
        for (int p = 2;  
                 p * p < MAX; p++)  
        { 
            // If isPrime[p] is  
            // not changed, then 
            // it is a prime 
            if (isPrime[p] == 0)  
            { 
                // Update all 
                // multiples of p 
                for (int i = p * 2;  
                         i < MAX; i += p) 
                    isPrime[i] = 1; 
            } 
        } 
        return -1; 
    }      
    static int findSubset(int []a, int n) 
    { 
        int cnt1 = 0; 
      
        // Counting no. of  
        // ones in the array 
        for (int i = 0; i < n; i++)  
            if (a[i] == 1) 
                cnt1++; 
      
        // Case-I: count of  
        // ones(1s) > 0 and  
        // an integer > 1 is  
        // present in the array 
        if (cnt1 > 0)  
        { 
            for (int i = 0; i < n; i++)  
            { 
                // Find a[i], where 
                // a[i] + 1 is prime. 
                if ((a[i] != 1) &&  
                    (isPrime[a[i] + 1] == 0))  
                { 
                    System.out.println(cnt1 + 1); 
      
                    // Print all  
                    // the ones(1s). 
                    for (int j = 0; 
                             j < cnt1; j++)  
              
                    System.out.print(1 + " "); 
                    System.out.println(a[i]); // print a[i]. 
                    return 0; 
                } 
            } 
        } 
      
        // Case-II: array contains 
        // only ones(1s) 
        if (cnt1 >= 2)  
        { 
            System.out.println(cnt1); 
      
            // Print all ones(1s). 
            for (int i = 0;  
                     i < cnt1; i++)  
                System.out.print(1 + " "); 
      
            System.out.println(); 
            return 0; 
        } 
      
        // Case-III: array does 
        // not contain 1s 
        for (int i = 0; i < n; i++)  
        { 
            for (int j = i + 1;  
                     j < n; j++)  
            { 
                // Find a pair of integers 
                // whose sum is prime 
                if (isPrime[a[i] + a[j]] == 0)  
                { 
                    System.out.println(2); 
                    System.out.println(a[i] + 
                                 " " + a[j]); 
                    return 0; 
                } 
            } 
        } 
      
        // Array contains only  
        // a single element. 
        System.out.println(-1); 
        return -1; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        sieve(); 
        int []A = new int[]{ 2, 1, 1 }; 
        int n = A.length; 
        findSubset(A, n); 
    } 
} 
  
// This code is contributed by  
// Manish Shaw(manishshaw1) 

