t = int(input())
for i in range(t):    n, m = map(int, input().split())
k = list(map(int, input().split()))
c = list(map(int, input().split()))
k.sort(reverse=True)
c.sort()
s = set()
j = 0
sum = 0
for i in range(n):        if
c[k[i] - 1] > c[j]: sum += c[j]
s.add(c[j])
j = j + 1 elif c[k[i] - 1] <= c[j]: sum += c[k[i] - 1]
print(sum)
