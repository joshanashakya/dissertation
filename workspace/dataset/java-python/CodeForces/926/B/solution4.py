import math n = int(input())a = list(map(int, input().split()))a.sort() g = 0for i in range(n - 1):  g = math.gcd(g, a[i + 1] - a[i]) print((a[-1] - a[0]) // g - n + 1)
