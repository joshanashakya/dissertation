

# Python program to find remainder  
# without using modulo operator 
  
# This function returns remainder of  
# num / divisor without using % (modulo) 
# operator 
def getRemainder(num, divisor): 
    return (num - divisor * (num // divisor)) 
  
  
# Driver program to test above functions 
num = 100
divisor = 7
print(getRemainder(num, divisor)) 
  
# This code is contributed by Danish Raza 

