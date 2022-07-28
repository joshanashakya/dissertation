

# Python3 program to find the sum of the elements 
# from an array which have even parity 
  
# Function that returns true if x 
# has even parity 
def checkEvenParity(x): 
      
    # We basically count set bits  
    # https://www.geeksforgeeks.org/count-set-bits-in-an-integer/ 
    parity = 0
    while (x != 0): 
        x = x & (x - 1) 
        parity += 1
  
    if (parity % 2 == 0): 
        return True
    else: 
        return False
  
# Function to return the sum of the elements 
# from an array which have even parity 
def sumlist(a, n): 
    sum = 0
    for i in range(n): 
          
        # If a[i] has even parity 
        if (checkEvenParity(a[i])): 
            sum += a[i] 
    return sum
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 2, 4, 3, 5, 9 ] 
    n = len(arr) 
    print(sumlist(arr, n)) 
  
# This code is contributed by 29AjayKumar. 

