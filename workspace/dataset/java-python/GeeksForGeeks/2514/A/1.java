

// Java program to find sum of the series 
// 1.2.3 + 2.3.4 + 3.4.5 + ... 
import java.io.*; 
import java.math.*; 
  
class GFG  
{ 
  
    static int sumofseries(int n) 
    { 
    int res = 0; 
    for (int i = 1; i <= n; i++)  
        res += (i) * (i + 1) * (i + 2);  
    return res; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        System.out.println(sumofseries(3)); 
    } 
} 

