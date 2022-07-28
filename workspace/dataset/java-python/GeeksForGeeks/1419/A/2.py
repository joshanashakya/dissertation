

# Python3 Implementation of above approach. 
  
# Function to return the number  
# of students that can pass 
def check(n, marks): 
  
    # maximum marks 
    x = max(marks) 
  
    # maximum bonus marks that can be given 
    bonus = 100-x 
    c = 0
    for i in range(n): 
  
        # counting the number of  
        # students that can pass 
        if(marks[i] + bonus >= 50): 
            c += 1
  
    return c 
  
# Driver code 
n = 5
marks = [0, 21, 83, 45, 64] 
print(check(n, marks)) 

