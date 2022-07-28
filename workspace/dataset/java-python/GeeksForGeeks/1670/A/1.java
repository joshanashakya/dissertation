

// Java program to find the  
// blocks for given number. 
import java.util.*; 
  
class GFG { 
  
static void block(long x) 
{ 
    ArrayList<Integer> v = new ArrayList<Integer>(); 
      
    // Convert decimal number to 
    // its binary equivalent 
    System.out.print("Blocks for "+x+" : "); 
    while (x > 0)  
    { 
        v.add((int)x % 2); 
        x = x / 2; 
    } 
  
    // Displaying the output when 
    // the bit is '1' in binary 
    // equivalent of number. 
    for (int i = 0; i < v.size(); i++)  
    { 
        if (v.get(i) == 1)  
        { 
        System.out.print(i); 
            if (i != v.size() - 1) 
            System.out.print( ", "); 
        } 
    } 
System.out.println(); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    block(71307); 
    block(1213); 
    block(29); 
    block(100); 
} 
} 
  
// This code is contributed by Arnab Kundu. 

