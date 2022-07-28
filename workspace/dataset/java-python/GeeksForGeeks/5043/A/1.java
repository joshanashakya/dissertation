

// Java program to find maximum/minimum number 
// of isolated vertices. 
  
import java.io.*; 
  
class GFG { 
   
  
// Function to find out the minimum and  
// maximum number of isolated vertices 
 static void find(int n, int m) 
{ 
    // Condition to find out minimum number  
    // of isolated vertices 
    if (n <= 2 * m) 
        System.out.println( "Minimum " + 0); 
    else
        System.out.println( "Minimum " + (n - 2 * m)); 
  
    // To find out maximum number of isolated  
    // vertices 
    // Loop to find out value of number of  
    // vertices that are connected 
    int i; 
    for (i = 1; i <= n; i++) { 
        if (i * (i - 1) / 2 >= m) 
            break; 
    } 
    System.out.println( "Maximum " + (n - i)); 
} 
  
// Driver Function 
  
    public static void main (String[] args) { 
      
    // Number of vertices 
    int n = 4; 
  
    // Number of edges 
    int m = 2; 
  
    // Calling the function to maximum and  
    // minimum number of isolated vertices 
    find(n, m); 
    } 
} 
//This code is contributed by inder_verma. 

