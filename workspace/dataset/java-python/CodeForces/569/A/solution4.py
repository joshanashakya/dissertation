t, s, q = map(int, input().split())i = 0t -= swhile t > 0:    t -= s * q ** i * (q - 1)    i += 1print(i)
