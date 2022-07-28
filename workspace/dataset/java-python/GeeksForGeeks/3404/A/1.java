

// Jav program to implement Collatz Conjecture 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to find if n reaches to 1 or not. 
    static boolean isToOneRec(int n, HashSet<Integer> s)  
    { 
        if (n == 1)  
        { 
            return true; 
        } 
  
        // If there is a cycle formed, we can't r 
        // reach 1. 
        if (s.contains(n))  
        { 
            return false; 
        } 
  
        // If n is odd then pass n = 3n+1 else n = n/2 
        return (n % 2 == 1) ? isToOneRec(3 * n + 1, s) 
                : isToOneRec(n / 2, s); 
    } 
  
    // Wrapper over isToOneRec() 
    static boolean isToOne(int n)  
    { 
        // To store numbers visited using recursive calls. 
        HashSet<Integer> s = new HashSet<Integer>(); 
  
        return isToOneRec(n, s); 
    } 
  
    // Drivers code 
    public static void main(String[] args)  
    { 
        int n = 5; 
        if (isToOne(n))  
        { 
            System.out.print("Yes"); 
        }  
        else 
        { 
            System.out.print("No"); 
        } 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

