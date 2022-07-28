

# Python3 program to check if it is 
# possible to split string or not 
MAX_CHAR = 26
  
# Function to check if we  
# can spilt string or not 
def checkCorrectOrNot(s): 
      
    global MAX_CHAR 
      
    # Counter array inisialized with 0 
    count1 = [0] * MAX_CHAR 
    count2 = [0] * MAX_CHAR 
  
    # Length of the string 
    n = len(s) 
      
    if n == 1: 
        return true 
  
    # Traverse till the middle  
    # element is reached 
    i = 0; j = n - 1
      
    while (i < j): 
          
        # First half 
        count1[ord(s[i]) - ord('a')] += 1
  
        # Second half 
        count2[ord(s[j]) - ord('a')] += 1
  
        i += 1; j -= 1
  
    # Checking if values are  
    # different set flag to 1 
    for i in range(MAX_CHAR): 
          
        if count1[i] != count2[i]: 
            return False
              
    return True
  
  
# Driver Code 
  
# String to be checked 
s = "ababc"
  
print("Yes" if checkCorrectOrNot(s) else "No") 
  
  
# This code is contributed by Ansu Kumari. 

