

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the 
// winner of the game 
static String winner(String moves) 
{ 
    HashMap<Character, 
            Integer> data = new HashMap<Character,  
                                        Integer>(); 
    data.put('R', 0); 
    data.put('P', 1); 
    data.put('S', 2); 
  
    // Both the players chose to 
    // play the same move 
    if (moves.charAt(0) == moves.charAt(1)) 
    { 
        return "Draw"; 
    } 
  
    // Player A wins the game 
    if (((data.get(moves.charAt(0)) | 1 << (2)) -  
         (data.get(moves.charAt(1)) | 0 << (2))) % 3 != 0)  
    { 
        return "A"; 
    } 
  
    return "B"; 
} 
  
// Function to perform the queries 
static void performQueries(String arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(winner(arr[i]) + "\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String arr[] = { "RS", "SR", "SP", "PP" }; 
    int n = arr.length; 
  
    performQueries(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

