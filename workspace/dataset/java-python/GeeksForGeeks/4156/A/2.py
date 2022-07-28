

# Python3 implemenation to find the  
# Nth occurrence of a character  
  
# Function to find the  
# Nth occurrence of a character  
def findNthOccur(string , ch, N) : 
    occur = 0;  
  
    # Loop to find the Nth  
    # occurence of the character  
    for i in range(len(string)) : 
        if (string[i] == ch) : 
            occur += 1;  
  
        if (occur == N) : 
            return i;  
      
    return -1;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    string = "geeks";  
    ch = 'e';  
    N = 2;  
    print(findNthOccur(string, ch, N));  
  
# This code is contributed by AnkitRai01 

