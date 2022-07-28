

# Python3 implementation of the above approach 
# Function to prthe strings which 
# satisfy the mentioned conditions 
  
def getStrings(strr, arr): 
      
    # Iterate through all the strings 
    # in the array. 
    for i in range(len(arr)): 
          
        # check function to check the 
        # conditions for every string 
        if (check(arr[i], strr)): 
            print(arr[i],end=" ") 
              
# Function to check whether the string contains 
# any consecutive repetitive characters 
# and any characters other than those in str 
def check(s, strr): 
      
    chars = s 
      
    # Valid characters check 
    for c in chars: 
          
        if c not in strr: 
            return False
              
    # Nonrepetitive check 
    for i in range(len(chars)-1): 
        if (chars[i] == chars[i + 1]): 
            return False
      
    return True
  
# Driver code 
  
strr = "ABCD"
arr = ["AABCDA", "ABCDZADC","ABCDBCA", "ABCDABDCA"] 
getStrings(strr, arr) 
  
# This code is contributed by shubhamsingh10 

