

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true if all the 1's  
// in the binary string s are equidistant  
static boolean check(String s, int l)  
{  
  
    // Initialize vector to store  
    // the position of 1's  
    Vector<Integer> pos = new Vector<Integer>();  
  
    for (int i = 0; i < l; i++)  
    {  
  
        // Store the positions of 1's  
        if (s.charAt(i)== '1')  
            pos.add(i);  
    }  
  
    // Size of the position vector  
    int t = pos.size();  
    for (int i = 1; i < t; i++)  
    {  
  
        // If condition isn't satisfied  
        if ((pos.get(i) - pos.get(i-1)) != (pos.get(1) - pos.get(0)))  
            return false;  
    }  
  
    return true;  
}  
  
// Drivers code  
public static void main(String args[]) 
{  
    String s = "100010001000";  
    int l = s.length();  
    if (check(s, l))  
        System.out.print("Yes");  
    else
        System.out.print("No");  
} 
}  
  
// This code is contributed by Arnab Kundu 

