

# Python3 code to count number of matching  
# characters in a pair of strings  
  
# Function to count the matching characters  
def count(str1, str2) :  
  
    c = 0; j = 0;  
  
    # Traverse the string 1 char by char  
    for i in range(len(str1)) : 
  
        # This will check if str1[i]  
        # is present in str2 or not  
        # str2.find(str1[i]) returns -1 if not found  
        # otherwise it returns the starting occurrence  
        # index of that character in str2  
        if str1[i] in str2 :  
            c += 1;  
            #print(str1[i]) 
        j += 1;  
      
    print("No. of matching characters are: ", c );  
  
  
# Driver code  
if __name__ == "__main__" : 
    str1 = "aabcddekll12@"; 
    str2 = "bb2211@55k"; 
      
    count(str1, str2);  
      
# This code is contributed by AnkitRai01 

