

# Python3 implementation of the approach.  
  
# Function to return the required position  
def lenDoubleString(s): 
  
    l = len(s)  
    first_half = s[0 : l // 2]  
    second_half = ""  
  
    if l % 2 == 0: 
        second_half = s[l // 2 : ]  
    else: 
        second_half = s[l // 2 + 1 : ]  
  
    second_half = second_half[::-1] 
  
    # Print the double string  
    print(first_half + second_half)  
  
    # Print the length of the double string  
    if l % 2 == 0:  
        print(l)  
    else: 
        print(l - 1)  
  
# Driver Code 
if __name__ == "__main__": 
  
    n = "abba"
    lenDoubleString(n)  
  
    n = "abcdedcba"
    lenDoubleString(n)  
      
# This code is contributed by Rituraj Jain 

