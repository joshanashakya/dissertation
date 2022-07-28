

# Python program to 
# find Minimum number 
# of operations to 
# convert an array  
# so that arr[i] % 4 is zero. 
  
# Function to find 
# minimum operations. 
def minimumOperations(arr,n): 
  
    # Counting of all the elements 
    # leaving remainder 1, 2, 3 when 
    # divided by 4 in the array brr. 
    # at positions 1, 2 and 3 respectively. 
    brr = [ 0, 0, 0, 0 ] 
    for i in range(n): 
        brr[arr[i] % 4]+=1; 
   
    # If it is possible to convert the  
    # array so that arr[i] % 4 is zero. 
    if ((brr[1] + 2 * brr[2] + 3 * brr[3]) % 4 == 0):  
      
        # Pairing the elements 
        # of brr3 and brr1. 
        min_opr = min(brr[3], brr[1]) 
        brr[3] -= min_opr 
        brr[1] -= min_opr 
   
        # Pairing the brr2 elements. 
        min_opr += brr[2] // 2
   
        # Assigning the remaining 
        # brr2 elements. 
        brr[2] %= 2
   
        # If we are left with 
        # one brr2 element. 
        if (brr[2]): 
   
            # Here we need only two operations 
            # to convert the remaining one 
            # brr2 element to convert it. 
            min_opr += 2
   
            # Now there is no brr2 element. 
            brr[2] = 0
   
            # Remaining brr3 elements. 
            if (brr[3]):              
                brr[3] -= 2            
   
            # Remaining brr1 elements. 
            if (brr[1]):  
                brr[1] -= 2            
          
   
        # If we are left with brr1 and brr2 
        # elements then, we have to take four 
        # of them and fixing them all together 
        # in 3 operations. 
        if (brr[1]):         
            min_opr += (brr[1] // 4) * 3        
        if (brr[3]):         
            min_opr += (brr[3] // 4) * 3        
   
        # Returns the minimum operations. 
        return min_opr 
  
    # If it is not possible to convert the array. 
    return -1    
  
# Driver function 
  
arr = [ 1, 2, 3, 1, 2, 3, 8 ] 
n =len(arr) 
  
print(minimumOperations(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

