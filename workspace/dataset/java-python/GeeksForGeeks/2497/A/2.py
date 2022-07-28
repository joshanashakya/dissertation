

# program to compute mod of a big number 
# represented as string 
  
# Function to compute num (mod a) 
def mod(num, a): 
      
    # Initialize result 
    res = 0
  
    # One by one process all digits 
    # of 'num' 
    for i in range(0, len(num)): 
        res = (res * 10 + int(num[i])) % a; 
  
    return res 
  
# Driver program 
num = "12316767678678"; 
print(mod(num, 10)) 
  
# This code is contributed by Sam007 

