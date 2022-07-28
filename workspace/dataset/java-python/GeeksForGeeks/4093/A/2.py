

# Python3 implementation of the approach 
  
# Function to return the string formed  
# by the odd indexed characters of s 
def partOdd(s): 
    odd = [] 
    for i in range(len(s)): 
        if i % 2 != 0: 
            odd.append(s[i]) 
    return odd 
  
# Function to return the string formed  
# by the even indexed characters of s 
def partEven(s): 
    even = [] 
    for i in range(len(s)): 
        if i % 2 == 0: 
            even.append(s[i]) 
    return even 
  
  
# Function that returns true if s1  
# can be made equal to s2  
# with the given operation 
def canBeMadeEqual(s1, s2): 
      
    # Get the string formed by the  
    # even indexed characters of s1 
    even_s1 = partEven(s1) 
      
      
    # Get the string formed by the  
    # even indexed characters of s2 
    even_s2 = partEven(s2) 
      
    # Get the string formed by the  
    # odd indexed characters of s1 
    odd_s1 = partOdd(s1) 
      
    # Get the string formed by the  
    # odd indexed characters of s2 
    odd_s2 = partOdd(s2) 
  
    # Sorting all the lists 
    even_s1.sort() 
    even_s2.sort() 
    odd_s1.sort() 
    odd_s2.sort() 
  
    # If the strings can be made equal 
    if even_s1 == even_s2 and odd_s1 == odd_s2: 
        return True
      
    return False
  
  
# Driver code  
s1 = "cdab"
s2 = "abcd"
if canBeMadeEqual(s1, s2): 
    print("Yes") 
else: 
    print("No") 

