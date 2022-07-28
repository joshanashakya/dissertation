

# Python3 program to generate  
# Gould's Sequence  
  
# 32768 = 2^15  
MAX = 32768
  
# Array to store Sequence up to  
# 2^16 = 65536  
arr = [None] * (2 * MAX) 
  
# Utility function to pre-compute  
# odd numbers in ith row of Pascals's  
# triangle  
def gouldSequence():  
  
    # First term of the Sequence is 1  
    arr[0] = 1
  
    # Initilize i to 1  
    i = 1
  
    # Initilize p to 1 (i.e 2^i)  
    # in each iteration  
    # i will be pth power of 2  
    p = 1
  
    # loop to generate gould's Sequence  
    while i <= MAX:  
  
        # i is pth power of 2  
        # traverse the array  
        # from j=0 to i i.e (2^p)  
        j = 0
  
        while j < i:  
  
            # double the value of arr[j]  
            # and store to arr[i+j]  
            arr[i + j] = 2 * arr[j]  
            j += 1
          
        # upadate i to next power of 2  
        i = (1 << p)  
  
        # increment p  
        p += 1
      
# Function to print gould's Sequence  
def printSequence(n):  
  
    # loop to generate gould's Sequence  
    # up to n  
    for i in range(0, n): 
        print(arr[i], end = " ")  
      
# Driver code  
if __name__ == "__main__":  
  
    gouldSequence()  
  
    # Get n  
    n = 16
  
    # Function call  
    printSequence(n)  
  
# This code is contributed 
# by Rituraj Jain 

