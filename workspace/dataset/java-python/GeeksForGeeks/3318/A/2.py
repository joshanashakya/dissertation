

# Python 3 program to find minimum number 
# of characters to be removed to make 
# a string alternate. 
  
# Returns count of minimum characters  
# to be removed to make s alternate. 
def countToMake0lternate(s): 
  
    result = 0
  
    for i in range(len(s) - 1): 
  
        # if two alternating characters 
        # of string are same 
        if (s[i] == s[i + 1]): 
            result += 1 # then need to 
                        # delete a character 
  
    return result 
  
# Driver code 
if __name__ == "__main__": 
      
    print(countToMake0lternate("000111")) 
    print(countToMake0lternate("11111")) 
    print(countToMake0lternate("01010101")) 
  
# This code is contributed by ita_c 

