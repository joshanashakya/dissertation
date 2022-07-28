k, a, b = map(int, input().split())x, y = a - (a % k), b - (b % k)print((y - x)//k + (1 if a % k == 0 else 0))
