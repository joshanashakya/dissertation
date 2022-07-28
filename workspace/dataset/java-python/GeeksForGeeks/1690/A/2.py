

# Python program to check for integer  
# overflow on multiplication  
  
# Function to check whether there is  
# overflow in a * b or not. It returns  
# true if there is overflow.  
def isOverflow(a, b):  
  
    # Check if either of them is zero  
    if (a == 0 or b == 0) : 
        return False
  
    result = a * b 
    if (result >= 9223372036854775807 or 
        result <= -9223372036854775808): 
        result=0
    if (a == (result // b)): 
        print(result // b) 
        return False
    else: 
        return True
  
# Driver code  
if __name__ =="__main__": 
    a = 10000000000
    b = -10000000000
    if (isOverflow(a, b)): 
        print( "Yes") 
    else: 
        print( "No") 
          
# This code is contributed 
# Shubham Singh(SHUBHAMSINGH10) 

