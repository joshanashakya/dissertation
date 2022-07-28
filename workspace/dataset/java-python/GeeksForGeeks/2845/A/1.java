

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function that prints the segments 
static void sub_segments(String str, int n)  
{ 
    int l = str.length(); 
    for (int x = 0; x < l; x += n) 
    { 
        String newlist = str.substring(x, x + n); 
  
        // New array for every iteration 
        List<Character> arr = new ArrayList<Character>(); 
        for (char y : newlist.toCharArray())  
        { 
  
            // Check if the character is in the array 
            if (!arr.contains(y)) 
                arr.add(y); 
        } 
        for (char y : arr) 
            System.out.print(y); 
        System.out.println(); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeksgfg"; 
    int n = 4; 
    sub_segments(str, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

