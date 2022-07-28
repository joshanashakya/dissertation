

# Python 3 implementation to find the 
# sum of two integers of base B 
   
# Function to find the sum of  
# two integers of base B 
def sumBaseB(a,b,base): 
   
    len_a = len(a) 
    len_b = len(b) 
  
    s = ""; 
    sum = ""; 
   
    diff = abs(len_a - len_b); 
       
    # Padding 0 in front of the  
    # number to make both numbers equal 
    for i in range(1,diff+1): 
        s += "0"
       
    # Condition to check if the strings 
    # have lengths mis-match 
    if (len_a < len_b): 
        a = s + a 
    else: 
        b = s + b; 
   
    carry = 0; 
       
    # Loop to find the find the sum  
    # of two integers of base B 
    for i in range(max(len_a, len_b) - 1,-1,-1): 
           
        # Current Place value for  
        # the resultant sum 
        curr = carry + (ord(a[i]) -ord('0')) +( ord(b[i]) - ord('0')); 
   
        # Update carry 
        carry = curr // base 
   
        # Find current digit 
        curr = curr % base; 
   
        # Update sum result 
        sum = chr(curr + ord('0')) + sum
          
    if (carry > 0): 
        sum = chr(carry + ord('0')) + sum; 
    return sum
   
# Driver Code 
  
a = "123"
b = "234"
base = 6
       
# Function Call 
sum = sumBaseB(a, b, base); 
print(sum) 
  
# This code is contributed by atul_kumar_shrivastava 

