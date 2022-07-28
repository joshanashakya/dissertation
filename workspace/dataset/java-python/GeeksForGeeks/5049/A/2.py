

# Python3 implementation of the approach  
  
# Binary representation of the digits  
bin = [ "000", "001", "010", "011",  
        "100", "101", "110", "111" ];  
  
# Function to return the maximum frequency  
# of s modulo with a power of 2  
def maxFreq(s) : 
  
    # Store the binary representation  
    binary = "";  
  
    # Convert the octal to binary  
    for i in range(len(s)) : 
        binary += bin[ord(s[i]) - ord('0')];  
      
    # Remove the LSB  
    binary = binary[0 : len(binary) - 1];  
  
    count = 1; prev = -1;j = 0;  
  
    for i in range(len(binary) - 1, -1, -1) : 
  
        # If there is 1 in the binary representation  
        if (binary[i] == '1') : 
  
            # Find the number of zeroes in between  
            # two 1's in the binary representation  
            count = max(count, j - prev);  
            prev = j; 
          
        j += 1; 
  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    octal = "13";  
  
    print(maxFreq(octal));  
  
# This code is contributed by AnkitRai01 

