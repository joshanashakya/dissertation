import sys # sys.stdin = open('input.txt', 'r')# sys.stdout = open('output.txt', 'w') input = sys.stdin.readline  n = int(input())s = input().strip() st = []up = nfor i in range(n):    if s[i] == "L":        if not st:            up -= (i+1)        else:            length = i - st.pop() + 1            length -= length%2            up -= length    elif s[i] == "R":        st.append(i)if st:    up -= (n - st.pop()) print(up) 
