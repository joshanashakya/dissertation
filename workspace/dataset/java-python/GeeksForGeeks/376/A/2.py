

# Python3 program for above implementation 
  
# Utility function to find maximum string 
def maximumNum(curr_num, res): 
  
    len1 = len(curr_num); 
    len2 = len(res); 
  
    # If both having equal lengths 
    if (len1 == len2): 
          
        # Reach first unmatched character / value 
        i = 0; 
        while (curr_num[i]== res[i]): 
            i += 1; 
  
        # Return string with maximum value 
        if (curr_num[i] < res[i]): 
            return res; 
        else: 
            return curr_num; 
  
    # If different lengths 
    # return string with maximum length 
    return res if(len1 < len2) else curr_num; 
  
# Function to extract the maximum value 
def extractMaximum(str): 
  
    n = len(str); 
    curr_num = ""; 
    res = ""; 
  
    # Start traversing the string 
    for i in range(n): 
          
        # Ignore leading zeroes 
        while (i < n and str[i]=='0'): 
            i += 1; 
  
        # Store numeric value into a string 
        while (i < n and str[i] >= '0' and 
                         str[i] <= '9'): 
            curr_num += str[i]; 
            i += 1; 
  
        if (i == n): 
            break; 
  
        if (len(curr_num) > 0): 
            i -= 1; 
  
        # Update maximum string 
        res = maximumNum(curr_num, res); 
  
        curr_num = ""; 
  
    # To handle the case if there is only 
    # 0 numeric value 
    if (len(curr_num) == 0 and len(res) == 0): 
        res += '0'; 
  
    # Return maximum string 
    return maximumNum(curr_num, res); 
  
# Driver Code 
str ="100klh564abc365bg"; 
print(extractMaximum(str)); 
      
# This code is contributed by mits 

