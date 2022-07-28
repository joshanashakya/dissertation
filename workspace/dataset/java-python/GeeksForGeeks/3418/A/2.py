

# A Simple Python 3 program to  
# check if square root of a number 
# under modulo p exists or not 
  
# Returns true if square root of 
# n under modulo p exists 
def squareRootExists(n, p): 
    n = n % p 
  
    # One by one check all numbers  
    # from 2 to p-1 
    for x in range(2, p, 1): 
        if ((x * x) % p == n): 
            return True
    return False
  
# Driver Code 
if __name__ == '__main__': 
    p = 7
    n = 2
    if(squareRootExists(n, p) == True): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

