

# Python3 program to check if a string can be 
# converted to an empty string by deleting 
# given sub-string from any position, any 
# number of times. 
  
# Returns true if str can be made empty by 
# recursively removing sub_str. 
def canBecomeEmpty(string, sub_str): 
    while len(string) > 0: 
  
        # idx: to store starting index of sub- 
        #     string found in the original string 
        idx = string.find(sub_str) 
  
        if idx == -1: 
            break
  
        # Erasing the found sub-string from 
        # the original string 
        string = string.replace(sub_str, "", 1) 
  
    return (len(string) == 0) 
  
# Driver code 
if __name__ == "__main__": 
    string = "GEEGEEKSKS"
    sub_str = "GEEKS"
    if canBecomeEmpty(string, sub_str): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# sanjeev2552 

