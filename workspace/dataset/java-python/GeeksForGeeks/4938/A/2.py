

# Python3 implementation of the approach  
  
# Function to return the count of  
# distinct state codes  
def countDistinctCode(string):  
  
    codes = set() 
    for i in range(0, len(string) - 1):  
  
        # Insert every sub-string  
        # of length 2 in the set  
        codes.add(string[i:i + 2])  
  
    # Return the size of the set  
    return len(codes)  
  
# Driver code  
if __name__ == "__main__":  
  
    string = "UPUP"
    print(countDistinctCode(string))  
  
# This code is contributed  
# by Rituraj Jain 

