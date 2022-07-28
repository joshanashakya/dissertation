

# Python3 program to find next greater number with 
# same sum of digits. 
  
def getnext(arr, n): 
  
    # for storing 4 regions 
    a1=[]; 
    a2=[]; 
    a3=[]; 
    a4=[]; 
  
    # trailing zeros region1 
    i = n - 1; # last index 
    while (arr[i] == 0): 
        a1.append(0); 
        i-=1; 
  
    # lowest region(region 2) not in region 1 
    a2.append(arr[i]); 
    i-=1; 
  
    # Consecutive 9's (region 3) 
    while (arr[i] == 9): 
        a3.append(9); 
        i-=1; 
  
    j = 0; 
    while (arr[j] == 0): 
        j+=1; # Starting zeros 
  
    while (j <= i): # 4th region 
        a4.append(arr[j]); 
        j+=1; 
  
    # Calculation of result 
    j = len(a4) - 1; 
  
    a4[j]+=1; # Region4 + 1 
  
    a2[0]-=1; # Region2 -1 
  
    l = len(a1) + len(a2) + len(a3) + len(a4); 
  
    # Calculating the result 
    j = n-1; 
    i = len(a3) - 1; 
  
    # Copying the third region 
    while (i >= 0): 
        arr[j] = a3[i]; 
        j-=1; 
        i-=1; 
  
    # Copying the 2nd region 
    i = len(a2) - 1; 
    while (i >= 0): 
        arr[j] = a2[i]; 
        j-=1; 
        i-=1; 
  
    # Copying the 1st region 
    i = len(a1) - 1; 
    while (i >= 0): 
        arr[j] = a1[i]; 
        j-=1; 
        i-=1; 
  
    # Copying the 4th region 
    i = len(a4) - 1; 
    while (i >= 0): 
        arr[j] = a4[i]; 
        j-=1; 
        i-=1; 
  
    while (j >= 0): 
        arr[j] = 0; 
        j-=1; 
  
# Driver code 
arr = [ 0, 0, 0, 0, 0, 0, 0, 3, 9, 7, 0, 
            0, 2, 9, 8, 9, 5, 9, 9, 0 ]; 
n = len(arr); 
  
getnext(arr, n); # Calling the function 
  
for i in range(0,n): 
    print(arr[i],end=""); 
  
# This code is contributed by mits 

