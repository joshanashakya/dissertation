

# Python3 implementation of the above approach  
  
# Function to find the minimum number of  
# deletions required to make the occurrences  
# of the given character K continuous  
def noOfDeletions(string, k) :  
  
    ans = 0; cnt = 0; pos = 0;  
  
    # Find the first occurrence of the given letter  
    while (pos < len(string) and string[pos] != k) : 
        pos += 1;  
  
    i = pos;  
  
    # Iterate from the first occurrence  
    # till the end of the sequence  
    while (i < len(string)) :  
  
        # Find the index from where the occurrence  
        # of the character is not continuous  
        while (i < len(string) and string[i] == k) : 
            i = i + 1;  
          
        # Update the answer with the number of  
        # elements between non-consecutive occurrences  
        # of the given letter  
        ans = ans + cnt;  
        cnt = 0;  
        while (i < len(string) and string[i] != k) : 
            i = i + 1;  
  
            # Update the count for all letters  
            # which are not equal to the given letter  
            cnt = cnt + 1;  
              
    # Return the count  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    str1 = "ababababa";  
    k1 = 'a';  
      
    # Calling the function  
    print(noOfDeletions(str1, k1)); 
      
    str2 = "kprkkoinkopt";  
    k2 = 'k';  
      
    # Calling the function  
    print(noOfDeletions(str2, k2));  
      
# This code is contributed by AnkitRai01 

