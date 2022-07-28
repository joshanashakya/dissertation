

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the minimum cost to 
// travel from the first city to the last 
static int minCost(int []cost, int n) 
{ 
  
    // To store the total cost 
    int totalCost = 0; 
  
    // Start from the first city 
    int boardingBus = 0; 
  
    for (int i = 1; i < n; i++) 
    { 
  
        // If found any city with cost less than 
        // that of the previous boarded 
        // bus then change the bus 
        if (cost[boardingBus] > cost[i])  
        { 
  
            // Calculate the cost to travel from 
            // the currently boarded bus 
            // till the current city 
            totalCost += ((i - boardingBus) * cost[boardingBus]); 
  
            // Update the currently boarded bus 
            boardingBus = i; 
        } 
    } 
  
    // Finally calculate the cost for the 
    // last boarding bus till the (N + 1)th city 
    totalCost += ((n - boardingBus) * cost[boardingBus]); 
    return totalCost; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int []cost = { 4, 7, 8, 3, 4 }; 
    int n = cost.length; 
  
    System.out.print(minCost(cost, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

