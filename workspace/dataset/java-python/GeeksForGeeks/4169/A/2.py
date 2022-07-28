

# Python3 implementation of the approach  
  
CHARS = "qwertyuiopasdfghjklzxcvbnm";  
MAX = 26;  
  
# Function to return the modified string  
def getString(string, n) : 
  
    string = list(string); 
      
    # Map to store the next character 
    # on the keyboard for every 
    # possible lowercase character 
    uMap = {}; 
      
    for i in range(MAX) : 
        uMap[CHARS[i]] = CHARS[(i + 1) % MAX]; 
          
    # Update the string 
    for i in range(n) : 
        string[i] = uMap[string[i]]; 
          
    return "".join(string);  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "geeks";  
    n = len(string);  
  
    print(getString(string, n));  
  
# This code is contributed by AnkitRai01 

