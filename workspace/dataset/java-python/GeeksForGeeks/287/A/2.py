

# Python3 program to find whether  
# half-array reducible to 0 
  
# Function to print the desired  
# result after computation 
def isHalfReducible(arr, n, m): 
      
    frequencyHash =[0]*(m + 1); 
    i = 0; 
    while(i < n): 
        frequencyHash[(arr[i] % (m + 1))] += 1; 
        i += 1; 
  
    i = 0;  
    while(i <= m):  
        if(frequencyHash[i] >= (n / 2)): 
            break; 
        i += 1; 
  
    if (i <= m): 
        print("Yes"); 
    else: 
        print("No"); 
  
# Driver Code 
arr = [ 8, 16, 32, 3, 12 ]; 
n = len(arr); 
  
m = 7; 
isHalfReducible(arr, n, m); 
      
# This code is contributed by mits 

