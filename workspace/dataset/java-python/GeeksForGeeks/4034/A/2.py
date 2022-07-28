

# Python3 program to implement  
# the above approach  
  
# Function to check if  
# the condition holds  
def check(s):  
  
    # Get the length of the string  
    l = len(s)  
  
    # sort the given string  
    s = ''.join(sorted(s))  
  
    # Iterate for every index and  
    # check for the condition  
    for i in range(1, l):  
  
        # If are not consecutive  
        if ord(s[i]) - ord(s[i - 1]) != 1:  
            return False
  
    return True
  
# Driver code  
if __name__ == "__main__": 
  
    # 1st example  
    string = "dcef"
      
    if check(string):  
        print("Yes")  
    else: 
        print("No")  
  
    # 2nd example  
    string = "xyza"
  
    if check(string):  
        print("Yes")  
    else: 
        print("No")  
  
# This code is contributed by Rituraj Jain 

