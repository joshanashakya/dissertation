

# Python3 Program to implement the above approach  
  
# Function to count the adjacent pairs of  
# consonant and vowels in the string  
def countPairs(s) :  
  
    # Using a set to store the vowels so that  
    # checking each character becomes easier  
    st = set();  
    st.add('a');  
    st.add('e');  
    st.add('i');  
    st.add('o');  
    st.add('u');  
  
    # Variable to store number of  
    # consonant-vowel pairs  
    count = 0;  
  
    n = len(s);  
  
    for i in range(n - 1) : 
          
        # If the ith character is not found in the set,  
        # means it is a consonant  
        # And if the (i+1)th character is found in the set,  
        # means it is a vowel  
        # We increment the count of such pairs  
        if (s[i] not in st and s[i + 1] in st) :  
            count += 1;  
  
    return count;  
  
# Driver Code  
if __name__ == "__main__" :  
      
    s = "geeksforgeeks";  
  
    print(countPairs(s));  
      
# This code is contributed by AnkitRai01 

