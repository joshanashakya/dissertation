

# Python3 code to print the pattern 
  
# function to generate the pattern. 
def pattern(n): 
  
    # putting the space in line 1 
    for i in range(1, n * 2 + 1): 
        print(end = " ") 
    print("0")  
  
    # generating the middle pattern. 
    for i in range(1, n * 2): 
  
        # printing the increasing pattern 
        if (i < n): 
            for j in range(1, (n - i) * 2 + 1): 
                print(end = " ") 
        else: 
            for j in range(1, (i % n) * 2 + 1): 
                print(end = " ") 
          
        if (i < n):  
            for j in range(i % n + 1): 
                print(j, end = " ") 
            for j in range(i % n - 1, -1, -1): 
                print(j, end = " ") 
  
        # printing the decreasing pattern 
        elif (i > n):  
            for j in range(n - (i - n) + 1): 
                print(j, end = " ")  
            for j in range((n - (i - n)) - 1, -1, -1): 
                print(j, end = " ") 
  
        else:  
            for j in range(n + 1): 
                print(j, end = " ") 
            for j in range(n - 1, -1, -1): 
                print(j, end = " ") 
                  
        print() 
      
    # putting the space in last line 
    for i in range(1, n * 2 + 1): 
        print(end = " ") 
    print("0", end = "") 
  
# Driver Code 
n = 4; 
pattern(n); 
  
# This code is contributed by  
# mohit kumar 29 

