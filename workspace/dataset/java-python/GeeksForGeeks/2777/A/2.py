

# Python 3 program to find the 
# lexicographically maximum substring. 
def LexicographicalMaxString(str): 
      
    # loop to find the max leicographic  
    # substring in the substring array 
    mx = "" 
    for i in range(len(str)): 
        mx = max(mx, str[i:]) 
  
    return mx 
  
# Driver code 
if __name__ == '__main__': 
    str = "ababaa"
    print(LexicographicalMaxString(str)) 
      
# This code is contributed by 
# Sanjit_Prasad 

