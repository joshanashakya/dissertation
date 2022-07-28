

# Python 3 implementation of the approach 
MAX = 26
  
# Function to sort the given string 
# using counting sort 
def countingsort(s): 
    # Array to store the count of each character 
    count = [0 for i in range(MAX)] 
    for i in range(len(s)): 
        count[ord(s[i]) - ord('a')] += 1
    index = 0
  
    # Insert characters in the string 
    # in increasing order 
      
    for i in range(MAX): 
        j = 0
        while (j < count[i]): 
            s = s.replace(s[index],chr(97+i)) 
            index += 1
            j += 1
          
  
# Function that returns true if str can be 
# generated from any permutation of the 
# two strings selected from the given vector 
def isPossible(v, str1): 
    # Sort the given string 
    countingsort(str1); 
  
    # Select two strings at a time from given vector 
    for i in range(len(v)-1): 
        for j in range(i + 1,len(v),1): 
            # Get the concatenated string 
            temp = v[i] + v[j] 
  
            # Sort the resultant string 
            countingsort(temp) 
  
            # If the resultant string is equal 
            # to the given string str 
            if (temp == str1): 
                return False
              
    # No valid pair found 
    return True
  
# Driver code 
if __name__ == '__main__': 
    str1 = "amazon"
    v = ["fds", "oxq", "zoa", "epw", "amn"] 
  
    if (isPossible(v, str1)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

