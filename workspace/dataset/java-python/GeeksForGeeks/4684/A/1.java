

// Java implementation of the approach 
class GFG 
{ 
      
// Function to decide the winner 
static int decideWinner(int []a, int n) 
{ 
    int count0 = 0; 
    int count1 = 0; 
    int count2 = 0; 
    int count3 = 0; 
  
    // Iterate for all numbers in the array 
    for (int i = 0; i < n; i++) 
    { 
  
        // Condition to count 
  
        // If mod gives 0 
        if (a[i] % 4 == 0) 
            count0++; 
  
        // If mod gives 1 
        else if (a[i] % 4 == 1) 
            count1++; 
  
        // If mod gives 2 
        else if (a[i] % 4 == 2) 
            count2++; 
  
        // If mod gives 3 
        else if (a[i] % 4 == 3) 
            count3++; 
    } 
  
    // Check the winning condition for X 
    if (count0 % 2 == 0 && count1 % 2 == 0 &&  
        count2 % 2 == 0 && count3 == 0) 
        return 1; 
    else
        return 2; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int []a = { 4, 8, 5, 9 }; 
    int n = a.length; 
    if (decideWinner(a, n) == 1) 
        System.out.print("X wins"); 
    else
        System.out.print("Y wins"); 
} 
} 
  
// This code is contributed by Akanksha Rai 

