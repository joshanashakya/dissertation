

# Python3 implementation of the approach  
  
# Function that returns true if  
# the product of all the array elements  
# is a perfect square  
def isPerfectSquare(arr, n) :  
  
    umap = dict.fromkeys(arr, n);  
  
    # Update the frequencies of  
    # all the array elements  
    for key in arr : 
        umap[key] += 1;  
  
    for key in arr : 
  
        # If frequency of some element  
        # in the array is odd  
        if (umap[key] % 2 == 1) : 
            return False;  
  
    return True;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 2, 7, 7 ];  
    n = len(arr) 
  
    if (isPerfectSquare(arr, n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by Ryuga 

