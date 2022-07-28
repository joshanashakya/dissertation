from math import gcd n = int(input())s = 0for i in range(2, n):    copy = n    while copy > 0:        s += copy % i        copy //= i a = sb = n - 2g = gcd(a, b)print(f"{a // g}/{b // g}")
