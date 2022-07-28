import math k, l = int(input()), int(input())p = 0while l >= k and l % k == 0:  l //= k  p += 1 if p > 0 and l == 1:  print('YES')  print(p - 1)else:  print('NO')
