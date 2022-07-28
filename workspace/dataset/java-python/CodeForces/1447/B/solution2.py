t = int(input())
for _ in range(t):    n, m = map(int, input().split())
c = 0
s = 0
min1 = 999999
for i in range(n):        a = list(map(int, input().split()))
for j in a:            if
    (j < 0): c += 1
s += abs(j)
min1 = min(min1, abs(j))  # print(c,s,min1)    q = 2*(c%2)*min1    s -= q    print(s) 
