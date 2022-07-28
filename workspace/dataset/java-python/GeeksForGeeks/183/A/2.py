

# Python 3 program to 
# find if a number is 
# divisible by 
# 9 or not 
  
# Function to find that 
# number divisible by 9 
# or not 
def check(st) : 
  
    # Compute sum of digits 
    n = len(st) 
    digitSum = 0
      
    for i in range(0,n) : 
        digitSum = digitSum + (int)(st[i]) 
  
    # Check if sum of digits 
    # is divisible by 9. 
    return (digitSum % 9 == 0) 
  
# Driver code 
st = "99333"
  
if(check(st)) : 
    print("Yes") 
else :  
    print("No") 
      
# This code is contributed by Nikita Tiwari.  

