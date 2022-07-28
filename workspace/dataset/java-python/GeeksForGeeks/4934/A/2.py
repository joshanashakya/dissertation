

# Python 3 program to find the  
# maximum consecutive repeating  
# character in given string 
  
# Returns the maximum repeating  
# character in a given string 
def maxRepeating(str): 
  
    n = len(str) 
    count = 0
    res = str[0] 
    cur_count = 1
  
    # Traverse string except  
    # last character 
    for i in range(n): 
          
        # If current character  
        # matches with next 
        if (i < n - 1 and 
            str[i] == str[i + 1]): 
            cur_count += 1
  
        # If doesn't match, update result 
        # (if required) and reset count 
        else: 
            if cur_count > count: 
                count = cur_count 
                res = str[i] 
            cur_count = 1
    return res 
  
# Driver code 
if __name__ == "__main__": 
    str = "aaaabbaaccde"
    print(maxRepeating(str)) 
  
# This code is contributed  
# by ChitraNayal 

