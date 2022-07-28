

# Python3 program to reverse order of vowels  
  
# utility function to check for vowel  
def isVowel(c): 
    return (c=='a' or c=='A' or c=='e' or
            c=='E' or c=='i' or c=='I' or
            c=='o' or c=='O' or c=='u' or
            c=='U')  
  
# Function to reverse order of vowels  
def reverseVowel(str): 
  
    # Start two indexes from two corners  
    # and move toward each other  
    i = 0
    j = len(str) - 1
    while (i < j): 
        if not isVowel(str[i]): 
            i += 1
            continue
        if (not isVowel(str[j])): 
            j -= 1
            continue
          
        # swapping  
        str[i], str[j] = str[j], str[i] 
        i += 1
        j -= 1
    return str
  
# Driver function  
if __name__ == "__main__": 
    str = "hello world"
    print(*reverseVowel(list(str)), sep = "") 
  
# This code is contributed by SHUBHAMSINGH10 

