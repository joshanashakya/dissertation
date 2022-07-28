import math x, y, a, b = map(int, input().split())l = max(x, y) * min(x, y) // math.gcd(x, y)print(b//l - (a-1)//l)
