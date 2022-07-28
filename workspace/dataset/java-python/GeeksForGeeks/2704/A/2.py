

# Python 3 program to check if  
# a string can be made 
# valid by removing at most 1 character. 
  
# Assuming only lower case characters 
CHARS = 26
  
# To check a string S can be converted to a “valid” 
# string by removing less than or equal to one 
# character. 
      
def isValidString(str): 
  
    freq = [0]*CHARS 
  
    # freq[] : stores the frequency of each 
    # character of a string 
    for i in range(len(str)): 
        freq[ord(str[i])-ord('a')] += 1
  
    # Find first character with non-zero frequency 
    freq1 = 0
    count_freq1 = 0
    for i in range(CHARS): 
      
        if (freq[i] != 0): 
          
            freq1 = freq[i] 
            count_freq1 = 1
            break
  
    # Find a character with frequency different 
    # from freq1. 
    freq2 = 0
    count_freq2 = 0
    for j in range(i+1,CHARS): 
      
        if (freq[j] != 0): 
      
            if (freq[j] == freq1): 
                count_freq1 += 1
            else: 
              
                count_freq2 = 1
                freq2 = freq[j] 
                break
  
    # If we find a third non-zero frequency 
    # or count of both frequencies become more 
    # than 1, then return false 
    for k in range(j+1,CHARS): 
      
        if (freq[k] != 0): 
          
            if (freq[k] == freq1): 
                count_freq1 += 1
            if (freq[k] == freq2): 
                count_freq2 += 1
  
            # If we find a third non-zero freq 
            else: 
                return False
  
        # If counts of both frequencies is more than 1 
        if (count_freq1 > 1 and count_freq2 > 1): 
            return False
  
    # Return true if we reach here 
    return True
  
# Driver code 
if __name__ == "__main__": 
    str= "abcbc"
  
    if (isValidString(str)): 
        print("YES") 
    else: 
        print("NO") 
          
# this code is contributed by  
# ChitraNayal 

