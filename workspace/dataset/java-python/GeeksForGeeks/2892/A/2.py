

# Python3 program to count number of  
# digits in n-th number made of given  
# four digits. 
  
# Efficient function to calculate number  
# of digits in the nth number constructed 
# by using 6, 1, 4 and 9 as digits in the  
# ascending order. 
def number_of_digits(n): 
  
    i = 4;  
    res = 1;  
    sum = 0; 
  
    # Number of digits increase after  
    # every i-th number where i increases  
    # in powers of 4. 
    while(True): 
        i *= 4; 
        res += 1; 
        sum += i; 
        if(sum >= n): 
            break;  
    return res; 
  
# Driver Code 
n = 21; 
print(number_of_digits(n)); 
      
# This code is contributed by mits 

