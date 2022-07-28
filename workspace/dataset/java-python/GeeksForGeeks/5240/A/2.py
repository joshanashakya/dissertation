

# Python3 implementation of the approach 
  
# Function to return the count 
# of minimum stacks 
def countPiles(n, a): 
      
    # Keep track of occurrence 
    # of each capacity 
    occ = dict() 
  
    # Fill the occurrence map 
    for i in a: 
        if i in occ.keys(): 
            occ[i] += 1
        else: 
            occ[i] = 1
  
    # Number of piles is 0 initially 
    pile = 0
  
    # Traverse occurrences in increasing 
    # order of capacities. 
    while (len(occ) > 0): 
  
        # Adding a new pile 
        pile += 1
        size = 0
        toRemove = dict() 
  
        # Traverse all piles in increasing 
        # order of capacities 
        for tm in occ: 
            mx = tm 
            ct = occ[tm] 
  
            # Number of boxes of capacity mx 
            # that can be added to current pile 
            use = min(ct, mx - size + 1) 
  
            # Update the occurrence 
            occ[mx] -= use 
  
            # Update the size of the pile 
            size += use 
            if (occ[mx] == 0): 
                toRemove[mx] = 1
          
        # Remove capacities that are 
        # no longer available 
        for tm in toRemove: 
            del occ[tm] 
      
    return pile 
  
# Driver code 
a = [0, 0, 1, 1, 2] 
n = len(a) 
print(countPiles(n, a)) 
  
# This code is contributed  
# by Mohit Kumar 

