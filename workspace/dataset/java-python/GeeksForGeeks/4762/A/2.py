

# Python program to find the  
# maximum height of Pyramidal  
# Arrangement of array values 
import math 
  
def MaximumHeight(a, n): 
    return (-1 + int(math.sqrt(1 + 
                    (8 * n)))) // 2
  
# Driver Code 
arr = [40, 100, 20, 30] 
n = len(arr) 
print(MaximumHeight(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

