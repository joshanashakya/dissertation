

// Java implementation of the approach 
class GFG 
{ 
      
// Function to calculate gcd 
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
}  
  
// Function to return the winner 
// of the game 
static char getWinner(int []arr, int n) 
{ 
    // To store the gcd of the  
    // original array 
    int gcd = arr[0]; 
  
    // To store the maximum element 
    // from the original array 
    int maxEle = arr[0]; 
    for (int i = 1; i < n; i++)  
    { 
        gcd = __gcd(gcd, arr[i]); 
        maxEle = Math.max(maxEle, arr[i]); 
    } 
  
    int totalMoves = (maxEle / gcd) - n; 
  
    // If number of moves are odd 
    if (totalMoves % 2 == 1) 
        return 'A'; 
  
    return 'B'; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int []arr = { 5, 6, 7 }; 
    int n = arr.length; 
    System.out.print(getWinner(arr, n)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai 

