

# A Python program to find last 
# index of character x in given 
# string. 
  
# Returns last index of x if it 
# is present. Else returns -1. 
def findLastIndex(str, x): 
    index = -1
    for i in range(0, len(str)): 
        if str[i] == x: 
            index = i 
    return index 
  
# Driver program 
  
# String in which char is to be found 
str = "geeksforgeeks"
  
# char whose index is to be found 
x = 'e'
  
index = findLastIndex(str, x) 
  
if index == -1: 
    print("Character not found") 
else: 
    print('Last index is', index) 
  
# This code is contributed by shrikant13. 

