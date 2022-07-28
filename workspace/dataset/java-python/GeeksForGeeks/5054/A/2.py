

# Python3 Program all sequence of length s  
# starting with n such that difference  
# between consecutive element is less than k. 
  
# Recursive function to print all sequence  
# of length s starting with n such that  
# difference between consecutive element  
# is less than k. 
def printSequence(v, n, s, k): 
  
    # If size become 0, print the sequence. 
    if (s == 0) : 
        for i in range(0, len(v)): 
            print ("{} ".format(v[i]), end="") 
        print ("") 
        return; 
      
  
    # Increment the next element and make  
    # recursive call after inserting the  
    # (n + i) to the sequence. 
    for i in range(0,k): 
        v.append(n + i) 
        printSequence(v, n + i, s - 1, k) 
        v.pop() 
      
  
    # Decrementing the next element and' 
    # make recursive call after inserting  
    # the (n - i) to the sequence. 
    for i in range(1,k): 
        v.append(n - i) 
        printSequence(v, n - i, s - 1, k) 
        v.pop() 
      
  
  
# Wrapper Function 
def wrapper(n, s, k): 
    v = [] 
    v.append(n) 
    printSequence(v, n, s - 1, k) 
  
# Driven Program 
n = 5; s = 3; k = 2; 
wrapper(n, s, k); 
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

