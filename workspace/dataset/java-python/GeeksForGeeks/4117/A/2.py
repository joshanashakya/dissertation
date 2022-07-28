

# Python3 program to find the Minimum length String 
# with Sum of the alphabetical values 
# of the characters equal to N 
  
# Function to find the minimum length 
def minLength(n): 
    ans = n // 26
    if (n % 26 != 0): 
        ans += 1
  
    return ans 
  
# Function to find the minimum length String 
def minString(n): 
    ans = n // 26
    res = "" 
  
    while (ans): 
        res = res + "z"
        ans-=1
  
    if (n % 26 != 0): 
        res = res + chr((n % 26) + 96) 
  
    return res 
  
# Driver code 
n = 50; 
  
print(minLength(n)) 
print(minString(n)) 
  
# This code is contributed by Mohit Kumar 

