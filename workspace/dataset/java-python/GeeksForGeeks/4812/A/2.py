

# Python3 program to find the required  
# permutation of first 2*N natural numbers  
  
# Function to find the required permutation  
# of first 2*N natural numbers  
def printPermutation(n, k) : 
      
    # Iterate in blocks of 2  
    for i in range(1, n + 1) : 
        x = 2 * i - 1;  
        y = 2 * i;  
  
        # We need more increments,  
        # so print in reverse order  
        if (i <= k) : 
            print(y, x, end = " ");  
  
        # We have enough increments,  
        # so print in same order  
        else : 
            print(x, y, end = " ");  
  
# Driver Code  
if __name__ == "__main__" :  
    n = 2; k = 1;  
  
    printPermutation(n, k);  
      
# This code is contributed by Ryuga 

