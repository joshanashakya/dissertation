

# Simple Python3 program to convert all 
# substrings from decimal to given base. 
import math as mt 
  
def substringConversions(str1, k, b): 
  
    for i in range(0, len(str1) - k + 1): 
      
        # Saving subin sub 
        sub = str1[i:k + i] 
          
        # Evaluating decimal for current  
        # substring and printing it. 
        Sum = 0
        counter = 0
        for i in range(len(sub) - 1, -1, -1): 
            Sum = (Sum + ((ord(sub[i]) - ord('0')) * 
                           pow(b, counter))) 
            counter += 1
                  
        print(Sum, end = " ") 
      
# Driver code 
str1 = "12212"
b = 3
k = 3
substringConversions(str1, b, k)  
  
# This code is contributed by  
# Mohit Kumar 29 

