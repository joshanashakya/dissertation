

# Python3 program to demonstrate above  
# method to check divisibility by 29. 
  
# Returns true if n is divisible  
# by 29 else returns false. 
def isDivisible(n): 
  
    # add the lastdigit*3 to renaming  
    # number until number comes only 
    # 2 digit 
    while (int(n / 100)) : 
        last_digit = int(n % 10) 
        n = int(n / 10) 
        n += last_digit * 3
      
    # return true if number is 
    # divisible by 29 another 
    return (n % 29 == 0) 
  
# Driver Code 
n = 348
  
if(isDivisible(n) != 0): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Smitha Dinesh Semwal. 

