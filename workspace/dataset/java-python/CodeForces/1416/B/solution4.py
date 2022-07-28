for _ in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
s = sum(a)
if s % n != 0: print(-1);continue
t = s // n
print(3 * (n - 1))
for i in range(1, n):        x = (i + 1) - a[i] % (i + 1)
if a[i] % (i + 1) == 0:            x = 0
a[i] += x
print(1, i + 1, x)
print(i + 1, 1, a[i] // (i + 1))
for i in range(1, n): print(1, i + 1, t)
