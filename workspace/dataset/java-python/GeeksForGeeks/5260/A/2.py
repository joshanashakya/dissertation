

# Function to find the largest number 
def largestNum(a, b): 
    return a * (bool)(a // b) + \ 
           b * (bool)(b // a); 
  
# Driver Code 
a = 22; 
b = 1231; 
print(largestNum(a, b)); 
  
# This code is contributed by Rajput-Ji 

