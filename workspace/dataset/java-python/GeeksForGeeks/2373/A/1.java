

// Java implementation of above formula 
public class GFG{ 
  
    // Function to calculate 
    // Profit or loss 
    static void profitLoss(int N, int M) 
    { 
        if (N == M) 
            System.out.print("No Profit nor Loss"); 
        else { 
      
            float result = 0; 
      
            result = (float)(Math.abs(N - M))/ M; 
      
            if (N - M < 0) 
                System.out.print("Loss = -" + result * 100 +"%"); 
            else
                System.out.print("Profit = " + result * 100 + "%"); 
        } 
    } 
      
    // Driver Code 
     public static void main(String []args){ 
           
        int N = 8, M = 9; 
      
        profitLoss(N, M); 
          
     } 
     // This code is contributed by ANKITRAI1 
} 

