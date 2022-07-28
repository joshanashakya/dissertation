

# Python program to find the number 
# of operations required to make 
# all array elements Equal 
  
# Function to find maximum  
# element of the given array 
def find_n(a): 
    j, k = 0, 0
      
    x = max(a) 
    for i in range(len(a)): 
        if(a[i] == x): 
            s = i 
            break
      
    for i in a: 
        if(i != x and i <= min(a) and i !='\0'): 
            a[j] += 1
            a[s] -= 1
            x -= 1
            k += 1
            j += 1
        elif(i != '\0'): 
            j += 1
              
    for i in range(len(a)):      
        if(a[i] != x): 
            k = -1
        break
  
    return k 
  
# Driver Code  
a = [1, 6, 1, 1, 1] 
print (find_n(a)) 

