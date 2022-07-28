

# Python3 program to find the volume  
# of water wasted 
  
# Function to calculate amount  
# of wasted water 
def wastedWater(V, M, N): 
  
    # filled amount of water in one minute 
    amt_per_min = M - N 
  
    # total time taken to fill the tank 
    # because of leakage 
    time_to_fill = V / amt_per_min 
  
    # wasted amount of water 
    wasted_amt = N * time_to_fill 
  
    return wasted_amt 
  
# Driver code 
V = 700
M = 10
N = 3
print(wastedWater(V, M, N)) 
  
V = 1000
M = 100
N = 50
print(wastedWater(V, M, N)) 
  
# This code is contributed by Shrikant13 

