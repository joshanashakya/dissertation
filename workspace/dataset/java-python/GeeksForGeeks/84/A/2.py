

# Python3 implementation of the above approach  
  
# Function to return the lexicographically  
# smallest string that can be formed by  
# swapping at most one character.  
# The characters might not necessarily  
# be adjacent.  
def findSmallest(s) :  
  
    length = len(s);  
  
    # Store last occurrence of every character  
    # Set -1 as default for every character. 
    loccur = [-1]*26;  
  
  
    for i in range(length - 1, -1, -1) :  
  
        # Character index to fill  
        # in the last occurrence array  
        chI = ord(s[i]) - ord('a');  
        if (loccur[chI] == -1) : 
  
            # If this is true then this  
            # character is being visited  
            # for the first time from the last  
            # Thus last occurrence of this  
            # character is stored in this index  
            loccur[chI] = i;  
  
    sorted_s = s;  
    sorted_s.sort(); 
  
    for i in range(length) : 
        if (s[i] != sorted_s[i]) : 
  
            # Character to replace  
            chI = ord(sorted_s[i]) - ord('a');  
  
            # Find the last occurrence  
            # of this character.  
            last_occ = loccur[chI];  
  
            # Swap this with the last occurrence  
            # swap(s[i], s[last_occ]);  
            s[i],s[last_occ] = s[last_occ],s[i] 
            break;  
  
    return "".join(s);  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "geeks";  
      
    print(findSmallest(list(s)));  
  
# This code is contributed by Yash_R 

