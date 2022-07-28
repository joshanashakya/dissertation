n, a, b = map(int, input().split()) s = 0drctn = 1 if b >= 0 else -1while s < abs(b):    a += 1 * drctn    s += 1     if a > n:        a = 1    elif a <= 0:        a = n print(a)
