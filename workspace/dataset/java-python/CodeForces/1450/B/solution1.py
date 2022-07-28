for _ in range(int(input())):    n, k = map(int, input().split())
l = list()
for i in range(n):        x = list(map(int, input().split()))
l.append(x)
for i in l:            c = 1
for j in l:            if
abs(i[0] - j[0]) + abs(i[1] - j[1]) > k: c = 0
break
if c == 1:            print(1)
break
if c == 0:        print(-1) 
