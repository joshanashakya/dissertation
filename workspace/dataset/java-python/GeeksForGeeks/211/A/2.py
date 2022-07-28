

# Python 3 implementation to find 
# the next distinct digits number 
  
# Function to find the 
# next distinct digits number 
def findNextNumber(n): 
    h = [0 for i in range(10)] 
    i = 0
    msb = n 
    rem = 0
    next_num = -1
    count = 0
  
    # Loop to find the distinct  
    # digits using hash array 
    # and the number of digits 
    while (msb > 9): 
        rem = msb % 10
        h[rem] = 1
        msb //= 10
        count += 1
  
    h[msb] = 1
    count += 1
  
    # Loop to find the most significant 
    # distinct digit of the next number 
    for i in range(msb + 1,10,1): 
        if (h[i] == 0): 
            next_num = i 
            break
      
    # Condition to check if the number 
    # is possible with the same number 
    # of digits count 
    if (next_num == -1): 
        for i in range(1,msb,1): 
            if (h[i] == 0): 
                next_num = i 
                count += 1
                break
      
    # Condition to check if the desired 
    # most siginificant distinct  
    # digit is found 
    if (next_num > 0): 
          
                # Loop to find the minimum next digit 
        # which is not present in the number 
        for i in range(0,10,1): 
            if (h[i] == 0): 
                msb = i 
                break
          
        # Computation of the number  
        for i in range(1,count,1): 
            next_num = ((next_num * 10) + msb) 
          
        # Condition to check if the number is  
        # greater than the given number 
        if (next_num > n): 
            print(next_num) 
        else: 
            print("Not Possible") 
    else: 
        print("Not Possible") 
  
# Driver Code 
if __name__ == '__main__': 
    n = 2019
    findNextNumber(n) 
  
# This code is contributed by Surendra_Gangwar 

