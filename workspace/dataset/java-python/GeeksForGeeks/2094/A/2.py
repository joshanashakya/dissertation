

# Simple python program to count numbers with  
# last digit as k in given range. 
  
# Returns count of numbers with k as last 
# digit. 
def counLastDigitK(low, high, k): 
    count = 0
    for i in range(low, high+1): 
        if (i % 10 == k): 
            count+=1 
    return count 
  
  
# Driver Program 
low = 3
high = 35
k = 3
print(counLastDigitK(low, high, k)) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

