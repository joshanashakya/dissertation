

# Python3 program to find four factors of N 
# with maximum product and sum equal to N 
from math import sqrt, ceil, floor 
  
# Function to find factors 
# and to prthose four factors 
def findfactors(n): 
    mpp = dict() 
  
    v = [] 
    v1 = [] 
  
    # push all the factors in the container 
    for i in range(1,ceil(sqrt(n)) + 1): 
        if (n % i == 0): 
            v.append(i) 
            if (i != (n // i) and i != 1): 
                v.append(n // i) 
  
    # number of factors 
    s = len(v) 
  
    # Initial maximum 
    maxi = -1
  
    # hash-array to mark the 
    # pairs 
    mp1 = [0]*(n + 5) 
  
    for i in range(s): 
  
        # form all the pair sums 
        for j in range(i, s): 
  
            # if the pair sum is less than n 
            if (v[i] + v[j] < n): 
  
                # push in another container 
                v1.append(v[i] + v[j]) 
  
                # mark the sum with the elements 
                # formed 
                mp1[v[i] + v[j]] =[v[i], v[j]] 
  
                # mark in the map that v[i]+v[j] 
                # is present 
                mpp[v[i] + v[j]] = 1
  
  
    # new size of all the pair sums 
    s = len(v1) 
  
    # iterate for all pair sum 
    for i in range(s): 
  
        # the required part 
        el = n - (v1[i]) 
  
        # if the required part is also 
        # present in pair sum 
        if (el in mpp): 
  
            # find the elements with 
            # which the first pair is formed 
            a = mp1[v1[i]][0] 
            b = mp1[v1[i]][1] 
  
            # find the elements with 
            # which the second pair is formed 
            c = mp1[n - v1[i]][0] 
            d = mp1[n - v1[i]][1] 
  
            # check for previous maximum 
            maxi = max(a * b * c * d, maxi) 
  
    if (maxi == -1): 
        print("Not Possible") 
    else : 
        print("The maximum product is ", maxi) 
  
# Driver code 
n = 50
  
findfactors(n) 
  
# This code is contributed by mohit kumar 29 

