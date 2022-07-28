n, m = [int(i) for i in input().split()] n += 1 while True:    c = 0
for i in range(1, n):        if
n % i == 0: c += 1
if c == 1:        if
n == m: print("YES") else:            print("NO")
break
n += 1
