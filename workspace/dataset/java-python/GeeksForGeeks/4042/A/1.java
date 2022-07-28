

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function that returns true if  
// the product of every digit of a  
// contiguous subsequence is distinct 
static boolean productsDistinct(int N) 
{ 
      
    // To store the given number 
    // as a string 
    String s = ""; 
  
    // Append all the digits 
    // starting from the end 
    while (N > 0)  
    { 
        s += (char)(N % 10 + '0'); 
        N /= 10; 
    } 
  
    // Reverse the string to get 
    // the original number 
    s = reverse(s); 
  
    // Store size of the string 
    int sz = s.length(); 
  
    // Set to store product of 
    // each contiguous subsequence 
    HashSet<Integer> se = new HashSet<Integer>(); 
  
    // Find product of every 
    // contiguous subsequence 
    for (int i = 0; i < sz; i++)  
    { 
        int product = 1; 
        for (int j = i; j < sz; j++)  
        { 
            product *= (int)(s.charAt(j) - '0'); 
  
            // If current product already 
            // exists in the set 
            if (se.contains(product)) 
                return false; 
            else
                se.add(product); 
        } 
    } 
    return true; 
} 
  
static String reverse(String input) 
{ 
    char[] a = input.toCharArray(); 
    int l, r; 
    r = a.length - 1; 
    for (l = 0; l < r; l++, r--)  
    { 
        // Swap values of l and r  
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
}  
  
// Driver code 
public static void main(String[] args)  
{ 
    int N = 2345; 
  
    if (productsDistinct(N)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
    } 
} 
  
// This code is contributed  
// by PrinciRaj1992  

