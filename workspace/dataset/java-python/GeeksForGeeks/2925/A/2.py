

# Python3 program to split array in  
# groups of 3 
  
# Function to print the groups after 
# splitting array in groups of 3 
def printGroups(n, a): 
  
    ct = [0 for i in range(7)] 
    grps = n // 3
    i = 0
  
    # Count occurrence of each element 
    for i in range(n): 
        ct[a[i]] += 1
  
    # Check if it is possible to  
    # form the groups 
    if (ct[1] != grps or (ct[4] + ct[6]) != grps or 
       (ct[2] + ct[3]) != grps or ct[4] > ct[2]): 
        print(-1) 
        return
  
    # Print groups that end at 4 
    for i in range(ct[4]): 
        print("1 2 4") 
  
    # Print groups that end at 6, with 2 
    # in the middle 
    for i in range(ct[2] - ct[4]): 
        print("1 2 6") 
  
    # Print groups that have a 3 in the middle 
    for i in range(ct[3]): 
        print("1 3 6") 
  
# Driver Code 
n = 6
a = [2, 2, 1, 1, 4, 6 ] 
  
printGroups(n, a) 
  
# This code is contributed 
# by Mohit Kumar 

