

// Java implementation of the approach 
class GFG { 
    // Function to return the x% of n 
    static float percent(int n, int x) 
    { 
        float p = n * x; 
        p /= 100; 
        return p; 
    } 
  
    // Function to return the total loss 
    static float getLoss(int price[], int quantity[], int X[], int n) 
    { 
        // To store the total loss 
        float loss = 0; 
  
        for (int i = 0; i < n; i++) { 
  
            // Original price of the item 
            float originalPrice = price[i]; 
  
            // The price at which the item will be sold 
            float sellingPrice = originalPrice 
                                 + percent((int)originalPrice, X[i]); 
  
            // The discounted price of the item 
            float afterDiscount = sellingPrice 
                                  - percent((int)sellingPrice, X[i]); 
  
            // Loss incurred 
            loss += ((originalPrice - afterDiscount) * quantity[i]); 
        } 
  
        return loss; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int price[] = { 20, 48, 200, 100 }; 
        int quantity[] = { 20, 48, 1, 1 }; 
        int X[] = { 0, 48, 200, 5 }; 
  
        // Total items 
        int n = X.length; 
        System.out.print(getLoss(price, quantity, X, n)); 
    } 
} 

