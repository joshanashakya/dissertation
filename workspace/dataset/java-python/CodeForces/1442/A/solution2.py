import sysfrom

bisect
import bisect_left input = lambda: sys.stdin.readline().rstrip("\r\n")  for _ in range(int(input())):    n = int(
    input())
a = list(map(int, input().split()))
rd = 0
ld = 0
for i in range(1, n):        if
a[i] > a[i - 1]: rd += a[i] - a[i - 1] else:            ld += a[i - 1] - a[i]
if ld <= a[0] and rd <= a[-1]:        print('YES')  else:        print('NO')
