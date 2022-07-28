

# Python3 implementation for  
# finding nth number made of 
# prime digits only 
import math 
  
# Prints n-th number where  
# each digit is a prime number 
def nthprimedigitsnumber(n): 
      
    # Finding the length 
    # of n-th number 
    len = 1; 
  
    # Count of numbers  
    # with len-1 digits 
    prev_count = 0; 
    while(1):  
          
        # Count of numbers  
        # with i digits 
        curr_count = (prev_count + 
                      math.pow(4, len)); 
  
        # if i is the length of such 
        # number then n<4*(4^(i-1)-1)/3 
        # and n>= 4*(4 ^ i-1)/3 if a valid 
        # i is found break the loop 
        if (prev_count < n and 
            curr_count >= n): 
            break; 
  
        # check for i + 1 
        len += 1; 
  
        prev_count = curr_count; 
  
    # Till now we have covered 
    # 'prev_count' numbers 
  
    # Finding ith digit at ith place 
    for i in range (1, len + 1): 
          
        # j = 1 means 2 j = 2 
        # means ...j = 4 means 7 
        for j in range(1, 5):  
              
            # if prev_count + 4 ^ (len-i)  
            # is less than n, increase  
            # prev_count by 4^(x-i) 
            if (prev_count + pow(4, len - i) < n): 
                prev_count += pow(4, len - i); 
  
            # else print the ith 
            # digit and break 
            else: 
                if (j == 1): 
                    print("2", end = ""); 
                elif (j == 2): 
                    print("3", end = ""); 
                elif (j == 3): 
                    print("5", end = ""); 
                elif (j == 4): 
                    print("7", end = ""); 
                break; 
    print(); 
  
# Driver Code 
nthprimedigitsnumber(10); 
nthprimedigitsnumber(21); 
  
# This code is contributed by mits 

