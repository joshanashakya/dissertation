

# Python3 code for above approach 
  
# Returns the count of numbers in range 
# if the first digit is equal to last digit of number 
def count(l, r): 
    cnt = 0       # Initialize counter 
    for i in range(l, r): 
          
        # If number is less than 10 
        # then increment counter 
        # as number has only one digit  
        if(i < 10):      
            cnt += 1
              
        else: 
            n = i % 10     # Find the last digit 
            k = i 
  
            # Find the first digit 
            while(k >= 10): 
                k = k // 10
  
            # If first digit equals last digit 
            # then increment counter 
            if(n == k): 
                cnt += 1
                  
    return(cnt)     # Return the count 
  
# Driver Code 
L = 2; R = 60; 
print(count(L, R))  
  
L = 1; R = 1000; 
print(count(L, R)) 
  
# This code is contributed by Raj 

