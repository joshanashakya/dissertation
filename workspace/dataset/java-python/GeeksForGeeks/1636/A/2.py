

# Python program to sort a string of characters 
# in descending order 
  
MAX_CHAR = 26; 
  
# function to print string in sorted order 
def sortString(str): 
      
    # Hash array to keep count of characters. 
    # Initially count of all charters is 
    # initialized to zero. 
    charCount = [0]*MAX_CHAR; 
  
    # Traverse string and increment 
    # count of characters 
    for i in range(len(str)): 
  
        # 'a'-'a' will be 0, 'b'-'a' will be 1, 
        # so for location of character in count 
        # array we wil do str[i]-'a'. 
        charCount[ord(str[i]) - ord('a')]+=1; 
  
    # Traverse the hash array and print 
    # characters 
    for i in range(MAX_CHAR - 1,-1, -1): 
        for j in range(charCount[i]): 
            print(chr(97+i),end=""); 
  
# Driver program to test above function 
s = "alkasingh"; 
sortString(s); 
  
# This code is contributed by Princi Singh 

