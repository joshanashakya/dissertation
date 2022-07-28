

# Python3 program to find the K-th  
# smallest factor 
import math as mt 
  
# Function to find the k'th divisor 
def findkth (n, k): 
  
    # initialize vectors v1 and v2 
    v1 = list() 
    v2 = list() 
      
    # store all the divisors in the  
    # two vectors accordingly 
    for i in range(1, mt.ceil(n**(.5))): 
      
        if (n % i == 0): 
          
            v1.append(i) 
              
            if (i != mt.ceil(mt.sqrt(n))): 
                v2.append(n // i) 
          
    # reverse the vector v2 to sort it 
    # in increasing order 
    v2[::-1] 
      
    # if k is greater than the size of vectors  
    # then no divisor can be possible 
    if ( k > (len(v1) + len(v2))): 
        print("Doesn't Exist", end = "") 
          
    # else print the ( k - 1 )th value of vector  
    else: 
      
        # If K is lying in first vector 
        if(k <= len(v1)): 
            print(v1[k - 1]) 
              
        # If K is lying in second vector 
        else: 
            print(v2[k - len(v1) - 1]) 
      
# Driver code 
n = 15
k = 2
findkth (n, k)  
  
# This code is contributed by Mohit kumar 

