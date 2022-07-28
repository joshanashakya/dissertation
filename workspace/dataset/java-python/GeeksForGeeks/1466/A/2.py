

# Simple Python 3 program to find  
# pairs of positive and negative  
# values present in an array. 
  
# Print pair with negative and  
# positive value 
def printPairs(arr, n): 
    v = [] 
  
    # For each element of array. 
    for i in range(n):  
  
        # Try to find the negative value  
        # of arr[i] from i + 1 to n 
        for j in range( i + 1,n) : 
  
            # If absolute values are  
            # equal print pair. 
            if (abs(arr[i]) == abs(arr[j])) : 
                v.append(abs(arr[i]))  
  
    # If size of vector is 0, therefore  
    # there is no element with positive 
    # negative value, print "0" 
    if (len(v) == 0): 
        return; 
  
    # Sort the vector 
    v.sort() 
  
    # Print the pair with negative  
    # positive value. 
    for i in range(len( v)): 
        print(-v[i], "" , v[i], end = " ")  
  
# Driver Code 
if __name__ == "__main__": 
    arr = [ 4, 8, 9, -4, 1, -1, -8, -9 ] 
    n = len(arr) 
    printPairs(arr, n) 
  
# This code is contributed  
# by ChitraNayal 

