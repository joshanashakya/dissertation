

// Java program to count digits after dot when a 
// number is divided by another. 
import java.util.*; 
  
class GFG  
{ 
  
static int count(int x, int y) 
{ 
    int ans = 0; // Initialize result 
      
    Map<Integer,Integer> m = new HashMap<>(); 
      
    // calculating remainder 
    while (x % y != 0)  
    { 
  
        x = x % y; 
  
        ans++; 
  
        // if this remainder appeared before then  
        // the numbers are irrational and would not 
        // converge to a solution the digits after 
        // decimal will be infinite 
        if (m.containsKey(x))  
            return -1; 
  
        m.put(x, 1); 
        x = x * 10; 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int res = count(1, 2); 
    if((res == -1)) 
        System.out.println("INF"); 
    else
        System.out.println(res);  
  
    res = count(5, 3); 
    if((res == -1)) 
        System.out.println("INF"); 
    else
        System.out.println(res);  
      
    res = count(3, 5); 
    if((res == -1)) 
        System.out.println("INF"); 
    else
        System.out.println(res); 
} 
} 
  
// This code is contributed by Rajput-Ji 

