t = int(input())
for i in range(t):    n, T = map(int, input().split())
a = list(map(int, input().split()))
flag = 0
for i in range(n):        if
a[i] == T / 2:
if flag == 0:                a[i] = 0
flag = 1 else:                a[i] = 1
flag = 0 elif a[i] < T / 2: a[i] = 0 else:            a[i] = 1
print(*a)
