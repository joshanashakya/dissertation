

// Java program to find xor of elements  
// in an array having prime frequency  
import java.util.*;  
  
class GFG  
{  
  
    // Function to create Sieve to check primes  
    static void SieveOfEratosthenes(boolean prime[],  
                                        int p_size)  
    {  
        // False here indicates  
        // that it is not prime  
        prime[0] = false;  
        prime[1] = false;  
      
        for (int p = 2; p * p <= p_size; p++)  
        {  
      
            // If prime[p] is not changed,  
            // then it is a prime  
            if (prime[p])  
            {  
      
                // Update all multiples of p,  
                // set them to non-prime  
                for (int i = p * 2;  
                         i <= p_size; i += p)  
                    prime[i] = false;  
            }  
        }  
    }  
      
    // Function to return the xor of elements  
    // in an array having prime frequency  
    static int xorOfElements(int arr[], int n)  
    {  
        boolean prime[] = new boolean[n + 1];  
        Arrays.fill(prime, true);  
      
        SieveOfEratosthenes(prime, n + 1);  
      
        int i, j;  
      
        // Map is used to store  
        // element frequencies  
        HashMap<Integer,  
                Integer> m = new HashMap<>();  
        for (i = 0; i < n; i++)  
        {  
            if(m.containsKey(arr[i]))  
                m.put(arr[i], m.get(arr[i]) + 1);  
            else
                m.put(arr[i], 1);  
        }  
      
        int xor = 0;  
      
        // Traverse the map  
        for (Map.Entry<Integer,  
                       Integer> entry : m.entrySet())  
        {  
            int key = entry.getKey();  
            int value = entry.getValue();  
              
            // xor the elements  
            // having prime frequencies  
            if (prime[value])  
            {  
                xor ^= (key);  
            }  
        }  
      
        return xor;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int arr[] = { 5, 4, 6, 5, 4, 6 };  
        int n = arr.length;  
      
        System.out.println(xorOfElements(arr, n));  
    }  
}  
  
// This code is contributed by NikhilRathor 

