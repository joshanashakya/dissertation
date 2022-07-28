

# Python program to find the  
# maximum height of Pyramidal  
# Arrangement of array values 
  
def MaximumHeight(a, n): 
    result = 1
  
    for i in range(1, n): 
          
        # Just checking whether ith level 
        # is possible or not if possible 
        # then we must have atleast 
        # (i*(i+1))/2 elements in the array 
        y = (i * (i + 1)) / 2
  
        # updating the result 
        # value each time 
        if(y < n): 
            result = i 
              
        # otherwise we have  
        # exceeded n value 
        else: 
            break
  
    return result 
  
# Driver Code 
arr = [40, 100, 20, 30] 
n = len(arr) 
print(MaximumHeight(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

