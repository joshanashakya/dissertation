

# An efficient Python3 implementation  
# of above approach  
charBuffer = [] 
  
def processWords(input): 
      
    """ we are splitting the input based on  
    spaces (s)+ : this regular expression  
    will handle scenarios where we have words  
    separated by multiple spaces """
    s = input.split(" ")  
      
    for values in s: 
          
        """ charAt(0) will pick only the first 
            character from the string and append 
            to buffer """
        charBuffer.append(values[0]) 
    return charBuffer  
      
# Driver Code 
if __name__ == '__main__': 
    input = "geeks for geeks"
    print(*processWords(input), sep = "")  
      
# This code is contributed  
# by SHUBHAMSINGH10 

