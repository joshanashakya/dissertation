

# Python 3 program to check whether 
# bitwise AND of a number with any  
# subset of an array is zero or not 
  
# Function to check whether bitwise  
# AND of a number with any subset  
# of an array is zero or not 
def isSubsetAndZero(array, length, N): 
  
    # variable to store the 
    # AND of all the elements 
    arrAnd = array[0] 
  
    # find the AND of all  
    # the elements of the array 
    for i in range(1, length) : 
        arrAnd = arrAnd & array[i] 
  
    # if the AND of all the array  
    # elements and N is equal to zero 
    if ((arrAnd & N) == 0): 
        print("YES") 
    else: 
        print("NO") 
  
# Driver Code 
if __name__ == "__main__": 
    array = [ 1, 2, 4 ] 
    length = len(array) 
  
    N = 3
  
    isSubsetAndZero(array, length, N) 
  
# This code is contributed  
# by ChitraNayal 

