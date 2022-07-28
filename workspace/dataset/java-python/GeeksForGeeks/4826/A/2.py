

# Python3 implementation of the approach  
  
# Array to store how many times a button 
# has to be pressed for typing 
# a particular character 
arr = [ 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 
        2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 ]; 
  
# Function to return the count of 
# buttons pressed to type the given string 
def countKeyPressed(string, length) : 
    count = 0; 
  
    # Count the key presses 
    for i in range(length) : 
        count += arr[ord(string[i]) - ord('a')]; 
  
    # Return the required count 
    return count; 
  
# Driver code 
if __name__ == "__main__" : 
    string = "abcdef"; 
    length = len(string); 
      
    print(countKeyPressed(string, length)); 
  
# This code is contributed by Ryuga 

