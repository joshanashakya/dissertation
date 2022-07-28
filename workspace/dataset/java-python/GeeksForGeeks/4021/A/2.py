

# Python3 implementation of the approach  
  
# Function that returns true is str is valid  
def isValid(string, length): 
  
    # Assuming the string is binary  
    # If any two consecutive characters  
    # are equal then the string is invalid  
    for i in range(1, length):  
        if string[i] == string[i - 1]:  
            return False
  
    # If the string is alternating  
    return True
  
# Driver code  
if __name__ == "__main__":  
  
    string = "0110"
    length = len(string)  
  
    if isValid(string, length):  
        print("Valid")  
    else: 
        print("Invalid")  
  
# This code is contributed by Rituraj Jain 

