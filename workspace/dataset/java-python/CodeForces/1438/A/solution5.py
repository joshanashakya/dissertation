import sys ans = "1 " * 100 t = int(input())
for _ in range(t):    n = int(input())
print(ans[:2 * n - 1])
