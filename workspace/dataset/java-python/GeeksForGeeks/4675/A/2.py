

# Python3 program to count  
# deletions to reduce  
# the string to its  
# shortest length by  
# deleting a pair of  
# same adjacent characters 
   
# Function count  
# the operations 
def reduceString(s, l): 
    count = 1; 
    steps = 0; 
   
    # traverse in  
    # the string 
    for i in range(1,l): 
        # if adjacent  
        # characters are same 
        if (s[i] is s[i - 1]): 
            count += 1; 
   
        else: 
            # if same adjacent pairs  
            # are more than 1 
            steps +=(int)(count / 2); 
   
            count = 1; 
        steps +=(int)(count / 2); 
    return steps; 
  
   
# Driver Code 
s = "geeksforgeeks"; 
   
l = len(s); 
print(reduceString(s, l)); 
  
  
# This code contributed by Rajput-Ji 

