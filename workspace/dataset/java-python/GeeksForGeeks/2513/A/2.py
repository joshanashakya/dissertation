

# Python 3 program to implement 
# the above approach 
  
# Function that returns the 
# minimum value of X 
def findMinimumX(a, n): 
      
    # Declare a set 
    st = set() 
  
    # Iterate in the array element 
    # and insert them into the set 
    for i in range(n): 
        st.add(a[i]) 
  
    # If unique elements is 1 
    if (len(st) == 1): 
        return 0
  
    # Unique elements is 2 
    if (len(st) == 2): 
          
        # Get both el2 and el1 
        st = list(st) 
        el1 = st[0] 
        el2 = st[1] 
  
        # Check if they are even 
        if ((el2 - el1) % 2 == 0): 
            return int((el2 - el1) / 2) 
        else: 
            return (el2 - el1) 
  
    # If there are 3 unique elements 
    if (len(st) == 3): 
        st = list(st) 
          
        # Get three unique elements 
        el1 = st[0] 
        el2 = st[1] 
        el3 = st[2] 
  
        # Check if their difference is same 
        if ((el2 - el1) == (el3 - el2)): 
            return el2 - el1 
        else: 
            return -1
  
    # More than 3 unique elements 
    return -1
  
# Driver code 
if __name__ == '__main__': 
    a = [1, 4, 4, 7, 4, 1] 
    n = len(a) 
    print(findMinimumX(a, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

