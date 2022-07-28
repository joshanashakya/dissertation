import sys r = sys.stdin.readline t = int(r()) for tests in range(t):    arr = [int(item) for item in r().split()]
n = arr[0]
flag = True
for i in range(16, 32):        flag = True
secarr = arr[1:]
for j in range(4):            secarr[j] -= (int(bin(i)[3:][j]) + int(bin(i)[3:][(j - 1) % 4]))
for j in secarr:            if
j < 0 or j > n - 2: flag = False
break
if flag:            break     if flag:
    print("YES")    else:
    print("NO")                   
