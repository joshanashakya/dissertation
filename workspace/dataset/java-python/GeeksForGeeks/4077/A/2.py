

# Python3 implementation of the approach  
  
# Function to print the character sequence  
# for the given ASCII sentence  
def asciiToSentence(string, length) : 
      
    num = 0;  
    for i in range(length) : 
  
        # Append the current digit  
        num = num * 10 + (ord(string[i]) - 
                          ord('0'));  
  
        # If num is within the required range  
        if (num >= 32 and num <= 122) :  
  
            # Convert num to char  
            ch = chr(num);  
            print(ch, end = "");  
  
            # Reset num to 0  
            num = 0;  
  
# Driver code  
if __name__ == "__main__" :  
    string = "7110110110711510211111471101101107115";  
    length = len(string);  
      
    asciiToSentence(string, length);  
  
# This code is contributed by Ryuga 

