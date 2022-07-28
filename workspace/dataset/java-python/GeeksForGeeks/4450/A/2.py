

# Python3 implementation of the above approach  
  
# Function to return the converted string  
# after replacing every consonant sequence  
# with its length  
def replaceConsonants(string) : 
  
    # To store the resultant string  
    res = "";  
    i = 0; count = 0;  
  
    # Checking each character  
    # for consonant sequence  
    while (i < len(string)) : 
  
        # Count the length of consonants sequence  
        if (string[i] != 'a'
            and string[i] != 'e'
            and string[i] != 'i'
            and string[i] != 'o'
            and string[i] != 'u') :  
            i += 1;  
            count += 1;  
          
        else : 
  
            # Add the length in the string  
            if (count > 0) : 
                res += str(count);  
  
            # Add the vowel  
            res += string[i];  
  
            i += 1
            count = 0;  
  
    # Check for the last consonant  
    # sequence in the string  
    if (count > 0) : 
        res += str(count);  
  
    # Return the resultant string  
    return res;  
  
# Driver code  
if __name__ == "__main__" : 
      
    string = "abcdeiop";  
    print(replaceConsonants(string));  
  
# This code is contributed by Ryuga 

