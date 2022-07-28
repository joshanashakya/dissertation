

# Python 3 implementation of the approach  
  
# Function to return the count  
# of the required pairs  
def sumEqualProduct(a, n): 
    zero = 0
    two = 0
      
    # Find the count of 0s  
    # and 2s in the array  
    for i in range(n): 
        if a[i] == 0: 
            zero += 1
        if a[i] == 2: 
            two += 1
              
    # Find the count of required pairs 
    cnt = (zero * (zero - 1)) // 2 + \ 
            (two * (two - 1)) // 2
      
    # Return the count 
    return cnt 
      
# Driver code  
a = [ 2, 2, 3, 4, 2, 6 ]  
n = len(a)  
  
print(sumEqualProduct(a, n)) 
  
# This code is contributed by Ankit kumar 

