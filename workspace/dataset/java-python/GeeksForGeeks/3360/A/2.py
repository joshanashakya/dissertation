

# Function to check alphanumeric equality 
# of both strings 
def CompareAlphanumeric(str1, str2): 
      
    # variable declaration 
    i = 0
    j = 0
  
    # Length of first string 
    len1 = len(str1) 
  
    # Length of second string 
    len2 = len(str2) 
  
    # To check each and every character of both string 
    while (i <= len1 and j <= len2): 
          
        # If the current character of the first string  
        # is not an alphanumeric character, 
        # increase the pointer i 
        while (i < len1 and 
              (((str1[i] >= 'a' and str1[i] <= 'z') or 
                (str1[i] >= 'A' and str1[i] <= 'Z') or 
                (str1[i] >= '0' and str1[i] <= '9')) == False)): 
            i += 1
  
        # If the current character of the second string 
        # is not an alphanumeric character, 
        # increase the pointer j 
        while (j < len2 and 
              (((str2[j] >= 'a' and str2[j] <= 'z') or 
                (str2[j] >= 'A' and str2[j] <= 'Z') or 
                (str2[j] >= '0' and str2[j] <= '9')) == False)): 
            j += 1
  
        # if all alphanumeric characters of  
        # both strings are same, then return true 
        if (i == len1 and j == len2): 
            return True
  
        # if any alphanumeric characters of  
        # both strings are not same, then return false 
        elif (str1[i] != str2[j]): 
            return False
  
        # If current character matched, 
        # increase both pointers  
        # to check the next character 
        else: 
            i += 1
            j += 1
  
    # If not same, then return false 
    return False
  
# Function to print Equal or Unequal 
# if strings are same or not 
def CompareAlphanumericUtil(str1, str2): 
      
    # check alphanumeric equality of both strings 
    res = CompareAlphanumeric(str1, str2) 
  
    # if both are alphanumeric equal, print Equal 
    if (res == True): 
        print("Equal") 
          
    # otherwise print Unequal 
    else: 
        print("Unequal") 
  
# Driver code 
if __name__ == '__main__': 
    str1 = "Ram, Shyam"
    str2 = " Ram - Shyam."
    CompareAlphanumericUtil(str1, str2) 
  
    str1 = "abc123"
    str2 = "123abc"
    CompareAlphanumericUtil(str1, str2)  
  
# This code is contributed by Surendra_Gangwar 

