

# Function to find the cost to paint all poles 
import math as ma 
  
def find(n, m, p, q): 
  
    # To store all the columns 
    z =[] 
    for i in range(p): 
        z.append(q[i][1]) 
  
    print(max(z)-min(z)) 
      
n, m, p = 2, 2, 2
q =[(0, 0), (0, 1)] 
find(n, m, p, q) 

