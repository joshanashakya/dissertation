

# Python3 implementation of the approach 
  
# Function to return the count of repetitions  
# of string a to generate string b 
def getCount(a, b): 
      
    # If b cannot be generated by repeating a 
    if(len(b) % len(a) != 0): 
        return -1; 
      
    count = int(len(b) / len(a)) 
      
    # Repeat a count number of times 
    a = a * count 
      
    if(a == b): 
        return count 
      
    return -1; 
  
# Driver code 
if __name__ == '__main__': 
    a = 'geeks'
    b = 'geeksgeeks'
    print(getCount(a, b)) 

