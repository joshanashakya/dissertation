import math n = int(input())a = list(map(int, input().split()))a.sort() g = 0s = 0for i in range(1, n) :  g = math.gcd(g, a[i] - a[i - 1])  print((a[n - 1] - a[0]) // g + 1 - n)
