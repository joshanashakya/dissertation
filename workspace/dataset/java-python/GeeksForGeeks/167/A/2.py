

# Python 3 program to find if 
# a number is divisible by 25 
# or not 
  
# Function to find that 
# number divisible by 25 or not. 
def isDivisibleBy25(st) : 
  
    # If length of string is 
    # single digit then it's 
    # not divisible by 25 
    n = len(st) 
    if (n == 1) : 
        return False
  
    return ((int)(st[n-1]) == 0 and ((int)(st[n-2])== 0) or
           ((int)(st[n-2])*10 + (int)(st[n-1])%25 == 0)) 
  
# Driver code 
st = "76955"
if(isDivisibleBy25(st)) : 
    print("Yes") 
else : 
    print("No") 
      
  
# This code is contributed by Nikita Tiwari. 

