

// Java program to find count of numbers 
// with prime frequencies 
  
import java.util.*; 
  
class GFG 
{ 
  
    // Function to check if a 
    // number is prime 
    static boolean check_prime(int n)  
    { 
        // Corner cases 
        if (n <= 1) 
        { 
            return false; 
        } 
        if (n <= 3) 
        { 
            return true; 
        } 
  
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) 
        { 
            return false; 
        } 
  
        for (int i = 5; i * i <= n; i = i + 6) 
        { 
            if (n % i == 0 || n % (i + 2) == 0)  
            { 
                return false; 
            } 
        } 
  
        return true; 
    } 
  
    // Function to find count of numbers 
    // with prime frequencies 
    static int countPrimeFrequent(String s) 
    { 
        int count = 0; 
  
        // create a map to store 
        // frequency of each character 
        Map<Character, Integer> mp = new HashMap<>(); 
  
        // Store frequncy of each character 
        // in the map 
        for (int i = 0; i < s.length(); i++) 
        { 
            if (mp.containsKey(s.charAt(i))) 
            { 
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1); 
            }  
            else 
            { 
                mp.put(s.charAt(i), 1); 
            } 
        } 
  
        // now iterate the map and characters 
        // with prime occurrences 
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) 
        { 
  
            // if prime then increment count 
            if (check_prime(entry.getValue()))  
            { 
                count++; 
            } 
        } 
  
        return count; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String s = "geeksforgeeks"; 
  
        System.out.println(countPrimeFrequent(s)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

