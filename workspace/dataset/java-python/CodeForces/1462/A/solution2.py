t = int(input()) for x in range(t):    n = int(input())
b = [int(x) for x in input().split()]
r = [0 for x in range(n)]     i = 0
j = 0
while i < n:        r[i] = b[j]         if i + 1 != n:            r[i + 1] = b[n - (j + 1)]         i += 2
j += 1     print(' '.join(map(str, r)))
