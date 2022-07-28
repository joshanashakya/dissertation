

# Python3 program to implement Collatz Conjecture 
  
# Function to find if n reaches to 1 or not. 
def isToOneRec(n: int, s: set) -> bool: 
    if n == 1: 
        return True
  
    # If there is a cycle formed, 
    # we can't reach 1. 
    if n in s: 
        return False
  
    # If n is odd then pass n = 3n+1 else n = n/2 
    if n % 2: 
        return isToOneRec(3 * n + 1, s) 
    else: 
        return isToOneRec(n // 2, s) 
  
# Wrapper over isToOneRec() 
def isToOne(n: int) -> bool: 
  
    # To store numbers visited 
    # using recursive calls. 
    s = set() 
  
    return isToOneRec(n, s) 
  
# Driver Code 
if __name__ == "__main__": 
    n = 5
    if isToOne(n): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# sanjeev2552 

