

# Python implementation of the above approach 
  
# Function to check if both  
# sequences can be made equal 
def check(n, k, a, b): 
  
    # Sorting both the arrays 
    a.sort() 
    b.sort() 
  
    # Flag to tell if there are 
    # more than one mismatch 
    fl = False
  
    # To stores the index  
    # of mismatched element 
    ind = -1
    for i in range(n): 
        if(a[i] != b[i]): 
  
            # If there is more than one 
            # mismatch then return False 
            if(fl == True): 
                return False
            fl = True
            ind = i 
  
    # If there is no mismatch or the  
    # difference between the  
    # mismatching elements is <= k 
    # then return true 
    if(ind == -1 or abs(a[ind]-b[ind]) <= k): 
        return True
    return False
  
n, k = 2, 4
a =[1, 5] 
b =[1, 1] 
if(check(n, k, a, b)): 
    print("Yes") 
else: 
    print("No") 

