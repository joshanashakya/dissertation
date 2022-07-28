

# Python3 implementation of the approach 
# Function that returns X 
import math 
def findX(list,int): 
    #Sort the given array 
    list.sort() 
      
    #Get the possible X 
    x = list[0]*list[int-1]; 
  
    # Container to store divisors 
    vec=[] 
  
    # Find the divisors of a number 
    i = 2
    while(i * i <= x): 
        #Check if divisor 
        if(n % i == 0): 
            vec.append(i) 
            if ((int//i) != i): 
                vec.append(int//i) 
        i +=1
  
    # Check if a and vec have 
    # same elements in them 
    if(len(vec) == int): 
        j = 0
        for it in range(int): 
            if(a[j] != it): 
                return -1
            else: 
                j +=1
    return x 
  
# Drivers code 
a = [2, 5, 4, 10] 
n = len(a) 
print(findX(a,n)) 
  
# This code is contributed by souviksarkhelkgp 

