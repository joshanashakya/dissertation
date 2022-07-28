

# Python3 implementation of the above approach 
  
# NFA variable that keeps track of 
# the state while transaction. 
nfa = 1
  
# This checks for invalid input. 
flag = 0
  
# Function for the state Q2 
def state1(c): 
    global nfa,flag 
  
    # State transitions 
    # 'a' takes to Q4, and 
    # 'b' and 'c' remain at Q2 
    if (c == 'a'): 
        nfa = 2
    elif (c == 'b' or c == 'c'): 
        nfa = 1
    else: 
        flag = 1
  
# Function for the state Q3 
def state2(c): 
    global nfa,flag 
  
    # State transitions 
    # 'a' takes to Q3, and 
    # 'b' and 'c' remain at Q4 
    if (c == 'a'): 
        nfa = 3
    elif (c == 'b' or c == 'c'): 
        nfa = 2
    else: 
        flag = 1
  
# Function for the state Q4 
def state3(c): 
    global nfa,flag 
  
    # State transitions 
    # 'a' takes to Q2, and 
    # 'b' and 'c' remain at Q3 
    if (c == 'a'): 
        nfa = 1
    elif (c == 'b' or c == 'c'): 
        nfa = 3
    else: 
        flag = 1
  
# Function for the state Q5 
def state4(c): 
    global nfa,flag 
  
    # State transitions 
    # 'b' takes to Q6, and 
    # 'a' and 'c' remain at Q5 
    if (c == 'b'): 
        nfa = 5
    elif (c == 'a' or c == 'c'): 
        nfa = 4
    else: 
        flag = 1
  
# Function for the state Q6 
def state5(c): 
    global nfa, flag 
  
    # State transitions 
    # 'b' takes to Q7, and 
    # 'a' and 'c' remain at Q7 
    if (c == 'b'): 
        nfa = 6
    elif (c == 'a' or c == 'c'): 
        nfa = 5
    else: 
        flag = 1
  
# Function for the state Q7 
def state6(c): 
    global nfa,flag 
  
    # State transitions 
    # 'b' takes to Q5, and 
    # 'a' and 'c' remain at Q7 
    if (c == 'b'): 
        nfa = 4
    elif (c == 'a' or c == 'c'): 
        nfa = 6
    else: 
        flag = 1
  
# Function for the state Q8 
def state7(c): 
    global nfa,flag 
  
    # State transitions 
    # 'c' takes to Q9, and 
    # 'a' and 'b' remain at Q8 
    if (c == 'c'): 
        nfa = 8
    elif (c == 'b' or c == 'a'): 
        nfa = 7
    else: 
        flag = 1
  
# Function for the state Q9 
def state8(c): 
    global nfa,flag 
  
    # State transitions 
    # 'c' takes to Q10, and 
    # 'a' and 'b' remain at Q9 
    if (c == 'c'): 
        nfa = 9
    elif (c == 'b' or c == 'a'): 
        nfa = 8
    else: 
        flag = 1
  
# Function for the state Q10 
def state9(c): 
    global nfa,flag 
  
    # State transitions 
    # 'c' takes to Q8, and 
    # 'a' and 'b' remain at Q10 
    if (c == 'c'): 
        nfa = 7
    elif (c == 'b' or c == 'a'): 
        nfa = 9
    else: 
        flag = 1
          
# Function to check for 3 a's 
def checkA(s, x): 
    global nfa,flag 
    for i in range(x): 
        if (nfa == 1): 
            state1(s[i]) 
        elif (nfa == 2): 
            state2(s[i]) 
        elif (nfa == 3): 
            state3(s[i]) 
      
    if (nfa == 1):  
        return True
      
    else:  
        nfa = 4
      
# Function to check for 3 b's 
def checkB(s, x): 
    global nfa,flag 
    for i in range(x):  
        if (nfa == 4): 
            state4(s[i]) 
        elif (nfa == 5): 
            state5(s[i]) 
        elif (nfa == 6): 
            state6(s[i]) 
      
    if (nfa == 4): 
        return True
    else:  
        nfa = 7
      
# Function to check for 3 c's 
def checkC(s, x): 
    global nfa, flag 
    for i in range(x): 
        if (nfa == 7): 
            state7(s[i]) 
        elif (nfa == 8): 
            state8(s[i]) 
        elif (nfa == 9): 
            state9(s[i]) 
              
    if (nfa == 7): 
        return True
  
# Driver Code 
  
s = "bbbca"
x = 5
  
# If any of the states is True, that is, if either 
# the number of a's or number of b's or number of c's 
# is a multiple of three, then the is accepted 
if (checkA(s, x) or checkB(s, x) or checkC(s, x)): 
    print("ACCEPTED") 
  
else: 
    if (flag == 0): 
        print("NOT ACCEPTED") 
      
    else: 
        print("INPUT OUT OF DICTIONARY.") 
          
# This code is contributed by shubhamsingh10 

