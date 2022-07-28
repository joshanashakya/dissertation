

# Python3 implementation of the approach 
  
# Function to reduce every 
# element to it's half such that  
# the total sum remain zero 
def half(arr, n) : 
      
    # Flag to swith between alternating  
    # odd numbers in the array 
    flag = 0
      
    # For every element of the array 
    for i in range(n): 
          
        # If its even then reduce it to half 
        if arr[i] % 2 == 0 : 
            print(arr[i]//2, end =" ") 
              
        # If its odd 
        else : 
              
            # Reduce the odd elements  
            # alternatively 
            if flag == 0: 
                print(arr[i]//2, end =" ") 
                  
                # Switch flag 
                flag = 1
            else : 
                q = arr[i]//2
                q+= 1
                print(q, end =" ") 
                  
                # Switch flag 
                flag = 0
  
# Driver code 
arr = [-7, 14, -7] 
half(arr, len(arr)) 

