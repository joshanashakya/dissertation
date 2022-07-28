for t in range(int(input())):    n = int(input())
s = list(map(int, input().split()))
a = [0] * 102
b = [0] * 102
s.sort()
for i in s:        if
a[i] == 0: a[i] += 1 else: b[i] += 1
print(a.index(0) + b.index(0))
