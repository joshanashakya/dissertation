

# Python 3 program to find 
# if a number is divisible 
# by 16 or not 
  
# Function to find that 
# number divisible by 
# 16 or not 
def check(st) : 
    n = len(st)  
      
    # Empty string 
    if (n == 0 and n == 1) : 
        return False
   
    # If there is double digit 
    if (n == 2) : 
        return ((int)(st[n-2])*10 +
                ((int)(st[n-1])%16 == 0)) 
   
    # If there is triple digit 
    if(n == 3) : 
        return ( ((int)(st[n-3])*100 +
                   (int)(st[n-2])*10 +
                   (int)(st[n-1]))%16 == 0) 
   
   
    # If number formed by last 
    # four digits is divisible 
    # by 16. 
    last = (int)(st[n-1]) 
    second_last = (int)(st[n-2]) 
    third_last = (int)(st[n-3]) 
    fourth_last = (int)(st[n-4]) 
    return ((fourth_last*1000 + third_last*100
            + second_last*10 + last) % 16 == 0) 
  
  
# Driver code 
st = "769528"
if(check(st)) : 
    print("Yes") 
else : 
    print("No") 
      
  
# This code is conributed by Nikita Tiwari. 

