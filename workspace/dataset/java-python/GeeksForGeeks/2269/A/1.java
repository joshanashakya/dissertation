

// Java program to check if a number is 
// Trojan Number or not 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to check if a number 
    // can be expressed as x^y 
    static boolean isPerfectPower(int n) 
    { 
        if (n == 1) 
        { 
            return true; 
        } 
  
        // Try all numbers from 2 to sqrt(n) as base 
        for (int x = 2; x <= Math.sqrt(n); x++)  
        { 
            int y = 2; 
            int p = (int) Math.pow(x, y); 
  
            // Keep increasing y while power 'p' 
            // is smaller than n. 
            while (p <= n && p > 0)  
            { 
                if (p == n)  
                { 
                    return true; 
                } 
                y++; 
                p = (int) Math.pow(x, y); 
            } 
        } 
        return false; 
    } 
  
    // Function to check if a number is Strong 
    static boolean isStrongNumber(int n)  
    { 
        HashMap<Integer,  
                Integer> count = new HashMap<Integer,  
                                             Integer>(); 
        while (n % 2 == 0)  
        { 
            n = n / 2; 
            if (count.containsKey(2))  
            { 
                count.put(2, count.get(2) + 1); 
            }  
            else 
            { 
                count.put(2, 1); 
            } 
        } 
  
        // count the number for each prime factor 
        for (int i = 3; i <= Math.sqrt(n); i += 2)  
        { 
            while (n % i == 0) 
            { 
                n = n / i; 
                if (count.containsKey(i)) 
                { 
                    count.put(i, count.get(i) + 1); 
                } 
                else 
                { 
                    count.put(i, 1); 
                } 
            } 
        } 
  
        if (n > 2) 
        { 
            if (count.containsKey(n)) 
            { 
                count.put(n, count.get(n) + 1); 
            }  
            else 
            { 
                count.put(n, 1); 
            } 
        } 
  
        int flag = 0; 
  
        for (Map.Entry<Integer,  
                       Integer> b : count.entrySet())  
        { 
  
            // minimum number of prime divisors 
            // should be 2 
            if (b.getValue() == 1) 
            { 
                flag = 1; 
                break; 
            } 
        } 
  
        if (flag == 1)  
        { 
            return false; 
        }  
        else 
        { 
            return true; 
        } 
    } 
  
    // Function to check if a number 
    // is Trojan Number 
    static boolean isTrojan(int n)  
    { 
        if (!isPerfectPower(n) && isStrongNumber(n)) 
        { 
            return true; 
        } 
        else 
        { 
            return false; 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 108; 
  
        if (isTrojan(n))  
        { 
            System.out.println("Yes"); 
        }  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

