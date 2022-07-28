

# Python3 program to print n-th number in 
# Recaman's sequence 
  
# Prints first n terms of Recaman sequence 
def recaman(n): 
  
    if(n <= 0): 
        return
  
    # Print first term and store it in a hash 
    print(0, ",", end='') 
    s = set([]) 
    s.add(0) 
  
    # Print remaining terms using recursive 
    # formula. 
    prev = 0
    for i in range(1, n): 
  
        curr = prev - i 
  
        # If arr[i-1] - i is negative or 
        # already exists. 
        if(curr < 0 or curr in s): 
            curr = prev + i 
  
        s.add(curr) 
  
        print(curr, ",", end='') 
        prev = curr 
  
# Driver code 
if __name__=='__main__': 
    n = 17
    recaman(n) 
  
# This code is contributed by 
# Sanjit_Prasad 

