

# Python3 implementation of the approach  
  
# Function to return the count of  
# valid indices pairs  
def countPairs(s1, n1, s2, n2) :  
  
    # To store the frequencies of characters  
    # of string s1 and s2  
    freq1 = [0] * 26;  
    freq2 = [0] * 26;  
  
    # To store the count of valid pairs  
    count = 0;  
  
    # Update the frequencies of  
    # the characters of string s1  
    for i in range(n1) :  
        freq1[ord(s1[i]) - ord('a')] += 1;  
  
    # Update the frequencies of  
    # the characters of string s2  
    for i in range(n2) : 
        freq2[ord(s2[i]) - ord('a')] += 1;  
  
    # Find the count of valid pairs  
    for i in range(26) : 
        count += min(freq1[i], freq2[i]);  
  
    return count;  
  
# Driver code  
if __name__ == "__main__" : 
  
    s1 = "geeksforgeeks"; 
    s2 = "platformforgeeks";  
      
    n1 = len(s1) ; 
    n2 = len(s2);  
      
    print(countPairs(s1, n1, s2, n2));  
  
# This code is contributed by Ryuga 

