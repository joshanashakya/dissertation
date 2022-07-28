

# Python3 Program to find the total 
# number of distinct years 
  
# function to find the total 
# number of distinct years 
def distinct_years(str): 
    str2 = "" 
  
    uniqueDates = set() 
  
    for i in range(len(str)): 
        if str[i].isdigit(): 
            str2 += str[i] 
  
        # if we found - then clear the str2 
        if str[i] == '-': 
            str2 = "" 
  
        # if length of str2 becomes 4 
        # then store it in a set 
        if len(str2) == 4: 
            uniqueDates.add(str2) 
            str2 = "" 
  
    # return the size of set 
    return len(uniqueDates) 
  
# Driver code 
if __name__ == "__main__": 
    str = "UN was established on 24-10-1945.\ 
           India got freedom on 15-08-1947." 
  
    print(distinct_years(str)) 
  
# This code is contributed by 
# sanjeev2552 

