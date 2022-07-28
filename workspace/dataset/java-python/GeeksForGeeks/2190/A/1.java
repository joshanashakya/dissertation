

// Java program to check whether count of 
// distinct characters in a string 
// is Prime or not 
import java.util.*; 
  
class GFG 
{ 
    // Find whether a number is prime or not 
    static boolean isPrime(int n) 
    { 
        int i; 
      
        // 1 is not prime 
        if (n == 1) 
            return false; 
      
        // check if there is any factor or not 
        for (i = 2; i <= Math.sqrt(n); i++)  
        { 
            if (n % i == 0) 
                return false; 
        } 
        return true; 
    } 
      
    // Count the distinct characters in a string 
    static int countDistinct(String s) 
    { 
        // create a map to store the 
        // frequency of characters 
        Set<Character> m = new HashSet<Character>(); 
      
        // traverse the string 
        for (int i = 0; i < s.length(); i++)  
        { 
              
            // increase the frequency of character 
            m.add(s.charAt(i)); 
              
        } 
          
        return m.size(); 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        String str = "geeksforgeeks"; 
      
        if (isPrime(countDistinct(str))) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by ihritik 

