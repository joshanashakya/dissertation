

# Python 3 Program  to check if the  
# number lies in given range  
  
# Function that returns the maximum element. 
def check(a, n) : 
  
    # check for odd  
    if n % 2 == 1: 
        return False
  
    # check if the opposite element is same  
    # as a[i]  
    for i in range(n//2) : 
        if a[i] != a[i + (n//2)]: 
            return False
  
    return True
  
# Driver Code 
if __name__ == "__main__" : 
    a = [ 1, 4, 1, 4] 
  
    n = len(a) 
  
    if check(a, n) : 
        print("YES") 
    else : 
        print("NO") 
      
# This code is contributed by ANKITRAI1 

