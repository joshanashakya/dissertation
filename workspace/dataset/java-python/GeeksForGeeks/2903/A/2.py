

# Python 3 program to print all pairs  
  
# Function to print all pairs  
def checkPairs(l, r) : 
  
    # check if even  
    if (l - r) % 2 == 0 : 
        return False
  
    """ we can print all adjacent pairs 
    for i in range(l,r,2) : 
        print("{",i,",",i + 1, "},") 
    """
      
    return True
  
# Driver Code 
if __name__ == "__main__" : 
  
    l, r = 1, 8
  
    if checkPairs(l, r) : 
        print("Yes") 
    else : 
        print("No") 
             
# This code is contributed by ANKITRAI1 

