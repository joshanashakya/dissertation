

# Python3 implementation of the 
# above approach 
  
# Function to count the number of 
# characters whose ascii value is  
# less than k 
def CountCharacters(str, k): 
  
    # Initialising the count to 0 
    cnt = 0
  
    l = len(str) 
    for i in range(l): 
          
        # Incrementing the count 
        # if the value is less 
        if (ord(str[i]) < k): 
            cnt += 1
  
    # return the count 
    return cnt 
  
# Driver code 
if __name__ == "__main__": 
  
    str = "GeeksForGeeks"
    k = 90
  
    count = CountCharacters(str, k) 
    print ("Characters with ASCII values", 
                "less than K are", count) 
  
    print ("Characters with ASCII values", 
           "greater than or equal to K are", 
                           len(str) - count) 
  
# This code is contributed by ita_c 

