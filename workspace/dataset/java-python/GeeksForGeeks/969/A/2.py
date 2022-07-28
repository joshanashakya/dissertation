

# Python 3 program to find Lexicographically 
# smallest string whose hamming distance 
# from the given string is exactly K 
  
# function to find Lexicographically 
# smallest string with hamming distance k 
def findString(str, n, k): 
      
    # If k is 0, output input string 
    if (k == 0): 
        print(str) 
        return
      
    # Copying input string into output 
    # string 
    str2 = str
    p = 0
  
    # Traverse all the character of the 
    # string 
    for i in range(0, n, 1): 
          
        # If current character is not 'a' 
        if (str2[i] != 'a'): 
              
            # copy character 'a' to  
            # output string 
            str2 = str2.replace(str2[i], 'a') 
            p += 1
  
            # If hamming distance became k, 
            # break; 
            if (p == k): 
                break
      
    # If k is less than p 
    if (p < k): 
          
        # Traversing string in reverse  
        # order 
        i = n - 1
        while(i >= 0): 
            if (str[i] == 'a'): 
                str2 = str2.replace(str2[i], 'b') 
                p += 1
  
            if (p == k): 
                break
            i -= 1
              
    print(str2) 
  
# Driver Code 
if __name__ == '__main__': 
    str = "pqrs"
    n = len(str) 
    k = 2
  
    findString(str, n, k) 
  
# This code is contributed by  
# Surendra_Gangwar 

