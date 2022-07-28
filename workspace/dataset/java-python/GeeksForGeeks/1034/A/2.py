

# Python 3 to find four factors  
# of N with maximum product and 
# sum equal to N 
  
# import every thing from 
# math library 
from math import *
  
# Function to find factors  
# and to print those four factors  
def findfactors(n) : 
    vec = [] 
  
    # inserting all the factors 
    # in a list vec 
    for i in range(1, int(sqrt(n)) + 1) : 
        if n % i == 0 : 
            vec.append(i) 
            vec.append(n // i) 
  
    # sort the list 
    vec.sort() 
      
    print("All the factors are -> ",  
                           end = "") 
      
    # print all the factors  
    for i in range(len(vec)) : 
        print(vec[i], end = " ") 
    print() 
  
    # Any elements is divisible by 1  
    maxProduct = 1
    flag = 1
  
    # using three loop we'll find  
    # the three maximum factors  
    for i in range(0, len(vec)) : 
        for j in range(i, len(vec)) : 
            for k in range(j, len(vec)) : 
  
                # storing the fourth factor in y  
                y = n - vec[i] - vec[j] - vec[k] 
  
                # if the fouth factor become 
                # negative then break  
                if y <= 0 : 
                    break
  
                # we will replace more optimum  
                # number than the previous one  
                if n % y == 0 : 
                    flag = 0
                    maxProduct = max(vec[i] * vec[j] * 
                                     vec[k] * y , maxProduct) 
  
    # print the product if the numbers exist 
    if flag == 0 : 
        print("Product is - >", maxProduct) 
    else : 
        print("Not possible") 
  
# Driver Code 
if __name__ == "__main__" : 
    n = 50
  
    # function calling 
    findfactors(n) 
      
# This code is contributed by ANKITRAI1 

