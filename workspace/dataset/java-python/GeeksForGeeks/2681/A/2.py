

# Python3 program to remove duplicate character 
# from character array and prin sorted 
# order 
def removeDuplicate(str, n): 
      
    # Used as index in the modified string 
    index = 0
      
    # Traverse through all characters 
    for i in range(0, n): 
          
        # Check if str[i] is present before it  
        for j in range(0, i + 1): 
            if (str[i] == str[j]): 
                break
                  
        # If not present, then add it to 
        # result. 
        if (j == i): 
            str[index] = str[i] 
            index += 1
              
    return "".join(str[:index]) 
  
# Driver code 
str= "geeksforgeeks"
n = len(str) 
print(removeDuplicate(list(str), n)) 
  
# This code is contributed by SHUBHAMSINGH10 

