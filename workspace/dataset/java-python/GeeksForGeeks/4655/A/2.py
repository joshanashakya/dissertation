

# Python3 program for implementation of simple 
# approach to find length of last word 
def lengthOfLastWord(a): 
    l = 0
  
    # String a is 'final'-- can not be modified 
    # So, create a copy and trim the spaces from 
    # both sides 
    x = a.strip() 
  
    for i in range(len(x)): 
        if x[i] == " ": 
            l = 0
        else: 
            l += 1
    return l 
  
# Driver code 
if __name__ == "__main__": 
    inp = "Geeks For Geeks "
    print("The length of last word is",  
                 lengthOfLastWord(inp)) 
  
# This code is contributed by 
# sanjeev2552 

