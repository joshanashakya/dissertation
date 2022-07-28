

# Python Program to find the sum of  
# arithmetic series. 
  
# Function to find sum of series. 
def sumOfAP( a, d,n) : 
    sum = 0
    i = 0
    while i < n : 
        sum = sum + a 
        a = a + d 
        i = i + 1
    return sum
      
# Driver function 
n = 20
a = 2.5
d = 1.5
print (sumOfAP(a, d, n)) 
  
# This code is contributed by Nikita Tiwari. 

