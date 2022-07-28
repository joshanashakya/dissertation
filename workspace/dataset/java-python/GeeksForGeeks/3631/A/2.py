

# Python3 program to check for parallel 
# to X and Y Axis 
  
# To check for parallel line 
def parallel(n, a): 
    x = True;  
    y = True; 
  
    # checking for parallel 
    # to X and Y axis condition 
    for i in range(n - 1): 
        for j in range(2): 
            if (a[i][0] != a[i + 1][0]): 
                x = False; 
            if (a[i][1] != a[i + 1][1]): 
                y = False; 
  
    # To display the output 
    if (x): 
        print("Parallel to X Axis"); 
    elif (y): 
        print("Parallel to Y Axis"); 
    else: 
        print("Not Parallel to X and Y Axis"); 
  
# Driver's Code 
a = [[1, 2], [1, 4],  
     [1, 6], [1, 0]]; 
  
n = len(a); 
parallel(n, a); 
  
#This code is contributed by mits 

