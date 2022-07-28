

// Java program to check if a number  
// is pandigital in given base. 
import java.util.*; 
  
class GFG { 
      
// Return true if n is pandigit 
// else return false. 
static boolean checkPandigital(int b, String n) { 
      
    // Checking length is less than base 
    if (n.length() < b) 
    return false; 
  
    boolean hash[] = new boolean[b]; 
    Arrays.fill(hash, false); 
  
    // Traversing each digit of the number. 
    for (int i = 0; i < n.length(); i++) { 
          
    // If digit is integer 
    if (n.charAt(i) >= '0' && n.charAt(i) <= '9') 
        hash[n.charAt(i) - '0'] = true; 
  
    // If digit is alphabet 
    else if (n.charAt(i) - 'A' <= b - 11) 
        hash[n.charAt(i) - 'A' + 10] = true; 
    } 
  
    // Checking hash array, if any  
    // index is unmarked. 
    for (int i = 0; i < b; i++) 
    if (hash[i] == false) 
        return false; 
  
    return true; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int b = 13; 
    String n = "1298450376ABC"; 
  
    if (checkPandigital(b, n)) 
    System.out.println("Yes"); 
    else
    System.out.println("No"); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

