

# Python3 Program to  
# find closest multiple  
# of x to a^b 
import math 
  
# function to find closest  
# multiple of x to a^b  
def multiple(a, b, x): 
    if (b < 0): 
        if (a == 1 and x == 1): 
            print("1"); 
        else: 
            print("0"); 
              
    # calculate a ^ b / x 
    mul = int(pow(a, b)); 
      
    ans = int(mul / x); 
      
    # Answer is either (ans * x)  
    # or (ans + 1) * x  
    ans1 = x * ans; 
    ans2 = x * (ans + 1); 
      
    # Printing nearest answer 
    if ((mul - ans1) <= (ans2 - mul)): 
        print(ans1); 
    else:  
        print(ans2); 
  
# Driver Code 
a = 349; 
b = 1; 
x = 4; 
multiple(a, b, x); 
  
# This code is contributed  
# by mits 

