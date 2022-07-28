

# Python 3 code to find average  
# of ASCII characters 
  
# Function to find average  
# of ASCII value of chars 
def averageValue(s): 
    sum_char = 0
  
    # loop to sum the ascii 
    # value of chars 
    for i in range(len(s)): 
        sum_char += ord(s[i]) 
  
    # Returning average of chars 
    return sum_char // len(s) 
  
# Driver code 
if __name__ == "__main__": 
      
    s = "GeeksforGeeks"
  
    print(averageValue(s)) 
  
# This code is contributed by ita_c 

