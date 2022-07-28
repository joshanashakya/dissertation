

# Python implementation of above approach 
import sys 
  
# Function that finds the largest 
# element that occurs exactly 'k' times 
def solve(arr, n, k): 
  
    # store the frequency 
    # of each element 
    m = {};  
      
    for i in range(0, n - 1):  
        if(arr[i] in m.keys()):  
            m[arr[i]] += 1; 
        else:  
            m[arr[i]] = 1; 
        i += 1; 
      
    # to store the maximum element 
    max = sys.maxsize; 
  
    for i in range(0, n - 1):  
  
        # if current element has frequency 'k' 
        # and current maximum hasn't been set 
        if (m[arr[i]] == k and 
            max == sys.maxsize): 
  
            # set the current maximum 
            max = arr[i]; 
          
        # if current element has  
        # frequency 'k' and it is  
        # greater than the current maximum 
        elif (m[arr[i]] == k and max < arr[i]):  
  
            # change the current maximum 
            max = arr[i]; 
        i += 1
          
    # if there is no element 
    # with frequency 'k' 
    if (max == sys.maxsize): 
        print("No such element"); 
  
    # print the largest element 
    # with frequency 'k' 
    else: 
        print(max);  
  
# Driver code 
arr = [ 1, 1, 2, 3, 3, 4,  
           5, 5, 6, 6, 6 ] 
k = 4; 
n = len(arr) 
  
# find the largest element 
# that is repeated K times 
solve(arr, n, k) 
  
# This code is contributed  
# by Shivi_Aggarwal 

