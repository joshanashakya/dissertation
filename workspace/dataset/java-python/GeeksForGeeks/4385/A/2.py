

# Python3 program to Print symmetric  
# double triangle pattern 
  
# Print alternate x o beginning with x 
def printx(n): 
  
    for i in range(1, n + 1): 
        if (i % 2 != 0): 
            print("x ", end = "") 
        else: 
            print("o ", end = "") 
  
    return
  
# Print alternate x o beginning with o 
def printo(n): 
  
    for i in range(1, n + 1): 
        if (i % 2 != 0): 
            print("o ", end = "") 
        else: 
            print("x ", end = "") 
  
    return
  
# Print the pattern for n 
def printPattern(n): 
  
    # upper half 
    # n-1 lines for odd, 
    # n-2 lines for even 
    x = n 
  
    if (n % 2 == 0): 
        x = x - 1
  
    # number of spaces to leave 
    # in each line 
    p = n - 1
  
    # number of characters in each line 
    s = 1
  
    # prints double lines in each iteration 
    for i in range(1, (x - 1) // 2 + 1): 
        for j in range(1, p + 1): 
            print(" ", end = "") 
  
        if (i % 2 != 0): 
            printx(s) 
        else: 
            printo(s) 
  
        print() 
        p += 1
  
        for j in range(1, p + 1): 
            print(" ", end = "") 
  
        if (i % 2 != 0): 
            printx(s) 
        else: 
            printo(s) 
  
        print() 
  
        p -= 1
        s += 1
  
    # extra upper middle for even 
    if (n % 2 == 0): 
        for i in range(1, p + 1): 
            print(" ", end = "") 
  
        if (n % 4 != 0): 
            printx(n // 2) 
        else: 
            printo(n // 2) 
  
        print() 
  
    # middle line 
    if (n % 2 != 0): 
        printx(n) 
    else: 
        if (n % 4 != 0): 
            printx(n // 2) 
            printx(n // 2) 
        else: 
            printx(n // 2) 
            printo(n // 2) 
  
    print() 
  
    # extra lower middle for even 
    if (n % 2 == 0): 
        print(" ", end = "") 
        printx(n // 2) 
        print() 
  
    # lower half 
    p = 1
  
    if (n % 2 == 0): 
        x-=1
        p = 2
  
    q = x // 2
  
    # one line for each iteration 
    for i in range(1, x + 1): 
        for j in range(1, p + 1): 
            print(" ", end = "") 
  
        printx(q) 
  
        if (i % 2 == 0): 
            q -= 1
  
        print() 
  
        p += 1
  
    print() 
  
# Driver code 
n = 7
printPattern(n) 
n = 8
printPattern(n) 
  
# This code is contributed by mohit kumar 

