

// Java implementation to find Cost price 
import java.util.*; 
  
class solution 
{ 
  
// Function to calculate cost price with profit 
static float CPwithProfit(int sellingPrice, int profit) 
{ 
    float costPrice; 
  
    // required formula to calculate CP with profit 
    costPrice = (sellingPrice * 100) / (100 + profit); 
    return costPrice; 
} 
  
// Function to calculate cost price with loss 
static float CPwithLoss(int sellingPrice, int loss) 
{ 
    float costPrice; 
  
    // required formula to calculate CP with loss 
    costPrice = (sellingPrice * 100) / (100 - loss); 
    return costPrice; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int SP, profit, loss; 
  
    SP = 1020; 
    profit = 20; 
    System.out.println("Cost Price = "+CPwithProfit(SP, profit)); 
  
    SP = 900; 
    loss = 10; 
    System.out.println("Cost Price = "+CPwithLoss(SP, loss)); 
  
    SP = 42039; 
    profit = 8; 
    System.out.println("Cost Price = "+CPwithProfit(SP, profit)); 
  
} 
} 
// This code is contribute by 
// Shashank_Sharma 

