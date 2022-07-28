

# Python3 program to implement above approach 
N = 2005
mod = 10**9 + 7
  
# To store the size of string and 
# number of queries 
n, q = 0, 0
  
# To store parent and rank of ith place 
par = [0 for i in range(N)] 
Rank = [0 for i in range(N)] 
  
# To store maximum interval 
m = dict() 
  
# Function for initialization 
def initialize(): 
  
    for i in range(n + 1): 
        Rank[i], par[i] = 0, i 
  
# Function to find parent 
def find(x): 
    if (par[x] != x): 
        par[x] = find(par[x]) 
  
    return par[x] 
  
# Function to make union 
def Union(x, y): 
  
    xpar = find(x) 
    ypar = find(y) 
  
    if (Rank[xpar] < Rank[ypar]): 
        par[xpar] = ypar 
    elif (Rank[xpar] > Rank[ypar]): 
        par[ypar] = xpar 
    else: 
        par[ypar] = xpar 
        Rank[xpar] += 1
  
# Power function to calculate a raised to m1 
# under modulo 10000007 
def power(a, m1): 
  
    if (m1 == 0): 
        return 1
    elif (m1 == 1): 
        return a 
    elif (m1 == 2): 
        return (a * a) % mod 
    elif (m1 & 1): 
        return (a * power(power(a, m1 // 2), 2)) % mod 
    else: 
        return power(power(a, m1 // 2), 2) % mod 
  
# Function to take maxmium interval 
def query(l, r): 
    if l + r in m.keys(): 
        m[l + r] = max(m[l + r], r) 
    else: 
        m[l + r] = max(0, r) 
  
# Function to find different possible strings 
def possiblestrings(): 
    initialize() 
  
    for i in m: 
        x = i - m[i] 
        y = m[i] 
  
        # make union of all chracters which 
        # are meant to be same 
        while (x < y): 
            Union(x, y) 
            x += 1
            y -= 1
  
    # find number of different sets formed 
    ans = 0
    for i in range(1, n + 1): 
        if (par[i] == i): 
            ans += 1
  
    # return the required answer 
    return power(26, ans) % mod 
  
# Driver Code 
n = 4
  
# queries 
query(1, 3) 
query(2, 4) 
  
print(possiblestrings()) 
  
# This code is contributed by Mohit Kumar 

