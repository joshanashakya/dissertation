

# Python3 program to find the maximum  
# length of a substring of form R^nK^n  
  
# Function to calculate the maximum  
# length of substring of the form R^nK^n  
def find(s):  
       
    Max = j = countk = countr = 0 
    table = [[0, 0] for i in range(len(s))]  
  
    # Count no. Of R's before a K  
    for i in range(0, len(s)):   
        if s[i] == 'R':  
            countr += 1
        else: 
            table[j][0] = countr 
            j += 1
           
    j -= 1
  
    # Count no. Of K's after a K  
    for i in range(len(s) - 1, -1, -1):   
        if s[i] == 'K':   
            countk += 1 
            table[j][1] = countk 
            j -= 1
           
        # Update maximum length  
        if min(table[j + 1][0], table[j + 1][1]) > Max:  
            Max = min(table[j + 1][0], table[j + 1][1])  
           
    return Max 
       
# Driver code  
if __name__ == "__main__":  
       
    s = "RKRRRKKRRKKKKRR" 
    print(find(s))  
      
# This code is contributed by Rituraj Jain 

