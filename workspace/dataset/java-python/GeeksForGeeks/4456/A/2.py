

# Python3 implementation to check that  
# a string contains all vowels  
  
# Function to to check that  
# a string contains all vowels  
def checkIfAllVowels(string) :  
  
    # Hash Array of size 5  
    # such that the index 0, 1, 2, 3 and 4  
    # represent the vowels a, e, i, o and u  
    hash = [0]*5 ; 
      
    # Loop the string to mark the vowels 
    # which are present 
    for i in range(len(string)) : 
        if (string[i] == 'A' or string[i] == 'a') : 
            hash[0] = 1; 
              
        elif (string[i] == 'E' or string[i] == 'e') : 
            hash[1] = 1; 
              
        elif (string[i] == 'I' or string[i] == 'i') : 
            hash[2] = 1; 
              
        elif (string[i] == 'O' or string[i] == 'o') : 
            hash[3] = 1; 
              
        elif (string[i] == 'U' or string[i] == 'u') : 
            hash[4] = 1; 
              
    # Loop to check if there is any vowel 
    # which is not present in the string 
    for i in range(5) : 
        if (hash[i] == 0) : 
            return 1; 
              
    return 0;  
  
# Function to to check that  
# a string contains all vowels  
def checkIfAllVowelsArePresent(string) :  
  
    if (checkIfAllVowels(string)) : 
        print("Not Accepted");  
    else : 
        print("Accepted");  
  
# Driver Code  
if __name__ == "__main__" :  
  
    string = "aeioubc";  
    checkIfAllVowelsArePresent(string);  
  
# This code is contributed by AnkitRai01 

