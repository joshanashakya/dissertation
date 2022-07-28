

// Java implmentation to convert  
// a number into odd number such  
// that digit-sum is odd  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class Main  
{  
  
// Function to convert a number into  
// odd number such that digit-sum is odd  
static void converthenumber(int n)  
{  
    String s = Integer.toString(n);  
    String res = "";  
  
    // Loop to find any first two  
    // odd number such that their  
    // sum is even and number is odd  
    for (int i = 0; i < s.length(); i++)  
    {  
        if (s.charAt(i) == '1' || s.charAt(i) == '3'
            || s.charAt(i) == '5' || s.charAt(i) == '7'
            || s.charAt(i) == '9')  
            res += s.charAt(i);  
        if (res.length() == 2)  
            break;  
    }  
  
    // Print the result  
    if (res.length() == 2)  
        System.out.println(res);  
    else
        System.out.println(-1);  
}  
  
// Driver code  
public static void main (String[] args)  
{  
    int n = 18720;  
    converthenumber(n);  
}  
}  
  
// This code is contributed by Subhadeep Gupta 

