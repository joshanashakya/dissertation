import math n = int(input())a = sorted(list(map(int, input().split())))ans = 0for i in range(n):  if i % 2 != n % 2:    if i == 0:      ans += math.pi * a[i] ** 2    else:      ans += math.pi * (a[i] ** 2 - a[i - 1] ** 2)print(ans)
