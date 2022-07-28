

// Java program to find the player 
// who wins the game 
class GFG 
{ 
  
// Function to check the  
// wining player 
static void findWinner(int n) 
{ 
    // As discussed in the  
    // above approach 
    if ((n - 1) % 6 == 0) 
    { 
        System.out.println("Second Player wins the game"); 
    } 
    else
    { 
        System.out.println("First Player wins the game"); 
    } 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int n = 7; 
    findWinner(n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

