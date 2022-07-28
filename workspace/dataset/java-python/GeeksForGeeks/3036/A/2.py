

# Python3 program to find sub-set with  
# maximum possible size  
  
# Function to find sub-set with  
# maximum possible size  
def PowerOfTwo(x, n) :  
      
    # Sort the given array  
    x.sort() 
  
    # To store required sub-set  
    res = []  
  
    for i in range(n) :  
  
        # Iterate for all powers of two  
        for j in range(1, 31) : 
              
            # Left number  
            lx = x[i] - (1 << j) 
  
            # Right number  
            rx = x[i] + (1 << j)  
  
            if lx in x : 
                isl = True
            else : 
                isl = False
              
            if rx in x : 
                isr = True
            else : 
                isr = False
              
            # If possible to get sub-set of size 3  
            if (isl and isr and len(res) < 3) : 
                res = [ lx, x[i], rx ]  
  
            # If possible to get sub-set of size 2  
            if (isl and len(res) < 2) : 
                res = [ lx, x[i] ]  
  
            # If possible to get sub-set of size 2  
            if (isr and len(res) < 2) : 
                res = [ x[i], rx ] 
  
    # If not possible to get sub-set  
    if (not len(res)) : 
        print(-1)  
        return
      
    # Print the sub-set  
    for it in res : 
        print(it, end = " ")  
  
# Driver Code  
if __name__ == "__main__" : 
  
    a = [ 3, 4, 5, 6, 7 ]  
  
    n = len(a) 
    PowerOfTwo(a, n)  
  
# This code is contributed by Ryuga 

