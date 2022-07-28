

# Python3 implementation of the approach  
  
# Function to return the count  
# of required characters  
def countChars(string, n) : 
  
    i = 0; cnt = 0;  
  
    # While there are characters left  
    while (i < n) : 
  
        # Single bit character  
        if (string[i] == '0'): 
            i += 1;  
  
        # Two-bit character  
        else : 
            i += 2;  
  
        # Update the count  
        cnt += 1;  
  
    return cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "11010";  
    n = len(string);  
  
    print(countChars(string, n)); 
      
# This code is contributed by AnkitRai01 

