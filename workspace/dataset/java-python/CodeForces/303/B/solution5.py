from fractions import gcdn, m, x, y, a, b = map(int, input().split())k = gcd(a, b)a //= kb //= ktimes = min(n // a, m // b)a *= timesb *= timesx1 = x - (a + 1) // 2y1 = y - (b + 1) // 2if x1 < 0:    x1 = 0if y1 < 0:    y1 = 0if x1 + a > n:    x1 -= (x1 + a - n)if y1 + b > m:    y1 -= (y1 + b - m)print(x1, y1, x1 + a, y1 + b)