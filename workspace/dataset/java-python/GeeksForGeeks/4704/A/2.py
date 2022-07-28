

# Python3 program to find the sum of the 
# minimum and the maximum difference 
# between two given strings 
  
# Function to find the sum of the 
# minimum and the maximum difference 
# between two given strings 
def solve(a, b): 
    l = len(a) 
  
    # Variables to store the minimum 
    # difference and the maximum difference 
    min = 0
    max = 0
  
    # Iterate through the length of the as 
    # both the given strings are of the same length 
    for i in range(l): 
  
        # For the maximum difference, we can replace 
        # "+" in both the strings with different char 
        if (a[i] == '+' or b[i] == '+' or a[i] != b[i]): 
            max += 1
  
        # For the minimum difference, we can replace 
        # "+" in both the strings with the same char 
        if (a[i] != '+' and b[i] != '+' and a[i] != b[i]): 
            min += 1
  
    print(min + max) 
  
# Driver code 
if __name__ == '__main__': 
    s1 = "a+c"
    s2 = "++b"
    solve(s1, s2) 
  
# This code is contributed by mohit kumar 29     

