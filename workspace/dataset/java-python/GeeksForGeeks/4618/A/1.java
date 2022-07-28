

// Java program to find if it is 
// possible to get the ratio r 
import java.io.*; 
  
class Ratio  
{ 
  
    // Returns true if it is  
    // possible to get ratio r  
    // from given cost and  
    // quantity ranges. 
    static boolean isRatioPossible(int lowCost, int upCost, 
                                   int lowQuant, int upQuant,  
                                   int r) 
    { 
        for (int i = lowQuant; i <= upQuant; i++)  
        { 
  
            // Calculating cost corresponding 
            // to value of i 
            int ans = i * r; 
            if (lowCost <= ans && ans <= upCost) 
                return true; 
        } 
  
        return false; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int lowCost = 14, upCost = 30,  
            lowQuant = 5, upQuant = 12, r = 9; 
  
        if (isRatioPossible(lowCost, upCost,  
                            lowQuant, upQuant, r)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 

