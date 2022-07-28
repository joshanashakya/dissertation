

# Python3 implementation of the approach  
  
# Function to pre-process the sub-strings  
# in sorted order  
def pre_process(substrings, s) :  
      
    n = len(s);  
  
    # Generate all substrings  
    for i in range(n) : 
        dup = "";  
  
        # Iterate to find all sub-strings  
        for j in range(i,n) :  
            dup += s[j];  
  
            # Store the sub-string in the vector  
            substrings.append(dup);  
  
    # Sort the substrings lexicographically  
    substrings.sort(); 
    return substrings; 
  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "geek";  
  
    # To store all the sub-strings  
    substrings = [];  
    substrings = pre_process(substrings, s);  
  
    queries = [ 1, 5, 10 ];  
    q = len(queries);  
  
    # Perform queries  
    for i in range(q) : 
        print(substrings[queries[i] - 1]);  
          
# This code is contributed by AnkitRai01 

