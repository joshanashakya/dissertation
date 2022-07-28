t = int(input())
for i in range(t):    n = int(input())
l = list(map(int, input().split()))
l1 = []
for i in l:        for
j in l:
if (i != j):                l1.append(abs(i - j))
s = len(set(l1))
print(s)
