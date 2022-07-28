for _ in range(int(input())):    n = int(input())
l = list(map(int, input().split()))
a = []
for i in l:        a.append(i / 2)
s = set()
for i in range(n - 1):        for
j in range(i + 1, n): s.add(a[j] - a[i])
print(len(s))
