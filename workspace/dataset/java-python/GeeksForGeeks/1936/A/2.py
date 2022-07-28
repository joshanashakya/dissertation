

# Python3 Program to find ith character in  
# a binary string. 
  
# Function to store binary Representation 
def binary_conversion(s, m): 
    while(m): 
        temp = m % 2
        s += str(temp) 
        m = m // 2
      
    return s[::-1] 
  
# Function to find ith character 
def find_character(n, m, i): 
    s = "" 
  
  
# Function to change decimal to binary 
    s = binary_conversion(s, m) 
    s1 = "" 
  
    for x in range(n): 
        for j in range(len(s)): 
            if s[j] == "1": 
                s1 += "10"
            else: 
                s1 += "01"
  
    # Assign s1 string in s string      
        s = s1 
        s1 = "" 
    e = ord(s[i]) 
    r = ord('0') 
  
    return e-r 
  
# Driver code 
m, n, i = 5, 2, 8
  
print(find_character(n,m,i)) 
  
# This code is contributed by mohit kumar 29 

