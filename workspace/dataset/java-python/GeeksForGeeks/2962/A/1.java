

// Java program to count ways to divide a 
// String in two parts a and b such that 
// b/pow(10, p) == a 
import java.util.*; 
  
class GFG 
{ 
static int calculate(String N) 
{ 
    int len = N.length(); 
    int l = (len) / 2; 
    int count = 0; 
  
    for (int i = 1; i <= l; i++)  
    { 
  
        // subString representing int a 
        String s = N.substring(0, i); 
  
        // no of digits in a 
        int l1 = s.length(); 
  
        // consider only most significant  
        // l1 characters of remaining String  
        // for int b 
        String t = N.substring(i, l1 + i); 
  
        // if any of a or b contains leading 0s 
        // discard this combination 
        if (s.charAt(0) == '0' || t.charAt(0) == '0') 
            continue; 
  
        // if both are equal 
        if (s.compareTo(t) == 0)  
            count++;      
    } 
    return count; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String N = "2202200"; 
    System.out.print(calculate(N)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

