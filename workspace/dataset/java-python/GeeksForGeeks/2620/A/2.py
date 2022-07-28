

# Python3 Code to 
# Find pair with 
# maximum GCD in  
# an array 
  
# function to find 
# GCD of pair with 
# max GCD in the 
# array 
def findMaxGCD(arr, n) : 
      
    # Calculating MAX in 
    # array 
    high = 0
    for i in range(0, n) : 
        high = max(high, arr[i]) 
  
    # Maintaining count array 
    count = [0] * (high + 1) 
    for i in range(0, n) : 
        count[arr[i]]+=1
  
    # Variable to store the 
    # multiples of a number 
    counter = 0
  
    # Iterating from MAX 
    # to 1 GCD is always  
    # between MAX and 1 
    # The first GCD found 
    # will be the highest  
    # as we are decrementing 
    # the potential GCD 
    for i in range(high, 0, -1) : 
        j = i 
  
        # Iterating from current  
        # potential GCD till it  
        # is less than MAX 
        while (j <= high) : 
  
            # A multiple found 
            if (count[j] >0) : 
                counter+=count[j]     
  
            # Incrementing potential 
            # GCD by itself 
            # To check i, 2i, 3i.... 
            j += i 
  
            # 2 multiples found,  
            # max GCD found 
            if (counter == 2) : 
                return i 
        counter=0
          
# Driver code 
  
# Array in which pair 
# with max GCD is to 
# be found 
arr = [1, 2, 4, 8, 8, 12] 
# Size of array 
n = len(arr) 
print(findMaxGCD(arr, n)) 
  
#This code is contributed by Nikita Tiwari. 

