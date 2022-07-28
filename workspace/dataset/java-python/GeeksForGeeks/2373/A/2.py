

# Python 3 implementation of above formula 
  
# Function to calculate Profit or loss 
def profitLoss(N, M): 
    if (N == M): 
        print("No Profit nor Loss") 
    else: 
        result = 0.0
  
        result = float(abs(N - M)) / M 
  
        if (N - M < 0): 
            print("Loss = -",'{0:.6}' .  
                   format(result * 100), "%") 
        else: 
            print("Profit = ",'{0:.6}' .  
                   format(result * 100), "%") 
  
# Driver Code 
if __name__ == '__main__': 
    N = 8
    M = 9
  
    profitLoss(N, M) 
  
# This code is contributed by 
# Sanjit_Prasad 

