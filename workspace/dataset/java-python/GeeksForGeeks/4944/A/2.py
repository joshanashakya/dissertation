

# Python3 implementation of the approach  
  
# Function to return maximum number  
# that can be formed from the string  
def maxNumber(string , n) : 
      
    # To store the frequency of 'z' and 'n'  
    # in the given string  
    freq = [0, 0] 
      
    for i in range(n) : 
        if (string[i] == 'z') : 
  
            # Number of zeroes  
            freq[0] += 1;  
  
        elif (string[i] == 'n') : 
  
            # Number of ones  
            freq[1] += 1;  
  
    # To store the requried number  
    num = "";  
  
    # Add all the ones  
    for i in range(freq[1]) : 
        num += '1';  
  
    # Add all the zeroes  
    for i in range(freq[0]) : 
        num += '0';  
  
    return num;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "roenenzooe";  
    n = len(string);  
  
    print(maxNumber(string, n));  
  
# This code is contributed by AnkitRai01 

