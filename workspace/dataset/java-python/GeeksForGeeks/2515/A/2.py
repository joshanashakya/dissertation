

# Efficient CPP program to find sum of the 
# series 1.2.3 + 2.3.4 + 3.4.5 + ... 
  
# function to calculate sum of series 
def sumofseries(n): 
  
    return int(n * (n + 1) * (n + 2) * (n + 3) / 4) 
  
  
# Driver program 
print(sumofseries(3)) 
      
  
# This code is contributed 
# by Smitha Dinesh Semwal 

