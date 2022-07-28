

# Python 3 implementation to find remainder 
# when a large number is divided by 11 
  
# Function to return remainder 
def remainder(st) : 
      
    # len is variable to store the 
    # length of number string. 
    ln = len(st) 
      
    rem = 0
      
    # loop that find remainder 
    for i in range(0, ln) : 
        num = rem * 10 + (int)(st[i]) 
        rem = num % 11
          
    return rem 
      
      
# Driver code 
st = "3435346456547566345436457867978"
print(remainder(st)) 
  
  
# This code is contributed by Nikita Tiwari. 

