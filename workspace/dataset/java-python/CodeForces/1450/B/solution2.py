t = int(input())
for _ in range(t):    n, k = map(int, input().split())
ali = []
for i in range(n):        li = list(map(int, input().split()))
ali.append(li)
for i in range(0, n):        f = 0
for j in range(n):            q = abs(ali[i][0] - ali[j][0])
w = abs(ali[i][1] - ali[j][1])
if (q + w > k):                f = 1
break
if (f == 0):            break
if (f == 1):
    print(-1)    else:
    print(1)           
