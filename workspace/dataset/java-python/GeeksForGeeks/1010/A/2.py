

# Python3 program to find the sum of all the  
# elements from the array whose square  
# root is present in the same array 
import math 
  
# Function to return the required sum 
def getSum(arr, n): 
    sum = 0; 
  
    # Initialization of hash map 
    hashSet = set(); 
  
    # Store each element in the hash map 
    for i in range(n): 
        hashSet.add(arr[i]); 
      
    for i in range(n): 
      
        sqrtCurrent = math.sqrt(arr[i]); 
  
        # If sqrtCurrent is a decimal number 
        if (math.floor(sqrtCurrent) != math.ceil(sqrtCurrent)): 
            continue; 
  
        # If hash set contains sqrtCurrent 
        if (int(sqrtCurrent) in hashSet): 
            sum += int(sqrtCurrent * sqrtCurrent); 
  
    return sum; 
  
# Driver code 
arr = [ 2, 4, 5, 6, 7, 8, 9, 3 ]; 
n = len(arr); 
print(getSum(arr, n)); 
  
# This code is contributed by mits 

