t = int(input())
for i in range(t):    n = int(input())
arr = input()
c = [0] * (n + 1)
s = [int(j) for j in arr.split()]
min = 200005
flag = 0
for j in range(n):        c[s[j]] += 1
for j in range(n):        if
    (c[s[j]] == 1 and s[j] < min): min = s[j]
k = j + 1
flag = 1
if (flag == 0):
    print(-1)    else:
    print(k)
