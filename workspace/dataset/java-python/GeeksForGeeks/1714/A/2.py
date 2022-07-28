

# Python3 Program to get nth Pentagonal  
# pyramidal number. 
    
# function to get nth Pentagonal  
# pyramidal number. 
def pentagon_pyramidal(n): 
    sum = 0
  
    # Running loop from 1 to n  
    for i in range(1, n + 1): 
    
        # get nth pentagonal number 
        p = ( 3 * i * i - i ) / 2
  
        # add to sum 
        sum = sum + p        
   
    return sum
  
    
# Driver Program 
n = 4
print(int(pentagon_pyramidal(n))) 

