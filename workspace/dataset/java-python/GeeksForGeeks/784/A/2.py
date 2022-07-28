

# Python3 program to find minimum  
# moves required to make the array  
# in increasing order  
  
# function to find minimum moves required  
# to make the array in increasing order  
def MinimumMoves(a, n, x) : 
  
    # to store answer  
    ans = 0
  
    # iterate over an array 
    for i in range(1, n) : 
  
        # non- increasing order 
        if a[i] <= a[i - 1] : 
  
            p = (a[i - 1] - a[i]) // x + 1
  
            # add moves to answer  
            ans += p 
  
            # increase the element 
            a[i] += p * x 
  
    # return required answer  
    return ans 
          
# Driver code      
if __name__ == "__main__" : 
  
    arr = [1, 3, 3, 2] 
    x = 2
    n = len(arr) 
  
    print(MinimumMoves(arr, n, x)) 
  
  
# This code is contributed by ANKITRAI1 

