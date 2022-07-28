

# Python3 implementation of the approach 
  
# Function to return the count of 
# valid values of x 
def countX(n): 
  
    # Convert n into binary String 
    binary = "{0:b}".format(n) 
  
    # To store the count of 1s 
    count = 0
  
    for i in range(len(binary)): 
  
        # If current bit is 1 
        if (binary[i] == '1'): 
            count += 1
  
    # Calculating answer 
    answer = int(pow(2, count)) 
    return answer 
  
# Driver code 
if __name__ == "__main__": 
      
    n = 5
    answer = countX(n) 
    print(answer) 
  
# This code is contributed by ita_c 

