

# Python3 program to rearrange positive 
# and negative numbers without comparison  
# with 0. 
  
def oppositeSigns(x, y): 
      
    return ((x ^ y) < 0) 
  
def partitionNegPos(arr, n): 
      
    a = [] 
    b = [] 
      
    # Push first element to a. 
    a = a + [arr[0]] 
      
    # Now put all elements of same sign 
    # in a[] and opposite sign in b[] 
    for i in range(1, n) : 
        if (oppositeSigns(a[0], arr[i])): 
            b = b + [arr[i]] 
        else: 
            a = a + [arr[i]] 
              
    # Print a[] and b[] 
    for i in range(0, len(a)): 
        print(a[i], end = ' ') 
    print("") 
      
    for i in range(0, len(b)): 
        print(b[i], end = ' ') 
  
# Driver code 
arr = [1, -2, 6, -7, 8 ] 
n = len(arr) 
partitionNegPos(arr, n) 
  
# This code is contributed by Smitha 

