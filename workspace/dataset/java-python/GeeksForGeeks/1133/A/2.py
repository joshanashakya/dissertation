

# Python3 program to calculate clock delay 
  
# Function definition with logic 
def lagDuration(h1, m1, h2, m2, k): 
    lag, t1, t2 = 0, 0, 0
      
    # Conversion to minutes 
    t1 = (h1 + k) * 60 + m1 
      
    # Conversion to minutes 
    t2 = h2 * 60 + m2 
      
    # Calculating difference 
    lag = t1 - t2 
    return lag 
  
# Driver Code 
h1, m1 = 12, 0
h2, m2 = 12, 58
k = 1
  
lag = lagDuration(h1, m1, h2, m2, k) 
print("Lag =", lag, "minutes") 
  
# This code has been contributed  
# by 29AjayKumar 

