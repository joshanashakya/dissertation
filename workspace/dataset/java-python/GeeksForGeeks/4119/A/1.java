

import java.util.*; 
  
// Java implementation of above approach 
class GFG  
{ 
  
    // function that returns true 
    // if n is prime else false 
    static boolean isPrime(int n) 
    { 
        int i; 
  
        // 1 is not prime 
        if (n == 1)  
        { 
            return false; 
        } 
  
        // check if there is any factor or not 
        for (i = 2; i <= Math.sqrt(n); i++)  
        { 
            if (n % i == 0) 
            { 
                return false; 
            } 
        } 
  
        return true; 
    } 
  
    // function that returns true if 
    // the frequencies of all the 
    // characters of s are prime 
    static boolean check_frequency(char[] s) 
    { 
        // create a map to store 
        // the frequencies of characters 
        HashMap<Character, Integer> m = new HashMap<Character, Integer>(); 
  
        for (int i = 0; i < s.length; i++) // update the frequency 
        { 
            if (m.containsKey(s[i])) 
            { 
                m.put(s[i], m.get(s[i]) + 1); 
            } 
            else
            { 
                m.put(s[i], 1); 
            } 
        } 
  
        // check whether all the frequencies 
        // are prime or not 
        for (char ch = 'a'; ch <= 'z'; ch++) 
        { 
            if (m.get(ch) != null && m.get(ch) > 0 && !isPrime(m.get(ch)))  
            { 
                return false; 
            } 
        } 
  
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "geeksforgeeks"; 
  
        // if all the frequencies are prime 
        if (check_frequency(s.toCharArray())) 
        { 
            System.out.println("Yes"); 
        } 
        else
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code contributed by Rajput-Ji 

