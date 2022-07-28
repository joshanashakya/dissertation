

// Java code to find number occurring prime 
// number of times with frequency >= k 
import java.util.*; 
  
public class PrimeNumber { 
  
    // Function to find number with prime occurrences 
    static void primeOccurences(int[] arr, int k) 
    { 
        Map<Integer, Integer> map = new HashMap<>(); 
  
        // Insert values and their frequencies 
        for (int i = 0; i < arr.length; i++) { 
            int val = arr[i]; 
  
            int freq; 
            if (map.containsKey(val)) { 
                freq = map.get(val); 
                freq++; 
            } 
            else
                freq = 1; 
            map.put(val, freq); 
        } 
  
        // Traverse map and find elements with 
        // prime frequencies and frequency at 
        // least k 
        for (Map.Entry<Integer, Integer> entry :  
                               map.entrySet()) { 
            int value = entry.getValue(); 
            if (isPrime(value) && value >= k) 
                System.out.println(entry.getKey()); 
        } 
    } 
  
    // Check if the number of occurrences 
    // are primes or not 
    private static boolean isPrime(int n) 
    { 
  
        if ((n > 2 && n % 2 == 0) || n == 1)  
            return false;         
  
        for (int i = 3; i <= (int)Math.sqrt(n); 
             i += 2) { 
            if (n % i == 0)  
                return false;             
        } 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = { 11, 11, 11, 23, 11, 37, 
                      37, 51, 51, 51, 51, 51 }; 
        int k = 2; 
  
        primeOccurences(arr, k); 
    } 
} 

