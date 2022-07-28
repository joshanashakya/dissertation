

# Python 3 program to find k'th  
# non-repeating character in a string 
MAX_CHAR = 256
  
# Returns index of k'th non-repeating  
# character in given string str[] 
def kthNonRepeating(str, k): 
  
    n = len(str) 
  
    # count[x] is going to store count of   
    # character 'x' in str. If x is not  
    # present, then it is going to store 0. 
    count = [0] * MAX_CHAR 
  
    # index[x] is going to store index of  
    # character 'x' in str. If x is not  
    # present or x is repeating, then it  
    # is going to store a value (for example,  
    # length of string) that cannot be a valid 
    # index in str[] 
    index = [0] * MAX_CHAR 
  
    # Initialize counts of all characters  
    # and indexes of non-repeating characters. 
    for i in range( MAX_CHAR): 
        count[i] = 0
        index[i] = n # A value more than any  
                     # index in str[] 
  
    # Traverse the input string 
    for i in range(n): 
          
        # Find current character and  
        # increment its count 
        x = str[i] 
        count[ord(x)] += 1
  
        # If this is first occurrence, then  
        # set value in index as index of it. 
        if (count[ord(x)] == 1): 
            index[ord(x)] = i 
  
        # If character repeats, then remove  
        # it from index[] 
        if (count[ord(x)] == 2): 
            index[ord(x)] = n 
  
    # Sort index[] in increasing order. This step 
    # takes O(1) time as size of index is 256 only 
    index.sort() 
  
    # After sorting, if index[k-1] is value,  
    # then return it, else return -1. 
    return index[k - 1] if (index[k - 1] != n) else -1
  
# Driver code 
if __name__ == "__main__": 
    str = "geeksforgeeks"
    k = 3
    res = kthNonRepeating(str, k) 
    if(res == -1): 
        print("There are less than k", 
              "non-repeating characters") 
    else: 
        print("k'th non-repeating character is",  
                                       str[res]) 
  
# This code is contributed 
# by ChitraNayal 

