

# Python3 implementation of  
# the above approach  
  
# Function to check is it  
# possible to rearrange the string  
# such that every odd length  
# substring is palindrome  
def IsPossible(s) :  
  
    # Length of the string  
    n = len(s);  
  
    # To count number of distinct  
    # character in string  
    count = set(); 
      
    # To count frequency of 
    # each character 
    map = dict.fromkeys(s, 0);  
  
    for i in range(n) :  
  
        # Inserting into set  
        count.add(s[i]);  
  
        # Incrementing the frequency  
        map[s[i]] += 1;  
  
    # All characters in  
    # the string are same  
    if (len(count) == 1) : 
        return True;  
  
    # There are more than 2 different  
    # character in string  
    if (len(count) > 2) : 
        return False;  
          
    # Currently there is 2 different  
    # character in string  
    j = 0
    it = list(count)[j];  
  
    # Get the frequencies of the  
    # characters that present  
    # in string  
    x = 0; y = 0;  
    x = map[it]; 
      
    j += 1
    it = list(count)[j];  
    y = map[it];  
  
    # Difference between their  
    # count is less than or  
    # equal to 1  
    if (abs(x - y) <= 1) : 
        return True;  
  
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "aaaddad";  
  
    if (IsPossible(s)) : 
        print("YES");  
    else : 
        print("NO");  
          
# This code is contributed by AnkitRai01 

