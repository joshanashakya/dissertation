

// Java progarm to find the number 
// of lines which are formed from 
// given N points and not parallel 
// to X or Y axis 
import java.util.*; 
  
class GFG{ 
   
// Function to find the number of lines 
// which are formed from given N points 
// and not parallel to X or Y axis 
static int NotParallel(int p[][], int n) 
{ 
    // This will store the number of points has 
    // same x or y coordinates using the map as 
    // the value of coordinate can be very large 
    HashMap<Integer,Integer> x_axis = new HashMap<Integer,Integer>(); 
    HashMap<Integer,Integer> y_axis = new HashMap<Integer,Integer>(); 
   
    for (int i = 0; i < n; i++) { 
   
        // Counting frequency of each x and y 
        // coordinates 
        if(x_axis.containsKey(p[i][0])) 
            x_axis.put(p[i][0], x_axis.get(p[i][0])+1); 
        else
            x_axis.put(p[i][0], 1); 
        if(y_axis.containsKey(p[i][1])) 
            y_axis.put(p[i][1], y_axis.get(p[i][1])+1); 
        else
            y_axis.put(p[i][1], 1); 
    } 
   
    // Total number of pairs can be formed 
    int total = (n * (n - 1)) / 2; 
   
    for (Map.Entry<Integer,Integer> i : x_axis.entrySet()) { 
        int c = i.getValue(); 
   
        // We can not choose pairs from these as 
        // they have same x coordinatethus they 
        // will result line segment 
        // parallel to y axis 
        total -= (c * (c - 1)) / 2; 
    } 
   
    for (Map.Entry<Integer,Integer> i : y_axis.entrySet()) { 
        int c = i.getValue(); 
   
        // we can not choose pairs from these as 
        // they have same y coordinate thus they 
        // will result line segment 
        // parallel to x-axis 
        total -= (c * (c - 1)) / 2; 
    } 
   
    // Return the required answer 
    return total; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
   
    int p[][] = { { 1, 2 }, 
                   { 1, 5 }, 
                   { 1, 15 }, 
                   { 2, 10 } }; 
   
    int n = p.length; 
   
    // Function call 
    System.out.print(NotParallel(p, n)); 
   
} 
} 
  
// This code is contributed by PrinciRaj1992 

