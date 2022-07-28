

// Java implementation of the above approach 
import java.util.*; 
  
class GFG { 
  
    // this store all prime number 
    // upto 10^5 
    // this function find all prime 
    static Vector<Integer> findPrime(int MAX) 
    { 
        boolean pm[] = new boolean[MAX + 1]; 
        for (int i = 0; i < pm.length; i++) 
            pm[i] = true; 
  
        // use sieve to find prime 
        pm[0] = pm[1] = false; 
        for (int i = 2; i <= MAX; i++) 
            if (pm[i]) 
                for (int j = 2 * i; j <= MAX; j += i) 
                    pm[j] = false; 
  
        // if number is prime then 
        // store it in prime vector 
        Vector<Integer> prime = new Vector<Integer>(); 
        for (int i = 0; i <= MAX; i++) 
            if (pm[i]) 
                prime.add(i); 
  
        return prime; 
    } 
  
    static int max_element(int arr[]) 
    { 
        int max = arr[0]; 
  
        for (int i = 0; i < arr.length; i++) 
            max = Math.max(max, arr[i]); 
  
        return max; 
    } 
  
    // Function to find the smallest prime missing 
    static int findSmallest(int arr[], int n) 
    { 
        int MAX = max_element(arr); 
  
        // first of all find all prime 
        Vector<Integer> prime = findPrime(MAX); 
  
        // now store all number as index of freq arr 
        // so that we can improve searching 
        Set<Integer> s = new HashSet<Integer>(); 
        for (int i = 0; i < arr.length; i++) 
            s.add(arr[i]); 
  
        // now check for each prime 
        long ans = -1; 
        for (int i = 0; i < prime.size(); i++) { 
            if (!s.contains(prime.get(i))) { 
  
                ans = (prime.get(i)); 
                break; 
            } 
        } 
        return (int)ans; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 3, 0, 1, 2, 7 }; 
        int n = arr.length; 
  
        // find smallest prime 
        // which is not present 
        if (findSmallest(arr, n) == -1) 
            System.out.print("No prime number missing"); 
        else
            System.out.print(findSmallest(arr, n)); 
    } 
} 
  
// This code is contributed by Arnab Kundu 

