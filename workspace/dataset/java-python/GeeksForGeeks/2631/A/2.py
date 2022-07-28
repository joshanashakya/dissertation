

# Python3 Program to find Nth term  
  
# Function that will return nth term  
def getValue(n):  
  
    i = 0;  
    k = 1;  
  
    while (i < n): 
        i = i + k;  
        k = k * 2;  
  
    return int(k / 2);  
  
# Driver Code  
  
# Get n  
n = 9;  
  
# Get the value  
print(getValue(n));  
  
# Get n  
n = 1025;  
  
# Get the value  
print(getValue(n));  
  
# This code is contributed by mits 

