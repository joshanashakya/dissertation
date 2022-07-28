

# Python3 Program to get nth Pentagonal  
# pyramidal number. 
    
# function to get nth Pentagonal  
# pyramidal number. 
def pentagon_pyramidal(n):      
    return n * n * (n + 1) / 2
  
    
# Driver Program 
n = 4
print(int(pentagon_pyramidal(n))) 

